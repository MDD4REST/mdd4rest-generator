package com.github.icelyframework.generator.mde.pimGenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.atteo.evo.inflector.English;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.util.Diagnostician;

import com.github.icelyframework.dynamicview.Authenticated;
import com.github.icelyframework.dynamicview.Role;
import com.github.icelyframework.generator.mde.inputParser.*;
import com.github.icelyframework.staticview.*;

public class CorePIMProducer extends APIMProducer {

	YamlRESTfulService listOfYaml;
	PIMUtils restUtils;

	public CorePIMProducer(YamlRESTfulService listOfYaml) {
		super(listOfYaml.getApplications(), listOfYaml.getAggregates());
		this.listOfYaml = listOfYaml;
		restUtils = new PIMUtils(this.oProjectStatic, this.oProjectDynamic);
	}

	public CorePIMProducer(YamlRESTfulService listOfYaml, String projectName, String projectPath) {
		super(listOfYaml.getApplications(), listOfYaml.getAggregates(), projectName, projectPath);
		this.listOfYaml = listOfYaml;
		restUtils = new PIMUtils(this.oProjectStatic, this.oProjectDynamic);
	}

	@Override
	public Project producePIMStatic() {

		addPrimitiveTypes();
		createAllPIMApplications();
		addDomainObjectsRelations();

		createAllStaticResources();
		System.out.println(this.getProjectStatic().getHasApplication());

		return this.getProjectStatic();
	}

	@Override
	public com.github.icelyframework.dynamicview.Project producePIMDynamic() {
		addDynamicPrimitiveTypes();

		createAllDynamicPIMApplications();

		addProcessesRelations();

		createAllDynamicResources();

		return this.getProjectDynamic();
	}

	private Aggregate createPIMAggregate(YamlAggregate yamlAggregate) {
		Aggregate aggregate = this.getServicePIMFactory().createAggregate();
		aggregate.setName(yamlAggregate.getName());
		for (YamlDomainObject oDomainObject : yamlAggregate.getDomainObjects()) {
			DomainObject domainObject = createDomainObject(oDomainObject);
			domainObject.setAggregate(aggregate);
			if (domainObject.isAggregateRoot()) {
				System.out.println("aggregateRoot " + domainObject);
				aggregate.setAggregateRoot(domainObject);
			}
			aggregate.getHasDomainobject().add(domainObject);
		}
		return aggregate;
	}

	private DomainObject createDomainObject(YamlDomainObject domainObject) {
		System.out.println(domainObject.getName());
		switch (domainObject.getType()) {
		case Entity: {
			Entity entity = (Entity) createEntityOrValueObject(domainObject, BasicDomainObject.Entity);
			return entity;
		}
		case ValueObject: {
			ValueObject valueObject = (ValueObject) createEntityOrValueObject(domainObject,
					BasicDomainObject.ValueObject);
			return valueObject;
		}
		case Enumeration: {
			Enumeration enumeration = (Enumeration) createPIMEnumeration(domainObject);
			return enumeration;
		}
		case Event: {
			DomainEvent domainEvent = (DomainEvent) createEntityOrValueObject(domainObject, BasicDomainObject.Event);
			return domainEvent;
		}
		case Command: {
			CommandEvent domainEvent = (CommandEvent) createEntityOrValueObject(domainObject,
					BasicDomainObject.Command);
			return domainEvent;
		}
		case DTO: {
			DTO domainEvent = (DTO) createEntityOrValueObject(domainObject, BasicDomainObject.DTO);
			return domainEvent;
		}
		default:
			throw new IllegalArgumentException("The yaml variable '" + domainObject + "' is not a valid type");
		}
	}

	private DomainObject createEntityOrValueObject(YamlDomainObject yamlDomainObject, BasicDomainObject type) {
		DomainObject domainObject;
		switch (type) {
		case Entity: {
			domainObject = this.getServicePIMFactory().createEntity();
			break;
		}
		case ValueObject: {
			domainObject = this.getServicePIMFactory().createValueObject();
			break;
		}
		case Event: {
			domainObject = this.getServicePIMFactory().createDomainEvent();
			break;
		}
		case Command: {
			domainObject = this.getServicePIMFactory().createCommandEvent();
			break;
		}
		case DTO: {
			domainObject = this.getServicePIMFactory().createDTO();
			break;
		}
		default:
			throw new IllegalArgumentException("type '" + type + "' is not a valid type");
		}

		domainObject.setName(yamlDomainObject.getName());
		domainObject.setAggregateRoot(yamlDomainObject.getIsAggregateRoot());
		domainObject.setTypeName(domainObject.getName());

		if (yamlDomainObject.getProperties() != null)
			for (YamlProperty yamlProperty : yamlDomainObject.getProperties()) {
				Property property = addDomainObjectProperties(yamlProperty);
				domainObject.getHasProperty().add(property);
			}
		return domainObject;
	}

