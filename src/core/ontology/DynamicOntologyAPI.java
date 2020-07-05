package core.ontology;

import java.util.ArrayList;

import org.eclipse.core.resources.IProject;

import core.ontology.OntologySource.OntologyType;
import core.ontology.OntologyJenaAPI;

/**
 * Provides an API for the linked ontology in OWL format. Allows adding/deleting instances and properties.
 * 
 * @author themis
 */
public class DynamicOntologyAPI {

	/** The API for the linked ontology. */
	private OntologyJenaAPI dynamicOntology;

	/** The project to connect to in the linked ontology. */
	private String projectName;

	/**
	 * Initializes the connection of this API with the ontology. Upon calling this function, the ontology is loaded in
	 * memory. <u><b>NOTE</b></u> that you have to call {@link #close()} in order to save your changes to disk.
	 * 
	 * @param project the project to connect to in the dynamic ontology.
	 * @param forceDelete boolean denoting whether any existing ontology file should be deleted.
	 */
	public DynamicOntologyAPI(boolean forceDelete) {
		//requirements ontology
		dynamicOntology = new OntologyJenaAPI(OntologyType.DYNAMIC,
				"http://www.owl-ontologies.com/Ontology1273059028.owl", forceDelete);
		this.projectName = "amir prjct";
		dynamicOntology.addIndividual("Project", projectName);
	}

	/**
	 * Initializes the connection of this API with the ontology. Upon calling this function, the ontology is loaded in
	 * memory. <u><b>NOTE</b></u> that you have to call {@link #close()} in order to save your changes to disk.
	 * 
	 * @param project the project to connect to in the dynamic ontology.
	 */
	public DynamicOntologyAPI() {
		dynamicOntology = new OntologyJenaAPI(OntologyType.DYNAMIC,
				"http://www.owl-ontologies.com/Ontology1273059028.owl");
		this.projectName = "aMiir Prjct";
		dynamicOntology.addIndividual("Project", projectName);
	}

	/**
	 * Similar to the other constructors, used only for testing reasons.
	 * 
	 * @param projectName the name of the project.
	 */
	public DynamicOntologyAPI(String projectName) {
		dynamicOntology = new OntologyJenaAPI(OntologyType.DYNAMIC,
				"http://www.owl-ontologies.com/Ontology1273059028.owl", true);
		this.projectName = projectName;
		dynamicOntology.addIndividual("Project", projectName);
	}

	/**
	 * Similar to the other constructors, used only for testing reasons.
	 * 
	 * @param projectName the name of the project.
	 * @param forceDelete boolean denoting whether any existing ontology file should be deleted.
	 */
	public DynamicOntologyAPI(String projectName, boolean forceDelete) {
		dynamicOntology = new OntologyJenaAPI(OntologyType.DYNAMIC,
				"http://www.owl-ontologies.com/Ontology1273059028.owl", forceDelete);
		this.projectName = projectName;
		dynamicOntology.addIndividual("Project", projectName);
	}

	/**
	 * Adds an activity diagram in the ontology and connects it to the project.
	 * 
	 * @param activityDiagramName the diagram to be added.
	 */
	public void addActivityDiagram(String activityDiagramName) {
		dynamicOntology.addIndividual("ActivityDiagram", activityDiagramName);
		dynamicOntology
				.addPropertyAndReverseBetweenIndividuals(projectName, "project_has_diagram", activityDiagramName);
	}

	/**
	 * Adds an activity diagram in the ontology, including its text, and connects it to the project.
	 * 
	 * @param activityDiagramName the diagram to be added.
	 * @param activityDiagramText the text of the diagram to be added.
	 */
	public void addActivityDiagram(String activityDiagramName, String activityDiagramText) {
		dynamicOntology.addIndividual("ActivityDiagram", activityDiagramName, activityDiagramText);
		dynamicOntology
				.addPropertyAndReverseBetweenIndividuals(projectName, "project_has_diagram", activityDiagramName);
	}

	/**
	 * Connects an activity diagram to an element of the ontology.
	 * 
	 * @param activityDiagramName the activity diagram to be connected.
	 * @param elementName the element to be connected to the activity diagram.
	 */
	public void connectActivityDiagramToElement(String activityDiagramName, String elementName) {
		dynamicOntology.addPropertyAndReverseBetweenIndividuals(activityDiagramName, "diagram_has", elementName);
	}

