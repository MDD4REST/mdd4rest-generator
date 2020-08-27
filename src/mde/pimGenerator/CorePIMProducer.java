package mde.pimGenerator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.Diagnostician;

import SecurityPIM.Constraint;
import SecurityPIM.Permission;
import SecurityPIM.PermissionMode;
import SecurityPIM.PermissionType;
import SecurityPIM.Role;
import SecurityPIM.TwoPropertyOperator;
import SecurityPIM.TwoRelationalOperator;
import mde.inputParser.YamlActivity;
import mde.inputParser.YamlApplication;
import mde.inputParser.YamlConstraint;
import mde.inputParser.YamlEnumeration;
import mde.inputParser.YamlOperand;
import mde.inputParser.YamlPermission;
import mde.inputParser.YamlProperty;
import mde.inputParser.YamlRelationship;
import mde.inputParser.YamlResource;
import mde.inputParser.YamlRole;
import ServicePIM.Application;
import ServicePIM.BasicType;
import ServicePIM.CRUDActivity;
import ServicePIM.CRUDVerb;
import ServicePIM.Config;
import ServicePIM.Enumeration;
import ServicePIM.InputRepresentation;
import ServicePIM.Literal;
import ServicePIM.MediaType;
import ServicePIM.Multiplicity;
import ServicePIM.OutputRepresentation;
import ServicePIM.RESTfulServicePIM;
import ServicePIM.RelatedResource;
import ServicePIM.Relationship;
import ServicePIM.Resource;
import ServicePIM.ServicePIMPackage;
import ServicePIM.TypeDefinition;
import ServicePIM.Property;
import ServicePIM.PropertyType;

public class CorePIMProducer extends APIMProducer {

	public CorePIMProducer(ArrayList<YamlApplication> listOfPIMYamlApplications,
			ArrayList<YamlResource> listOfPIMYamlResources, ArrayList<YamlRole> listOfPIMYamlRoles,
			ArrayList<YamlEnumeration> listOfPIMYamlEnumeration) {
		super(listOfPIMYamlApplications, listOfPIMYamlResources, listOfPIMYamlRoles, listOfPIMYamlEnumeration);
	}

	public CorePIMProducer(ArrayList<YamlApplication> listOfPIMYamlApplications,
			ArrayList<YamlResource> listOfPIMYamlResources, ArrayList<YamlRole> listOfPIMYamlRoles,
			ArrayList<YamlEnumeration> listOfPIMYamlEnumeration, String strProjectName, String strProjectBasePath) {
		super(listOfPIMYamlApplications, listOfPIMYamlResources, listOfPIMYamlRoles, listOfPIMYamlEnumeration,
				strProjectName, strProjectBasePath);
	}

	@Override
	public RESTfulServicePIM producePIM() {
		
		addBasicTypes();
		createAllPIMEnumerations();
		createAllPIMResources();
		createAllPIMRoles();
		createAllPIMApplications();
		addResourceRelations();
		// validateProducedPIM();
		System.out.println(this.getRESTfulServicePIM().getHasApplications());

		return this.getRESTfulServicePIM();
	}

	private void createAllPIMResources() {
		for (int n = 0; n < this.listOfYamlResources.size(); n++) {
			YamlResource oCurrentYamlResource = this.listOfYamlResources.get(n);
//			System.out.println("Yaml Resource:: "+ oCurrentYamlResource);
			Resource oNewPIMResource = this.getServicePIMFactory().createResource();
			oNewPIMResource.setName(oCurrentYamlResource.getName());
			oNewPIMResource.setIsAlgorithmic(oCurrentYamlResource.getResourceType());
			oNewPIMResource = addResourceProperties(oNewPIMResource, oCurrentYamlResource);
			oNewPIMResource = addResourceCRUDActivities(oNewPIMResource, oCurrentYamlResource);
			oNewPIMResource = addResourceRepresentations(oNewPIMResource, oCurrentYamlResource);
			this.getRESTfulServicePIM().getHasResources().add(oNewPIMResource);
		}
		RESTfulServiceUtils restUtils = new RESTfulServiceUtils(this.oRESTfulServicePIM);
		this.getRESTfulServicePIM().getHasResources().add(restUtils.UserResource());
		this.getRESTfulServicePIM().getHasResources().add(restUtils.CurrentUserResource());
	}

