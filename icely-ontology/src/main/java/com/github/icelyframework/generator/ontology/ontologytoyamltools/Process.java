package com.github.icelyframework.generator.ontology.ontologytoyamltools;

import java.util.ArrayList;

public class Process {
	public String Name;
	
	public ArrayList<Activity> Activities;
		
	public Process() {
	}

	public Process(String name) {
		this.Name = name;
		Activities = new ArrayList<Activity>();
	}
	
	public void addActivity(Activity activity) {
		if (!Activities.contains(activity)) {
			Activities.add(activity);
		}
	}

	public String toYAMLString() {
		String all = "  - Name: " + Name;
		if (Activities.size() > 0) {
			all += "\n    Activities:";
			for (Activity activity : Activities) {
				all += "\n" + activity.toYAMLString();
			}
		} else
			all += "\n    Activities: []";
		return all;
	}

	
	@Override
	public boolean equals(Object obj) {
		return ((Process) obj).Name.equals(Name);
	}

	
	@Override
	public int hashCode() {
		return Name.hashCode();
	}
}
