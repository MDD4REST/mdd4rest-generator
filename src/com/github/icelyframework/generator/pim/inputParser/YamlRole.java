package com.github.icelyframework.generator.pim.inputParser;

import java.util.ArrayList;
import java.util.Arrays;

public class YamlRole {
	/**
	 * The name of the resource (note that all fields are public in order to allow serializing using
	 * {@link org.yaml.snakeyaml.Yaml Yaml}).
	 */
	public String Name;
	
	public String PermissionMode;

	/** A list of the related resources. */
	public ArrayList<YamlPermission> Permissions;

	/**
	 * Empty constructor. This is required for instatiating/serializing using {@link org.yaml.snakeyaml.Yaml Yaml}.
	 */
	public YamlRole() {

	}

	/**
	 * Initializes this object as a non-algorithmic resource by receiving its name and instatiating the lists.
	 * 
	 * @param name the name of this resource.
	 */
	public YamlRole(String name) {
		this.Name = name;
		Permissions = new ArrayList<YamlPermission>();
	}

	/**
	 * Adds a related resource to this resource.
	 * 
	 * @param relatedResource the related resource to be added.
	 */
	public void addPermission(YamlPermission permissions) {
		if (!Permissions.contains(permissions)) {
				Permissions.add(permissions);
		}
	}


	/**
	 * Returns a string representation of this resource.
	 * 
	 * @return a string representation of this object.
	 */
	@Override
	public String toString() {
		String all = "Resource:\n" + "Name: " + Name + "\n" + 
				"Permissions: " + Arrays.asList(Permissions);
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
		if (Permissions.size() > 0) {
			all += "\n  Properties:";
			for (YamlPermission permissions : Permissions) {
				all += "\n" + permissions.toYAMLString();
			}
		} else
			all += "\n  Permissions: []";
		all += "\n  Permissions: " + Arrays.asList(Permissions).toString().replaceAll("^\\[|\\]$", "");
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
		return ((YamlRole) obj).Name.equals(Name);
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
	
	public String getPermissionMode() {
		return PermissionMode;
	}
	
	public ArrayList<YamlPermission> getPermissions() {
		return Permissions;
	}
	
	public String getName(){
		return this.Name;
	}
}
