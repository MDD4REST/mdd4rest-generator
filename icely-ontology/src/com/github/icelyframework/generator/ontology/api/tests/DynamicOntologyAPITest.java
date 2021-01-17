package com.github.icelyframework.generator.ontology.api.tests;

import com.github.icelyframework.generator.ontology.api.DynamicOntologyAPI;

/**
 * An example instantiation of the dynamic ontology.
 * 
 * @author amirdeljouyi
 */
public class DynamicOntologyAPITest {

	/**
	 * Instantiates the ontology.
	 * 
	 * @param args unused parameter.
	 */
	public static void main(String[] args) {

		// Create a new file for the dynamic ontology and instantiate it
		DynamicOntologyAPI ontology = new DynamicOntologyAPI("bookmarks");

		// Add a new diagram
		ontology.addActivityDiagram("Add_Bookmark");

		// Add a start node, an end node and any preconditions
		ontology.addInitialActivity("StartNode");
		ontology.connectActivityDiagramToElement("Add_Bookmark", "StartNode");
		ontology.addPreconditionToDiagram("Add_Bookmark", "User_must_be_logged_in");
		ontology.addFinalActivity("EndNode");
		ontology.connectActivityDiagramToElement("Add_Bookmark", "EndNode");

		// Add an individual for an activity and its properties
		ontology.addActivity("Create_bookmark");
		ontology.connectActivityDiagramToElement("Add_Bookmark", "Create_bookmark");
		ontology.addActionToActivity("Create_bookmark", "create");
		ontology.addObjectToActivity("Create_bookmark", "bookmark");
		ontology.addActivityTypeToActivity("Create_bookmark", "create");
		ontology.addPropertyToActivity("Create_bookmark", "Bookmark_URL");
		ontology.addPropertyToActivity("Create_bookmark", "Bookmark_Name");

		// Add an individual for another activity
		ontology.addActivity("Add_tag");
		ontology.connectActivityDiagramToElement("Add_Bookmark", "Add_tag");
		ontology.addActionToActivity("Add_tag", "add");
		ontology.addObjectToActivity("Add_tag", "tag");
		ontology.addActivityTypeToActivity("Add_tag", "create");
		ontology.addPropertyToActivity("Add_tag", "Tag_text");

		// Add individuals for the first transition
		ontology.addTransition("StartNode", "Create_bookmark");
		ontology.connectActivityDiagramToTransition("Add_Bookmark", "StartNode", "Create_bookmark");

		// Add individuals for another transition (a possible path)
		ontology.addTransition("Create_bookmark", "Add_tag");
		ontology.connectActivityDiagramToTransition("Add_Bookmark", "Create_bookmark", "Add_tag");
		ontology.addConditionToTransition("User_wants_to_add_tag__PATH__Yes", "Create_bookmark", "Add_tag");

		// Add individuals for another transition (another possible path)
		ontology.addTransition("Create_bookmark", "EndNode");
		ontology.connectActivityDiagramToTransition("Add_Bookmark", "Create_bookmark", "EndNode");
		ontology.addConditionToTransition("User_wants_to_add_tag__PATH__No", "Create_bookmark", "EndNode");

		// Add individuals for the final transition
		ontology.addTransition("Add_tag", "EndNode");
		ontology.connectActivityDiagramToTransition("Add_Bookmark", "Add_tag", "EndNode");

		// Close and save the ontology
		ontology.close();
	}

}
