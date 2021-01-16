package com.github.icelyframework.generator.cim.ontologytoyamltools;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 * Class used to find the types of verbs. Available types are {@code CREATE}, {@code READ}, {@code UPDATE},
 * {@code DELETE}, and {@code OTHER}.
 * 
 * @author themis
 * 
 */
public class VerbTypeFinder {

	/** Set used to keep {@code CREATE} verbs. */
	HashSet<String> CREATE_VERBS;

	/** Set used to keep {@code READ} verbs. */
	HashSet<String> READ_VERBS;

	/** Set used to keep {@code UPDATE} verbs. */
	HashSet<String> UPDATE_VERBS;

	/** Set used to keep {@code DELETE} verbs. */
	HashSet<String> DELETE_VERBS;

	/**
	 * Initializes this class by creating the four sets of words.
	 */
	public VerbTypeFinder() {
		CREATE_VERBS = new HashSet<String>();
		ArrayList<String> createverbs = new ArrayList<String>(Arrays.asList(new String[] { "create", "add", "produce",
				"make", "put", "write", "pay", "create", "send", "build", "raise", "develop", "produce", "register",
				"post" }));
		for (String verb : createverbs)
			CREATE_VERBS.add(Stemmer.stemVerb(verb));

		READ_VERBS = new HashSet<String>();
		ArrayList<String> readverbs = new ArrayList<String>(Arrays.asList(new String[] { "retrieve", "check", "choose",
				"return", "provide", "contact", "get", "take", "see", "ask", "show", "watch", "read",
				"open", "reach", "return", "receive", "view", "load" }));
		for (String verb : readverbs)
			READ_VERBS.add(Stemmer.stemVerb(verb));

		UPDATE_VERBS = new HashSet<String>();
		ArrayList<String> updateverbs = new ArrayList<String>(Arrays.asList(new String[] { "perform", "mark",
				"evaluate", "update", "set", "change", "edit" }));
		for (String verb : updateverbs)
			UPDATE_VERBS.add(Stemmer.stemVerb(verb));

		DELETE_VERBS = new HashSet<String>();
		ArrayList<String> deleteverbs = new ArrayList<String>(
				Arrays.asList(new String[] { "delete", "destroy", "kill" }));
		for (String verb : deleteverbs)
			DELETE_VERBS.add(Stemmer.stemVerb(verb));
	}

	/**
	 * Receives a verb as a parameter and returns its type ({@code CREATE}, {@code READ}, {@code UPDATE}, {@code DELETE}
	 * or {@code OTHER}).
	 * 
	 * @param verb the verb of which the type is returned.
	 * @return a string denoting the type of the verb ({@code "Create"}, {@code "Read"}, {@code "Update"},
	 *         {@code "Delete"} or {@code "Other"}
	 */
	public String getVerbType(String verb) {
		verb = Stemmer.stemVerb(verb);
		if (CREATE_VERBS.contains(verb)) {
			return "Create";
		} else if (READ_VERBS.contains(verb)) {
			return "Read";
		} else if (UPDATE_VERBS.contains(verb)) {
			return "Update";
		} else if (DELETE_VERBS.contains(verb)) {
			return "Delete";
		} else {
			return "Other";
		}
	}

}
