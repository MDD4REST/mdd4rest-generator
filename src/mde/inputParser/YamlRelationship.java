package mde.inputParser;

public class YamlRelationship {
	/**
	 * The name of the property (note that all fields are public in order to allow serializing using
	 * {@link org.yaml.snakeyaml.Yaml Yaml}).
	 */
	public String Resource;

	/** The type of this property. */
	public String Multiplicity;

	/**
	 * Empty constructor. This is required for instatiating/serializing using {@link org.yaml.snakeyaml.Yaml Yaml}.
	 */
	public YamlRelationship() {

	}

	/**
	 * Initializes this object as a relatedResource given its name.
	 * 
	 * @param name the name of this relatedResource.
	 */
	public YamlRelationship(String Resource) {
		this.Resource = Resource;
	}
	
	/**
	 * Initializes this object as a relatedResource given its name and multiplicity .
	 * 
	 * @param name the name of this relatedResource.
	 * @param multiplicity the multiplicity of this relatedResource
	 */
	
	public YamlRelationship(String Resource, String multiplicity) {
		this.Resource = Resource;
		this.Multiplicity = multiplicity;
	}

	/**
	 * Returns a string representation of this property.
	 * 
	 * @return a string representation of this object.
	 */
	@Override
	public String toString() {
		return Resource + "(Multiplicity = " + Multiplicity + ")";
	}

	/**
	 * Returns a YAML representation of this property. This is used in order to create a more human-readable
	 * representation. (It sould be also performed using {@link org.yaml.snakeyaml.Yaml Yaml}).
	 * 
	 * @return a YAML representation of this object.
	 */
	public String toYAMLString() {
		String all = "  - Resource: " + Resource;
		all += "\n    Multiplicity: " + Multiplicity;
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
		return ((YamlRelationship) obj).Resource.equals(Resource);
	}

	/**
	 * Used to check if two properties are the same in sets, maps, etc. This function must be overriden because the
	 * {@code contains} function uses this to check for equal objects.
	 * 
	 * @return an integer hashcode.
	 */
	@Override
	public int hashCode() {
		return Resource.hashCode();
	}
	
	public String getResource(){
		return this.Resource;
	}
	
	public String getMultiplicity(){
		return this.Multiplicity;
	}
}
