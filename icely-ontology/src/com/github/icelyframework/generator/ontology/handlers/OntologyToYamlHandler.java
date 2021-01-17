package com.github.icelyframework.generator.ontology.handlers;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

import org.apache.commons.io.IOUtils;

import com.github.icelyframework.generator.ontology.api.LinkedOntologyAPI;
import com.github.icelyframework.generator.ontology.ontologytoyamltools.Activity;
import com.github.icelyframework.generator.ontology.ontologytoyamltools.Activity.ActivityType;
import com.github.icelyframework.generator.ontology.ontologytoyamltools.Activity.VerbType;
import com.github.icelyframework.generator.ontology.ontologytoyamltools.Aggregate;
import com.github.icelyframework.generator.ontology.ontologytoyamltools.Aggregates;
import com.github.icelyframework.generator.ontology.ontologytoyamltools.Application;
import com.github.icelyframework.generator.ontology.ontologytoyamltools.DomainObject;
import com.github.icelyframework.generator.ontology.ontologytoyamltools.Property;
import com.github.icelyframework.generator.ontology.ontologytoyamltools.Relation;
import com.github.icelyframework.generator.ontology.ontologytoyamltools.Stemmer;
import com.github.icelyframework.generator.ontology.ontologytoyamltools.StringHelpers;
import com.github.icelyframework.generator.ontology.ontologytoyamltools.VerbTypeFinder;
import com.github.icelyframework.generator.ontology.ontologytoyamltools.DomainObject.DomainObjectType;

/**
 * Class used to read data from the linked ontology and create a PIM in YAML
 * format.
 * 
 * @author amirdeljouyi based on themis's work
 */
public class OntologyToYamlHandler {

	private String projectName;
	private String projectPath;
	private LinkedOntologyAPI linkedOntology;

	public OntologyToYamlHandler(String projectName, String projectPath, LinkedOntologyAPI linkedOntology) {
		this.projectName = projectName;
		this.projectPath = projectPath;
		this.linkedOntology = linkedOntology;
	}

	public void linkedToYaml() {
		Aggregates aggregates = createAggregates();
		ArrayList<String> roles = createRoles();
		writeYamlFile(aggregates, roles);
	}

	private Aggregates createAggregates() {
		// Verb type finder determining whether a verb is CRUD
		VerbTypeFinder verbTypeFinder = new VerbTypeFinder();

		// Iterate over all resources
		Aggregates aggregates = new Aggregates();
		ArrayList<String> remainObjects = linkedOntology.getObjects();
		ArrayList<String> enumerations = linkedOntology.getEnumerations();

		for (String aggregateName : linkedOntology.getAggregates()) {
			Aggregate aggregate = aggregates.getAggregateByName(StringHelpers.toNounClassStyle(aggregateName));
			ArrayList<String> entities = linkedOntology.getEntitiesOfAggregate(aggregateName);
			ArrayList<String> valueObjects = linkedOntology.getValueObjectsOfAggregate(aggregateName);
			for (String object : linkedOntology.getObjectsOfAggregate(aggregateName)) {
				createObjects(aggregate, object, valueObjects, entities, enumerations);
				remainObjects.remove(object);
			}

			// Iterate over each activity of this resource
			for (String activityName : linkedOntology.getActivitiesOfAggregate(aggregateName)) {
				String activityDiagramName = linkedOntology.getActivityDiargramOfElement(activityName);
				String policy = linkedOntology.getPolicyOfActivity(activityName);
//				String processName = StringHelpers.toClassStyle(activityDiagramName.);
				String processName = StringHelpers.toClassStyle(activityDiagramName.replace("ACD_", ""));
				com.github.icelyframework.generator.ontology.ontologytoyamltools.Process process;
				String action = linkedOntology.getActionOfActivity(activityName);
				String actiontype = linkedOntology.getActivityTypeOfActivity(activityName);
				String verbtype = verbTypeFinder.getVerbType(action);
				String stemmedAction = StringHelpers.toOperationStyle(action);
				String stemmedActivityName = StringHelpers.toOperationStyle(activityName);
				String role = linkedOntology.getRoleOfActivity(activityName);
				String roleName = null;
				Boolean commandType = false;
				
				if(role != null)
					roleName = StringHelpers.toClassStyle(role);
				
				if (activityDiagramName != null) {
					// to operation style or to class style
					process = aggregate.getProcessByName(processName);
				} else {
					process = aggregate.getProcessByName(StringHelpers.toClassStyle(stemmedActivityName));
				}

				VerbType verb = VerbType.Other;
				if (verbtype.equalsIgnoreCase("read") ) {
					verb = VerbType.Read;
				} else if (verbtype.equalsIgnoreCase("create")) {
					verb = VerbType.Create;
				} else if (verbtype.equalsIgnoreCase("delete")) {
					verb = VerbType.Delete;
				}
				System.out.println("activity: " + activityName);
				System.out.println("action: " + action);
				System.out.println("actiontype: " + actiontype);
				System.out.println("verbtype: " + verbtype);
				System.out.println("stemmedAction: " + stemmedAction);
				Activity activity;
				if (actiontype != null && actiontype.equalsIgnoreCase("Query")) {
					verb = VerbType.Read;
					activity = new Activity(stemmedActivityName, stemmedAction, roleName, ActivityType.Query, verb);
				} else {
					commandType = true;
					activity = new Activity(stemmedActivityName, stemmedAction, roleName, ActivityType.Command, verb);
				}
				
				if(policy!= null) {
					String source = linkedOntology.getSourceOfPolicy(policy);
					activity.addPolicy(source);
				}

				for (String object : linkedOntology.getObjectsOfActivity(activityName)) {
					String objectName = StringHelpers.toNounClassStyle(object);
					activity.addObjects(objectName);
				}

				// add Command Object
				if(commandType) {
					String commandObjectName = StringHelpers.toClassStyle(stemmedAction + "Command");
					DomainObject commandObject = new DomainObject(commandObjectName, DomainObjectType.Command, false);
					for (String object : linkedOntology.getObjectsOfActivity(activityName)) {
						String name = StringHelpers.toNounVariableStyle(object);
						String target = StringHelpers.toNounClassStyle(object);
						Boolean many = false;
						commandObject.addRelation(new Relation(name, target, many));
					}
					aggregate.addDomainObject(commandObject);
				}

				// add DomainEvent Object
				for (String event : linkedOntology.getEventsOfActivity(activityName)) {
					String eventCamelCase = StringHelpers.toClassStyle(event);
					activity.addPublish(eventCamelCase);
					DomainObject eventObject = new DomainObject(eventCamelCase, DomainObjectType.Event, false);

					for (String object : linkedOntology.getObjectsOfActivity(activityName)) {
						String name = StringHelpers.toNounVariableStyle(object);
						String target = StringHelpers.toNounClassStyle(object);
						Boolean many = false;
						eventObject.addRelation(new Relation(name, target, many));
					}

					aggregate.addDomainObject(eventObject);
				}
				
				// add Domain Transfer Object
				for (String dto : linkedOntology.getReadmodelsOfActivity(activityName)) {
					String dtoCamelCase = StringHelpers.toClassStyle(dto + "DTO");
					activity.addReadModel(dtoCamelCase);
					DomainObject dtoObject = new DomainObject(dtoCamelCase, DomainObjectType.DTO, false);

					for (String object : linkedOntology.getObjectsOfActivity(activityName)) {
						String name = StringHelpers.toNounVariableStyle(object);
						String target = StringHelpers.toNounClassStyle(object);
						Boolean many = false;
						dtoObject.addRelation(new Relation(name, target, many));
					}

					aggregate.addDomainObject(dtoObject);
				}
				process.addActivity(activity);
			}
		}

		if (remainObjects.size() > 0) {
			for (String object : remainObjects) {
				Aggregate aggregate = aggregates.getAggregateByName(StringHelpers.toNounClassStyle(object));
				createObjects(aggregate, object, new ArrayList<String>(), new ArrayList<String>(), enumerations);
			}
		}

		return aggregates;
	}
	
