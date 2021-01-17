package com.github.icelyframework.generator.ontology.ontologytoyamltools;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Class representing an operation of an external service resource.
 * 
 * @author themis
 */
public class Operation {

	/** The name of this operation. */
	public String OperationName;

	/** The URL of this operation. */
	public String TargetServiceURL;

	/** The URL path of this operation. */
	public String TargetServicePath;

	/** The WS type of this operation. */
	public String TargetServiceWSType;

	/** The CRUD verb used for this operation. */
	public String TargetServiceCRUDVerb;

	/** The type of the response of this operation. */
	public String TargetServiceResponseType;

	/** A list of the query parameters of the operation. */
	public ArrayList<QueryParameter> TargetServiceQueryParameters;

	/** A list of the URI parameters of the operation. */
	public ArrayList<URIParameter> TargetServiceURIParameters;

	/** A list of the input parameters of the operation. */
	public ArrayList<InputProperty> TargetServiceInputProperties;

	/** A list of the output parameters of the operation. */
	public ArrayList<OutputProperty> TargetServiceOutputProperties;

	/** A list of the complex types of the operation (used for nested types). */
	public ComplexTypes complexTypes;

	/**
	 * Initializes this operation given its name and elements.
	 * 
	 * @param operationName the name of this property.
	 * @param operationElements the elements of this property.
	 */
	public Operation(String operationName, String... operationElements) {
		OperationName = operationName;
		TargetServiceURL = operationElements[0];
		TargetServicePath = operationElements[1];
		TargetServiceWSType = operationElements[2];
		TargetServiceCRUDVerb = operationElements[3];
		TargetServiceResponseType = operationElements[4];
		TargetServiceQueryParameters = new ArrayList<QueryParameter>();
		TargetServiceURIParameters = new ArrayList<URIParameter>();
		TargetServiceInputProperties = new ArrayList<InputProperty>();
		TargetServiceOutputProperties = new ArrayList<OutputProperty>();
		complexTypes = new ComplexTypes();
	}

	/**
	 * Returns the non-primitive properties of the given list of properties.
	 * 
	 * @param parameterTypeElements the list of properties/parameters given as an {@link ArrayList}.
	 * @return a {@link LinkedList} with the properties/parameters that are not primitive.
	 */
	private LinkedList<String> findNonPrimitiveProperties(ArrayList<String> parameterTypeElements) {
		LinkedList<String> nonPrimitiveProperties = new LinkedList<String>();
		for (String parameterTypeElement : parameterTypeElements) {
			if (!(StringHelpers.isPrimitive(parameterTypeElement)))
				nonPrimitiveProperties.add(parameterTypeElement);
		}
		return nonPrimitiveProperties;
	}

	/**
	 * Adds a URI parameter to this operation, given its name.
	 * 
	 * @param parameterName the name of the parameter to be added.
	 */
	public void addURIParameter(String parameterName) {
		TargetServiceURIParameters.add(new URIParameter(parameterName));
	}

	/**
	 * Adds a query parameter to this operation, given its name, elements and nested types. Returns the non-primitive
	 * types that are used by this parameter (i.e. nested types).
	 * 
	 * @param parameterName the name of the parameter to be added.
	 * @param parameterElements the elements of the parameter to be added.
	 * @param parameterTypeElements the nested types of the parameter to be added.
	 * @return a {@link LinkedList} with the non-primitive types that are used by the newly added parameter.
	 */
	public LinkedList<String> addQueryParameter(String parameterName, String[] parameterElements,
			ArrayList<String> parameterTypeElements) {
		TargetServiceQueryParameters.add(new QueryParameter(parameterName, parameterElements, parameterTypeElements));
		return findNonPrimitiveProperties(parameterTypeElements);
	}