	private Property addDomainObjectProperties(YamlProperty yamlProperty) {
		Property property = this.getServicePIMFactory().createProperty();
		property.setName(yamlProperty.getName());
		property.setIsUnique(yamlProperty.getUniqueness());
		property.setIsNamingProperty(yamlProperty.getNamingAbility());

		TypeDefinition type = getTypeDefinition(yamlProperty.getType());
		System.out.println("Type:: " + type);
		property.setType(type);

		return property;
	}

	private Enumeration createPIMEnumeration(YamlDomainObject yamlDomainObject) {
		Enumeration enumeration = this.getServicePIMFactory().createEnumeration();
		enumeration.setName(yamlDomainObject.getName());
		enumeration.setTypeName(yamlDomainObject.getName());

		int i = 0;
		for (String yamlLiteral : yamlDomainObject.getLiterals()) {
			Literal literal = this.getServicePIMFactory().createLiteral();
			literal.setName(yamlLiteral);
			literal.setValue(i);
			enumeration.getHasLiteral().add(literal);
			i++;
		}
		return enumeration;
	}

	private void createAllPIMApplications() {
		for (YamlApplication oCurrentYamlApplication : this.listOfYamlApplications) {
			Application application = this.getServicePIMFactory().createApplication();
			application.setName(oCurrentYamlApplication.getName());
			for (String aggregateName : oCurrentYamlApplication.getAggregates()) {
				YamlAggregate yamlAggregate = listOfYaml.getAggregateByName(aggregateName);
				Aggregate aggregate = createPIMAggregate(yamlAggregate);
				aggregate.setApplication(application);
				application.getHasAggregate().add(aggregate);
			}
			application.setProject(this.getProjectStatic());
			this.getProjectStatic().getHasApplication().add(application);
		}
	}

	private void addDomainObjectsRelations() {
		System.out.println("All Resources" + this.getProjectStatic().getHasApplication());
		for (Application application : this.getProjectStatic().getHasApplication()) {
			for (Aggregate aggregate : application.getHasAggregate()) {
				for (DomainObject domainObject : aggregate.getHasDomainobject()) {
					YamlDomainObject yamlDomainObject = listOfYaml.getDomainObjectByName(domainObject.getName(),
							aggregate.getName());
					addOutgoingRelations(application.getName(), domainObject, yamlDomainObject);
				}
			}
		}
	}

	private void addOutgoingRelations(String applicationName, DomainObject domainObject,
			YamlDomainObject yamlDomainObject) {
		if (yamlDomainObject.getRelations() != null) {
			for (YamlRelation oCurrentYamlRelation : yamlDomainObject.getRelations()) {
				System.out.println("yamlTarget: " + oCurrentYamlRelation.getTarget());
				DomainObject target = restUtils.findDomainObject(oCurrentYamlRelation.getTarget(), applicationName);
				Relation oNewRelation = this.getServicePIMFactory().createRelation();
				System.out.println("target: " + target);
				oNewRelation.setSource(domainObject);
				oNewRelation.setTarget(target);
				oNewRelation.setName(oCurrentYamlRelation.getName());
				if (oCurrentYamlRelation.getMany()) {
					ComplexType complexType = this.getServicePIMFactory().createComplexType();
					restUtils.findApplication(applicationName).getComplextypes().add(complexType);
					complexType.setType(target);
					oNewRelation.setType(complexType);
					oNewRelation.setMultiplicity(Multiplicity.ONE_TO_MANY);
				} else {
					oNewRelation.setType(target);
					oNewRelation.setMultiplicity(Multiplicity.ONE_TO_ONE);
				}

				domainObject.getHasRelation().add(oNewRelation);
			}
		}
	}

	private Resource addStaticResource(Aggregate aggregate) {

		Resource resource = this.getServicePIMFactory().createCollectionResource();
		String resourceName = English.plural(aggregate.getName());
		resource.setName(resourceName.concat("Resource"));
		resource.setSimpleName(resourceName);

		return resource;
	}

