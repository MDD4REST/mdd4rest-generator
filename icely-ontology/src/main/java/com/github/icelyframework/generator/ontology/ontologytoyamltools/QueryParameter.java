package com.github.icelyframework.generator.ontology.ontologytoyamltools;

import java.util.ArrayList;

/**
 * Class representing a query parameter of an operation.
 * 
 * @author themis
 */
public class QueryParameter extends OperationProperty {

	/** A boolean denoting if this parameter is an auth token or not. */
	public boolean IsAuthToken;

	/** The URL of this parameter. */
	public String URL;

	/** A boolean denoting if this parameter is optional or not. */
	public boolean IsOptional;

	/**
	 * Initializes this parameter given its name, elements and nested types.
	 * 
	 * @param parameterName the name of this parameter.
	 * @param parameterElements the elements of this parameter.
	 * @param parameterTypeElements the nested types of this parameter.
	 */
	public QueryParameter(String parameterName, String[] parameterElements, ArrayList<String> parameterTypeElements) {
		super(parameterName, parameterElements[0], parameterTypeElements);
		IsAuthToken = Boolean.parseBoolean(parameterElements[1]);
		URL = parameterElements[2];
		if (URL.equals(""))
			URL = null;
		IsOptional = Boolean.parseBoolean(parameterElements[3]);
	}

	/**
	 * Returns a YAML representation of this parameter.
	 * 
	 * @return a YAML representation of this parameter.
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
