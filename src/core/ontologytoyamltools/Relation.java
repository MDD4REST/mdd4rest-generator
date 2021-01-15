package core.ontologytoyamltools;

import java.util.ArrayList;
import java.util.Arrays;

public class Relation {
	public String Name;

//	public String Source;
	
	public String Target;
	
	public Boolean Many;
	

	public Relation(String name, String target) {
		this.Name = name;
//		Source = source;
		Target = target;
		Many = false;	
	}
	
	public Relation(String name, String target, Boolean many) {
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
		Relation ref = (Relation) obj;
		return (ref.Name.equals(Name) && ref.Target.equals(Target));
	}

	
	@Override
	public int hashCode() {
		return Name.hashCode();
	}
	
}
