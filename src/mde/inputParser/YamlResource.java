package mde.inputParser;

import java.util.Arrays;
import java.util.ArrayList;

public class YamlResource {

	/**
	 * The name of the resource (note that all fields are public in order to allow serializing using
	 * {@link org.yaml.snakeyaml.Yaml Yaml}).
	 */
	public String Name;

	/** A boolean denoting if this resource is algorithmic or not. */
	public boolean IsAlgorithmic;

	/** A list of the available crud activities (note that this cannot be a set since sets are not serialized in YAML). */
	public ArrayList<String> CRUDActivities;

	/** A list of the related resources. */
	public ArrayList<YamlRelatedResource> RelatedResources;

	/** A list of this resource's properties. */
	public ArrayList<YamlProperty> Properties;

	/** The input representation of this resource. */
	public String InputRepresentation;

	/** The output representation of this resource. */
	public String OutputRepresentation;
	

	/**
	 * Empty constructor. This is required for instatiating/serializing using {@link org.yaml.snakeyaml.Yaml Yaml}.
	 */
	public YamlResource() {

	}

	/**
	 * Initializes this object as a non-algorithmic resource by receiving its name and instatiating the lists.
	 * 
	 * @param name the name of this resource.
	 */
	public YamlResource(String name) {
		this.Name = name;
		this.IsAlgorithmic = false;
		CRUDActivities = new ArrayList<String>();
		RelatedResources = new ArrayList<YamlRelatedResource>();
		Properties = new ArrayList<YamlProperty>();
	}

	/**
	 * Initializes this object as a resource by receiving its name and whether it is algorithmic and instatiating the
	 * lists.
	 * 
	 * @param name the name of this resource.
	 * @param isAlgorithmic boolean denoting whether this resource is algorithmic.
	 */
	public YamlResource(String name, boolean isAlgorithmic) {
		this.Name = name;
		this.IsAlgorithmic = isAlgorithmic;
		CRUDActivities = new ArrayList<String>();
		RelatedResources = new ArrayList<YamlRelatedResource>();
		Properties = new ArrayList<YamlProperty>();
	}

	/**
	 * Adds an allowed CRUD verb in the resource.
	 * 
	 * @param CRUDActivity the activity to be added.
	 */
	public void addCRUDActivity(String CRUDActivity) {
		if (!CRUDActivities.contains(CRUDActivity))
			CRUDActivities.add(CRUDActivity);
	}

	/**
	 * Adds a related resource to this resource.
	 * 
	 * @param relatedResource the related resource to be added.
	 */
	public void addRelatedResource(YamlRelatedResource relatedResource) {
		if (!RelatedResources.contains(relatedResource)) {
			if (!relatedResource.equals(Name))
				RelatedResources.add(relatedResource);
		}
	}

	/**
	 * Adds a property to this reource.
	 * 
	 * @param property the property to be added.
	 */
	public void addProperty(YamlProperty property) {
		if (!Properties.contains(property)) {
			Properties.add(property);
		}
	}

	/**
	 * Returns a string representation of this resource.
	 * 
	 * @return a string representation of this object.
	 */
	@Override
	public String toString() {
		String all = "Resource:\n" + "Name: " + Name + "\n" + "IsAlgorithmic: " + IsAlgorithmic + "\n"
				+ "CRUDActivities: " + Arrays.asList(CRUDActivities) + "\n" + "InputRepresentation: "
				+ InputRepresentation + "\n" + "OutputRepresentation: " + OutputRepresentation + "\n" + "Properties: "
				+ Arrays.asList(Properties) + "\n" + "RelatedResources: " + Arrays.asList(RelatedResources);
		return all;
	}

	/**
	 * Returns a YAML representation of this resource. This is used in order to create a more human-readable
	 * representation. (It sould be also performed using {@link org.yaml.snakeyaml.Yaml Yaml}).
	 * 
	 * @return a YAML representation of this object.
	 */
	public String toYAMLString() {
		String all = "- !!cim.Resource";
		all += "\n  Name: " + Name;
		all += "\n  IsAlgorithmic: " + IsAlgorithmic;
		all += "\n  CRUDActivities: " + Arrays.asList(CRUDActivities).toString().replaceAll("^\\[|\\]$", "");
		all += "\n  InputRepresentation: " + InputRepresentation;
		all += "\n  OutputRepresentation: " + OutputRepresentation;
		if (Properties.size() > 0) {
			all += "\n  Properties:";
			for (YamlProperty property : Properties) {
				all += "\n" + property.toYAMLString();
			}
		} else
			all += "\n  Properties: []";
		all += "\n  RelatedResources: " + Arrays.asList(RelatedResources).toString().replaceAll("^\\[|\\]$", "");
		return all;
	}

	/**
	 * Used to check if this resource is equal to another one. We override the default {@code equals}, so that two
	 * resources are considered equal if they have the same name.
	 * 
	 * @param obj an object to check if it is equal to this resource.
	 * @return {@code true} if {@code obj} is equal to this property, {@code false} otherwise.
	 */
	@Override
	public boolean equals(Object obj) {
		return ((YamlResource) obj).Name.equals(Name);
	}

	/**
	 * Used to check if two resources are the same in sets, maps, etc. This function must be overriden because the
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
	
	public boolean getResourceType(){
		return this.IsAlgorithmic;
	}
	
	public ArrayList<String> getCRUDActivities(){
		return this.CRUDActivities;
	}
	
	public ArrayList<YamlRelatedResource> getRelatedResources(){
		return this.RelatedResources;
	}
	
	public ArrayList<YamlProperty> getYamlProperties(){
		return this.Properties;
	}
	
	public String getInputRepresentation(){
		return this.InputRepresentation;
	}
	
	public String getOutputRepresentation(){
		return this.OutputRepresentation;
	}

}