	private void createAllPIMEnumerations() {
		for (int n = 0; n < this.listOfYamlEnumerations.size(); n++) {
			YamlEnumeration oCurrentYamlEnumeration = this.listOfYamlEnumerations.get(n);
			System.out.println("Current" + oCurrentYamlEnumeration);
			Enumeration oNewPIMEnumeration = this.getServicePIMFactory().createEnumeration();
			oNewPIMEnumeration.setName(oCurrentYamlEnumeration.getName());
			oNewPIMEnumeration.setTypeName(oCurrentYamlEnumeration.getName());
			
			for (int i = 0; i< oCurrentYamlEnumeration.getLiterals().size(); i++) {
				String yamlLiteral = oCurrentYamlEnumeration.getLiterals().get(i);
				Literal literal = this.getServicePIMFactory().createLiteral();
				literal.setName(yamlLiteral);
				literal.setValue(i);
				oNewPIMEnumeration.getLiterals().add(literal);
			}
			this.getRESTfulServicePIM().getEnumerations().add(oNewPIMEnumeration);
		}
	}

	private void createAllPIMRoles() {
		for (int n = 0; n < this.listOfYamlRoles.size(); n++) {
			YamlRole oCurrentYamlRole = this.listOfYamlRoles.get(n);
			Role oNewPIMRole = this.getSecurityPIMFactory().createRole();
			String permsissionMode = oCurrentYamlRole.getPermissionMode();
			oNewPIMRole.setName(oCurrentYamlRole.getName());
			PermissionMode oPermissionMode = PermissionMode.DENY_ALL_EXCEPT_PERMISSIONS;
			if (oCurrentYamlRole.PermissionMode.equalsIgnoreCase("Allow_All_Except_Permissions")) {
				oPermissionMode = PermissionMode.ALLOW_ALL_EXCEPT_PERMISSIONS;
				oNewPIMRole.setPermissionMode(PermissionMode.ALLOW_ALL_EXCEPT_PERMISSIONS);
			} else {
				oNewPIMRole.setPermissionMode(PermissionMode.DENY_ALL_EXCEPT_PERMISSIONS);
			}
			for (YamlPermission yamlPermission : oCurrentYamlRole.Permissions) {
				Permission permission = this.getSecurityPIMFactory().createPermission();
				String resourceOfPermission = yamlPermission.getResource();
				if (oPermissionMode.equals(PermissionMode.ALLOW_ALL_EXCEPT_PERMISSIONS)) {
					permission.setPermissionType(PermissionType.DENY);
				} else {
					permission.setPermissionType(PermissionType.ALLOW);
				}
				for (YamlConstraint constraint : yamlPermission.getConstraints()) {
					YamlOperand yamlRightOperand = constraint.getRightOperand();
					YamlOperand yamlLeftOperand = constraint.getLeftOperand();
					Constraint oNewConstraint = this.getSecurityPIMFactory().createConstraint();
					RESTfulServiceUtils restUtils = new RESTfulServiceUtils(this.oRESTfulServicePIM);
					Property rightPropertyOperand = restUtils.findProperty(yamlRightOperand.getResource(),
							yamlRightOperand.getProperty());
					Property leftPropertyOperand = restUtils.findProperty(yamlLeftOperand.getResource(),
							yamlLeftOperand.getProperty());
					System.out.println("left: "+leftPropertyOperand);
					TwoRelationalOperator operator = this.getSecurityPIMFactory().createTwoRelationalOperator();
					operator.setRightOperand(rightPropertyOperand);
					operator.setLeftOperand(leftPropertyOperand);
					oNewConstraint.getConstraintoperator().add(operator);
					permission.getConstraint().add(oNewConstraint);
				}
				oNewPIMRole.getPermission().add(permission);
			}
			this.getRESTfulServicePIM().getHasRoles().add(oNewPIMRole);
		}
	}

