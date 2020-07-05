package core.ontologytoyamltools;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * A list of the {@link ComplexType} objects of an {@link Operation}.
 * 
 * @author themis
 */
@SuppressWarnings("serial")
public class ComplexTypes extends ArrayList<ComplexType> {

	/** An integer used to keep track of complex type ids. */
	private int id;

	/** A set of the non-primitive parameters. */
	public HashSet<OperationProperty> nonPrimitiveProperties;

	/**
	 * Initializes this list.
	 */
	public ComplexTypes() {
		nonPrimitiveProperties = new HashSet<OperationProperty>();
	}

	/**
	 * Populates this list. Note that this should be the only way of populating this class.
	 * 
	 * @param properties one or more lists with properties/parameters as elements.
	 */
	@SuppressWarnings("unchecked")
	public void populate(ArrayList<? extends OperationProperty>... propertiesLists) {
		ArrayList<OperationProperty> allProperties = new ArrayList<OperationProperty>();
		id = 0;
		for (ArrayList<? extends OperationProperty> propertiesList : propertiesLists) {
			for (OperationProperty property : propertiesList) {
				allProperties.add(property);
			}
		}
		internalPopulate(allProperties);
	}

	/**
	 * Adds a non-primitive parameter.
	 * 
	 * @param operationProperty the non-primitive parameter to be added.
	 */
	public void addOperationProperty(OperationProperty operationProperty) {
		nonPrimitiveProperties.add(operationProperty);
	}

	/**
	 * Returns a non-primitive parameter given its name.
	 * 
	 * @param name the name of the non-primitive parameter to be returned.
	 * @return a non-primitive parameter.
	 */
	private OperationProperty getPropertyWithName(String name) {
		for (OperationProperty property : nonPrimitiveProperties) {
			if (property.Name.equals(name))
				return property;
		}
		return null;
	}

	/**
	 * Returns a list of non-primitive parameters given their names.
	 * 
	 * @param names the names of the non-primitive parameters to be returned.
	 * @return a list of non-primitive parameters.
	 */
	private ArrayList<OperationProperty> getPropertiesWithNames(ArrayList<String> names) {
		ArrayList<OperationProperty> complexTypeProperties = new ArrayList<OperationProperty>();
		for (String nonPrimitivePropertyName : names) {
			OperationProperty nonPrimitiveProperty = getPropertyWithName(nonPrimitivePropertyName);
			if (nonPrimitiveProperty != null)
				complexTypeProperties.add(nonPrimitiveProperty);
		}
		return complexTypeProperties;
	}

	/**
	 * Internally populates this list. This method is used by method {@link #populate} to populate the list with the
	 * complex types recursively.
	 * 
	 * @param properties one or more lists with properties/parameters as elements.
	 */
	private void internalPopulate(ArrayList<? extends OperationProperty> properties) {
		ArrayList<ComplexType> complexTypes = new ArrayList<ComplexType>();
		if (properties.size() > 0) {
			for (OperationProperty property : properties) {
				if (property.Types != null) {
					property.TypeRef = "ComplexType" + (++id);
					complexTypes.add(new ComplexType(property.TypeRef, getPropertiesWithNames(property.Types)));
				}
			}
		}
		this.addAll(complexTypes);
		for (ComplexType complexType : complexTypes) {
			if (complexType.ComplexTypeParameters.size() > 0)
				internalPopulate(complexType.ComplexTypeParameters);
		}
	}
}
