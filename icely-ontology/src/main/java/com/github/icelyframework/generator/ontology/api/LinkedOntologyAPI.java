package com.github.icelyframework.generator.ontology.api;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.github.icelyframework.generator.ontology.api.OntologySource.OntologyType;
import com.github.icelyframework.generator.ontology.ontologytoyamltools.StringHelpers;
import com.github.icelyframework.generator.ontology.api.OntologyJenaAPI;

/**
 * Provides an API for the linked ontology in OWL format. Allows adding/deleting
 * instances and properties.
 * 
 * @author amirdeljouyi based on themis's work
 */
public class LinkedOntologyAPI {

	private OntologyJenaAPI linkedOntology;

	private String projectName;
	
	private StringHelpers helper = new StringHelpers();

	public LinkedOntologyAPI(boolean forceDelete) {
		this.projectName = "MyCore Project";
		linkedOntology = new OntologyJenaAPI(null, OntologyType.LINKED,
				"http://www.owl-ontologies.com/Ontology1273059028.owl", projectName, forceDelete);
		linkedOntology.addIndividual("Project", projectName);
	}

	public LinkedOntologyAPI() {
		linkedOntology = new OntologyJenaAPI(null, OntologyType.LINKED,
				"http://www.owl-ontologies.com/Ontology1273059028.owl");
		this.projectName = "MyCore Project";
		linkedOntology.addIndividual("Project", projectName);
	}

	public LinkedOntologyAPI(String projectName) {
		linkedOntology = new OntologyJenaAPI(null, OntologyType.LINKED,
				"http://www.owl-ontologies.com/Ontology1273059028.owl", projectName, true);
		this.projectName = projectName;
		linkedOntology.addIndividual("Project", projectName);
	}

	public LinkedOntologyAPI(String projectName, String projectPath) {
		linkedOntology = new OntologyJenaAPI(projectPath, OntologyType.LINKED,
				"http://www.owl-ontologies.com/Ontology1273059028.owl", projectName, true);
		this.projectName = projectName;
		linkedOntology.addIndividual("Project", projectName);
	}

	public LinkedOntologyAPI(String projectName, boolean forceDelete) {
		linkedOntology = new OntologyJenaAPI(null, OntologyType.LINKED,
				"http://www.owl-ontologies.com/Ontology1273059028.owl", projectName, forceDelete);
		this.projectName = projectName;
		linkedOntology.addIndividual("Project", projectName);
	}

	public LinkedOntologyAPI(String projectName, String projectPath, boolean forceDelete) {
		linkedOntology = new OntologyJenaAPI(projectPath, OntologyType.LINKED,
				"http://www.owl-ontologies.com/Ontology1273059028.owl", projectName, forceDelete);
		this.projectName = projectName;
		linkedOntology.addIndividual("Project", projectName);
	}

	public void connectProjectToElement(String elementName) {
		linkedOntology.addPropertyAndReverseBetweenIndividuals(projectName, "has_element", elementName);
	}

	public void addRequirement(String requirementName) {
		linkedOntology.addIndividual("Requirement", requirementName);
		linkedOntology.addPropertyAndReverseBetweenIndividuals(projectName, "has_requirement", requirementName);
	}

	public void addRequirement(String requirementName, String requirementsText) {
		linkedOntology.addIndividual("Requirement", requirementName, requirementsText);
		linkedOntology.addPropertyAndReverseBetweenIndividuals(projectName, "has_requirement", requirementName);
	}

	public void connectRequirementToElement(String requirementName, String elementName) {
		linkedOntology.addPropertyAndReverseBetweenIndividuals(requirementName, "contains_element", elementName);
		linkedOntology.addPropertyAndReverseBetweenIndividuals(elementName, "element_is_contained_in", requirementName);
		linkedOntology.addPropertyAndReverseBetweenIndividuals(projectName, "has_element", elementName);
	}

	public ArrayList<String> getActivityDiagrams() {
		return linkedOntology.getIndividualsOfClass("ActivityDiagram");
	}