	/**
	 * Connects an activity diagram to a transition of the ontology.
	 * 
	 * @param activityDiagramName the activity diagram to be connected.
	 * @param sourceActivity the source activity of the transition to be connected to the activity diagram.
	 * @param targetActivity the target activity of the transition to be connected to the activity diagram.
	 */
	public void connectActivityDiagramToTransition(String activityDiagramName, String sourceActivity,
			String targetActivity) {
		String transitionName = "FROM__" + sourceActivity + "__TO__" + targetActivity;
		dynamicOntology.addPropertyAndReverseBetweenIndividuals(activityDiagramName, "diagram_has", transitionName);
	}

	/**
	 * Adds an action to a specific activity of the ontology.
	 * 
	 * @param activityName the name of the activity to connect the action to.
	 * @param actionName the name of the action to be added.
	 */
	public void addActionToActivity(String activityName, String actionName) {
		dynamicOntology.addIndividual("Action", actionName);
		dynamicOntology.addPropertyAndReverseBetweenIndividuals(activityName, "activity_has_action", actionName);
	}

	/**
	 * Adds an object to a specific activity of the ontology.
	 * 
	 * @param activityName the name of the activity to connect the object to.
	 * @param objectName the name of the object to be added.
	 */
	public void addObjectToActivity(String activityName, String objectName) {
		dynamicOntology.addIndividual("Object", objectName);
		dynamicOntology.addPropertyAndReverseBetweenIndividuals(activityName, "activity_has_object", objectName);
	}

	/**
	 * Adds a property to a specific activity of the ontology.
	 * 
	 * @param activityName the name of the activity to connect the property to.
	 * @param propertyName the name of the property to be added.
	 */
	public void addPropertyToActivity(String activityName, String propertyName) {
		dynamicOntology.addIndividual("Property", propertyName);
		dynamicOntology.addPropertyAndReverseBetweenIndividuals(activityName, "activity_has_property", propertyName);
	}

	/**
	 * Adds an activity type to a specific activity of the ontology.
	 * 
	 * @param activityName the name of the activity to connect the type to.
	 * @param activityType the type of the activity to be added.
	 */
	public void addActivityTypeToActivity(String activityName, String activityType) {
		dynamicOntology.addPropertyAndReverseBetweenIndividuals(activityName, "activitytype", activityType);
	}

	/**
	 * Closes the connection of the ontology and saves it to disk. <u><b>NOTE</b></u> that if this function is not
	 * called, then the ontology is not saved.
	 */
	public void close() {
		dynamicOntology.close();
	}

	/**
	 * Returns the activities of the ontology for the current project.
	 * 
	 * @return an {@link ArrayList} containing the names of the activities.
	 */
	public ArrayList<String> getActivities() {
		return dynamicOntology.getIndividualsOfClass("Activity");
	}

	/**
	 * Returns the object of a specific activity.
	 * 
	 * @param activity the name of the activity of which the object is returned.
	 * @return a {@link String} containing the name of the object.
	 */
	public String getObjectOfActivity(String activity) {
		return dynamicOntology.getIndividualNameGivenIndividualAndProperty(activity, "activity_has_object");
	}

	/**
	 * Returns the action of a specific activity.
	 * 
	 * @param activity the name of the activity of which the action is returned.
	 * @return a {@link String} containing the name of the action.
	 */
	public String getActionOfActivity(String activity) {
		return dynamicOntology.getIndividualNameGivenIndividualAndProperty(activity, "activity_has_action");
	}

	/**
	 * Returns the type of a specific activity.
	 * 
	 * @param activity the name of the activity of which the type is returned.
	 * @return a {@link String} containing the name of the type.
	 */
	public String getActivityTypeOfActivity(String activity) {
		String activityType = dynamicOntology.getIndividualPropertyValue(activity, "activitytype");
		return activityType != null ? activityType : "Other";
	}

	/**
	 * Returns the properties of a specific activity.
	 * 
	 * @param activity the name of the activity of which the properties are returned.
	 * @return an {@link ArrayList} containing the name of the properties.
	 */
	public ArrayList<String> getPropertiesOfActivity(String activity) {
		return dynamicOntology.getIndividualNamesGivenIndividualAndProperty(activity, "activity_has_property");
	}