	private com.github.icelyframework.dynamicview.Resource addDynamicResource(com.github.icelyframework.dynamicview.Aggregate aggregate, YamlAggregate yamlAggregate) {

		String applicationName = aggregate.getApplication().getName();
		com.github.icelyframework.dynamicview.Resource resource = this.getDynamicPIMFactory().createCollectionResource();
		String resourceName = English.plural(aggregate.getName());
		resource.setName(resourceName.concat("Resource"));
//		resource.setSimpleName(resourceName);

		for (YamlProcess yamlProcess : yamlAggregate.getProcess()) {
			for (YamlActivity yamlActivity : yamlProcess.getActivities()) {
				if (yamlActivity.getRole() != null) {
					if (yamlActivity.getVerbTypeAction() == yamlActivity.VerbTypeAction.Other) {
						com.github.icelyframework.dynamicview.Other resourceActivity = (com.github.icelyframework.dynamicview.Other) createResourceActivity(applicationName,
								yamlActivity);
						resourceActivity.setResource(resource);
						resource.getHasActivity().add(resourceActivity);
						resource.getOtherActivities().add(resourceActivity);
					} else if (yamlActivity.getVerbTypeAction() == yamlActivity.VerbTypeAction.Read) {
						com.github.icelyframework.dynamicview.Read resourceActivity = (com.github.icelyframework.dynamicview.Read) createResourceActivity(applicationName,
								yamlActivity);
						resourceActivity.setResource(resource);
						resource.getHasActivity().add(resourceActivity);
						resource.setReadActivity(resourceActivity);
					} else if (yamlActivity.getVerbTypeAction() == yamlActivity.VerbTypeAction.Create) {
						com.github.icelyframework.dynamicview.Create resourceActivity = (com.github.icelyframework.dynamicview.Create) createResourceActivity(applicationName,
								yamlActivity);
						resourceActivity.setResource(resource);
						resource.getHasActivity().add(resourceActivity);
						resource.setCreateActivity(resourceActivity);
					} else {
						com.github.icelyframework.dynamicview.Delete resourceActivity = (com.github.icelyframework.dynamicview.Delete) createResourceActivity(applicationName,
								yamlActivity);
						resourceActivity.setResource(resource);
						resource.getHasActivity().add(resourceActivity);
						resource.setDeleteActivity(resourceActivity);
					}
				}
			}
		}
		
		if(yamlAggregate.IsAuthenticatedRequired) {
			Authenticated authenticated = this.getDynamicPIMFactory().createAuthenticated();
			resource.getHasPermission().add(authenticated);
			System.out.println("auth Resource: "+ resource);
		}

		return resource;

	}

	private com.github.icelyframework.dynamicview.ResourceActivity createResourceActivity(String applicationName, YamlActivity yamlActivity) {
		com.github.icelyframework.dynamicview.ResourceActivity resourceActivity;
		switch (yamlActivity.getVerbTypeAction()) {
		case Read: {
			resourceActivity = this.getDynamicPIMFactory().createRead();
			break;
		}
		case Create: {
			resourceActivity = this.getDynamicPIMFactory().createCreate();
			break;
		}
		case Delete: {
			resourceActivity = this.getDynamicPIMFactory().createDelete();
			break;
		}
		default: {
			resourceActivity = this.getDynamicPIMFactory().createOther();
			break;
		}
		}
		resourceActivity.setName(yamlActivity.getAction());
		
		resourceActivity.setTrigger(restUtils.findProcessOperation(yamlActivity.getAction(), applicationName));
		return resourceActivity;
	}

	private String concatAllStrings(ArrayList<String> strings) {
		String name = "";
		for (String objectName : strings) {
			name = name.concat(objectName);
		}
		return name;
	}

	private void validateProducedPIM() {

		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(this.getProjectStatic());
		if (diagnostic.getSeverity() == Diagnostic.OK) {
			System.out.println("Produced PIM is valid!");
		} else {
			System.out.println("Produced PIM is invalid!");
			System.out.println(diagnostic.getMessage());
			for (Iterator<Diagnostic> iteratorOfDiagnostics = diagnostic.getChildren().iterator(); iteratorOfDiagnostics
					.hasNext();) {
				Diagnostic childDiagnostic = (Diagnostic) iteratorOfDiagnostics.next();
				System.out.println(childDiagnostic.getMessage());
			}
		}
	}