	public ArrayList<String> getActivityDiargramOrRequirementOfElement(String element) {
		return linkedOntology.getIndividualNamesGivenIndividualAndProperty(element, "element_is_contained_in");
	}

	public String getActivityDiargramOfElement(String element) {
		return linkedOntology.getIndividualNameGivenIndividualAndProperty(element, "is_activity_of_diagram");
	}

	public void addActivityDiagram(String activityDiagramName) {
		linkedOntology.addIndividual("ActivityDiagram", activityDiagramName);
		linkedOntology.addPropertyAndReverseBetweenIndividuals(projectName, "has_activity_diagram",
				activityDiagramName);
	}

	public void addActivityDiagram(String activityDiagramName, String activityDiagramText) {
		linkedOntology.addIndividual("ActivityDiagram", activityDiagramName, activityDiagramText);
		linkedOntology.addPropertyAndReverseBetweenIndividuals(projectName, "has_activity_diagram",
				activityDiagramName);
	}

	public void connectActivityDiagramToElement(String activityDiagramName, String elementName) {
		linkedOntology.addPropertyAndReverseBetweenIndividuals(activityDiagramName, "contains_element", elementName);
		linkedOntology.addPropertyAndReverseBetweenIndividuals(projectName, "has_element", elementName);
	}
	
	public void connectActivityDiagramToActivity(String activityDiagramName, String activityName) {
		linkedOntology.addPropertyAndReverseBetweenIndividuals(activityDiagramName, "diagram_has_activity", activityName);
		linkedOntology.addPropertyAndReverseBetweenIndividuals(activityName, "is_activity_of_diagram",activityDiagramName);
	}
	
	public void connectPolicyToEvent(String policyName, String eventName) {
		linkedOntology.addPropertyAndReverseBetweenIndividuals(policyName, "policy_source", eventName);
		linkedOntology.addPropertyAndReverseBetweenIndividuals(eventName, "is_source_of_policy", policyName);
	}

	public void addEnumeration(String enumeration) {
		linkedOntology.addIndividual("Enumeration", helper.underscoreTCapitalizeWithUnderscore(enumeration));
	}

	public void addEntity(String entity) {
		linkedOntology.addIndividual("Entity", helper.underscoreTCapitalizeWithUnderscore(entity));
	}

	public void addValueObject(String valueObject) {
		linkedOntology.addIndividual("ValueObject", helper.underscoreTCapitalizeWithUnderscore(valueObject));
	}

	public void addObject(String object) {
		linkedOntology.addIndividual("Object", helper.underscoreTCapitalizeWithUnderscore(object));
	}

	public void addAggregate(String aggregate) {
		linkedOntology.addIndividual("Aggregate", aggregate);
	}

	public void addPropertyToObject(String objectName, String propertyName) {
		linkedOntology.addIndividual("Property", propertyName);
		linkedOntology.addPropertyAndReverseBetweenIndividuals(objectName, "has_property", propertyName);
	}

	public void addActivityToElement(String elementName, String activityName) {
		linkedOntology.addIndividual("Activity", activityName);
		linkedOntology.addPropertyAndReverseBetweenIndividuals(elementName, "has_activity", activityName);
	}

	public void addObjectToAggregate(String aggregate, String objectName) {
		linkedOntology.addIndividual("Object", objectName);
		linkedOntology.addPropertyAndReverseBetweenIndividuals(aggregate, "has_object", objectName);
	}
	
	public void addObjectToActivity(String activity, String objectName) {
		linkedOntology.addPropertyAndReverseBetweenIndividuals(activity, "activity_has_object", objectName);
	}

	public void addEntityToAggregate(String aggregate, String objectName) {
		linkedOntology.addIndividual("Entity", objectName);
		linkedOntology.addPropertyAndReverseBetweenIndividuals(aggregate, "has_entity", objectName);
		addObjectToAggregate(aggregate, objectName);
	}

	public void addValueObjectToAggregate(String aggregate, String objectName) {
		linkedOntology.addIndividual("ValueObject", objectName);
		linkedOntology.addPropertyAndReverseBetweenIndividuals(aggregate, "has_value_object", objectName);
		addObjectToAggregate(aggregate, objectName);
	}

