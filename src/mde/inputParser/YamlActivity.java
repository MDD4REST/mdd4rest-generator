package mde.inputParser;

import java.util.ArrayList;
import java.util.Arrays;

public class YamlActivity {
	/**
	 * The name of the resource (note that all fields are public in order to allow serializing using
	 * {@link org.yaml.snakeyaml.Yaml Yaml}).
	 */
	public String Type;
	public Boolean IsAuthenticatedRequired;
	

	public YamlActivity() {

	}

	public YamlActivity(String type) {
		this.Type = type;
	}
	
	public YamlActivity(String type, Boolean isAuthenticationRequired) {
		this.Type = type;
		this.IsAuthenticatedRequired = isAuthenticationRequired;
	}

	@Override
	public String toString() {
		String all = "Activity:\n" + "Type: " + Type + "\n"
				+ "IsAuthenticationRequired: " + IsAuthenticatedRequired + "\n";
		return all;
	}

	/**
	 * Returns a YAML representation of this resource. This is used in order to create a more human-readable
	 * representation. (It sould be also performed using {@link org.yaml.snakeyaml.Yaml Yaml}).
	 * 
	 * @return a YAML representation of this object.
	 */
	public String toYAMLString() {
		String all = "- !!cim.Activity";
		all += "\n  Type: " + Type;
		all += "\n IsAuthenticationRequired: " + IsAuthenticatedRequired;
		return all;
	}
	
	@Override
	public boolean equals(Object obj) {
		return ((YamlResource) obj).Name.equals(Type);
	}

	
	@Override
	public int hashCode() {
		return Type.hashCode();
	}
	
	public String getType(){
		return this.Type;
	}
	
	public Boolean getIsAuthenticationRequired(){
		return this.IsAuthenticatedRequired;
	}
}