	private void addPrimitiveTypes() {
		PrimitiveType stringType = this.getServicePIMFactory().createPrimitiveType();
		PrimitiveType integerType = this.getServicePIMFactory().createPrimitiveType();
		PrimitiveType floatType = this.getServicePIMFactory().createPrimitiveType();
		PrimitiveType booleanType = this.getServicePIMFactory().createPrimitiveType();
		PrimitiveType nullType = this.getServicePIMFactory().createPrimitiveType();
		PrimitiveType dateType = this.getServicePIMFactory().createPrimitiveType();

		stringType.setType(DefaultType.STRING);
		integerType.setType(DefaultType.INTEGER);
		floatType.setType(DefaultType.FLOAT);
		booleanType.setType(DefaultType.BOOLEAN);
		nullType.setType(DefaultType.NULL);
		dateType.setType(DefaultType.DATE);

		List<PrimitiveType> primitiveTypes = Arrays.asList(stringType, integerType, floatType, booleanType, nullType,
				dateType);

		for (PrimitiveType primitiveType : primitiveTypes) {
			String typeName = primitiveType.getType().getName();
			typeName = StringUtils.capitalize(typeName);
			primitiveType.setTypeName(typeName);
		}

		this.getProjectStatic().getPrimitiveTypes().addAll(primitiveTypes);
	}

	private void addDynamicPrimitiveTypes() {
		com.github.icelyframework.dynamicview.PrimitiveType stringType = this.getDynamicPIMFactory().createPrimitiveType();
		com.github.icelyframework.dynamicview.PrimitiveType integerType = this.getDynamicPIMFactory().createPrimitiveType();
		com.github.icelyframework.dynamicview.PrimitiveType floatType = this.getDynamicPIMFactory().createPrimitiveType();
		com.github.icelyframework.dynamicview.PrimitiveType booleanType = this.getDynamicPIMFactory().createPrimitiveType();
		com.github.icelyframework.dynamicview.PrimitiveType nullType = this.getDynamicPIMFactory().createPrimitiveType();
		com.github.icelyframework.dynamicview.PrimitiveType dateType = this.getDynamicPIMFactory().createPrimitiveType();

		stringType.setType(com.github.icelyframework.dynamicview.DefaultType.STRING);
		integerType.setType(com.github.icelyframework.dynamicview.DefaultType.INTEGER);
		floatType.setType(com.github.icelyframework.dynamicview.DefaultType.FLOAT);
		booleanType.setType(com.github.icelyframework.dynamicview.DefaultType.BOOLEAN);
		nullType.setType(com.github.icelyframework.dynamicview.DefaultType.NULL);
		dateType.setType(com.github.icelyframework.dynamicview.DefaultType.DATE);

		List<com.github.icelyframework.dynamicview.PrimitiveType> primitiveTypes = Arrays.asList(stringType, integerType, floatType, booleanType,
				nullType, dateType);

		for (com.github.icelyframework.dynamicview.PrimitiveType primitiveType : primitiveTypes) {
			String typeName = primitiveType.getType().getName();
			typeName = StringUtils.capitalize(typeName);
			primitiveType.setTypeName(typeName);
		}

		this.getProjectDynamic().getPrimitiveTypes().addAll(primitiveTypes);
	}

	private TypeDefinition getTypeDefinition(String type) {
		if (type.equals("String") || type.equals("Integer") || type.equals("Float") || type.equals("Boolean")
				|| type.equals("Null") || type.equals("Date")) {
			PrimitiveType primitiveType = restUtils.findPrimitiveType(type);
			return primitiveType;
		} else {
			System.out.println("Corrupted input! Unkown Type: " + type);
			throw new IllegalArgumentException("Unkown Type '" + type);
		}
	}

	private void createAllDynamicPIMApplications() {
		for (YamlApplication oCurrentYamlApplication : this.listOfYamlApplications) {
			com.github.icelyframework.dynamicview.Application application = this.getDynamicPIMFactory().createApplication();
			application.setName(oCurrentYamlApplication.getName());
			for (String oRole : oCurrentYamlApplication.getRoles()) {
				com.github.icelyframework.dynamicview.Role role = this.getDynamicPIMFactory().createRole();
				role.setName(oRole);
				role.setApplication(application);
				application.getHasRole().add(role);
			}
			for (String aggregateName : oCurrentYamlApplication.getAggregates()) {
				YamlAggregate yamlAggregate = listOfYaml.getAggregateByName(aggregateName);
				com.github.icelyframework.dynamicview.Aggregate aggregate = createDynamicPIMAggregate(yamlAggregate);
				aggregate.setApplication(application);
				application.getHasAggregate().add(aggregate);
			}
			application.setProject(this.getProjectDynamic());
			this.getProjectDynamic().getHasApplication().add(application);
		}
	}