	public void addActionToActivity(String activityName, String actionName) {
		linkedOntology.addIndividual("Action", actionName);
		linkedOntology.addPropertyAndReverseBetweenIndividuals(activityName, "has_action", actionName);
	}

	public void addConditionToActivity(String activityName, String conditionName) {
		linkedOntology.addIndividual("Condition", conditionName);
		linkedOntology.addPropertyAndReverseBetweenIndividuals(activityName, "has_condition", conditionName);
	}

	public void addNextActivityToActivity(String activityName, String nextActivityName) {
		linkedOntology.addPropertyAndReverseBetweenIndividuals(activityName, "has_next_activity", nextActivityName);
	}
	
	public void addPolicyToActivity(String activityName, String policyName) {
		linkedOntology.addIndividual("Policy", policyName);
		linkedOntology.addPropertyAndReverseBetweenIndividuals(activityName, "has_policy", policyName);
		linkedOntology.addPropertyAndReverseBetweenIndividuals(policyName, "is_policy_of", activityName);
	}
	
	public void addRoleToActivity(String activityName, String roleName) {
		linkedOntology.addIndividual("Role", roleName);
		linkedOntology.addPropertyAndReverseBetweenIndividuals(activityName, "has_role", roleName);
		linkedOntology.addPropertyAndReverseBetweenIndividuals(roleName, "is_role_of", activityName);
	}

	public void addReference(String reference, ArrayList<String> sources, ArrayList<String> targets, Boolean many,
			String name) {
		linkedOntology.addIndividual("Reference", reference);
		for (String source : sources) {
			linkedOntology.addPropertyAndReverseBetweenIndividuals(reference, "has_source",
					helper.underscoreTCapitalizeWithUnderscore(source));
			linkedOntology.addPropertyAndReverseBetweenIndividuals(helper.underscoreTCapitalizeWithUnderscore(source), "is_source_of",
					reference);
		}
		for (String target : targets) {
			linkedOntology.addPropertyAndReverseBetweenIndividuals(reference, "has_target",
					helper.underscoreTCapitalizeWithUnderscore(target));
		}
		linkedOntology.addPropertyToIndividual(reference, "many", many);
		linkedOntology.addPropertyToIndividual(reference, "hasName", name);
	}

	public Boolean getManyOfReference(String reference) {
		String many = linkedOntology.getIndividualPropertyValue(reference, "many");
		return many != null ? many.equalsIgnoreCase("true") ? true : false : false;
	}

	public String getNameOfElement(String element) {
		return linkedOntology.getIndividualPropertyValue(element, "hasName");
	}

	public ArrayList<String> getObjects() {
		return linkedOntology.getIndividualsOfClass("Object");
	}

	public ArrayList<String> getAggregates() {
		return linkedOntology.getIndividualsOfClass("Aggregate");
	}
	
	public ArrayList<String> getRoles() {
		return linkedOntology.getIndividualsOfClass("Role");
	}

	public String getSourceOfReference(String reference) {
		return linkedOntology.getIndividualNameGivenIndividualAndProperty(reference, "has_source");
	}

	public String getTargetOfReference(String reference) {
		return linkedOntology.getIndividualNameGivenIndividualAndProperty(reference, "has_target");
	}

	public ArrayList<String> getEnumerations() {
		return linkedOntology.getIndividualsOfClass("Enumeration");
	}

	public ArrayList<String> getActivitiesOfAggregate(String aggregateName) {
		return linkedOntology.getIndividualNamesGivenIndividualAndProperty(aggregateName, "has_activity");
	}

	public ArrayList<String> getObjectsOfAggregate(String aggregateName) {
		return linkedOntology.getIndividualNamesGivenIndividualAndProperty(aggregateName, "has_object");
	}
	
	public ArrayList<String> getObjectsOfActivity(String activity) {
		return linkedOntology.getIndividualNamesGivenIndividualAndProperty(activity, "activity_has_object");
	}

	public ArrayList<String> getPropertiesOfObject(String objectName) {
		return linkedOntology.getIndividualNamesGivenIndividualAndProperty(objectName, "has_property");
	}

