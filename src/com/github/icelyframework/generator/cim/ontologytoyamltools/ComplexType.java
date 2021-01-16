package com.github.icelyframework.generator.cim.ontologytoyamltools;

import java.util.ArrayList;

/**
 * Class representing a complex type of a property.
 * 
 * @author themis
 */
public class ComplexType {

	/** The reference from the parent property. */
	public String TypeRef;

	/** The name of this complex type. */
	public String ComplexTypeName;

	/** The nested types of this complex type. */
	public ArrayList<OperationProperty> ComplexTypeParameters;

	/**
	 * Initialized this complex type.
	 * 
	 * @param typeRef the reference from the parent property.
	 * @param complexTypeParameters the nested types of this complex type.
	 */
	public ComplexType(String typeRef, ArrayList<OperationProperty> complexTypeParameters) {
		TypeRef = typeRef;
		ComplexTypeName = typeRef;
		ComplexTypeParameters = complexTypeParameters;
	}

	/**
	 * Returns a YAML representation of this complex type.
	 * 
	 * @return a YAML representation of this complex type.
	 */
	public String toYAMLString() {
		String all = "  - TypeRef: " + TypeRef;
		all += "\n    ComplexTypeName: " + ComplexTypeName;
		all += "\n    ComplexTypeProperties:";
		for (OperationProperty property : ComplexTypeParameters) {
			all += "\n" + property.toYAMLString(2);
		}
		return all;
	}

}
