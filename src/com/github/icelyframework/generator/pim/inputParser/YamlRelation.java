package com.github.icelyframework.generator.pim.inputParser;


public class YamlRelation {
	public String Name;

//	public String Source;
	
	public String Target;
	
	public Boolean Many;
	
	public YamlRelation() {
		
	}

	public YamlRelation(String name, String target) {
		this.Name = name;
//		Source = source;
		Target = target;
		Many = false;	
	}
	
	public YamlRelation(String name, String target, Boolean many) {
		this.Name = name;
//		Source = source;
		Target = target;
		Many = many;	
	}


	public String toYAMLString() {
		String all = "    - Name: " + Name;
		all += "\n      Target: " + Target;
		all += "\n      Many: " + Many;
		return all;
	}

	
	@Override
	public boolean equals(Object obj) {
		YamlRelation ref = (YamlRelation) obj;
		return (ref.Name.equals(Name) && ref.Target.equals(Target));
	}

	
	@Override
	public int hashCode() {
		return Name.hashCode();
	}

	public String getName() {
		return Name;
	}

	public String getTarget() {
		return Target;
	}

	public Boolean getMany() {
		return Many;
	}
	
	
	
}

