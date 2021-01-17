package com.github.icelyframework.generator.ontology.ontologytoyamltools;

import java.util.HashMap;
import java.util.Map;

/**
 * A stemmer for english language words.
 * 
 * @author themis
 */
public class Stemmer {

	/**
	 * Exceptions of verb types.
	 */
	private static final Map<String, String> verbExceptions;
	static {
		verbExceptions = new HashMap<String, String>();
		verbExceptions.put("caught", "catch");
		verbExceptions.put("been", "be");
		verbExceptions.put("thought", "think");
		verbExceptions.put("told", "tell");
		verbExceptions.put("spoke", "speak");
		verbExceptions.put("stood", "stand");
		verbExceptions.put("led", "lead");
		verbExceptions.put("lost", "lose");
		verbExceptions.put("drawn", "draw");
		verbExceptions.put("ran", "run");
		verbExceptions.put("went", "go");
		verbExceptions.put("broke", "break");
		verbExceptions.put("began", "begin");
		verbExceptions.put("made", "make");
		verbExceptions.put("left", "leave");
		verbExceptions.put("gave", "give");
		verbExceptions.put("brought", "bring");
		verbExceptions.put("hoped", "hope");
		verbExceptions.put("fell", "fall");
		verbExceptions.put("found", "find");
		verbExceptions.put("known", "know");
		verbExceptions.put("came", "come");
		verbExceptions.put("grown", "grow");
		verbExceptions.put("meant", "mean");
		verbExceptions.put("broken", "break");
		verbExceptions.put("bought", "buy");
		verbExceptions.put("knew", "know");
		verbExceptions.put("taught", "teach");
		verbExceptions.put("understood", "understand");
		verbExceptions.put("did", "do");
		verbExceptions.put("begun", "begin");
		verbExceptions.put("had", "have");
		verbExceptions.put("got", "get");
		verbExceptions.put("ate", "eat");
		verbExceptions.put("shown", "show");
		verbExceptions.put("won", "win");
		verbExceptions.put("written", "write");
		verbExceptions.put("took", "take");
		verbExceptions.put("wrote", "write");
		verbExceptions.put("felt", "feel");
		verbExceptions.put("done", "do");
		verbExceptions.put("sent", "send");
		verbExceptions.put("gone", "go");
		verbExceptions.put("chosen", "choose");
		verbExceptions.put("were", "be");
		verbExceptions.put("eaten", "eat");
		verbExceptions.put("became", "become");
		verbExceptions.put("died", "die");
		verbExceptions.put("chose", "choose");
		verbExceptions.put("said", "say");
		verbExceptions.put("met", "meet");
		verbExceptions.put("heard", "hear");
		verbExceptions.put("sold", "sell");
		verbExceptions.put("built", "build");
		verbExceptions.put("sat", "sit");
		verbExceptions.put("spent", "spend");
		verbExceptions.put("saw", "see");
		verbExceptions.put("kept", "keep");
		verbExceptions.put("grew", "grow");
		verbExceptions.put("drew", "draw");
		verbExceptions.put("fallen", "fall");
		verbExceptions.put("paid", "pay");
		verbExceptions.put("spoken", "speak");
	}

	/**
	 * Exceptions of noun types.
	 */
	private static final Map<String, String> nounExceptions;
	static {
		nounExceptions = new HashMap<String, String>();
		nounExceptions.put("men", "man");
		nounExceptions.put("women", "woman");
		nounExceptions.put("children", "child");
	}

	/**
	 * Stems a series of nouns split with an underscore (e.g. virtual_machines) given as input and returns the stemmed
	 * nouns connected again with underscores (e.g. virtual_machine).
	 * 
	 * @param word the noun to be stemmed.
	 * @return the stemmed noun.
	 */
	public static String stemNounConstruct(String wordConstruct) {
		String[] words = wordConstruct.split("_");
		String stemmedWordConstruct = "";
		for (String word : words) {
			stemmedWordConstruct += stemNoun(word) + "_";
		}
		return stemmedWordConstruct.substring(0, stemmedWordConstruct.length() - 1);
	}

	/**
	 * Stems a noun given as input and returns the stemmed noun.
	 * 
	 * @param word the noun to be stemmed.
	 * @return the stemmed noun.
	 */
	public static String stemNoun(String word) {
		word = word.toLowerCase();
		int wordLength = word.length();
		if (nounExceptions.containsKey(word))
			return nounExceptions.get(word);
		else if (word.endsWith("sses") || word.endsWith("xes") || word.endsWith("shes") || word.endsWith("ches")
				|| word.endsWith("lles"))
			return word.substring(0, wordLength - 2);
		else if (word.endsWith("ces") || word.endsWith("ses") || word.endsWith("tes") || word.endsWith("nges")
				|| word.endsWith("mes") || word.endsWith("nes") || word.endsWith("des") || word.endsWith("ges")
				|| word.endsWith("les"))
			return word.substring(0, wordLength - 1);
		else if (word.endsWith("ves"))
			return word.substring(0, wordLength - 3) + "fe";
		else if (word.endsWith("yes"))
			return word.substring(0, wordLength - 1);
		else if (word.endsWith("ies"))
			return word.substring(0, wordLength - 3) + "y";
		else if (word.endsWith("ues"))
			return word.substring(0, wordLength - 1);
		else if (word.endsWith("es"))
			return word.substring(0, wordLength - 2);
		else if (word.endsWith("ss"))
			return word;
		else if (word.endsWith("s"))
			return word.substring(0, wordLength - 1);
		else
			return word;
	}