	private ArrayList<String> createRoles() {
		ArrayList<String> roles = new ArrayList<String>();
		for (String role: linkedOntology.getRoles()) {
			roles.add(StringHelpers.toClassStyle(role));
		}
		return roles;
	}

	private void createObjects(Aggregate aggregate, String objectName, ArrayList<String> valueObjects,
			ArrayList<String> entities, ArrayList<String> enumerations) {
		DomainObject domainObject;
		String objectCamelCase = StringHelpers.toNounClassStyle(objectName);
		if (valueObjects.contains(objectName)) {
			domainObject = new DomainObject(objectCamelCase, DomainObjectType.ValueObject, false);
		} else if (enumerations.contains(objectName)) {
			domainObject = new DomainObject(objectCamelCase, DomainObjectType.Enumeration, false);
			for (String literal : linkedOntology.getLiteralsOfEnumeration(objectName)) {
				domainObject.addLiteral(StringHelpers.toClassStyle(literal));
			}
		} else {
			domainObject = new DomainObject(objectCamelCase, DomainObjectType.Entity, true);
		}

		for (String ref : linkedOntology.getReferencesOfObject(objectName)) {
			String name = StringHelpers.toVariableStyle(linkedOntology.getNameOfElement(ref));
			String target = StringHelpers.toNounClassStyle(linkedOntology.getTargetOfReference(ref));
			Boolean many = linkedOntology.getManyOfReference(ref);
			domainObject.addRelation(new Relation(name, target, many));
		}

		for (String property : linkedOntology.getPropertiesOfObject(objectName)) {
			domainObject.addProperty(new Property(StringHelpers.toNounVariableStyle(property)));
		}

		aggregate.addDomainObject(domainObject);
	}

	private void writeYamlFile(Aggregates aggregates, ArrayList<String> roles) {
		// Open a new YAML file in the project
		FileOutputStream file = null;
		String filename = projectPath + "/CIM/yaml/" + projectName + ".yaml";
		try {
			file = new FileOutputStream(filename);
		} catch (FileNotFoundException e) {
			System.out.println("can't create a file" + e);
		}

		// Write the resources to file
		Application application = new Application(projectName);
		String ymlContents = "Aggregates:\n";
		for (Aggregate aggregate : aggregates) {
			ymlContents += aggregate.toYAMLString() + "\n\n\n";
			application.addAggregate(aggregate.Name);
		}
		for (String role : roles) {
			application.addRole(role);
		}
		ymlContents += "Applications:\n";
		ymlContents += application.toYAMLString();
		ByteArrayInputStream ymlStream = new ByteArrayInputStream(ymlContents.getBytes(StandardCharsets.UTF_8));
		System.out.println("yml" + ymlContents);
		try {
			IOUtils.copy(ymlStream, file);
		} catch (IOException e) {
			System.out.println("Unable to create YAML file (service.yml)." + e);
		}
	}

}
