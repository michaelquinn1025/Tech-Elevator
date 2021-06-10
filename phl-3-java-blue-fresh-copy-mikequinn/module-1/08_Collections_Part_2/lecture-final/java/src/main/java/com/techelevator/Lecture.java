package com.techelevator;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("####################");
		System.out.println("        MAPS");
		System.out.println("####################");
		System.out.println();

		// Declaring and initializing a Map
		Map<String, String> myMap = new HashMap<String, String>();

		// Adding an item to a Map
		myMap.put("B", "Beth");
		myMap.put("F", "Frank");
		myMap.put("S", "Summer");
		myMap.put("J",  "Jerry");


		// Retrieving an item from a Map
		
		String sName = myMap.get("S");
		System.out.println("myMap.get(\"S\"): " + sName);

		String fName = myMap.get("F");
		System.out.println("myMap.get(\"F\"): " + fName);
		
		// If key already exists, value is updated, otherwise key-value added
		myMap.put("S", "Sally");
		
		sName = myMap.get("S");
		System.out.println("myMap.get(\"S\") (after update): " + sName);
		
		
		// If key does not exist, null is returned
		
		String xName = myMap.get("X");
		System.out.println("xName: " + xName);
		
		// avoid putting keys or values with null value in Maps if possible
		
		
		// Check to see if a key already exists
		
		boolean fExists = myMap.containsKey("F");
		System.out.println("fExists: " + fExists);
		

		boolean xExists = myMap.containsKey("X");
		System.out.println("xExists: " + xExists);
		
		
		// Find the number if elements in a Map

		int numOfElements = myMap.size();
		System.out.println("numOfElements: " + numOfElements);
		
		
		// Retrieving just the keys from a Map
		Set<String> keys = myMap.keySet();
		
		for (String key : keys) {
			System.out.println("key: " + key);
		}
		
		// Iterate through the key-value pairs in the Map
		Set<Entry<String, String>> entrySet = myMap.entrySet();
		
		for (Entry<String, String> entry : entrySet) {
			System.out.println("key: " + entry.getKey());
			System.out.println("value: " + entry.getValue());
		}
		
		// Entry<T, T>
		
		// another way to do this is to not use a variable for the entrySet
		// we don't need to store because we just iterating
		for (Entry<String, String> entry : myMap.entrySet()) {
			System.out.println("key: " + entry.getKey());
			System.out.println("value: " + entry.getValue());
		}
		
		
		System.out.println("--- start remove section ----");
		// Remove an element from the Map
		myMap.remove("J");
		
		for (Entry<String, String> entry : myMap.entrySet()) {
			System.out.println("key: " + entry.getKey());
			System.out.println("value: " + entry.getValue());
		} 
		
		String jValue = myMap.get("J");
		System.out.println("jValue: " + jValue);
		
		boolean jExists = myMap.containsKey("J");
		System.out.println("jExists: " + jExists);
		
		System.out.println("--- end remove section ----");
		
		// let's do something for "Sally"
		for (Entry<String, String> entry : myMap.entrySet()) {
			if (entry.getValue().equals("Sally")) {
				System.out.println("key: " + entry.getKey());
				System.out.println("value: " + entry.getValue());
			}
		} 
		
		// 
		Map<Integer, String> testMap = new HashMap<>();
		
		
		System.out.println("####################");
		System.out.println("        SETS");
		System.out.println("####################");
		System.out.println();
		
		
		// declare and initialize a Set
		Set<Integer> intSet = new HashSet<Integer>();
		intSet.add(4);
		intSet.add(9);
		intSet.add(199);
		
		for (Integer currentInt : intSet) {
			System.out.println("currentInt: " + currentInt);
		}
		
		System.out.println("--- before add duplicate ----");
		
		// adding the same value to a set will NOT create another
		// entry in the set
		
		intSet.add(9);
		
		for (Integer currentInt : intSet) {
			System.out.println("currentInt: " + currentInt);
		}
		
		

		
		// create some some objects

		
		// add them to set
		
		// what happens if we add a duplicate object?
		
		// check if element contained in set
		boolean contains9 = intSet.contains(9) && intSet.contains(500);
		
		
		System.out.println("contains9: " + contains9);
		System.out.println("using direct call:");
		System.out.println("contains9: " + intSet.contains(9));
		System.out.println("contains500: " + intSet.contains(500));
		
		// mymethod(String firstParam, boolean isContained)
		// myMethod("Hi", intSet.contains(500))
		
		
		// note that you can call the method directly if
		// you do not need to store the result
		//
		// you can always do wharever you want (math, call a method that
		// returns a value, etc) AS LONG AS the result of whatever you
		// do evaluates to the EXPECTED TYPE
		System.out.println("contains 200: " + intSet.contains(200));

		// remove object from set
		
		System.out.println("--- before remove ----");
		intSet.remove(9);
		
		System.out.println("contains 9: " + intSet.contains(9));

		
		// find number of elements in a set
		int itemCount = intSet.size();
		System.out.println("itemCount: " + itemCount);



	}

}
