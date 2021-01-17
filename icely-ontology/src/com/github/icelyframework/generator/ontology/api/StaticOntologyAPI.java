package com.github.icelyframework.generator.ontology.api;

import java.util.ArrayList;

import com.github.icelyframework.generator.ontology.api.OntologySource.OntologyType;
import com.github.icelyframework.generator.ontology.api.OntologyJenaAPI;

/**
 * Provides an API for the static ontology in OWL format. Allows adding/deleting instances and properties.
 * 
 * @author amirdeljouyi
 */
public class StaticOntologyAPI {

	/** The API object for the static ontology. */
	private OntologyJenaAPI staticOntology;

	/** The project to connect to in the static ontology. */
	private String projectName;

	/**
	 * Initializes the connection of this API with the ontology. Upon calling this function, the ontology is loaded in
	 * memory. <u><b>NOTE</b></u> that you have to call {@link #close()} in order to save your changes to disk.
	 * 
	 * @param project the project to connect to in the static ontology.
	 * @param forceDelete boolean denoting whether any existing ontology file should be deleted.
	 */
	public StaticOntologyAPI(boolean forceDelete) {
		this.projectName = "MyCore Project";
		staticOntology = new OntologyJenaAPI(null, OntologyType.STATIC,
				"http://www.owl-ontologies.com/Ontology1273059028.owl", projectName, forceDelete);
		staticOntology.addIndividual("Project", projectName);
	}

	/**
	 * Initializes the connection of this API with the ontology. Upon calling this function, the ontology is loaded in
	 * memory. <u><b>NOTE</b></u> that you have to call {@link #close()} in order to save your changes to disk.
	 * 
	 * @param project the project to connect to in the static ontology.
	 */
	public StaticOntologyAPI() {
		staticOntology = new OntologyJenaAPI(null, OntologyType.STATIC,
				"http://www.owl-ontologies.com/Ontology1273059028.owl");
		this.projectName = "MyCore Project";
		staticOntology.addIndividual("Project", projectName);
	}

	/**
	 * Similar to the other constructors, used only for testing reasons.
	 * 
	 * @param projectName the name of the project.
	 */
	public StaticOntologyAPI(String projectName) {
		this.projectName = projectName;
		staticOntology = new OntologyJenaAPI(null, OntologyType.STATIC,
				"http://www.owl-ontologies.com/Ontology1273059028.owl", projectName, true);
		staticOntology.addIndividual("Project", projectName);
	}
	
	public StaticOntologyAPI(String projectName, String projectPath) {
		this.projectName = projectName;
		staticOntology = new OntologyJenaAPI(projectPath, OntologyType.STATIC,
				"http://www.owl-ontologies.com/Ontology1273059028.owl", projectName, true);
		staticOntology.addIndividual("Project", projectName);
	}

	/**
	 * Similar to the other constructors, used only for testing reasons.
	 * 
	 * @param projectName the name of the project.
	 * @param forceDelete delete any existing ontology file.
	 */
	public StaticOntologyAPI(String projectName, boolean forceDelete) {
		this.projectName = projectName;
		staticOntology = new OntologyJenaAPI(null, OntologyType.STATIC,
				"http://www.owl-ontologies.com/Ontology1273059028.owl", projectName, forceDelete);
		staticOntology.addIndividual("Project", projectName);
	}
	
	public StaticOntologyAPI(String projectName, String projectPath, boolean forceDelete) {
		this.projectName = projectName;
		staticOntology = new OntologyJenaAPI(projectPath, OntologyType.STATIC,
				"http://www.owl-ontologies.com/Ontology1273059028.owl", projectName, forceDelete);
		staticOntology.addIndividual("Project", projectName);
	}

	/**
	 * Adds a requirement in the ontology and connects it to the project.
	 * 
	 * @param requirementName the requirement to be added.
	 */
	public void addRequirement(String requirementName) {
		staticOntology.addIndividual("Requirement", requirementName);
		staticOntology.addPropertyAndReverseBetweenIndividuals(projectName, "project_has_requirement", requirementName);
	}

	/**
	 * Adds a requirement in the ontology, including its text, and connects it to the project.
	 * 
	 * @param requirementName the requirement to be added.
	 * @param requirementsText the text of the requirement to be added.
	 */
	public void addRequirement(String requirementName, String requirementsText) {
		staticOntology.addIndividual("Requirement", requirementName, requirementsText);
		staticOntology.addPropertyAndReverseBetweenIndividuals(projectName, "project_has_requirement", requirementName);
	}