	private void addProcessesRelations() {
		for (com.github.icelyframework.dynamicview.Application application : this.getProjectDynamic().getHasApplication()) {
			for (com.github.icelyframework.dynamicview.Aggregate aggregate : application.getHasAggregate()) {
				for (com.github.icelyframework.dynamicview.Process process : aggregate.getHasProcess()) {
					for (com.github.icelyframework.dynamicview.ProcessOperation processOperation : process.getHasOperation()) {
						System.out.println(processOperation);
						YamlActivity yamlActivity = listOfYaml.getActivityByName(processOperation.getName(),
								aggregate.getName(), process.getName());
						for (String yamlPolicy : yamlActivity.getPolicy()) {
							com.github.icelyframework.dynamicview.Event event = (com.github.icelyframework.dynamicview.Event) restUtils.findDynamicDomainObject(yamlPolicy,
									application.getName());
							com.github.icelyframework.dynamicview.Policy policy = this.getDynamicPIMFactory().createPolicy();
							policy.setEventType(event);
							processOperation.setPolicy(policy);
						}

						for (String yamlPolicy : yamlActivity.getPublish()) {
							com.github.icelyframework.dynamicview.Event event = (com.github.icelyframework.dynamicview.Event) restUtils.findDynamicDomainObject(yamlPolicy,
									application.getName());
							com.github.icelyframework.dynamicview.Publish publish = this.getDynamicPIMFactory().createPublish();
							publish.setEventType(event);
							processOperation.setPublish(publish);
						}
					}
				}
			}
		}
	}

	private com.github.icelyframework.dynamicview.Aggregate createDynamicPIMAggregate(YamlAggregate yamlAggregate) {
		com.github.icelyframework.dynamicview.Aggregate aggregate = this.getDynamicPIMFactory().createAggregate();
		aggregate.setName(yamlAggregate.getName());

		for (YamlDomainObject oDomainObject : yamlAggregate.getDomainObjects()) {
			com.github.icelyframework.dynamicview.DomainObject domainObject = createDynamicDomainObject(oDomainObject);
			domainObject.setAggregate(aggregate);
			if (domainObject.isAggregateRoot()) {
				aggregate.setAggregateRoot(domainObject);
			}
			aggregate.getDomainobjects().add(domainObject);
		}

		for (YamlProcess oProcess : yamlAggregate.getProcess()) {
			com.github.icelyframework.dynamicview.Process process = createDynamicPIMProcess(oProcess);
			process.setAggregate(aggregate);
			aggregate.getHasProcess().add(process);
		}

		return aggregate;
	}

	private void createAllStaticResources() {
		for (Application application : this.getProjectStatic().getHasApplication()) {
			for (Aggregate aggregate : application.getHasAggregate()) {
				Resource resource = addStaticResource(aggregate);
				for (Resource relatedResource : resource.getHasRelatedResource()) {
					relatedResource.setAggregate(aggregate);
					aggregate.getHasResource().add(relatedResource);
				}
				resource.setAggregate(aggregate);
				aggregate.getHasResource().add(resource);
			}
		}

	}

	private void createAllDynamicResources() {
		for (com.github.icelyframework.dynamicview.Application application : this.getProjectDynamic().getHasApplication()) {
			for (com.github.icelyframework.dynamicview.Aggregate aggregate : application.getHasAggregate()) {
				YamlAggregate oAggregate = this.listOfYaml.getAggregateByName(aggregate.getName());
				com.github.icelyframework.dynamicview.Resource resource = addDynamicResource(aggregate, oAggregate);

				// relatedResources
				for (com.github.icelyframework.dynamicview.Resource relatedResource : resource.getHasRelatedResource()) {
					relatedResource.setAggregate(aggregate);
					aggregate.getHasResource().add(relatedResource);
				}

				resource.setAggregate(aggregate);
				aggregate.getHasResource().add(resource);

			}
		}

	}