	private void createAllPIMApplications() {
		for (int n = 0; n < this.listOfYamlApplications.size(); n++) {
			YamlApplication oCurrentYamlApplication = this.listOfYamlApplications.get(n);
			Application oNewPIMApplication = this.getServicePIMFactory().createApplication();
			Config configOfApplication = this.getServicePIMFactory().createConfig();
			RESTfulServiceUtils restUtils = new RESTfulServiceUtils(this.oRESTfulServicePIM);
			for (String resourceName : oCurrentYamlApplication.getResources()) {
				Resource resource = restUtils.findResource(resourceName);
				System.out.println(resourceName);
				System.out.println(resource);
				oNewPIMApplication.getResources().add(resource);
			}
			for (String role : oCurrentYamlApplication.getRoles()) {
				oNewPIMApplication.getRoles().add(restUtils.findRole(role));
			}
			configOfApplication.setBaseName(oCurrentYamlApplication.getName());
			oNewPIMApplication.setHasConfig(configOfApplication);

			this.getRESTfulServicePIM().getHasApplications().add(oNewPIMApplication);
		}
	}

	private Resource addResourceProperties(Resource oNewPIMResource, YamlResource oCurrentYamlResource) {

		for (int n = 0; n < oCurrentYamlResource.getYamlProperties().size(); n++) {
			YamlProperty oCurrentYamlProperty = oCurrentYamlResource.getYamlProperties().get(n);
			Property oNewResourceProperty = this.getServicePIMFactory().createProperty();
			oNewResourceProperty.setName(oCurrentYamlProperty.getName());
			
			TypeDefinition type = getTypeDefinition(oCurrentYamlProperty.getType());
			System.out.println("Type:: " + type.getClass().getSimpleName());
//			if(type.getClass().getSimpleName().equals("BasicTypeImpl")) {
//				oNewResourceProperty.setBasictype((BasicType) type); 
//			}
			oNewResourceProperty.setType(type);
			oNewResourceProperty.setTypeName(type.getTypeName());
			
			oNewResourceProperty.setIsUnique(oCurrentYamlProperty.getUniqueness());
			oNewResourceProperty.setIsNamingProperty(oCurrentYamlProperty.getNamingAbility());
			oNewPIMResource.getHasProperty().add(oNewResourceProperty);
		}
		return oNewPIMResource;
	}

	private void addResourceRelations() {
		System.out.println( "All Resources" + this.getRESTfulServicePIM().getHasResources());
		for (int n = 0; n < this.getRESTfulServicePIM().getHasResources().size(); n++) {
			for (int i = 0; i < this.listOfYamlResources.size(); i++) {
				// if we come by the parent Yaml resource of this PIM resource
				System.out.println("RestRes: " + this.getRESTfulServicePIM().getHasResources().get(n));
				System.out.println("YamlRes: " + this.listOfYamlResources.get(i).getName());
				if (this.getRESTfulServicePIM().getHasResources().get(n).getName()
						.equalsIgnoreCase(this.listOfYamlResources.get(i).getName())) {
					// add to the PIM resource the same related resources as the ones that the Yaml
					// resource has
					addOutgoingRelations(n, i);
				}
			}
		}
//		for (int n = 0; n < this.getRESTfulServicePIM().getHasResources().size(); n++) {
//			addIncomingRelations(n);
//		}
	}

