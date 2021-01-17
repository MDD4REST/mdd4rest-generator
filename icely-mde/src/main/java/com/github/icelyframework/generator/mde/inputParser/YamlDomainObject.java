package com.github.icelyframework.generator.mde.inputParser;

import java.util.ArrayList;
import java.util.Arrays;

public class YamlDomainObject {
	public String Name;

	public DomainObjectType Type;

	public Boolean IsAggregateRoot;

	public ArrayList<YamlProperty> Properties;
	
	public ArrayList<YamlRelation> Relations;
	
	public ArrayList<String> Literals;

	public YamlDomainObject() {
		this.IsAggregateRoot = false;
	}
	
	public YamlDomainObject(String name, DomainObjectType type) {
		this.Name = name;
		this.IsAggregateRoot = false;
		Type = type;
		if (type == type.Enumeration) {
			Literals = new ArrayList<String>();
		} else {
			Relations = new ArrayList<YamlRelation>();
			Properties = new ArrayList<YamlProperty>();
		}

	}

	public YamlDomainObject(String name, DomainObjectType type, boolean isAggregateRoot) {
		this.Name = name;
		this.IsAggregateRoot = isAggregateRoot;
		Type = type;
		if (type == type.Enumeration) {
			Literals = new ArrayList<String>();
		} else {
			Relations = new ArrayList<YamlRelation>();
			Properties = new ArrayList<YamlProperty>();
		}
	}

	public void addRelation(YamlRelation ref) {
		if (!Relations.contains(ref)) {
			if (!ref.Name.equals(Name))
				Relations.add(ref);
		}
	}

	public void addProperty(YamlProperty property) {
		if (!Properties.contains(property)) {
			Properties.add(property);
		}
	}
	
	public void addLiteral(String literal) {
		if (!Literals.contains(literal)) {
			Literals.add(literal);
		}
	}

	public String toYAMLString() {
		String all = "  - Name: " + Name;
		all += "\n    Type: " + Type.name();
		if (Type != DomainObjectType.Enumeration) {
			all += "\n    IsAggregateRoot: " + IsAggregateRoot;
			if (Properties.size() > 0) {
				all += "\n    Properties:";
				for (YamlProperty property : Properties) {
					all += "\n" + property.toYAMLString();
				}
			} else
				all += "\n    Properties: []";
			if (Relations.size() > 0) {
				all += "\n    Relations:";
				for (YamlRelation ref : Relations) {
					all += "\n" + ref.toYAMLString();
				}
			} else
				all += "\n    Relations: []";
		} else {
			all += "\n    Literals: " + Arrays.asList(Literals).toString().replaceAll("^\\[|\\]$", "");
		}
		all += "\n";
		return all;
	}

	@Override
	public boolean equals(Object obj) {
		return ((YamlDomainObject) obj).Name.equals(Name);
	}

	public String getName() {
		return Name;
	}

	public Boolean getIsAggregateRoot() {
		return IsAggregateRoot;
	}

	public ArrayList<YamlRelation> getRelations() {
		return Relations;
	}

	public ArrayList<YamlProperty> getProperties() {
		return Properties;
	}

	public ArrayList<String> getLiterals() {
		return Literals;
	}

	public DomainObjectType getType() {
		return Type;
	}

	@Override
	public int hashCode() {
		return Name.hashCode();
	}

	public enum DomainObjectType {
		Entity, ValueObject, Enumeration, Event, Command, DTO  
	}
}
