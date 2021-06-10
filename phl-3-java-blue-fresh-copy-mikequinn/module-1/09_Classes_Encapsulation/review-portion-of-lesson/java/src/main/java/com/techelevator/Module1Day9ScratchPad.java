package com.techelevator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Module1Day9ScratchPad {

	public static void main(String[] args) {
		
		Module1Day9ScratchPad scratchPad = new Module1Day9ScratchPad();
		
		List<String> stringList = new ArrayList<String>();
		
		

	}
	
	public void mapToSet() {
		Map<Integer, String> theMap = new HashMap<Integer, String>();
		theMap.put(100,  "Hello!");
		theMap.put(1074,  "Wow!");
		theMap.put(5,  "Whew");
		theMap.put(764,  "Howdy");
		
		// let's make a set for the value
		
		// HashSet has a contstructor that accepts a collection 
		// that we can use to create a set
		
		Set<String> theMapAsSet = new HashSet<>(theMap.values());
		
		// another way
		//
		// the map values() method returns a Collection
		// 
		// using it in the constructor works because Java
		// can figure it out from what we are creating
		// but in this situation we have to force the
		// Collection to be seen as a Set by casting it
		// using (Set)
		//
		// this will remove duplicates because this a s
		//Set<String> setFromValues = (Set) theMap.values();
		
		// if we want to retain ALL values, we use a list
		//
		// *****This appears to not actually work when run. I am investigating
		// if there is a way to dot this***
		// 
		//List<String> listFromValue = (List) theMap.values();
		
		// don't need to do anything special here because
		// theMap.keySet() ALWAYS returns a Set
		Set<Integer> setFromKeys = theMap.keySet();
		
		// I could just iterate through theMap.keySet()
		
		for (Integer key : theMap.keySet()) {
			// do something
		}
		
		// for values we don't need to case in this case
		// most likely because we can use for-each for 
		// any type of Collection so it probably
		// doesn't matter that we are specifying the type
		for (String value : theMap.values()) {
			// do something
		}
		
		// if we want to access BOTH key and value 
		// than we must Entry objects (theMap.entrySet)
		// when we iterate because they hold
		// both the keys and the values
		
		
	}
	
	/*
	 * Given the name of an animal, return the name of a group of that animal
	 * (e.g. "Elephant" -> "Herd", "Rhino" - "Crash").
	 *
	 * The animal name should be case insensitive so "elephant", "Elephant", and
	 * "ELEPHANT" should all return "herd".
	 * (HINT: we discussed how to check for String equality without considering case when
	 * learning about the equals method. If you don't remember what the method for that is,
	 * use the String's dot operator to list its available methods)
	 *
	 * If the name of the animal is not found, null, or empty, return "unknown".
	 *
	 * Rhino -> Crash
	 * Giraffe -> Tower
	 * Elephant -> Herd
	 * Lion -> Pride
	 * Crow -> Murder
	 * Pigeon -> Kit
	 * Flamingo -> Pat
	 * Deer -> Herd
	 * Dog -> Pack
	 * Crocodile -> Float
	 *
	 * animalGroupName("giraffe") → "Tower"
	 * animalGroupName("") -> "unknown"
	 * animalGroupName("walrus") -> "unknown"
	 * animalGroupName("Rhino") -> "Crash"
	 * animalGroupName("rhino") -> "Crash"
	 * animalGroupName("elephants") -> "unknown"
	 *
	 */
	public String animalGroupName(String animalName) {
		
		Map<String, String> animalGroupName = new HashMap<String, String>();
		
		// we normalize our data to use all lowercase
		// so that we can make our given key all lowercase
		// and it will match regardless of the case
		animalGroupName.put("rhino", "Crash");
		animalGroupName.put("giraffe", "Tower");
		animalGroupName.put("elephant", "Herd");
		animalGroupName.put("lion", "Pride");
		animalGroupName.put("crow", "Murder");
		animalGroupName.put("pigeon", "Kit");
		animalGroupName.put("flamingo", "Pat");
		animalGroupName.put("deer", "Herd");
		animalGroupName.put("dog", "Pack");
		animalGroupName.put("crocodile", "Float");
		
		// handle the situation where the key is null
		// 
		// we check if animalNAme is equal to null
		// we can use == rather than equals because:
		//		1. we are talking about what animalName references
		// 		2. We actually NEED to do this because you can't call equals 
		//			method for an object that doesn't exist
		if (animalName == null) {
			return "unknown";
		}
		
		// if we wanted to check if the key is empty (which for
		// a String means it is "" 
		//boolean isEmptyString = animalName.equals("");
		//boolean isEmptyStringUsingMethod = animalName.isEmpty();
		
		// force our given key to be lowercase so we
		// look up value correctly
		String normalizedAnimalName = animalName.toLowerCase();
		
		
		
		
		// use the key (animalName) to ask for the data
		if (animalGroupName.containsKey(normalizedAnimalName)) {
			return animalGroupName.get(normalizedAnimalName);
		} else {
			return "unknown";
		}
		
	}
	
	/*
	 * Given the name of an animal, return the name of a group of that animal
	 * (e.g. "Elephant" -> "Herd", "Rhino" - "Crash").
	 *
	 * The animal name should be case insensitive so "elephant", "Elephant", and
	 * "ELEPHANT" should all return "herd".
	 * (HINT: we discussed how to check for String equality without considering case when
	 * learning about the equals method. If you don't remember what the method for that is,
	 * use the String's dot operator to list its available methods)
	 *
	 * If the name of the animal is not found, null, or empty, return "unknown".
	 *
	 * Rhino -> Crash
	 * Giraffe -> Tower
	 * Elephant -> Herd
	 * Lion -> Pride
	 * Crow -> Murder
	 * Pigeon -> Kit
	 * Flamingo -> Pat
	 * Deer -> Herd
	 * Dog -> Pack
	 * Crocodile -> Float
	 *
	 * animalGroupName("giraffe") → "Tower"
	 * animalGroupName("") -> "unknown"
	 * animalGroupName("walrus") -> "unknown"
	 * animalGroupName("Rhino") -> "Crash"
	 * animalGroupName("rhino") -> "Crash"
	 * animalGroupName("elephants") -> "unknown"
	 *
	 */
	public String animalGroupNameWithoutNormalization(String animalName) {
		
		Map<String, String> animalGroupName = new HashMap<String, String>();
		
		animalGroupName.put("Rhino", "Crash");
		animalGroupName.put("Giraffe", "Tower");
		animalGroupName.put("Elephant", "Herd");
		animalGroupName.put("Lion", "Pride");
		animalGroupName.put("Crow", "Murder");
		animalGroupName.put("Pigeon", "Kit");
		animalGroupName.put("Flamingo", "Pat");
		animalGroupName.put("Deer", "Herd");
		animalGroupName.put("Dog", "Pack");
		animalGroupName.put("Crocodile", "Float");
		
		// handle the situation where the key is null
		// 
		// we check if animalNAme is equal to null
		// we can use == rather than equals because:
		//		1. we are talking about what animalName references
		// 		2. We actually NEED to do this because you can't call equals 
		//			method for an object that doesn't exist
		if (animalName == null) {
			return "unknown";
		}
		
		String givenKey = animalName.toLowerCase();
		
		for (Map.Entry<String, String> entry : animalGroupName.entrySet()) {
			String key = entry.getKey().toLowerCase();
			if (key.equals(givenKey)) {
				return animalGroupName.get(givenKey);
			}
		}
		
		return "unknown";
		
	}
	
	/*
	 * Just when you thought it was safe to get back in the water --- last2Revisited!!!!
	 *
	 * Given an array of Strings, for each String, the count of the number of times that a subString length 2 appears
	 * in the String and also as the last 2 chars of the String, so "hixxxhi" yields 1.
	 *
	 * We don't count the end subString, but the subString may overlap a prior position by one.  For instance, "xxxx"
	 * has a count of 2, one pair at position 0, and the second at position 1. The third pair at position 2 is the
	 * end subString, which we don't count.
	 *
	 * Return Map<String, Integer>, where the key is String from the array, and its last2 count.
	 *
	 * last2Revisited(["hixxhi", "xaxxaxaxx", "axxxaaxx"]) → {"hixxhi": 1, "xaxxaxaxx": 1, "axxxaaxx": 2}
	 *
	 */
	public Map<String, Integer> last2Revisited(String[] words) {
		Map<String, Integer> resultMap = new HashMap<String, Integer>();
		
		// loop through all words
		for (String word : words) {
			// get last 2 chars of current word
			String last2 = word.substring(word.length() - 2);
			
			// start new count for current word
			int count = 0;
			
			// go through the word char by char
			for (int i = 0; i < word.length() - 2; i++) {
				// check if char and the one after equals the last2 chars we grabbed before
				if (word.substring(i, i + 2).equals(last2)) {
					// if it does, increment the count
					count++;
				}
			}
			// add the word and the count to the map
			resultMap.put(word, count);
		}
		
		// when we are all done with all the words and the entries, return map
		
		
		return resultMap;
	}
	
	

}
