package com.github.icelyframework.generator.ontology.api;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

import com.github.icelyframework.generator.ontology.CIMEngineStarter;

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
	public final static InputStream getOntology(OntologyType ontologyType) {
		ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
	    
		try {
			switch (ontologyType) {
			case STATIC: {
				Path temp = Files.createTempFile("static-", ".owl");
				Files.copy(classLoader.getResourceAsStream(StaticOntologyPath), temp, StandardCopyOption.REPLACE_EXISTING);
				return new FileInputStream(temp.toFile());
			}
			case DYNAMIC: {
				Path temp = Files.createTempFile("dynamic-", ".owl");
				Files.copy(classLoader.getResourceAsStream(DynamicOntologyPath), temp, StandardCopyOption.REPLACE_EXISTING);
				return new FileInputStream(temp.toFile());
			}
			case LINKED: {
				Path temp = Files.createTempFile("linked-", ".owl");
				Files.copy(classLoader.getResourceAsStream(LinkedOntologyPath), temp, StandardCopyOption.REPLACE_EXISTING);
				return new FileInputStream(temp.toFile());
			}
			default:
				return null;
			}
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * The string of the static ontology.
	 */
//	File file = new File("resources/activity diagram/model.uml");
	public final static String StaticOntologyPath = "static.owl";

	/**
	 * The string of the dynamic ontology.
	 */
	public final static String DynamicOntologyPath = "dynamic.owl";

	/**
	 * The string of the linked ontology.
	 */
	public final static String LinkedOntologyPath = "linked.owl";
}
