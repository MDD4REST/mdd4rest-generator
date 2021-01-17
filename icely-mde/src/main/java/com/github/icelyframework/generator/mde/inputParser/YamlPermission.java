package com.github.icelyframework.generator.mde.inputParser;

import java.util.ArrayList;
import java.util.Arrays;

public class YamlPermission {


	/**
	 * The name of the resource (note that all fields are public in order to allow serializing using
	 * {@link org.yaml.snakeyaml.Yaml Yaml}).
	 */
	public String Resource;
	public ArrayList<String> Activities;
	public ArrayList<YamlConstraint> Constraints;
	

	public YamlPermission() {
	}

	public YamlPermission(String Resource) {
		this.Resource = Resource;
		this.Activities = new ArrayList<String>();
		this.Constraints = new ArrayList<YamlConstraint>();
	}
	
	public void addActivities(String Activity) {
		if (!Activities.contains(Activity))
			Activities.add(Activity);
	}
	
	public void addConstraints(YamlConstraint Constraint) {
		if (!Constraints.contains(Constraint))
			Constraints.add(Constraint);
	}

	@Override
	public String toString() {
		String all = "Permission:\n" + "Resource: " + Resource + "\n"
				+ "Activities: " + Arrays.asList(Activities) + "\n"
				+ "Constraints: " + Arrays.asList(Constraints);
		return all;
	}

	public String toYAMLString() {
		String all = "- !!cim.Permission";
		all += "\n  Resource: " + Resource;
		all += "\n  Activities: " + Arrays.asList(Activities).toString().replaceAll("^\\[|\\]$", "");
		all +=  "Constraints: " + Arrays.asList(Constraints);
		return all;
	}
	
	public String getResource() {
		return Resource;
	}
	
	public ArrayList<String> getActivities() {
		return Activities;
	}
	
	public ArrayList<YamlConstraint> getConstraints(){
		return Constraints;
	}
}
