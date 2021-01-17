package com.github.icelyframework.generator.ontology.api.tests;

import com.github.icelyframework.generator.ontology.api.StaticOntologyAPI;

/**
 * An example instantiation of the static ontology.
 * 
 * @author amirdeljouyi
 */
public class StaticOntologyAPITest {

	/**
	 * Instantiates the ontology.
	 * 
	 * @param args unused parameter.
	 */
	public static void main(String[] args) {

		// Create a new file for the static ontology and instantiate it
		StaticOntologyAPI ontology = new StaticOntologyAPI("bookmarks");

		// Add a new requirement
		ontology.addRequirement("FR1");

		// Add an actor
		ontology.addActor("user");
		ontology.connectRequirementToConcept("FR1", "user");

		// Add an object
		ontology.addObject("bookmark");
		ontology.connectRequirementToConcept("FR1", "bookmark");

		// Add an action
		ontology.addAction("create");
		ontology.connectRequirementToOperation("FR1", "create");
		ontology.connectActorToAction("user", "create");
		ontology.connectActionToObject("create","bookmark");

		// Add a property
		ontology.addProperty("tag");
		ontology.connectRequirementToConcept("FR1", "tag");
		ontology.connectElementToProperty("bookmark", "tag");
		
		System.out.println(ontology);

		// Close and save the ontology
		ontology.close();
	}

}
