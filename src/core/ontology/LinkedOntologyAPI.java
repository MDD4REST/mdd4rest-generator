package core.ontology;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;

import core.ontology.OntologySource.OntologyType;
import core.ontology.OntologyJenaAPI;

/**
 * Provides an API for the linked ontology in OWL format. Allows adding/deleting instances and properties.
 * 
 * @author themis
 */
public class LinkedOntologyAPI {

	/** The API for the linked ontology. */
	private OntologyJenaAPI linkedOntology;

	/** The project to connect to in the linked ontology. */
	private String projectName;

	/**
	 * Initializes the connection of this API with the ontology. Upon calling this function, the ontology is loaded in
	 * memory. <u><b>NOTE</b></u> that you have to call {@link #close()} in order to save your changes to disk.
	 * 
	 * @param project the project to connect to in the linked ontology.
	 * @param forceDelete boolean denoting whether any existing ontology file should be deleted.
	 */
	public LinkedOntologyAPI(boolean forceDelete) {
		linkedOntology = new OntologyJenaAPI(OntologyType.LINKED,
				"http://www.owl-ontologies.com/Ontology1273059028.owl", forceDelete);
		this.projectName = "Amir Project";
		linkedOntology.addIndividual("Project", projectName);
	}

	/**
	 * Initializes the connection of this API with the ontology. Upon calling this function, the ontology is loaded in
	 * memory. <u><b>NOTE</b></u> that you have to call {@link #close()} in order to save your changes to disk.
	 * 
	 * @param project the project to connect to in the linked ontology.
	 */
	public LinkedOntologyAPI() {
		linkedOntology = new OntologyJenaAPI(OntologyType.LINKED,
				"http://www.owl-ontologies.com/Ontology1273059028.owl");
		this.projectName = "Amir Project";
		linkedOntology.addIndividual("Project", projectName);
	}

	/**
	 * Similar to the other constructors, used only for testing reasons.
	 * 
	 * @param projectName the name of the project.
	 */
	public LinkedOntologyAPI(String projectName) {
		linkedOntology = new OntologyJenaAPI(OntologyType.LINKED,
				"http://www.owl-ontologies.com/Ontology1273059028.owl", true);
		this.projectName = projectName;
		linkedOntology.addIndividual("Project", projectName);
	}

	/**
	 * Similar to the other constructors, used only for testing reasons.
	 * 
	 * @param projectName the name of the project.
	 * @param forceDelete delete any existing ontology file.
	 */
	public LinkedOntologyAPI(String projectName, boolean forceDelete) {
		linkedOntology = new OntologyJenaAPI(OntologyType.LINKED,
				"http://www.owl-ontologies.com/Ontology1273059028.owl", forceDelete);
		this.projectName = projectName;
		linkedOntology.addIndividual("Project", projectName);
	}

	/**
	 * Connects the project to an element of the ontology.
	 * 
	 * @param elementName the element to be connected to the project.
	 */
	public void connectProjectToElement(String elementName) {
		linkedOntology.addPropertyAndReverseBetweenIndividuals(projectName, "has_element", elementName);
	}

	/**
	 * Adds a requirement in the ontology and connects it to the project.
	 * 
	 * @param requirementName the requirement to be added.
	 */
	public void addRequirement(String requirementName) {
		linkedOntology.addIndividual("Requirement", requirementName);
		linkedOntology.addPropertyAndReverseBetweenIndividuals(projectName, "has_requirement", requirementName);
	}

	/**
	 * Adds a requirement in the ontology, including its text, and connects it to the project.
	 * 
	 * @param requirementName the requirement to be added.
	 * @param requirementsText the text of the requirement to be added.
	 */
	public void addRequirement(String requirementName, String requirementsText) {
		linkedOntology.addIndividual("Requirement", requirementName, requirementsText);
		linkedOntology.addPropertyAndReverseBetweenIndividuals(projectName, "has_requirement", requirementName);
	}

	/**
	 * Connects a requirement to an element of the ontology.
	 * 
	 * @param requirementName the requirement to be connected.
	 * @param elementName the element to be connected to the requirement.
	 */
	public void connectRequirementToElement(String requirementName, String elementName) {
		linkedOntology.addPropertyAndReverseBetweenIndividuals(requirementName, "contains_element", elementName);
		linkedOntology.addPropertyAndReverseBetweenIndividuals(projectName, "has_element", elementName);
	}