	/**
	 * Stems a verb given as input and returns the stemmed verb.
	 * 
	 * @param word the verb to be stemmed.
	 * @return the stemmed verb.
	 */
	public static String stemVerb(String word) {
		word = word.toLowerCase();
		int wordLength = word.length();
		if (verbExceptions.containsKey(word))
			return verbExceptions.get(word);
		else if (word.endsWith("ied"))
			return word.substring(0, wordLength - 3) + "y";
		else if (word.endsWith("ssed") || word.endsWith("xed") || word.endsWith("shed") || word.endsWith("ched")
				|| word.endsWith("lled"))
			return word.substring(0, wordLength - 2);
		else if (word.endsWith("eed"))
			return word.substring(0, wordLength - 1);
		else if (word.endsWith("ed") // Handles double consonants, e.g. stopped --> stop
				&& wordLength > 4
				&& word.substring(wordLength - 4, wordLength - 3)
						.equals(word.substring(wordLength - 3, wordLength - 2)))
			return word.substring(0, wordLength - 3);
		else if (word.endsWith("eeded") || word.endsWith("nted") || word.endsWith("rted") || word.endsWith("sted")
				|| word.endsWith("red") || word.endsWith("yed") || word.endsWith("wed") || word.endsWith("ned")
				|| word.endsWith("ked") || word.endsWith("med") || word.endsWith("ped") || word.endsWith("oed"))
			return word.substring(0, wordLength - 2);
		else if (word.endsWith("ed"))
			return word.substring(0, wordLength - 1);
		else if (word.endsWith("en"))
			return word.substring(0, wordLength - 1);
		else if (word.endsWith("ies"))
			return word.substring(0, wordLength - 3) + "y";
		else if (word.endsWith("sses") || word.endsWith("xes") || word.endsWith("shes") || word.endsWith("ches")
				|| word.endsWith("lles") || word.endsWith("oes"))
			return word.substring(0, wordLength - 2);
		else if (word.endsWith("s"))
			return word.substring(0, wordLength - 1);
		else if (word.endsWith("ssing") || word.endsWith("xing") || word.endsWith("shing") || word.endsWith("ching")
				|| word.endsWith("lling") || word.endsWith("oing") || word.endsWith("eeing") || word.endsWith("inging"))
			return word.substring(0, wordLength - 3);
		else if (word.endsWith("ing") // Handles double consonants, e.g. stopping --> stop
				&& wordLength > 5
				&& word.substring(wordLength - 5, wordLength - 4)
						.equals(word.substring(wordLength - 4, wordLength - 3)))
			return word.substring(0, wordLength - 4);
		else if (word.endsWith("eaking"))
			return word.substring(0, wordLength - 3);
		else if (word.endsWith("aking") || word.endsWith("ating") || word.endsWith("iking") || word.endsWith("iting"))
			return word.substring(0, wordLength - 3) + "e";
		else if (word.endsWith("eeding") || word.endsWith("nting") || word.endsWith("rting") || word.endsWith("sting")
				|| word.endsWith("ring") || word.endsWith("ying") || word.endsWith("wing") || word.endsWith("ning")
				|| word.endsWith("king") || word.endsWith("oing") || word.endsWith("oping") || word.endsWith("lping")
				|| word.endsWith("eting") || word.endsWith("uting") || word.endsWith("iting") || word.endsWith("ating")
				|| word.endsWith("lding") || word.endsWith("nding") || word.endsWith("ading")
				|| word.endsWith("eeming") || word.endsWith("eeping"))
			return word.substring(0, wordLength - 3);
		else if (word.endsWith("ing"))
			return word.substring(0, wordLength - 3) + "e";
		return word;
	}

	/**
	 * Tests this stemmer, provide new words as needed.
	 * 
	 * @param args unused parameter.
	 */
	public static void main(String[] args) {
		String exampleNoun = "businesses";
		System.out.println(exampleNoun + " --> " + StringHelpers.underscoreToCamelCase(Stemmer.stemNoun(exampleNoun)));
		String exampleNounConstruct = "virtual_machines";
		System.out.println(exampleNounConstruct + " --> " + Stemmer.stemNounConstruct(exampleNounConstruct));
		String exampleVerb = "creating";
		System.out.println(exampleVerb + " --> " + Stemmer.stemVerb(exampleVerb));
	}
}
