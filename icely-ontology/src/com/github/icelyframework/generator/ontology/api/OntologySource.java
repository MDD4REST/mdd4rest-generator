package com.github.icelyframework.generator.ontology.api;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Class containing the source of the three ontologies.
 * 
 * @author themis
 */
public class OntologySource {

	/**
	 * Enumeration for the three types of ontologies.
	 */
	public enum OntologyType {

		/** Static ontology */
		STATIC,
		/** Dynamic ontology */
		DYNAMIC,
		/** Linked ontology */
		LINKED
	}

	/**
	 * Returns an ontology instance given its type.
	 * 
	 * @param ontologyType the type of the ontology to be returned.
	 * @return the instance of the ontology.
	 */
	public static final FileInputStream getOntology(OntologyType ontologyType) {
		try {
			switch (ontologyType) {
			case STATIC:
				return new FileInputStream(new File(StaticOntologyPath));
			case DYNAMIC:
				return new FileInputStream(new File(DynamicOntologyPath));
			case LINKED:
				return new FileInputStream(new File(LinkedOntologyPath));
			default:
				return null;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * The string of the static ontology.
	 */
//	File file = new File("resources/activity diagram/model.uml");
	public final static String StaticOntologyPath = "resources/ontology/static.owl";

	/**
	 * The string of the dynamic ontology.
	 */
	public final static String DynamicOntologyPath = "resources/ontology/dynamic.owl";

	/**
	 * The string of the linked ontology.
	 */
	public final static String LinkedOntologyPath = "resources/ontology/linked.owl";
}
