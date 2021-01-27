package com.github.icelyframework.generator.mde.inputParser;

import java.util.ArrayList;


public class YamlProcess {
	public String Name;
	
	public ArrayList<YamlActivity> Activities;	

	public YamlProcess() {
	}

	public YamlProcess(String name) {
		this.Name = name;
		Activities = new ArrayList<YamlActivity>();
	}
	
	public void addActivity(YamlActivity activity) {
		if (!Activities.contains(activity)) {
			Activities.add(activity);
		}
	}

	public String toYAMLString() {
		String all = "- Name: " + Name;

		if (Activities.size() > 0) {
			all += "\n  Activities:";
			for (YamlActivity activity : Activities) {
				all += "\n" + activity.toYAMLString();
			}
		} else
			all += "\n  Activities: []";
		return all;
	}

	
	@Override
	public boolean equals(Object obj) {
		return ((YamlProcess) obj).Name.equals(Name);
	}

	
	@Override
	public int hashCode() {
		return Name.hashCode();
	}
	
	public String getName() {
		return Name;
	}
	
	public ArrayList<YamlActivity> getActivities() {
		return Activities;
	}
}