	private com.github.icelyframework.dynamicview.DomainObject createDynamicDomainObject(YamlDomainObject domainObject) {
		switch (domainObject.getType()) {
		case Entity: {
			com.github.icelyframework.dynamicview.Entity entity = (com.github.icelyframework.dynamicview.Entity) createDynamicEntityOrValueObject(domainObject,
					BasicDomainObject.Entity);
			return entity;
		}
		case ValueObject: {
			com.github.icelyframework.dynamicview.ValueObject valueObject = (com.github.icelyframework.dynamicview.ValueObject) createDynamicEntityOrValueObject(domainObject,
					BasicDomainObject.ValueObject);
			return valueObject;
		}
		case Enumeration: {
			com.github.icelyframework.dynamicview.Enumeration enumeration = (com.github.icelyframework.dynamicview.Enumeration) createDynamicPIMEnumeration(domainObject);
			return enumeration;
		}
		case Event: {
			com.github.icelyframework.dynamicview.DomainEvent domainEvent = (com.github.icelyframework.dynamicview.DomainEvent) createDynamicEntityOrValueObject(domainObject,
					BasicDomainObject.Event);
			return domainEvent;
		}
		case Command: {
			com.github.icelyframework.dynamicview.CommandEvent domainEvent = (com.github.icelyframework.dynamicview.CommandEvent) createDynamicEntityOrValueObject(
					domainObject, BasicDomainObject.Command);
			return domainEvent;
		}

		case DTO: {
			com.github.icelyframework.dynamicview.DTO domainEvent = (com.github.icelyframework.dynamicview.DTO) createDynamicEntityOrValueObject(domainObject,
					BasicDomainObject.DTO);
			return domainEvent;
		}
		default:
			throw new IllegalArgumentException("The yaml variable '" + domainObject + "' is not a valid type");
		}
	}

	private com.github.icelyframework.dynamicview.DomainObject createDynamicEntityOrValueObject(YamlDomainObject yamlDomainObject,
			BasicDomainObject type) {
		com.github.icelyframework.dynamicview.DomainObject domainObject;

		switch (type) {
		case Entity: {
			domainObject = this.getDynamicPIMFactory().createEntity();
			break;
		}
		case ValueObject: {
			domainObject = this.getDynamicPIMFactory().createValueObject();
			break;
		}
		case Event: {
			domainObject = this.getDynamicPIMFactory().createDomainEvent();
			break;
		}
		case Command: {
			domainObject = this.getDynamicPIMFactory().createCommandEvent();
			break;
		}

		case DTO: {
			domainObject = this.getDynamicPIMFactory().createDTO();
			break;
		}
		default:
			throw new IllegalArgumentException("type '" + type + "' is not a valid type");
		}

		domainObject.setName(yamlDomainObject.getName());
		domainObject.setAggregateRoot(yamlDomainObject.getIsAggregateRoot());
		domainObject.setTypeName(domainObject.getName());

		return domainObject;
	}

	private com.github.icelyframework.dynamicview.Enumeration createDynamicPIMEnumeration(YamlDomainObject yamlDomainObject) {
		com.github.icelyframework.dynamicview.Enumeration enumeration = this.getDynamicPIMFactory().createEnumeration();
		enumeration.setName(yamlDomainObject.getName());
		enumeration.setTypeName(yamlDomainObject.getName());

		return enumeration;
	}

	private com.github.icelyframework.dynamicview.Process createDynamicPIMProcess(YamlProcess yamlProcess) {
		com.github.icelyframework.dynamicview.Process process = this.getDynamicPIMFactory().createProcess();
		process.setName(yamlProcess.getName());
		for (YamlActivity yamlActivity : yamlProcess.getActivities()) {
			com.github.icelyframework.dynamicview.ProcessOperation processOperation;
			switch (yamlActivity.getType()) {
			case Command: {
				processOperation = this.getDynamicPIMFactory().createCommandOperation();
				break;
			}

			case Query: {
				processOperation = this.getDynamicPIMFactory().createQueryOperation();
				break;
			}

			default:
				throw new IllegalArgumentException("yamlActivity '" + yamlActivity + "' is not a valid type");

			}

			processOperation.setName(yamlActivity.getAction());
			processOperation.setProcess(process);
			process.getHasOperation().add(processOperation);
		}
		return process;
	}

	private enum BasicDomainObject {
		Entity, ValueObject, Event, Command, DTO
	}

}