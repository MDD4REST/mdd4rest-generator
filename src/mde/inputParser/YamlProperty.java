package mde.inputParser;


public class YamlProperty {

	/**
	 * The name of the property (note that all fields are public in order to allow serializing using
	 * {@link org.yaml.snakeyaml.Yaml Yaml}).
	 */
	public String Name;

	/** The type of this property. */
	public String Type;

	/** A boolean denoting if this property is unique or not. */
	public boolean Unique;

	/** A boolean denoting if this property is a naming property or not. */
	public boolean NamingProperty;

	/**
	 * Empty constructor. This is required for instatiating/serializing using {@link org.yaml.snakeyaml.Yaml Yaml}.
	 */
	public YamlProperty() {

	}

	/**
	 * Initializes this object as a propertu given its name.
	 * 
	 * @param name the name of this property.
	 */
	public YamlProperty(String name) {
		this.Name = name;
	}

	/**
	 * Returns a string representation of this property.
	 * 
	 * @return a string representation of this object.
	 */
	@Override
	public String toString() {
		return Name + "(Type = " + Type + ", Unique = " + Unique + ", NamingProperty = " + NamingProperty + ")";
	}

	/**
	 * Returns a YAML representation of this property. This is used in order to create a more human-readable
	 * representation. (It sould be also performed using {@link org.yaml.snakeyaml.Yaml Yaml}).
	 * 
	 * @return a YAML representation of this object.
	 */
	public String toYAMLString() {
		String all = "  - Name: " + Name;
		all += "\n    Type: " + Type;
		all += "\n    Unique: " + Unique;
		all += "\n    NamingProperty: " + NamingProperty;
		return all;
	}

	/**
	 * Used to check if this property is equal to another one. We override the default {@code equals}, so that two
	 * properties are considered equal if they have the same name.
	 * 
	 * @param obj an object to check if it is equal to this property.
	 * @return {@code true} if {@code obj} is equal to this property, {@code false} otherwise.
	 */
	@Override
	public boolean equals(Object obj) {
		return ((YamlProperty) obj).Name.equals(Name);
	}

	/**
	 * Used to check if two properties are the same in sets, maps, etc. This function must be overriden because the
	 * {@code contains} function uses this to check for equal objects.
	 * 
	 * @return an integer hashcode.
	 */
	@Override
	public int hashCode() {
		return Name.hashCode();
	}
	
	public String getName(){
		return this.Name;
	}
	
	public String getType(){
		return this.Type;
	}
	
	public boolean getUniqueness(){
		return this.Unique;
	}
	
	public boolean getNamingAbility(){
		return this.NamingProperty;
	}

}