	/**
	 * Adds an activity diagram in the ontology and connects it to the project.
	 * 
	 * @param activityDiagramName the activity diagram to be added.
	 */
	public void addActivityDiagram(String activityDiagramName) {
		linkedOntology.addIndividual("ActivityDiagram", activityDiagramName);
		linkedOntology
				.addPropertyAndReverseBetweenIndividuals(projectName, "has_activity_diagram", activityDiagramName);
	}

	/**
	 * Adds an activity diagram in the ontology, including its text, and connects it to the project.
	 * 
	 * @param activityDiagramName the activity diagram to be added.
	 * @param activityDiagramText the text of the activity diagram to be added.
	 */
	public void addActivityDiagram(String activityDiagramName, String activityDiagramText) {
		linkedOntology.addIndividual("ActivityDiagram", activityDiagramName, activityDiagramText);
		linkedOntology
				.addPropertyAndReverseBetweenIndividuals(projectName, "has_activity_diagram", activityDiagramName);
	}

	/**
	 * Connects an activity diagram to an element of the ontology.
	 * 
	 * @param activityDiagramName the activity diagram to be connected.
	 * @param elementName the element to be connected to the activity diagram.
	 */
	public void connectActivityDiagramToElement(String activityDiagramName, String elementName) {
		linkedOntology.addPropertyAndReverseBetweenIndividuals(activityDiagramName, "contains_element", elementName);
		linkedOntology.addPropertyAndReverseBetweenIndividuals(projectName, "has_element", elementName);
	}

	/**
	 * Adds a resource to the ontology.
	 * 
	 * @param resourceName the name of the resource to be added.
	 */
	public void addResource(String resourceName) {
		linkedOntology.addIndividual("Resource", resourceName);
		linkedOntology.addPropertyToIndividual(resourceName, "isExternalService", false);
	}

	/**
	 * Adds a resource to the ontology.
	 * 
	 * @param resourceName the name of the resource to be added.
	 * @param resourceIsExternalService boolean denoting if the resource is an external service.
	 */
	public void addResource(String resourceName, boolean resourceIsExternalService) {
		linkedOntology.addIndividual("Resource", resourceName);
		linkedOntology.addPropertyToIndividual(resourceName, "isExternalService", resourceIsExternalService);
	}

	/**
	 * Adds a property to a specific resource of the ontology.
	 * 
	 * @param resourceName the name of the resource to connect the property to.
	 * @param propertyName the name of the property to be added.
	 */
	public void addPropertyToResource(String resourceName, String propertyName) {
		linkedOntology.addIndividual("Property", propertyName);
		linkedOntology.addPropertyAndReverseBetweenIndividuals(resourceName, "has_property", propertyName);
	}

	/**
	 * Adds an activity to a specific resource of the ontology. Sets the activity type of the activity to "Other".
	 * 
	 * @param resourceName the name of the resource to connect the activity to.
	 * @param activityName the name of the activity to be added.
	 */
	public void addActivityToResource(String resourceName, String activityName) {
		linkedOntology.addIndividual("Activity", activityName);
		linkedOntology.addPropertyAndReverseBetweenIndividuals(resourceName, "has_activity", activityName);
		linkedOntology.addPropertyToIndividual(activityName, "activitytype", "Other");
	}

	/**
	 * Adds an activity to a specific resource of the ontology. This function is overloaed in order to account for the
	 * type of the activity.
	 * 
	 * @param resourceName the name of the resource to connect the activity to.
	 * @param activityName the name of the activity to be added.
	 * @param activitytype the type of the newly added activity.
	 */
	public void addActivityToResource(String resourceName, String activityName, String activitytype) {
		linkedOntology.addIndividual("Activity", activityName);
		linkedOntology.addPropertyAndReverseBetweenIndividuals(resourceName, "has_activity", activityName);
		linkedOntology.addPropertyToIndividual(activityName, "activitytype", activitytype);
	}

