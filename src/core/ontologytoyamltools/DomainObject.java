package core.ontologytoyamltools;

import java.util.ArrayList;
import java.util.Arrays;

public class DomainObject {

	public String Name;

	public Boolean IsAggregateRoot;

	public ArrayList<Relation> Relations;

	public ArrayList<Property> Properties;
	
	public ArrayList<String> Literals;

	public DomainObjectType Type;

	public DomainObject(String name, DomainObjectType type) {
		this.Name = name;
		this.IsAggregateRoot = false;
		Type = type;
		if (type == type.Enumeration) {
			Literals = new ArrayList<String>();
		} else {
			Relations = new ArrayList<Relation>();
			Properties = new ArrayList<Property>();
		}

	}

	public DomainObject(String name, DomainObjectType type, boolean isAggregateRoot) {
		this.Name = name;
		this.IsAggregateRoot = isAggregateRoot;
		Type = type;
		if (type == type.Enumeration) {
			Literals = new ArrayList<String>();
		} else {
			Relations = new ArrayList<Relation>();
			Properties = new ArrayList<Property>();
		}
	}

	public void addRelation(Relation ref) {
		if (!Relations.contains(ref)) {
			if (!ref.Name.equals(Name))
				Relations.add(ref);
		}
	}

	public void addProperty(Property property) {
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
				for (Property property : Properties) {
					all += "\n" + property.toYAMLString();
				}
			} else
				all += "\n    Properties: []";
			if (Relations.size() > 0) {
				all += "\n    Relations:";
				for (Relation ref : Relations) {
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
		return ((DomainObject) obj).Name.equals(Name);
	}

	@Override
	public int hashCode() {
		return Name.hashCode();
	}

	public enum DomainObjectType {
		Entity, ValueObject, Enumeration, Event, Command, DTO
	}
}