	private void addOutgoingRelations(int iPIMResourceIndex, int iYamlResourceIndex) {
		if (this.listOfYamlResources.get(iYamlResourceIndex).getRelationships() != null) {
			RESTfulServiceUtils restUtils = new RESTfulServiceUtils(this.oRESTfulServicePIM);
			for (int i = 0; i < this.listOfYamlResources.get(iYamlResourceIndex).getRelationships().size(); i++) {
				YamlRelationship oCurrentYamlRelationship = this.listOfYamlResources.get(iYamlResourceIndex)
						.getRelationships().get(i);
				System.out.println(oCurrentYamlRelationship.getResource());
				Resource relatedResource = restUtils.findResource(oCurrentYamlRelationship.getResource());
				Relationship oNewRelationship = this.getServicePIMFactory().createRelationship();
				oNewRelationship.setFromResource(this.getRESTfulServicePIM().getHasResources().get(iPIMResourceIndex));
				oNewRelationship.setToResource(relatedResource);

				if (oCurrentYamlRelationship.Multiplicity.equalsIgnoreCase("one-many")) {
					oNewRelationship.setMultiplicity(Multiplicity.ONE_TO_MANY);
				} else if (oCurrentYamlRelationship.Multiplicity.equalsIgnoreCase("many-one")) {
					oNewRelationship.setMultiplicity(Multiplicity.MANY_TO_ONE);
				} else if (oCurrentYamlRelationship.Multiplicity.equalsIgnoreCase("one-one")) {
					oNewRelationship.setMultiplicity(Multiplicity.ONE_TO_ONE);
				} else if (oCurrentYamlRelationship.Multiplicity.equalsIgnoreCase("many-many")) {
					oNewRelationship.setMultiplicity(Multiplicity.MANY_TO_MANY);
				} else {
					System.out.println("Corrupted input! Unkown multiplicity: " + oCurrentYamlRelationship);
					Runtime.getRuntime().exit(-1);
				}

				this.getRESTfulServicePIM().getHasResources().get(iPIMResourceIndex).getHasRelationship()
						.add(oNewRelationship);
			}
		}
	}

	private void addIncomingRelations(int iPIMResourceIndex) {

		System.out.println("iPIM:: " + iPIMResourceIndex);
		for (int n = 0; n < this.getRESTfulServicePIM().getHasResources().size(); n++) {
			for (int i = 0; i < this.getRESTfulServicePIM().getHasResources().get(n).getHasRelationship().size(); i++) {
				System.out.println("n: " + n + ", i:" + i);
				if (this.getRESTfulServicePIM().getHasResources().get(iPIMResourceIndex).getName()
						.equalsIgnoreCase(this.getRESTfulServicePIM().getHasResources().get(n).getHasRelationship()
								.get(i).getToResource().getName())) {
					this.getRESTfulServicePIM().getHasResources().get(iPIMResourceIndex).getHasRelationship()
							.add(this.getRESTfulServicePIM().getHasResources().get(n).getHasRelationship().get(i));
				}
			}
		}
	}

	private Resource addResourceCRUDActivities(Resource oNewPIMResource, YamlResource oCurrentYamlResource) {

		for (int n = 0; n < oCurrentYamlResource.getActivities().size(); n++) {

			CRUDActivity oCRUDActivity = this.getServicePIMFactory().createCRUDActivity();
			YamlActivity oCurrentActivity =  oCurrentYamlResource.getActivities().get(n);
			if (oCurrentActivity.getType().equalsIgnoreCase("create")) {
				oCRUDActivity = this.getServicePIMFactory().createCreate();
			} else if (oCurrentActivity.getType().equalsIgnoreCase("read")) {
				oCRUDActivity = this.getServicePIMFactory().createRead();
			} else if (oCurrentActivity.getType().equalsIgnoreCase("update")) {
				oCRUDActivity = this.getServicePIMFactory().createUpdate();
			} else if (oCurrentActivity.getType().equalsIgnoreCase("delete")) {
				oCRUDActivity = this.getServicePIMFactory().createDelete();
			} else {
				System.out.println("Corrupted input! Unkown CRUD verb: " + oCurrentYamlResource.getActivities().get(n));
				Runtime.getRuntime().exit(-1);
			}
			oCRUDActivity.setIsAuthenticatedRequired(oCurrentActivity.getIsAuthenticationRequired());
			oNewPIMResource.getHasActivities().add(oCRUDActivity);
		}
		return oNewPIMResource;
	}