	/**
	 * Adds an action to a specific activity of the ontology.
	 * 
	 * @param activityName the name of the activity to connect the action to.
	 * @param actionName the name of the action to be added.
	 */
	public void addActionToActivity(String activityName, String actionName) {
		linkedOntology.addIndividual("Action", actionName);
		linkedOntology.addPropertyAndReverseBetweenIndividuals(activityName, "has_action", actionName);
	}

	/**
	 * Adds a condition to a specific activity of the ontology.
	 * 
	 * @param activityName the name of the activity to connect the action to.
	 * @param conditionName the name of the condition to be added.
	 */
	public void addConditionToActivity(String activityName, String conditionName) {
		linkedOntology.addIndividual("Condition", conditionName);
		linkedOntology.addPropertyAndReverseBetweenIndividuals(activityName, "has_condition", conditionName);
	}

	/**
	 * Adds a forthcoming activity to a specific activity of the ontology.
	 * 
	 * @param activityName the name of the activity to connect the next activity to.
	 * @param nextActivityName the name of the next activity to be added.
	 */
	public void addNextActivityToActivity(String activityName, String nextActivityName) {
		linkedOntology.addPropertyAndReverseBetweenIndividuals(activityName, "has_next_activity", nextActivityName);
	}

	/**
	 * Adds a related resource to a resource.
	 * 
	 * @param resourceName the name of the resource to relate the related resource to.
	 * @param relatedResourceName the name of the related resource to be added.
	 */
	public void addRelatedResourceToResource(String resourceName, String relatedResourceName) {
		linkedOntology.addPropertyAndReverseBetweenIndividuals(resourceName, "has_related_resource",
				relatedResourceName);
	}

	/**
	 * Adds an operation to a specific resource of the ontology.
	 * 
	 * @param resourceName the name of the resource to connect the operation to.
	 * @param operationName the name of the operation to be added.
	 * @param operationURL the URL to which this operation belongs.
	 * @param operationPath the path of the newly added operation.
	 * @param operationWSType the type of the web service of the newly added operation.
	 * @param operationCRUDVerb the CRUD verb of the newly added operation.
	 */
	public void addOperationToResource(String resourceName, String operationName, String operationURL,
			String operationPath, String operationWSType, String operationCRUDVerb, String operationResponseType) {
		linkedOntology.addIndividual("Operation", operationName);
		linkedOntology.addPropertyAndReverseBetweenIndividuals(resourceName, "has_operation", operationName);
		linkedOntology.addPropertyToIndividual(operationName, "hasName", operationName);
		linkedOntology.addPropertyToIndividual(operationName, "belongsToURL", operationURL);
		linkedOntology.addPropertyToIndividual(operationName, "hasResourcePath", operationPath);
		linkedOntology.addPropertyToIndividual(operationName, "belongsToWSType", operationWSType);
		linkedOntology.addPropertyToIndividual(operationName, "hasCRUDVerb", operationCRUDVerb);
		linkedOntology.addPropertyToIndividual(operationName, "hasResponseType", operationResponseType);
	}

	/**
	 * Adds a query parameter to the ontology.
	 * 
	 * @param parameterName the name of the parameter to be added.
	 * @param parameterType the type of the newly added parameter, one of "Primitive", "Array", "Object"
	 * @param parameterIsAuthToken boolean denoting whether the parameter is an auth token.
	 * @param parameterAuthURL the URL to which this parameter auth token is sent, null if it is not an auth token.
	 * @param parameterIsOptional boolean denoting whether the parameter is optional.
	 * @param parameterHasElements string or strings denoting the names of the parameter elements.
	 */
	public void addQueryParameter(String parameterName, String parameterType, boolean parameterIsAuthToken,
			String parameterAuthURL, boolean parameterIsOptional, String... parameterHasElements) {
		addInputParameter(parameterName, parameterType, parameterIsAuthToken, parameterAuthURL, parameterIsOptional,
				parameterHasElements);
	}

