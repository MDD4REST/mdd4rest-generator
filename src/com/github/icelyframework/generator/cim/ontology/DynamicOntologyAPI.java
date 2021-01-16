package com.github.icelyframework.generator.cim.ontology;

import java.util.ArrayList;

import com.github.icelyframework.generator.cim.ontology.OntologySource.OntologyType;
import com.github.icelyframework.generator.cim.ontology.OntologyJenaAPI;

/**
 * Provides an API for the linked ontology in OWL format. Allows adding/deleting
 * instances and properties.
 * 
 * @author amirdeljouyi
 */
public class DynamicOntologyAPI {

	private OntologyJenaAPI dynamicOntology;

	private String projectName;

	public DynamicOntologyAPI(boolean forceDelete) {
		// requirements ontology
		this.projectName = "MyCore Project";
		dynamicOntology = new OntologyJenaAPI(null, OntologyType.DYNAMIC,
				"http://www.owl-ontologies.com/Ontology1273059028.owl", projectName, forceDelete);
		dynamicOntology.addIndividual("Project", projectName);
	}

	public DynamicOntologyAPI() {
		dynamicOntology = new OntologyJenaAPI(null, OntologyType.DYNAMIC,
				"http://www.owl-ontologies.com/Ontology1273059028.owl");
		this.projectName = "MyCore Project";
		dynamicOntology.addIndividual("Project", projectName);
	}
	
	public DynamicOntologyAPI(String projectName) {
		this.projectName = projectName;
		dynamicOntology = new OntologyJenaAPI(null, OntologyType.DYNAMIC,
				"http://www.owl-ontologies.com/Ontology1273059028.owl", projectName, true);
		dynamicOntology.addIndividual("Project", projectName);
	}
	
	public DynamicOntologyAPI(String projectName, String projectPath) {
		this.projectName = projectName;
		dynamicOntology = new OntologyJenaAPI(projectPath, OntologyType.DYNAMIC,
				"http://www.owl-ontologies.com/Ontology1273059028.owl", projectName, true);
		dynamicOntology.addIndividual("Project", projectName);
	}

	public DynamicOntologyAPI(String projectName, boolean forceDelete) {
		this.projectName = projectName;
		dynamicOntology = new OntologyJenaAPI(null, OntologyType.DYNAMIC,
				"http://www.owl-ontologies.com/Ontology1273059028.owl", projectName, forceDelete);
		dynamicOntology.addIndividual("Project", projectName);
	}
	
	public DynamicOntologyAPI(String projectName, String projectPath, boolean forceDelete) {
		this.projectName = projectName;
		dynamicOntology = new OntologyJenaAPI(projectPath, OntologyType.DYNAMIC,
				"http://www.owl-ontologies.com/Ontology1273059028.owl", projectName, forceDelete);
		dynamicOntology.addIndividual("Project", projectName);
	}

	public void addActivityDiagram(String activityDiagramName) {
		dynamicOntology.addIndividual("ActivityDiagram", activityDiagramName);
		dynamicOntology.addPropertyAndReverseBetweenIndividuals(projectName, "project_has_diagram",
				activityDiagramName);
	}

	public void addActivityDiagram(String activityDiagramName, String activityDiagramText) {
		dynamicOntology.addIndividual("ActivityDiagram", activityDiagramName, activityDiagramText);
		dynamicOntology.addPropertyAndReverseBetweenIndividuals(projectName, "project_has_diagram",
				activityDiagramName);
	}

	public void connectActivityDiagramToElement(String activityDiagramName, String elementName) {
		dynamicOntology.addPropertyAndReverseBetweenIndividuals(activityDiagramName, "diagram_has", elementName);
		dynamicOntology.addPropertyAndReverseBetweenIndividuals(elementName, "is_of_diagram", activityDiagramName);
	}
	
	public void connectActorToActivity(String actor, String activityName) {
		dynamicOntology.addPropertyAndReverseBetweenIndividuals(activityName, "has_actor", actor);
	}
	
	public void connectActivityDiagramToTransition(String activityDiagramName, String sourceActivity,
			String targetActivity) {
		String transitionName = "FROM__" + sourceActivity + "__TO__" + targetActivity;
		dynamicOntology.addPropertyAndReverseBetweenIndividuals(activityDiagramName, "diagram_has", transitionName);
	}
	