	private Resource addResourceRepresentations(Resource oNewPIMResource, YamlResource oCurrentYamlResource) {

		oNewPIMResource = addInputRepresentations(oNewPIMResource, oCurrentYamlResource);
		oNewPIMResource = addOutputRepresentations(oNewPIMResource, oCurrentYamlResource);

		return oNewPIMResource;
	}

	private Resource addInputRepresentations(Resource oNewPIMResource, YamlResource oCurrentYamlResource) {

		if (oCurrentYamlResource.getInputRepresentation() != null) {
			InputRepresentation oInputRepresentation = this.getServicePIMFactory().createInputRepresentation();
			if (oCurrentYamlResource.getInputRepresentation().equalsIgnoreCase("JSON")) {
				oInputRepresentation.setInputMediaType(MediaType.JSON);
			} else if (oCurrentYamlResource.getInputRepresentation().equalsIgnoreCase("XML")) {
				oInputRepresentation.setInputMediaType(MediaType.XML);
			} else {
				System.out.println(
						"Corrupted inpt! Unkown input media type: " + oCurrentYamlResource.getInputRepresentation());
				Runtime.getRuntime().exit(-1);
			}
			oNewPIMResource.getHasInputRepresentation().add(oInputRepresentation);
		}

		return oNewPIMResource;
	}

	private Resource addOutputRepresentations(Resource oNewPIMResource, YamlResource oCurrentYamlResource) {

		if (oCurrentYamlResource.getOutputRepresentation() != null) {
			OutputRepresentation oOutputRepresentation = this.getServicePIMFactory().createOutputRepresentation();
			if (oCurrentYamlResource.getOutputRepresentation().equalsIgnoreCase("JSON")) {
				oOutputRepresentation.setOutputMediaType(MediaType.JSON);
			} else if (oCurrentYamlResource.getOutputRepresentation().equalsIgnoreCase("XML")) {
				oOutputRepresentation.setOutputMediaType(MediaType.XML);
			} else {
				System.out.println("Corrupted input! Unknown output media type: "
						+ oCurrentYamlResource.getOutputRepresentation());
				Runtime.getRuntime().exit(-1);
			}
			oNewPIMResource.getHasOutputRepresentation().add(oOutputRepresentation);
		}

		return oNewPIMResource;
	}

	private void validateProducedPIM() {

		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(this.getRESTfulServicePIM());
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

	private void addBasicTypes() {
		BasicType stringType = this.getServicePIMFactory().createBasicType();
		BasicType integerType = this.getServicePIMFactory().createBasicType();
		BasicType floatType = this.getServicePIMFactory().createBasicType();
		BasicType booleanType = this.getServicePIMFactory().createBasicType();
		BasicType nullType = this.getServicePIMFactory().createBasicType();
		
		stringType.setType(PropertyType.STRING);
		integerType.setType(PropertyType.INTEGER);
		floatType.setType(PropertyType.FLOAT);
		booleanType.setType(PropertyType.BOOLEAN);
		nullType.setType(PropertyType.NULL);
		
		List<BasicType> basicTypes = Arrays.asList(stringType, integerType, floatType, booleanType, nullType);
		
		for (BasicType basicType : basicTypes) {
			String typeName = basicType.getType().getName();
			typeName = StringUtils.capitalize(typeName);
			basicType.setTypeName(typeName);
		}
		
		this.getRESTfulServicePIM().getBasictypes().addAll(basicTypes);
	}
	
	private TypeDefinition getTypeDefinition(String type) {
		
		RESTfulServiceUtils restUtils = new RESTfulServiceUtils(this.oRESTfulServicePIM);
		
		if (type.equals("String") || type.equals("Integer") || type.equals("Float") || type.equals("Boolean") || type.equals("Null")) {
			BasicType basicType = restUtils.findBasicType(type);
			return basicType;
		} else {
			Enumeration enumeration = null;
			enumeration = restUtils.findEnumeration(type);
			System.out.println("ENUM:: OoO " + enumeration);
			if (enumeration != null) {
				return enumeration;
			} else {
				return null;
			}
		}
	}
}