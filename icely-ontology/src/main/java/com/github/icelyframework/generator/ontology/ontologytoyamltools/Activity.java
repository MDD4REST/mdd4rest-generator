package com.github.icelyframework.generator.ontology.ontologytoyamltools;

import java.util.ArrayList;
import java.util.Arrays;

public class Activity {
	
	public String Name;
	public String Action;
	public String Role;

	public ArrayList<String> Policy;
	public ArrayList<String> Publish;
	public ArrayList<String> ReadModel;
	public ArrayList<String> Objects;
	
	public ActivityType Type;
	public VerbType VerbTypeAction;


	public Activity(String name, String action) {
		this.Name = name;
		this.Action = action;
		Type = ActivityType.Command;
		VerbTypeAction = VerbType.Other;
		Policy = new ArrayList<String>();
		Publish = new ArrayList<String>();
		ReadModel = new ArrayList<String>();
		Objects = new ArrayList<String>();
	}
	
	public Activity(String name, String action, ActivityType type) {
		this.Name = name;
		this.Action = action;
		Type = type;
		VerbTypeAction = VerbType.Other;
		Policy = new ArrayList<String>();
		Publish = new ArrayList<String>();
		Objects = new ArrayList<String>();
	}
	
	public Activity(String name, String action, ActivityType type, VerbType verbType) {
		this.Name = name;
		this.Action = action;
		Type = type;
		VerbTypeAction = verbType;
		Policy = new ArrayList<String>();
		Publish = new ArrayList<String>();
		Objects = new ArrayList<String>();
	}
	
	public Activity(String name, String action, String role, ActivityType type, VerbType verbType) {
		this.Name = name;
		this.Action = action;
		this.Role = role;
		Type = type;
		VerbTypeAction = verbType;
		Policy = new ArrayList<String>();
		Publish = new ArrayList<String>();
		ReadModel = new ArrayList<String>();
		Objects = new ArrayList<String>();
	}
	
	public void addPublish(String event) {
		if (!Publish.contains(event)) {
			Publish.add(event);
		}
	}
	
	public void addReadModel(String readmodel) {
		if (!ReadModel.contains(readmodel)) {
			ReadModel.add(readmodel);
		}
	}

	public void addPolicy(String event) {
		if (!Policy.contains(event)) {
			Policy.add(event);
		}
	}
	
	public void addObjects(String object) {
		if (!Objects.contains(object)) {
			Objects.add(object);
		}
	}


	public String toYAMLString() {
		String all = "    - Name: " + Name;
		all += "\n      Action: " + Action;
		all += "\n      Role: " + Role;
		all += "\n      Type: " + Type.name();
		all += "\n      VerbTypeAction: " + VerbTypeAction.name();
		all += "\n      Objects: " + Arrays.asList(Objects).toString().replaceAll("^\\[|\\]$", "");
		all += "\n      Policy: " + Arrays.asList(Policy).toString().replaceAll("^\\[|\\]$", "");
		all += "\n      Publish: " + Arrays.asList(Publish).toString().replaceAll("^\\[|\\]$", "");
		all += "\n      ReadModel: " + Arrays.asList(ReadModel).toString().replaceAll("^\\[|\\]$", "");
		return all;
	}

	
	@Override
	public boolean equals(Object obj) {
		return ((Activity) obj).Name.equals(Name);
	}

	
	@Override
	public int hashCode() {
		return Name.hashCode();
	}
	
	public enum ActivityType {
		Command, Query
	}
	
	public enum VerbType {
		Read, Create, Delete, Other
	}
}