	public void addActionToActivity(String activityName, String actionName) {
		dynamicOntology.addIndividual("Action", actionName);
		dynamicOntology.addPropertyAndReverseBetweenIndividuals(activityName, "activity_has_action", actionName);
	}
	
	
	public void addCommandToActivity(String activityName, String actionName) {
		dynamicOntology.addIndividual("Command", actionName);
		dynamicOntology.addPropertyAndReverseBetweenIndividuals(activityName, "activity_has_action", actionName);
		dynamicOntology.addPropertyAndReverseBetweenIndividuals(activityName, "activity_has_command", actionName);
		dynamicOntology.addPropertyAndReverseBetweenIndividuals(activityName, "activity_has_starter_action", actionName);
	}

	public void addQueryToActivity(String activityName, String actionName) {
		dynamicOntology.addIndividual("Query", actionName);
		dynamicOntology.addPropertyAndReverseBetweenIndividuals(activityName, "activity_has_action", actionName);
		dynamicOntology.addPropertyAndReverseBetweenIndividuals(activityName, "activity_has_query", actionName);
		dynamicOntology.addPropertyAndReverseBetweenIndividuals(activityName, "activity_has_starter_action", actionName);
	}
	
	public void addEventToActivity(String activityName, String actionName) {
		dynamicOntology.addIndividual("Event", actionName);
		dynamicOntology.addPropertyAndReverseBetweenIndividuals(activityName, "activity_has_event", actionName);
		dynamicOntology.addPropertyAndReverseBetweenIndividuals(actionName, "is_event_of_activity",activityName );
	}
	
	public void addReadModelToActivity(String activityName, String actionName) {
		dynamicOntology.addIndividual("ReadModel", actionName);
		dynamicOntology.addPropertyAndReverseBetweenIndividuals(activityName, "activity_has_readmodel", actionName);
		dynamicOntology.addPropertyAndReverseBetweenIndividuals(actionName, "is_readmodel_of_activity", activityName);
	}
	
	public void addEventToSupplier(String supplierName, String actionName) {
		dynamicOntology.addPropertyAndReverseBetweenIndividuals(supplierName, "supplier_trigger_event", actionName);
	}
	
	public void addReadModelToSupplier(String supplierName, String actionName) {
		dynamicOntology.addPropertyAndReverseBetweenIndividuals(supplierName, "supplier_trigger_readmodel", actionName);
	}
	
	public void addReadModelToEvent(String activityName, String actionName) {
		dynamicOntology.addPropertyAndReverseBetweenIndividuals(activityName, "event_trigger_readmodel", actionName);
	}
	
	public void addEventSourceToPolicy(String policyName, String eventName) {
		dynamicOntology.addIndividual("Policy", policyName);
		dynamicOntology.addPropertyAndReverseBetweenIndividuals(policyName, "policy_source", eventName);
	}
	
	public void addPolicyToTransition(String transitionName, String policyName) {
		dynamicOntology.addIndividual("Policy", policyName);
		dynamicOntology.addPropertyAndReverseBetweenIndividuals(transitionName, "has_policy", policyName);
	}
	
	public void addAggregateToActivity(String activityName, String aggregateName) {
		dynamicOntology.addIndividual("Aggregate", aggregateName);
		dynamicOntology.addPropertyAndReverseBetweenIndividuals(activityName, "activity_has_supplier", aggregateName);
	}
	
	public void addObjectToAggregate(String aggregate, String objectName) {
		dynamicOntology.addIndividual("Object", objectName);
		dynamicOntology.addPropertyAndReverseBetweenIndividuals(aggregate, "aggregate_has_object", objectName);
	}
	
	public void addObjectToActivity(String activity, String objectName) {
		dynamicOntology.addPropertyAndReverseBetweenIndividuals(activity, "activity_has_object", objectName);
	}
	
	public void addEntityToAggregate(String aggregate, String objectName) {
		dynamicOntology.addIndividual("Entity", objectName);
		dynamicOntology.addPropertyAndReverseBetweenIndividuals(aggregate, "aggregate_has_object", objectName);
		dynamicOntology.addPropertyAndReverseBetweenIndividuals(aggregate, "aggregate_has_entity", objectName);
	}
	
