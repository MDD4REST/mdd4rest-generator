package com.github.icelyframework.generator.pim.inputParser;

public class YamlOperand {
	public String Resource;
	public String Property;

	public YamlOperand() {
		System.out.println("Resource");
	}

	public YamlOperand(String Resource) {
		System.out.println("Resource::" + Resource);
		this.Resource = Resource;
//		this.Property = Property;
	}

	public YamlOperand(String Resource, String Property) {
		System.out.println("Resource::" + Resource);
		this.Resource = Resource;
		this.Property = Property;
	}

	@Override
	public String toString() {
		return Resource + "(Resource = " + Resource + ", Property=" + Property + ")";
	}

	public String toYAMLString() {
		String all = "  - Resource: " + Resource;
		all += "\n    Property: " + Property;
		return all;
	}

	public String getResource() {
		return this.Resource;
	}

	public String getProperty() {
		return this.Property;
	}

}