	/**
	 * Adds an input property to this operation, given its name, elements and nested types. Returns the non-primitive
	 * types that are used by this property (i.e. nested types).
	 * 
	 * @param parameterName the name of the property to be added.
	 * @param parameterElements the elements of the property to be added.
	 * @param parameterTypeElements the nested types of the property to be added.
	 * @return a {@link LinkedList} with the non-primitive types that are used by the newly added property.
	 */
	public LinkedList<String> addInputProperty(String parameterName, String[] parameterElements,
			ArrayList<String> parameterTypeElements) {
		TargetServiceInputProperties.add(new InputProperty(parameterName, parameterElements, parameterTypeElements));
		return findNonPrimitiveProperties(parameterTypeElements);
	}

	/**
	 * Adds an output property to this operation, given its name, elements and nested types. Returns the non-primitive
	 * types that are used by this property (i.e. nested types).
	 * 
	 * @param parameterName the name of the property to be added.
	 * @param parameterElements the elements of the property to be added.
	 * @param parameterTypeElements the nested types of the property to be added.
	 * @return a {@link LinkedList} with the non-primitive types that are used by the newly added property.
	 */
	public LinkedList<String> addOutputProperty(String parameterName, String[] parameterElements,
			ArrayList<String> parameterTypeElements) {
		TargetServiceOutputProperties.add(new OutputProperty(parameterName, parameterElements, parameterTypeElements));
		return findNonPrimitiveProperties(parameterTypeElements);
	}

	/**
	 * Adds a non-primitive property to this operation, given its name, elements and nested types. Returns the
	 * non-primitive types that are used by this property (i.e. nested types).
	 * 
	 * @param parameterName the name of the property to be added.
	 * @param parameterElements the elements of the property to be added.
	 * @param parameterTypeElements the nested types of the property to be added.
	 * @return a {@link LinkedList} with the non-primitive types that are used by the newly added property.
	 */
	public LinkedList<String> addNonPrimitiveProperty(String parameterName, String[] parameterElements,
			ArrayList<String> parameterTypeElements) {
		complexTypes.addOperationProperty(new OperationProperty(parameterName, parameterElements[0],
				parameterTypeElements));
		return findNonPrimitiveProperties(parameterTypeElements);
	}

	/**
	 * Returns a YAML representation of this operation.
	 * 
	 * @return a YAML representation of this operation.
	 */
	@SuppressWarnings("unchecked")
	public String toYAMLString() {
		String all = "\n  TargetServiceURL: " + TargetServiceURL;
		all += "\n  TargetServicePath: " + TargetServicePath;
		all += "\n  TargetServiceWSType: " + TargetServiceWSType;
		all += "\n  TargetServiceCRUDVerb: " + TargetServiceCRUDVerb;
		all += "\n  TargetServiceResponseType: " + TargetServiceResponseType;
		complexTypes
				.populate(TargetServiceQueryParameters, TargetServiceInputProperties, TargetServiceOutputProperties);
		if (TargetServiceURIParameters.size() > 0) {
			all += "\n  TargetServiceURIParameters:";
			for (URIParameter property : TargetServiceURIParameters)
				all += "\n" + property.toYAMLString();
		} else
			all += "\n  TargetServiceURIParameters: []";
		if (TargetServiceQueryParameters.size() > 0) {
			all += "\n  TargetServiceQueryParameters:";
			for (QueryParameter property : TargetServiceQueryParameters)
				all += "\n" + property.toYAMLString();
		} else
			all += "\n  TargetServiceQueryParameters: []";
		if (TargetServiceInputProperties.size() > 0) {
			all += "\n  TargetServiceInputProperties:";
			for (InputProperty property : TargetServiceInputProperties)
				all += "\n" + property.toYAMLString();
		} else
			all += "\n  TargetServiceInputProperties: []";
		if (TargetServiceOutputProperties.size() > 0) {
			all += "\n  TargetServiceOutputProperties:";
			for (OutputProperty property : TargetServiceOutputProperties)
				all += "\n" + property.toYAMLString();
		} else
			all += "\n  TargetServiceComplexTypes: []";
		if (complexTypes.size() > 0) {
			all += "\n  TargetServiceComplexTypes:";
			for (ComplexType complexType : complexTypes)
				all += "\n" + complexType.toYAMLString();
		} else
			all += "\n  TargetServiceComplexTypes: []";
		return all;
	}
}