	public void addValueObjectToAggregate(String aggregate, String objectName) {
		dynamicOntology.addIndividual("ValueObject", objectName);
		dynamicOntology.addPropertyAndReverseBetweenIndividuals(aggregate, "aggregate_has_object", objectName);
		dynamicOntology.addPropertyAndReverseBetweenIndividuals(aggregate, "aggregate_has_value_object", objectName);
	}
	
	public void addPropertyToActivity(String activityName, String propertyName) {
		dynamicOntology.addIndividual("Property", propertyName);
		dynamicOntology.addPropertyAndReverseBetweenIndividuals(activityName, "activity_has_property", propertyName);
	}

	public void addActivityTypeToActivity(String activityName, String activityType) {
		dynamicOntology.addPropertyAndReverseBetweenIndividuals(activityName, "activitytype", activityType);
	}

	public void close() {
		dynamicOntology.close();
	}
	public ArrayList<String> getActivities() {
		return dynamicOntology.getIndividualsOfClass("Activity");
	}
	
	public ArrayList<String> getActivitiesOfActivityDiagram(String activityDiagram) {
		return dynamicOntology.getIndividualNamesGivenIndividualAndProperty(activityDiagram, "diagram_has");
	}
	public String getObjectOfActivity(String activity) {
		return dynamicOntology.getIndividualNameGivenIndividualAndProperty(activity, "activity_has_object");
	}
	
	public String getSupplierOfActivity(String activity) {
		return dynamicOntology.getIndividualNameGivenIndividualAndProperty(activity, "activity_has_supplier");
	}
	
	public String getActionOfActivity(String activity) {
		return dynamicOntology.getIndividualNameGivenIndividualAndProperty(activity, "activity_has_action");
	}
	
	public String getStarterActionOfActivity(String activity) {
		return dynamicOntology.getIndividualNameGivenIndividualAndProperty(activity, "activity_has_starter_action");
	}
	
	public String getSourceOfPolicy(String policy) {
		return dynamicOntology.getIndividualNameGivenIndividualAndProperty(policy, "policy_source");
	}
	
	public ArrayList<String> getActionsOfActivity(String activity) {
		return dynamicOntology.getIndividualNamesGivenIndividualAndProperty(activity, "activity_has_action");
	}
	
	public ArrayList<String> getCommandsOfActivity(String activity) {
		return dynamicOntology.getIndividualNamesGivenIndividualAndProperty(activity, "activity_has_command");
	}
	
	public ArrayList<String> getQueriesOfActivity(String activity) {
		return dynamicOntology.getIndividualNamesGivenIndividualAndProperty(activity, "activity_has_query");
	}
	
	public ArrayList<String> getEventsOfActivity(String activity) {
		return dynamicOntology.getIndividualNamesGivenIndividualAndProperty(activity, "activity_has_event");
	}
	
	public ArrayList<String> getReadmodelsOfActivity(String activity) {
		return dynamicOntology.getIndividualNamesGivenIndividualAndProperty(activity, "activity_has_readmodel");
	}
	
	public String getPoliciesOfTransition(String transition) {
		return dynamicOntology.getIndividualNameGivenIndividualAndProperty(transition, "has_policy");
	}
	
	public ArrayList<String> getEventTriggerOfReadModel(String readmodel) {
		return dynamicOntology.getIndividualNamesGivenIndividualAndProperty(readmodel, "readmodel_triggered_by_event");
	}
	
	public ArrayList<String> getObjectsOfAggregate(String aggregate) {
		return dynamicOntology.getIndividualNamesGivenIndividualAndProperty(aggregate, "aggregate_has_object");
	}
	
	public ArrayList<String> getObjectsOfActivity(String activity) {
		return dynamicOntology.getIndividualNamesGivenIndividualAndProperty(activity, "activity_has_object");
	}
	
	public ArrayList<String> getEntitiesOfAggregate(String aggregate) {
		return dynamicOntology.getIndividualNamesGivenIndividualAndProperty(aggregate, "aggregate_has_entity");
	}
	
	public ArrayList<String> getValueObjectsOfAggregate(String aggregate) {
		return dynamicOntology.getIndividualNamesGivenIndividualAndProperty(aggregate, "aggregate_has_value_object");
	}
	
	public String getActorOfElement(String element) {
		return dynamicOntology.getIndividualNameGivenIndividualAndProperty(element, "has_actor");
	}
	