	/**
	 * Connects a requirement to a concept of the ontology.
	 * 
	 * @param requirementName the requirement to be connected.
	 * @param conceptName the concept to be connected to the requirement.
	 */
	public void connectRequirementToConcept(String requirementName, String conceptName) {
		staticOntology.addPropertyAndReverseBetweenIndividuals(requirementName, "requirement_has_concept", conceptName);
	}

	/**
	 * Connects a requirement to an operation of the ontology.
	 * 
	 * @param requirementName the requirement to be connected.
	 * @param operationName the operation to be connected to the requirement.
	 */
	public void connectRequirementToOperation(String requirementName, String operationName) {
		staticOntology.addPropertyAndReverseBetweenIndividuals(requirementName, "requirement_has_operation",
				operationName);
	}

	/**
	 * Closes the connection of the ontology and saves it to disk. <u><b>NOTE</b></u> that if this function is not
	 * called, then the ontology is not saved.
	 */
	public void close() {
		staticOntology.close();
	}

	/**
	 * Returns the objects of the ontology for the current project.
	 * 
	 * @return an {@link ArrayList} containing the names of the objects.
	 */
	public ArrayList<String> getObjects() {
		return staticOntology.getIndividualsOfClass("object");
	}
	
	public ArrayList<String> getLiterals(){
		return staticOntology.getIndividualsOfClass("literal");
	}
	
	public ArrayList<String> getLiteralsOfEnumeration(String enumeration){
		return staticOntology.getIndividualNamesGivenIndividualAndProperty(enumeration, "has_literal");
	}
	
	public ArrayList<String> getEnumerations() {
		return staticOntology.getIndividualsOfClass("enumeration");
	}
	
	public ArrayList<String> getEntities() {
		return staticOntology.getIndividualsOfClass("entity");
	}
	
	public ArrayList<String> getValueObjects() {
		return staticOntology.getIndividualsOfClass("value_object");
	}
	
	public String getNameOfElement(String element) {
		return staticOntology.getIndividualPropertyValue(element, "has_name");
	}
	
	public Boolean getManyOfReference(String reference) {
		String many = staticOntology.getIndividualPropertyValue(reference, "many");
		return many != null ? many.equalsIgnoreCase("true") ? true : false : false;
	}
	
	public ArrayList<String> getSourceOfReference(String reference) {
		return staticOntology.getIndividualNamesGivenIndividualAndProperty(reference, "has_source");
	}
	
	public ArrayList<String> getTargetOfReference(String reference) {
		return staticOntology.getIndividualNamesGivenIndividualAndProperty(reference, "has_target");
	}
	
	public ArrayList<String> getReferences() {
		return staticOntology.getIndividualsOfClass("reference");
	}

	/**
	 * Returns the properties of a specific object.
	 * 
	 * @param object the name of the object of which the properties are returned.
	 * @return an {@link ArrayList} containing the name of the properties.
	 */
	public ArrayList<String> getPropertiesOfObject(String object) {
		return staticOntology.getIndividualNamesGivenIndividualAndProperty(object, "has_property");
	}

	/**
	 * Returns the actions of a specific object.
	 * 
	 * @param object the name of the object of which the actions are returned.
	 * @return an {@link ArrayList} containing the names of the actions.
	 */
	public ArrayList<String> getActionsOfObject(String object) {
		return staticOntology.getIndividualNamesGivenIndividualAndProperty(object, "receives_action");
	}

	/**
	 * Returns the related objects of a specific object.
	 * 
	 * @param object the name of the object of which the related objects are returned.
	 * @return an {@link ArrayList} containing the names of the related objects.
	 */
	public ArrayList<String> getReferenceObjectsOfObject(String object) {
		return staticOntology.getIndividualNamesGivenIndividualAndProperty(object, "has_reference");
	}

	/**
	 * Returns the requirements of a specific concept.
	 * 
	 * @param concept the name of the concept of which the requirements are returned.
	 * @return an {@link ArrayList} containing the names of the requirements.
	 */
	public ArrayList<String> getRequirementsOfConcept(String concept) {
		return staticOntology.getIndividualNamesGivenIndividualAndProperty(concept, "is_concept_of_requirement");
	}