	/**
	 * Returns the activity diagrams of a specific concept.
	 * 
	 * @param concept the name of the concept of which the activity diagrams are returned.
	 * @return an {@link ArrayList} containing the names of the activity diagrams.
	 */
	public ArrayList<String> getDiagramsOfConcept(String concept) {
		return dynamicOntology.getIndividualNamesGivenIndividualAndProperty(concept, "is_of_diagram");
	}

	/**
	 * Returns the text of a specific activity diagram.
	 * 
	 * @param diagram the activity diagram of which the text is returned.
	 * @return the text of the given activity diagram.
	 */
	public String getTextOfActivityDiagram(String diagram) {
		return dynamicOntology.getIndividualComment(diagram);
	}

	/**
	 * Returns the transitions of the ontology for the current project.
	 * 
	 * @return an {@link ArrayList} containing the names of the transitions.
	 */
	public ArrayList<String> getTransitions() {
		return dynamicOntology.getIndividualsOfClass("Transition");
	}

	/**
	 * Returns the condition of a specific transition.
	 * 
	 * @param transition the name of the transition of which the condition is returned.
	 * @return a {@link String} containing the name of the condition.
	 */
	public String getConditionOfTransition(String transition) {
		return dynamicOntology.getIndividualNameGivenIndividualAndProperty(transition, "has_condition");
	}

	/**
	 * Returns the source activity of a specific transition.
	 * 
	 * @param transition the name of the transition of which the source activity is returned.
	 * @return a {@link String} containing the name of the source activity.
	 */
	public String getSourceActivityOfTransition(String transition) {
		return dynamicOntology.getIndividualNameGivenIndividualAndProperty(transition, "has_source");
	}

	/**
	 * Returns the target activity of a specific transition.
	 * 
	 * @param transition the name of the transition of which the target activity is returned.
	 * @return a {@link String} containing the name of the target activity.
	 */
	public String getTargetActivityOfTransition(String transition) {
		return dynamicOntology.getIndividualNameGivenIndividualAndProperty(transition, "has_target");
	}

	/**
	 * Adds an initial activity to the ontology.
	 * 
	 * @param initialActivity the name of the initial activity to be added.
	 */
	public void addInitialActivity(String initialActivity) {
		dynamicOntology.addIndividual("InitialActivity", initialActivity);
	}

	/**
	 * Adds a final activity to the ontology.
	 * 
	 * @param finalActivity the name of the final activity to be added.
	 */
	public void addFinalActivity(String finalActivity) {
		dynamicOntology.addIndividual("FinalActivity", finalActivity);
	}

	/**
	 * Adds a precondition to a specific diagram of the ontology.
	 * 
	 * @param diagramName the name of the diagram to connect the precondition to.
	 * @param precondition the precondition to be added.
	 */
	public void addPreconditionToDiagram(String diagramName, String precondition) {
		dynamicOntology.addIndividual("PreCondition", precondition);
		dynamicOntology.addPropertyAndReverseBetweenIndividuals(diagramName, "diagram_has_condition", precondition);
	}

	/**
	 * Adds an activity to the ontology.
	 * 
	 * @param activity the name of the activity to be added.
	 */
	public void addActivity(String activity) {
		dynamicOntology.addIndividual("Activity", activity);
	}

	/**
	 * Adds a transition to the ontology.
	 * 
	 * @param sourceActivity the source activity of the transition to be added to the ontology.
	 * @param targetActivity the target activity of the transition to be added to the ontology.
	 */
	public void addTransition(String sourceActivity, String targetActivity) {
		String transitionName = "FROM__" + sourceActivity + "__TO__" + targetActivity;
		dynamicOntology.addIndividual("Transition", transitionName);
		dynamicOntology.addPropertyAndReverseBetweenIndividuals(transitionName, "has_source", sourceActivity);
		dynamicOntology.addPropertyAndReverseBetweenIndividuals(transitionName, "has_target", targetActivity);
	}

	/**
	 * Adds a condition to a specific transition of the ontology.
	 * 
	 * @param condition the condition to be connected to the transition.
	 * @param sourceActivity the source activity of the transition to be connected to the condition.
	 * @param targetActivity the target activity of the transition to be connected to the condition.
	 */
	public void addConditionToTransition(String condition, String sourceActivity, String targetActivity) {
		String transitionName = "FROM__" + sourceActivity + "__TO__" + targetActivity;
		dynamicOntology.addIndividual("GuardCondition", condition);
		dynamicOntology.addPropertyAndReverseBetweenIndividuals(transitionName, "has_condition", condition);
	}

}
