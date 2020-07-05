package core.ontologytoyamltools;

import java.util.Arrays;
import java.util.ArrayList;

/**
 * Class representing a resource object.
 * 
 * @author themis
 */
public class Resource {

	/**
	 * The name of the resource (note that all fields are {@code public} in order to allow serializing using
	 * {@link org.yaml.snakeyaml.Yaml Yaml}).
	 */
	public String Name;

	/** A boolean denoting if this resource is algorithmic or not. */
	public boolean IsAlgorithmic;

	/** A list of the available crud activities (note that this cannot be a set since sets are not serialized in YAML). */
	public ArrayList<String> CRUDActivities;

	/** A list of the related resources. */
	public ArrayList<String> RelatedResources;

	/** A list of this resource's properties. */
	public ArrayList<Property> Properties;

	/** The input representation of this resource. */
	public String InputRepresentation;

	/** The output representation of this resource. */
	public String OutputRepresentation;

	/** A boolean denoting if this resource is an external service or not. */
	public boolean IsExternalService;

	/** The operation of this resource. */
	public Operation ROperation;

	/**
	 * Empty constructor. This is required for instantiating/serializing using {@link org.yaml.snakeyaml.Yaml Yaml}.
	 */
	public Resource() {

	}

	/**
	 * Initializes this object as a non-algorithmic resource by receiving its name and instantiating the lists.
	 * 
	 * @param name the name of this resource.
	 */
	public Resource(String name) {
		this.Name = name;
		this.IsAlgorithmic = false;
		CRUDActivities = new ArrayList<String>();
		RelatedResources = new ArrayList<String>();
		Properties = new ArrayList<Property>();
		InputRepresentation = "JSON";
		OutputRepresentation = "JSON";
		IsExternalService = false;
	}

	/**
	 * Initializes this object as a resource by receiving its name and whether it is algorithmic and instantiating the
	 * lists.
	 * 
	 * @param name the name of this resource.
	 * @param isAlgorithmic boolean denoting whether this resource is algorithmic.
	 */
	public Resource(String name, boolean isAlgorithmic) {
		this.Name = name;
		this.IsAlgorithmic = isAlgorithmic;
		CRUDActivities = new ArrayList<String>();
		RelatedResources = new ArrayList<String>();
		Properties = new ArrayList<Property>();
		InputRepresentation = "JSON";
		OutputRepresentation = "JSON";
		IsExternalService = false;
	}

	/**
	 * Initializes this object as a resource by receiving its name and whether it is algorithmic and instantiating the
	 * lists.
	 * 
	 * @param name the name of this resource.
	 * @param isAlgorithmic boolean denoting whether this resource is algorithmic.
	 */
	public Resource(String name, boolean isAlgorithmic, boolean isExternalService) {
		this.Name = name;
		this.IsAlgorithmic = isAlgorithmic;
		CRUDActivities = new ArrayList<String>();
		RelatedResources = new ArrayList<String>();
		Properties = new ArrayList<Property>();
		InputRepresentation = "JSON";
		OutputRepresentation = "JSON";
		IsExternalService = isExternalService;
		if (IsExternalService) {
			IsAlgorithmic = true;
			CRUDActivities.add("read");
		}
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
	public void addRelatedResource(String relatedResource) {
		if (!RelatedResources.contains(relatedResource)) {
			if (!relatedResource.equals(Name))
				RelatedResources.add(relatedResource);
		}
	}

	/**
	 * Adds a property to this resource.
	 * 
	 * @param property the property to be added.
	 */
	public void addProperty(Property property) {
		if (!Properties.contains(property)) {
			Properties.add(property);
		}
	}

	/**
	 * Adds an operation to this resource.
	 * 
	 * @param operation the operation to be added.
	 */
	public void addOperation(Operation operation) {
		ROperation = operation;
	}

	/**
	 * Returns a YAML representation of this resource. This is used in order to create a more human-readable
	 * representation. (It could also be performed using {@link org.yaml.snakeyaml.Yaml Yaml}).
	 * 
	 * @return a YAML representation of this object.
	 */
	public String toYAMLString() {
		String all = "- !!eu.fp7.scase.inputParser.YamlResource";
		all += "\n  Name: " + Name;
		all += "\n  IsAlgorithmic: " + IsAlgorithmic;
		all += "\n  IsExternalService: " + IsExternalService;
		all += "\n  CRUDActivities: " + Arrays.asList(CRUDActivities).toString().replaceAll("^\\[|\\]$", "");
		all += "\n  InputRepresentation: " + InputRepresentation;
		all += "\n  OutputRepresentation: " + OutputRepresentation;
		if (Properties.size() > 0) {
			all += "\n  Properties:";
			for (Property property : Properties) {
				all += "\n" + property.toYAMLString();
			}
		} else
			all += "\n  Properties: []";
		all += "\n  RelatedResources: " + Arrays.asList(RelatedResources).toString().replaceAll("^\\[|\\]$", "");
		if (IsExternalService && ROperation != null)
			all += ROperation.toYAMLString();
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
		return ((Resource) obj).Name.equals(Name);
	}

	/**
	 * Used to check if two resources are the same in sets, maps, etc. This function must be overridden because the
	 * {@code contains} function uses this to check for equal objects.
	 * 
	 * @return an integer hashcode.
	 */
	@Override
	public int hashCode() {
		return Name.hashCode();
	}

}