	/**
	 * Returns the text of a specific requirement.
	 * 
	 * @param requirement the requirement of which the text is returned.
	 * @return the text of the given requirement.
	 */
	public String getTextOfRequirement(String requirement) {
		return staticOntology.getIndividualComment(requirement);
	}

	/**
	 * Returns the requirements of a specific operation.
	 * 
	 * @param operation the name of the operation of which the requirements are returned.
	 * @return an {@link ArrayList} containing the names of the requirements.
	 */
	public ArrayList<String> getRequirementsOfOperation(String operation) {
		return staticOntology.getIndividualNamesGivenIndividualAndProperty(operation, "is_operation_of_requirement");
	}

	/**
	 * Adds an actor to the ontology.
	 * 
	 * @param actor the name of the actor to be added.
	 */
	public void addActor(String actor) {
		staticOntology.addIndividual("actor", actor);
	}


	/**
	 * Adds an object to the ontology.
	 * 
	 * @param object the name of the object to be added.
	 */
	public void addObject(String object) {
		staticOntology.addIndividual("object", object);
	}

	/**
	 * Adds an action to the ontology.
	 * 
	 * @param action the name of the action to be added.
	 */
	public void addAction(String action) {
		staticOntology.addIndividual("action", action);
	}

	/**
	 * Connects an actor to an action.
	 * 
	 * @param actor the actor to be connected.
	 * @param action the action to be connected to the actor.
	 */
	public void connectActorToAction(String actor, String action) {
		staticOntology.addPropertyAndReverseBetweenIndividuals(actor, "is_actor_of", action);
	}

	/**
	 * Connects an action to an object.
	 * 
	 * @param action the action to be connected to the object.
	 * @param object the object to be connected.
	 */
	public void connectActionToObject(String action, String object) {
		staticOntology.addPropertyAndReverseBetweenIndividuals(action, "acts_on", object);
	}

	/**
	 * Relates the two objects to each other.
	 * 
	 * @param object1 the first object that relates to the second.
	 * @param object2 the second object that is related to the first.
	 */
	public void connectObjectToObject(String object1, String object2) {
		staticOntology.addPropertyAndReverseBetweenIndividuals(object1, "has_reference", object2);
	}

	/**
	 * Adds a property to the ontology.
	 * 
	 * @param property the name of the property to be added.
	 */
	public void addProperty(String property) {
		staticOntology.addIndividual("property", property);
	}

	/**
	 * Connects an element to a property.
	 * 
	 * @param element the element to be connected to the property.
	 * @param property the property to be connected.
	 */
	public void connectElementToProperty(String element, String property) {
		staticOntology.addPropertyAndReverseBetweenIndividuals(element, "has_property", property);
	}
	
	// newly added
	
	/**
	 * Add Aggregate
	 * @param aggregate
	 */
	public void addAggregate(String aggregate) {
		staticOntology.addIndividual("aggregate", aggregate);
	}
	
	/**
	 * 
	 * @param reference
	 */
	public void addReference(String reference, String sourceObject, String targetObject) {
		staticOntology.addIndividual("reference", reference);
		staticOntology.addPropertyAndReverseBetweenIndividuals(reference, "has_source", sourceObject);
		staticOntology.addPropertyAndReverseBetweenIndividuals(reference, "has_target", targetObject);
	}
	
	/**
	 * 
	 * @param enumeration
	 */
	public void addEnumeration(String enumeration) {
		staticOntology.addIndividual("enumeration", enumeration);
	}
	
	/**
	 * 
	 * @param literal
	 */
	
	public void addLiteralToEnumeration(String enumeration, String literal) {
		staticOntology.addIndividual("literal", literal);
		staticOntology.addPropertyAndReverseBetweenIndividuals(enumeration, "has_literal", literal);
	}
	
	/**
	 * 
	 * @param reference
	 * @param object
	 */
	public void connectSourceToReference(String reference, String object) {
		staticOntology.addPropertyAndReverseBetweenIndividuals(reference, "has_source", object);
	}
	
	/**
	 * 
	 * @param reference
	 * @param object
	 */
	public void connectTargetToReference(String reference, String object) {
		staticOntology.addPropertyAndReverseBetweenIndividuals(reference, "has_target", object);
	}
	
	/**
	 * 
	 * @param enumeration
	 * @param object
	 */
	public void connectEnumerationToObject(String enumeration, String object) {
		staticOntology.addPropertyAndReverseBetweenIndividuals(object, "has_property", enumeration);
	}
}
