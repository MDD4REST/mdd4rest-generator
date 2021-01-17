package com.github.icelyframework.generator.ontology.ontologytoyamltools;

/**
 * Class representing a URI property of an operation.
 * 
 * @author themis
 */
public class URIParameter {

	/** The name of this parameter. */
	public String Name;

	/** The type of this parameter. */
	public String Type;

	/**
	 * Initializes this object as a parameter given its name. Its type is intialized to string by default.
	 * 
	 * @param name the name of this parameter.
	 */
	public URIParameter(String name) {
		Name = name;
		Type = "String";
	}

	/**
	 * Returns a YAML representation of this parameter.
	 * 
	 * @return a YAML representation of this parameter.
	 */
	public String toYAMLString() {
		String all = "  - Name: " + Name;
		all += "\n    Type: " + Type;
		return all;
	}

}