	public ArrayList<String> getEventsOfElement(String element) {
		return dynamicOntology.getIndividualNamesGivenIndividualAndProperty(element, "has_policy");
	}
	
	public String getActivityDiagramOfElement(String elemnent) {
		return dynamicOntology.getIndividualNameGivenIndividualAndProperty(elemnent, "is_of_diagram");
	}
	
	public String getActivityTypeOfActivity(String activity) {
		String activityType = dynamicOntology.getIndividualPropertyValue(activity, "activitytype");
		return activityType != null ? activityType : "Other";
	}
	
	public ArrayList<String> getPropertiesOfActivity(String activity) {
		return dynamicOntology.getIndividualNamesGivenIndividualAndProperty(activity, "activity_has_property");
	}

	public ArrayList<String> getDiagramsOfConcept(String concept) {
		return dynamicOntology.getIndividualNamesGivenIndividualAndProperty(concept, "is_of_diagram");
	}
	public String getTextOfActivityDiagram(String diagram) {
		return dynamicOntology.getIndividualComment(diagram);
	}
	
	public ArrayList<String> getActivityDiagrams() {
		return dynamicOntology.getIndividualsOfClass("ActivityDiagram");
	}
	
	public ArrayList<String> getTransitions() {
		return dynamicOntology.getIndividualsOfClass("Transition");
	}

	public String getConditionOfTransition(String transition) {
		return dynamicOntology.getIndividualNameGivenIndividualAndProperty(transition, "has_condition");
	}
	
	public String getSourceActivityOfTransition(String transition) {
		return dynamicOntology.getIndividualNameGivenIndividualAndProperty(transition, "has_source");
	}

	public String getTargetActivityOfTransition(String transition) {
		return dynamicOntology.getIndividualNameGivenIndividualAndProperty(transition, "has_target");
	}

	public void addInitialActivity(String initialActivity) {
		dynamicOntology.addIndividual("InitialActivity", initialActivity);
	}
	
	public void addFinalActivity(String finalActivity) {
		dynamicOntology.addIndividual("FinalActivity", finalActivity);
	}
	
	
	public void addActor(String actor) {
		dynamicOntology.addIndividual("Actor", actor);
	}
	
	public void addUserActor(String actor) {
		dynamicOntology.addIndividual("UserActor", actor);
	}
	
	public void addSystemActor(String actor) {
		dynamicOntology.addIndividual("System", actor);
	}

	
	public ArrayList<String> getActors() {
		return dynamicOntology.getIndividualsOfClass("Actor");
	}
	
	public ArrayList<String> getUserActors() {
		return dynamicOntology.getIndividualsOfClass("UserActor");
	}
	
	public ArrayList<String> getReadmodels() {
		return dynamicOntology.getIndividualsOfClass("ReadModel");
	}
	
	public ArrayList<String> getEvents() {
		return dynamicOntology.getIndividualsOfClass("Event");
	}
	
	public void addPreconditionToDiagram(String diagramName, String precondition) {
		dynamicOntology.addIndividual("PreCondition", precondition);
		dynamicOntology.addPropertyAndReverseBetweenIndividuals(diagramName, "diagram_has_condition", precondition);
	}
	
	public void addPostconditionToDiagram(String diagramName, String postcondition) {
		dynamicOntology.addIndividual("PostCondition", postcondition);
		dynamicOntology.addPropertyAndReverseBetweenIndividuals(diagramName, "diagram_has_condition", postcondition);
	}

	public void addActivity(String activity) {
		dynamicOntology.addIndividual("Activity", activity);
	}

	public void addTransition(String sourceActivity, String targetActivity) {
		String transitionName = "FROM__" + sourceActivity + "__TO__" + targetActivity;
		dynamicOntology.addIndividual("Transition", transitionName);
		dynamicOntology.addPropertyAndReverseBetweenIndividuals(transitionName, "has_source", sourceActivity);
		dynamicOntology.addPropertyAndReverseBetweenIndividuals(transitionName, "has_target", targetActivity);
	}

	public void addConditionToTransition(String condition, String sourceActivity, String targetActivity) {
		String transitionName = "FROM__" + sourceActivity + "__TO__" + targetActivity;
		dynamicOntology.addIndividual("GuardCondition", condition);
		dynamicOntology.addPropertyAndReverseBetweenIndividuals(transitionName, "has_condition", condition);
	}

}