	/**
	 * Adds a query parameter to the ontology. Overloads
	 * {@link #addQueryParameter(String, String, boolean, String, boolean, String...)}.
	 * 
	 * @param parameterName the name of the parameter to be added.
	 * @param parameterType the type of the newly added parameter, one of "Primitive", "Array", "Object"
	 * @param parameterIsAuthToken boolean denoting whether the parameter is an auth token.
	 * @param parameterAuthURL the URL to which this parameter auth token is sent, null if it is not an auth token.
	 * @param parameterIsOptional boolean denoting whether the parameter is optional.
	 * @param parameterHasElements a list denoting the names of the parameter elements.
	 */
	public void addQueryParameter(String parameterName, String parameterType, boolean parameterIsAuthToken,
			String parameterAuthURL, boolean parameterIsOptional, List<String> parameterHasElements) {
		addInputParameter(parameterName, parameterType, parameterIsAuthToken, parameterAuthURL, parameterIsOptional,
				parameterHasElements);
	}

	/**
	 * Adds an input parameter to the ontology.
	 * 
	 * @param parameterName the name of the parameter to be added.
	 * @param parameterType the type of the newly added parameter, one of "Primitive", "Array", "Object"
	 * @param parameterIsAuthToken boolean denoting whether the parameter is an auth token.
	 * @param parameterAuthURL the URL to which this parameter auth token is sent, null if it is not an auth token.
	 * @param parameterIsOptional boolean denoting whether the parameter is optional.
	 * @param parameterHasElements string or strings denoting the names of the parameter elements.
	 */
	public void addInputParameter(String parameterName, String parameterType, boolean parameterIsAuthToken,
			String parameterAuthURL, boolean parameterIsOptional, String... parameterHasElements) {
		linkedOntology.addIndividual("InputRepresentation", parameterName);
		linkedOntology.addPropertyToIndividual(parameterName, "hasName", parameterName);
		linkedOntology.addPropertyToIndividual(parameterName, "isType", parameterType);
		linkedOntology.addPropertyToIndividual(parameterName, "isAuthToken", parameterIsAuthToken);
		linkedOntology.addPropertyToIndividual(parameterName, "belongsToURL", parameterAuthURL);
		linkedOntology.addPropertyToIndividual(parameterName, "isOptional", parameterIsOptional);
		for (String parameterElement : parameterHasElements) {
			linkedOntology.addPropertyAndReverseBetweenIndividuals(parameterName, "has_elements", parameterElement);
		}
	}

	/**
	 * Adds an input parameter to the ontology. Overloads
	 * {@link #addInputParameter(String, String, boolean, String, boolean, String...)}.
	 * 
	 * @param parameterName the name of the parameter to be added.
	 * @param parameterType the type of the newly added parameter, one of "Primitive", "Array", "Object"
	 * @param parameterIsAuthToken boolean denoting whether the parameter is an auth token.
	 * @param parameterAuthURL the URL to which this parameter auth token is sent, null if it is not an auth token.
	 * @param parameterIsOptional boolean denoting whether the parameter is optional.
	 * @param parameterHasElements a list denoting the names of the parameter elements.
	 */
	public void addInputParameter(String parameterName, String parameterType, boolean parameterIsAuthToken,
			String parameterAuthURL, boolean parameterIsOptional, List<String> parameterHasElements) {
		addInputParameter(parameterName, parameterType, parameterIsAuthToken, parameterAuthURL, parameterIsOptional,
				parameterHasElements.toArray(new String[parameterHasElements.size()]));
	}

	/**
	 * Adds an output parameter to the ontology.
	 * 
	 * @param parameterName the name of the parameter to be added.
	 * @param parameterType the type of the newly added parameter, one of "Primitive", "Array", "Object"
	 * @param parameterHasElements string or strings denoting the names of the parameter elements.
	 */
	public void addOutputParameter(String parameterName, String parameterType, String... parameterHasElements) {
		linkedOntology.addIndividual("OutputRepresentation", parameterName);
		linkedOntology.addPropertyToIndividual(parameterName, "hasName", parameterName);
		linkedOntology.addPropertyToIndividual(parameterName, "isType", parameterType);
		for (String parameterElement : parameterHasElements) {
			linkedOntology.addPropertyAndReverseBetweenIndividuals(parameterName, "has_elements", parameterElement);
		}
	}

	/**
	 * Adds an output parameter to the ontology. Overloads {@link #addOutputParameter(String, String, String...)}.
	 * 
	 * @param parameterName the name of the parameter to be added.
	 * @param parameterType the type of the newly added parameter, one of "Primitive", "Array", "Object"
	 * @param parameterHasElements a list of strings denoting the names of the parameter elements.
	 */
	public void addOutputParameter(String parameterName, String parameterType, List<String> parameterHasElements) {
		addOutputParameter(parameterName, parameterType,
				parameterHasElements.toArray(new String[parameterHasElements.size()]));
	}

