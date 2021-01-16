package core.ontologytoyamltools;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Class representing a property of an operation.
 * 
 * @author themis
 */
public class OperationProperty {

	/**
	 * The name of the property (note that all fields are public in order to allow serializing using
	 * {@link org.yaml.snakeyaml.Yaml Yaml}).
	 */
	public String Name;

	/** The type of this property. */
	public String Type;

	/** The reference to nested types. */
	public String TypeRef;

	/** A boolean denoting if this property is unique or not. */
	public boolean Unique;

	/** The nested types of this property. */
	public ArrayList<String> Types;

	/**
	 * Initializes this property given its name, type and nested types.
	 * 
	 * @param parameterName the name of this property.
	 * @param parameterType the type of this property.
	 * @param parameterTypeElements the nested types of this property.
	 */
	public OperationProperty(String parameterName, String parameterType, ArrayList<String> parameterTypeElements) {
		Name = parameterName;
		if (parameterType.equals("Primitive")
				|| (parameterType.equals("Array") && StringHelpers.isPrimitive(parameterTypeElements.get(0)))) {
			Type = parameterTypeElements.get(0).substring(0, 1).toUpperCase()
					+ parameterTypeElements.get(0).substring(1);
			if (Type.equals("Int"))
				Type = "Integer";
			TypeRef = null;
			Types = null;
		} else {
			Type = "Object";
			TypeRef = Arrays.asList(parameterTypeElements).toString().replaceAll("^\\[|\\]$", "");
			Types = parameterTypeElements;
		}
		Unique = !(parameterType.equals("Array"));
	}

	/**
	 * Returns a YAML representation of this property.
	 * 
	 * @return a YAML representation of this property.
	 */
	public String toYAMLString() {
		return toYAMLString(1);
	}

	/**
	 * Returns a YAML representation of this property.
	 * 
	 * @param indentLevel the indent level of this representation.
	 * @return a YAML representation of this property.
	 */
	public String toYAMLString(int indentLevel) {
		char[] outerChars = new char[2 * indentLevel];
		char[] innerChars = new char[2 * indentLevel + 2];
		Arrays.fill(outerChars, ' ');
		Arrays.fill(innerChars, ' ');
		String outerIndent = new String(outerChars);
		String innerIndent = new String(innerChars);
		String all = outerIndent + "- Name: " + Name;
		all += "\n" + innerIndent + "Type: " + Type;
		all += "\n" + innerIndent + "TypeRef: " + TypeRef;
		all += "\n" + innerIndent + "Unique: " + Unique;
		return all;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OperationProperty other = (OperationProperty) obj;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		return true;
	}

}
