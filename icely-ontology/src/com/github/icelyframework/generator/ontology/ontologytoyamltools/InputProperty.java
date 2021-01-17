package com.github.icelyframework.generator.ontology.ontologytoyamltools;

import java.util.ArrayList;

/**
 * Class representing an input property of an operation.
 * 
 * @author themis
 */
public class InputProperty extends OperationProperty {

	/** A boolean denoting if this property is an auth token or not. */
	public boolean IsAuthToken;

	/** The URL of this property. */
	public String URL;

	/** A boolean denoting if this property is optional or not. */
	public boolean IsOptional;

	/**
	 * Initializes this property given its name, elements and nested types.
	 * 
	 * @param parameterName the name of this property.
	 * @param parameterElements the elements of this property.
	 * @param parameterTypeElements the nested types of this property.
	 */
	public InputProperty(String parameterName, String[] parameterElements, ArrayList<String> parameterTypeElements) {
		super(parameterName, parameterElements[0], parameterTypeElements);
		IsAuthToken = Boolean.parseBoolean(parameterElements[1]);
		URL = parameterElements[2];
		if (URL.equals(""))
			URL = null;
		IsOptional = Boolean.parseBoolean(parameterElements[3]);
	}

	/**
	 * Returns a YAML representation of this property.
	 * 
	 * @return a YAML representation of this property.
	 */
	public String toYAMLString() {
		String all = "  - Name: " + Name;
		all += "\n    Type: " + Type;
		all += "\n    TypeRef: " + TypeRef;
		all += "\n    Unique: " + Unique;
		all += "\n    IsAuthToken: " + IsAuthToken;
		all += "\n    URL: " + URL;
		all += "\n    IsOptional: " + IsOptional;
		return all;
	}

}