	/**
	 * Adds one or more URI parameters in an operation.
	 * 
	 * @param operationName the name of the operation to add the URI parameter to.
	 * @param parameterNames the names of the parameters to be added to the operation.
	 */
	public void addURIParametersToOperation(String operationName, String... parameterNames) {
		for (String parameterName : parameterNames) {
			linkedOntology.addPropertyToIndividual(operationName, "hasURIParameters", parameterName);
		}
	}

	/**
	 * Adds one or more URI parameters in an operation. Overloads
	 * {@link #addURIParametersToOperation(String, String...)}.
	 * 
	 * @param operationName the name of the operation to add the URI parameter to.
	 * @param parameterNames a list of the names of the parameters to be added to the operation.
	 */
	public void addURIParametersToOperation(String operationName, List<String> parameterNames) {
		addURIParametersToOperation(operationName, parameterNames.toArray(new String[parameterNames.size()]));
	}

	/**
	 * Adds one or more query parameters in an operation. <u><b>NOTE</b></u> that you have to add the
	 * parameters to the linked ontology (using {@link #addQueryParameter}) before calling this method.
	 * 
	 * @param operationName the name of the operation to add the URI parameter to.
	 * @param parameterNames the names of the parameters to be added to the operation.
	 */
	public void addQueryParametersToOperation(String operationName, String... parameterNames) {
		for (String parameterName : parameterNames) {
			linkedOntology
					.addPropertyAndReverseBetweenIndividuals(operationName, "has_query_parameters", parameterName);
		}
	}

	/**
	 * Adds one or more query parameters in an operation. <u><b>NOTE</b></u> that you have to add the
	 * parameters to the linked ontology (using {@link #addQueryParameter}) before calling this method. Overloads
	 * {@link #addQueryParametersToOperation(String, String...)}.
	 * 
	 * @param operationName the name of the operation to add the URI parameter to.
	 * @param parameterNames a list of the names of the parameters to be added to the operation.
	 */
	public void addQueryParametersToOperation(String operationName, List<String> parameterNames) {
		addQueryParametersToOperation(operationName, parameterNames.toArray(new String[parameterNames.size()]));
	}

	/**
	 * Adds one or more input parameters in an operation. <u><b>NOTE</b></u> that you have to add the
	 * parameters to the linked ontology (using {@link #addInputParameter}) before calling this method.
	 * 
	 * @param operationName the name of the operation to add the URI parameter to.
	 * @param parameterNames the names of the parameters to be added to the operation.
	 */
	public void addInputParametersToOperation(String operationName, String... parameterNames) {
		for (String parameterName : parameterNames) {
			linkedOntology.addPropertyAndReverseBetweenIndividuals(operationName, "has_input", parameterName);
		}
	}

	/**
	 * Adds one or more input parameters in an operation. <u><b>NOTE</b></u> that you have to add the
	 * parameters to the linked ontology (using {@link #addInputParameter}) before calling this method. Overloads
	 * {@link #addInputParametersToOperation(String, String...)}.
	 * 
	 * @param operationName the name of the operation to add the URI parameter to.
	 * @param parameterNames the names of the parameters to be added to the operation.
	 */
	public void addInputParametersToOperation(String operationName, List<String> parameterNames) {
		addInputParametersToOperation(operationName, parameterNames.toArray(new String[parameterNames.size()]));
	}

	/**
	 * Adds one or more output parameters in an operation. <u><b>NOTE</b></u> that you have to add the
	 * parameters to the linked ontology (using {@link #addOutputParameter}) before calling this method.
	 * 
	 * @param operationName the name of the operation to add the URI parameter to.
	 * @param parameterNames the names of the parameters to be added to the operation.
	 */
	public void addOutputParametersToOperation(String operationName, String... parameterNames) {
		for (String parameterName : parameterNames) {
			linkedOntology.addPropertyAndReverseBetweenIndividuals(operationName, "has_output", parameterName);
		}
	}

