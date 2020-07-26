package mde.inputParser;

import java.util.ArrayList;
import java.util.Arrays;

public class YamlEnumeration {


	/**
	 * The name of the resource (note that all fields are public in order to allow serializing using
	 * {@link org.yaml.snakeyaml.Yaml Yaml}).
	 */
	public String Name;
	public ArrayList<String> Literals;
	

	public YamlEnumeration() {

	}

	/**
	 * Initializes this object as a non-algorithmic resource by receiving its name and instatiating the lists.
	 * 
	 * @param name the name of this resource.
	 */
	public YamlEnumeration(String name) {
		this.Name = name;
	}

	/**
	 * Adds an allowed CRUD verb in the resource.
	 * 
	 * @param CRUDActivity the activity to be added.
	 */
	public void addLiterals(String literal) {
		if (!Literals.contains(literal))
			Literals.add(literal);
	}

	/**
	 * Returns a string representation of this resource.
	 * 
	 * @return a string representation of this object.
	 */
	@Override
	public String toString() {
		String all = "Enumeration:\n" + "Name: " + Name + "\n"
				+ "Literals: " + Arrays.asList(Literals) + "\n";
		return all;
	}

	/**
	 * Returns a YAML representation of this resource. This is used in order to create a more human-readable
	 * representation. (It sould be also performed using {@link org.yaml.snakeyaml.Yaml Yaml}).
	 * 
	 * @return a YAML representation of this object.
	 */
	public String toYAMLString() {
		String all = "- !!cim.Enumeration";
		all += "\n  Name: " + Name;
		all += "\n  Literals: " + Arrays.asList(Literals).toString().replaceAll("^\\[|\\]$", "");
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
	
	public ArrayList<String> getLiterals(){
		return this.Literals;
	}

}