	public ArrayList<String> getReferencesOfObject(String objectName) {
		return linkedOntology.getIndividualNamesGivenIndividualAndProperty(objectName, "is_source_of");
	}

	public ArrayList<String> getNextActivitiesOfActivity(String activityName) {
		return linkedOntology.getIndividualNamesGivenIndividualAndProperty(activityName, "has_next_activity");
	}

	public String getActionOfActivity(String activityName) {
		return linkedOntology.getIndividualNameGivenIndividualAndProperty(activityName, "has_action");
	}
	
	public String getPolicyOfActivity(String activityName) {
		return linkedOntology.getIndividualNameGivenIndividualAndProperty(activityName, "has_policy");
	}
	
	public String getSourceOfPolicy(String policy) {
		return linkedOntology.getIndividualNameGivenIndividualAndProperty(policy, "policy_source");
	}
	
	public String getRoleOfActivity(String activityName) {
		return linkedOntology.getIndividualNameGivenIndividualAndProperty(activityName, "has_role");
	}

	public ArrayList<String> getEventsOfActivity(String activityName) {
		return linkedOntology.getIndividualNamesGivenIndividualAndProperty(activityName, "has_event");
	}
	
	public ArrayList<String> getReadmodelsOfActivity(String activityName) {
		return linkedOntology.getIndividualNamesGivenIndividualAndProperty(activityName, "activity_has_readmodel");
	}

	public String getActivityTypeOfActivity(String activityName) {
		return linkedOntology.getIndividualPropertyValue(activityName, "activitytype");
	}	

	public void addCommandActionToActivity(String activityName, String actionName) {
		addActionToActivity(activityName, actionName);
		linkedOntology.addPropertyToIndividual(activityName, "activitytype", "Command");
//		linkedOntology.addPropertyAndReverseBetweenIndividuals(activityName, "has_starter_action", actionName);
	}

	public void addQueryActionToActivity(String activityName, String actionName) {
		addActionToActivity(activityName, actionName);
		linkedOntology.addPropertyToIndividual(activityName, "activitytype", "Query");
//		linkedOntology.addPropertyAndReverseBetweenIndividuals(activityName, "has_starter_action", actionName);
	}

	public void addEventToActivity(String activityName, String actionName) {
		linkedOntology.addIndividual("Event", actionName);
		linkedOntology.addPropertyAndReverseBetweenIndividuals(activityName, "has_event", actionName);
	}
	
	public void addReadmodelToActivity(String activityName, String readmodelName) {
		linkedOntology.addIndividual("ReadModel", readmodelName);
		linkedOntology.addPropertyAndReverseBetweenIndividuals(activityName, "activity_has_readmodel", readmodelName);
	}

	public void addAggregateToActivity(String activityName, String aggregateName) {
		linkedOntology.addIndividual("Aggregate", aggregateName);
		linkedOntology.addPropertyAndReverseBetweenIndividuals(activityName, "has_aggregate", aggregateName);
	}

	public void addLiteralToEnumeration(String enumeration, String literal) {
		linkedOntology.addIndividual("Literal", helper.underscoreTCapitalizeWithUnderscore(literal));
		linkedOntology.addPropertyAndReverseBetweenIndividuals(helper.underscoreTCapitalizeWithUnderscore(enumeration), "has_literal",
				helper.underscoreTCapitalizeWithUnderscore(literal));
	}

	public ArrayList<String> getEntitiesOfAggregate(String aggregate) {
		return linkedOntology.getIndividualNamesGivenIndividualAndProperty(aggregate, "has_entity");
	}

	public ArrayList<String> getValueObjectsOfAggregate(String aggregate) {
		return linkedOntology.getIndividualNamesGivenIndividualAndProperty(aggregate, "has_value_object");
	}

	public ArrayList<String> getLiteralsOfEnumeration(String enumeration) {
		return linkedOntology.getIndividualNamesGivenIndividualAndProperty(enumeration, "has_literal");
	}

	public void close() {
		linkedOntology.close();
	}
}