	/**
	 * Adds one or more output parameters in an operation. <u><b>NOTE</b></u> that you have to add the
	 * parameters to the linked ontology (using {@link #addOutputParameter}) before calling this method. Overloads
	 * {@link #addOutputParametersToOperation(String, String...)}.
	 * 
	 * @param operationName the name of the operation to add the URI parameter to.
	 * @param parameterNames the names of the parameters to be added to the operation.
	 */
	public void addOutputParametersToOperation(String operationName, List<String> parameterNames) {
		addOutputParametersToOperation(operationName, parameterNames.toArray(new String[parameterNames.size()]));
	}

	/**
	 * Returns the resources of the ontology for the current project.
	 * 
	 * @return an {@link ArrayList} containing the names of the resources.
	 */
	public ArrayList<String> getResources() {
		return linkedOntology.getIndividualsOfClass("Resource");
	}

	/**
	 * Returns the activities of a specific resource.
	 * 
	 * @param resourceName the name of the resource of which the activities are returned.
	 * @return an {@link ArrayList} containing the name of the activities.
	 */
	public ArrayList<String> getActivitiesOfResource(String resourceName) {
		return linkedOntology.getIndividualNamesGivenIndividualAndProperty(resourceName, "has_activity");
	}

	/**
	 * Returns the properties of a specific resource.
	 * 
	 * @param resourceName the name of the resource of which the properties are returned.
	 * @return an {@link ArrayList} containing the names of the properties.
	 */
	public ArrayList<String> getPropertiesOfResource(String resourceName) {
		return linkedOntology.getIndividualNamesGivenIndividualAndProperty(resourceName, "has_property");
	}

	/**
	 * Returns the related resources of a specific resource.
	 * 
	 * @param resourceName the name of the resource of which the related resources are returned.
	 * @return an {@link ArrayList} containing the names of the related resources.
	 */
	public ArrayList<String> getRelationshipsOfResource(String resourceName) {
		return linkedOntology.getIndividualNamesGivenIndividualAndProperty(resourceName, "has_related_resource");
	}

	/**
	 * Returns the resource of a specific activity.
	 * 
	 * @param activityName the name of the activity of which the resource is returned.
	 * @return the name of the resource.
	 */
	public String getResourceOfActivity(String activityName) {
		return linkedOntology.getIndividualNameGivenIndividualAndProperty(activityName, "is_activity_of");
	}

	/**
	 * Returns the forthcoming activities of a specific activity.
	 * 
	 * @param activityName the name of the activity of which the next activities are returned.
	 * @return an {@link ArrayList} containing the names of the next activities.
	 */
	public ArrayList<String> getNextActivitiesOfActivity(String activityName) {
		return linkedOntology.getIndividualNamesGivenIndividualAndProperty(activityName, "has_next_activity");
	}

	/**
	 * Returns the action of a specific activity.
	 * 
	 * @param activityName the name of the activity of which the action is returned.
	 * @return the name of the action.
	 */
	public String getActionOfActivity(String activityName) {
		return linkedOntology.getIndividualNameGivenIndividualAndProperty(activityName, "has_action");
	}

	/**
	 * Returns the activity type of a specific activity.
	 * 
	 * @param activityName the name of the activity of which the activity type is returned.
	 * @return the type of the activity.
	 */
	public String getActivityTypeOfActivity(String activityName) {
		return linkedOntology.getIndividualPropertyValue(activityName, "activitytype");
	}

	/**
	 * Returns a boolean indicating whether a resource is an external service.
	 * 
	 * @param resourceName the name of the resource to check if it is an external service.
	 * @return a boolean indicating whether the resource is an external service ({@code true}), or not ({@code false}).
	 */
	public boolean resourceIsExternalService(String resourceName) {
		String value = linkedOntology.getIndividualPropertyValue(resourceName, "isExternalService");
		if (value != null)
			return Boolean.parseBoolean(value);
		return false;
	}

	/**
	 * Returns the operation of a specific resource.
	 * 
	 * @param resourceName the name of the resource of which the operation is returned.
	 * @return the name of the operation.
	 */
	public String getOperationOfResource(String resourceName) {
		return linkedOntology.getIndividualNameGivenIndividualAndProperty(resourceName, "has_operation");
	}

