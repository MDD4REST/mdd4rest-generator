package core.ontologytoyamltools;

/**
 * A class that holds string manipulation functions.
 * 
 * @author themis
 */
public class StringHelpers {

	/**
	 * Receives a word construct split in underscores and converts it to camelCase.
	 * Example: virtual_machine --> virtualMachine
	 * 
	 * @param wordConstruct the word construct to change its split.
	 * @return the camelCased word construct
	 */
	public static String underscoreToCamelCase(String wordConstruct) {
		String[] words = wordConstruct.split("_");
		String camelCaseWordConstruct = "";
		for (String word : words) {
			if (!camelCaseWordConstruct.equals("")) {
				if (!word.equals(""))
					camelCaseWordConstruct += word.substring(0, 1).toUpperCase() + word.substring(1);
			} else
				camelCaseWordConstruct += word;
		}
		return camelCaseWordConstruct;
	}

	/**
	 * Checks whether a string is a primitive type of java.
	 * 
	 * @param type the type to be checked whether it is a primitive.
	 * @return a boolean denoting whether the given type is a primitive ({@code true}), or not ({@code false}).
	 */
	public static boolean isPrimitive(String type) {
		return (type.equals("boolean") || type.equals("char") || type.equals("double") || type.equals("float")
				|| type.equals("integer") || type.equals("string") || type.equals("boolean"))
				|| (type.equals("Boolean") || type.equals("Char") || type.equals("Double") || type.equals("Float")
						|| type.equals("Integer") || type.equals("String") || type.equals("Boolean")
						|| type.equals("int") || type.equals("long") || type.equals("Int") || type.equals("Long"));
	}

}
