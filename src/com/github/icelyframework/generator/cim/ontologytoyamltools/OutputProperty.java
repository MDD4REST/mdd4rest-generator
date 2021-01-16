package core.ontologytoyamltools;

import java.util.ArrayList;

/**
 * Class representing an output property of an operation.
 * 
 * @author themis
 */
public class OutputProperty extends OperationProperty {

	/**
	 * Initializes this property given its name, elements and nested types.
	 * 
	 * @param parameterName the name of this property.
	 * @param parameterElements the elements of this property.
	 * @param parameterTypeElements the nested types of this property.
	 */
	public OutputProperty(String parameterName, String[] parameterElements, ArrayList<String> parameterTypeElements) {
		super(parameterName, parameterElements[0], parameterTypeElements);
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
		return all;
	}

}