	/**
	 * Returns the elements of a specific operation, including the ontology instances for classes {@code "belongsToURL"}
	 * , {@code "hasResourcePath"}, {@code "belongsToWSType"}, {@code "hasCRUDVerb"}, and {@code "hasResponseType"}.
	 * 
	 * @param operationName the name of the operation of which the elements are returned.
	 * @return an array of the operation elements.
	 */
	public String[] getOperationElements(String operationName) {
		return linkedOntology.getIndividualPropertiesValues(operationName, "belongsToURL", "hasResourcePath",
				"belongsToWSType", "hasCRUDVerb", "hasResponseType");
	}

	/**
	 * Returns the query parameters of a specific operation.
	 * 
	 * @param operationName the name of the operation of which the query parameters are returned.
	 * @return an {@link ArrayList} containing the names of the query parameters.
	 */
	public ArrayList<String> getQueryParametersOfOperation(String operationName) {
		return linkedOntology.getIndividualNamesGivenIndividualAndProperty(operationName, "has_query_parameters");
	}

	/**
	 * Returns the elements of a specific query parameter, including the ontology instances for classes {@code "isType"}
	 * , {@code "isAuthToken"}, {@code "belongsToURL"}, and {@code "isOptional"}.
	 * 
	 * @param parameterName the name of the query parameter of which the elements are returned.
	 * @return an array of the query parameter elements.
	 */
	public String[] getQueryParameterElements(String parameterName) {
		return linkedOntology.getIndividualPropertiesValues(parameterName, "isType", "isAuthToken", "belongsToURL",
				"isOptional");
	}

	/**
	 * Returns the input parameters of a specific operation.
	 * 
	 * @param operationName the name of the operation of which the input parameters are returned.
	 * @return an {@link ArrayList} containing the names of the input parameters.
	 */
	public ArrayList<String> getInputParametersOfOperation(String operationName) {
		return linkedOntology.getIndividualNamesGivenIndividualAndProperty(operationName, "has_input");
	}

	/**
	 * Returns the elements of a specific input parameter, including the ontology instances for classes {@code "isType"}
	 * , {@code "isAuthToken"}, {@code "belongsToURL"}, and {@code "isOptional"}.
	 * 
	 * @param parameterName the name of the input parameter of which the elements are returned.
	 * @return an array of the input parameter elements.
	 */
	public String[] getInputParameterElements(String parameterName) {
		return linkedOntology.getIndividualPropertiesValues(parameterName, "isType", "isAuthToken", "belongsToURL",
				"isOptional");
	}

	/**
	 * Returns the output parameters of a specific operation.
	 * 
	 * @param operationName the name of the operation of which the output parameters are returned.
	 * @return an {@link ArrayList} containing the names of the output parameters.
	 */
	public ArrayList<String> getOutputParametersOfOperation(String operationName) {
		return linkedOntology.getIndividualNamesGivenIndividualAndProperty(operationName, "has_output");
	}

	/**
	 * Returns the elements of a specific output parameter, including the ontology instance for class {@code "isType"}.
	 * 
	 * @param parameterName the name of the output parameter of which the elements are returned.
	 * @return an array of the output parameter elements.
	 */
	public String[] getOutputParameterElements(String parameterName) {
		return linkedOntology.getIndividualPropertiesValues(parameterName, "isType");
	}

	/**
	 * Returns the URI parameters of a specific operation.
	 * 
	 * @param operationName the name of the operation of which the URI parameters are returned.
	 * @return an {@link ArrayList} containing the names of the URI parameters.
	 */
	public ArrayList<String> getURIParametersOfOperation(String operationName) {
		return linkedOntology.getIndividualPropertyValues(operationName, "hasURIParameters");
	}

	/**
	 * Returns the type elements for a specific parameter.
	 * 
	 * @param parameterName the name of the parameter of which the type elements are returned.
	 * @return an {@link ArrayList} containing the names of the type elements.
	 */
	public ArrayList<String> getParameterTypeElements(String parameterName) {
		return linkedOntology.getIndividualNamesGivenIndividualAndProperty(parameterName, "has_elements");
	}

	/**
	 * Closes the connection of the ontology and saves it to disk. <u><b>NOTE</b></u> that if this function is not
	 * called, then the ontology is not saved.
	 */
	public void close() {
		linkedOntology.close();
	}
}
