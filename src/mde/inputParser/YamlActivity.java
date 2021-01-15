package mde.inputParser;

import java.util.ArrayList;
import java.util.Arrays;


public class YamlActivity {
	public String Name;
	
	public String Action;
	
	public String Role;
	
	public ActivityType Type;
	
	public VerbType VerbTypeAction;
	
	public Boolean IsAuthenticatedRequired; 

	public ArrayList<String> Policy;
	public ArrayList<String> Publish;
	public ArrayList<String> ReadModel;
	public ArrayList<String> Objects;
	
	public YamlActivity() {
		
	}
	
	public YamlActivity(String name, String action) {
		this.Name = name;
		this.Action = action;
		Type = ActivityType.Command;
		VerbTypeAction = VerbType.Other;
		Policy = new ArrayList<String>();
		Publish = new ArrayList<String>();
		Publish = new ArrayList<String>();
		Objects = new ArrayList<String>();
		IsAuthenticatedRequired = false;
	}
	
	public YamlActivity(String name, String action, ActivityType type) {
		this.Name = name;
		this.Action = action;
		Type = type;
		VerbTypeAction = VerbType.Other;
		Policy = new ArrayList<String>();
		Publish = new ArrayList<String>();
		ReadModel = new ArrayList<String>();
		Objects = new ArrayList<String>();
		IsAuthenticatedRequired = false;

	}
	
	public YamlActivity(String name, String action, ActivityType type, VerbType verbType) {
		this.Name = name;
		this.Action = action;
		Type = type;
		VerbTypeAction = verbType;
		Policy = new ArrayList<String>();
		Publish = new ArrayList<String>();
		ReadModel = new ArrayList<String>();
		Objects = new ArrayList<String>();
		IsAuthenticatedRequired = false;
	}
	
	public void addPublish(String event) {
		if (!Publish.contains(event)) {
			Publish.add(event);
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
		String all = "  - Name: " + Name;
		all += "\n    Action: " + Action;
		all += "\n    Type: " + Type.name();
		all += "\n      VerbType: " + VerbTypeAction.name();
		all += "\n    IsAuthenticatedRequired: " + IsAuthenticatedRequired;
		all += "\n    Policy: " + Arrays.asList(Policy).toString().replaceAll("^\\[|\\]$", "");
		all += "\n    Publish: " + Arrays.asList(Publish).toString().replaceAll("^\\[|\\]$", "");
		return all;
	}

	
	@Override
	public boolean equals(Object obj) {
		return ((YamlActivity) obj).Name.equals(Name);
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

	@Override
	public String toString() {
		String all = "Activity:\n" + "Type: " + Type + "\n"
				+ "IsAuthenticationRequired: " + IsAuthenticatedRequired + "\n";
		return all;
	}

	public String getName() {
		return Name;
	}

	public String getAction() {
		return Action;
	}
	
	public String getRole() {
		return Role;
	}

	public ArrayList<String> getPolicy() {
		return Policy;
	}

	public ArrayList<String> getPublish() {
		return Publish;
	}
	
	public ArrayList<String> getReadModel() {
		return ReadModel;
	}

	public ActivityType getType() {
		return Type;
	}

	public VerbType getVerbTypeAction() {
		return VerbTypeAction;
	}

	public Boolean getIsAuthenticatedRequired() {
		return IsAuthenticatedRequired;
	}

	public ArrayList<String> getObjects() {
		return Objects;
	}	
	
}
