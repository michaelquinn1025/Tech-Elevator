package com.techelevator;

public class Lecture {

	public static void main(String[] args) {

		System.out.println("************************************");
		System.out.println("****** MAKING A STRING OBJECT ******");
		System.out.println("************************************");

		/* The String class gets special treatment in the Java language.  One
		 * example of this is that there is a literal representation of a
		 * String (i.e. characters appearing between two double quotes.  This
		 * is not the case for most classes */

		/* create an new instance of String using a literal */

		// convenience form for creating Strings
		String hello1 = "Hello";
		
		// this is what's going behind the scenes (either was is ok)
		String hello2 = new String("Hello 2!!!!");
		
		System.out.println();
		System.out.println("******************************");
		System.out.println("****** MEMBER METHODS ******");
		System.out.println("******************************");
		System.out.println();
		


		/* Other commonly used methods:
		 *
		 * endsWith
		 * startsWith
		 * indexOf
		 * lastIndexOf
		 * length
		 * substring
		 * toLowerCase
		 * toUpperCase
		 * trim
		 */

		// call length method of hello1
		System.out.println("length of hello1: " + hello1.length());
		
		// call length method of hello2 and store the result in
		// a variable
		//
		// NOTE: results of length
		int lengthOfHello2 = hello2.length();
		System.out.println("lengthOfHello2: " + lengthOfHello2);
		
		// you can read a char at a specific index of a String
		char charAt5 = hello2.charAt(6);
		System.out.println("charAt5: " + charAt5);
		

		// this will cause an error
		//char charAt100 = hello2.charAt(100);
		
		// endsWith will check whether a String ends with a given
		// String and return a boolean indicating true or false
		boolean hello1EndsWithExclamations = hello1.endsWith("!!");
		System.out.println("hello1EndsWithExclamations: " + hello1EndsWithExclamations);;
		
		boolean hello2EndsWithExclamations = hello2.endsWith("!!");
		System.out.println("hello2EndsWithExclamations: " + hello2EndsWithExclamations);;
		
		// startsWith will check whether a String starts with a given
		// String and return a boolean indicating true or false
		
		boolean hello1StartsWithHe = hello1.startsWith("he");
		boolean hello2StartsWithHe = hello2.startsWith("He");
		
		System.out.println("hello1StartsWithHe: " + hello1StartsWithHe);
		System.out.println("hello2StartsWithHe: " + hello2StartsWithHe);
		
		
		//indexOf searches for a String within a String and returns
		// index of first occurence
		//hello
		
		int hello1IndexOf = hello1.indexOf("ll");
		System.out.println("hello1IndexOf: " + hello1IndexOf);
		
		int helloIndexOf9x = hello1.indexOf("9x");
		System.out.println("helloIndexOf9x: " + helloIndexOf9x);
		
		// example of checking if string contain a String
		// using indexOf
		if (hello1.indexOf("ll") != -1) {
			System.out.println("ll found");
		} else {
			System.out.println("ll not found");
		}
		
		// here is if doesn't match
		if (hello1.indexOf("9x") != -1) {
			System.out.println("9x found");
		} else {
			System.out.println("9x not found");
		}
		
		// this is probably a better way... use contains method
		boolean hello1Containsll = hello1.contains("ll");
		System.out.println("hello1Containsll: " + hello1Containsll);
		
		boolean hello2Contains9x = hello1.contains("9x");
		System.out.println("hello2Contains9x: " + hello2Contains9x);
		
		//toLowerCase and toUpperCase
		System.out.println("hello1.toUpperCase(): " + hello1.toUpperCase());
		// can do this with toLowerCase
		
		// trim remove leading and trailing whitespace
		String trimExample  = "   Monday is a sleepy day ";
		System.out.println(">>>>" + trimExample + "<<<<");
		// with trim
		System.out.println(">>>>" + trimExample.trim() + "<<<<");
		
		//substring
		String subExample = "Oh my what a week!";
		// print substring starting at index 0
		// and ending at index 10 but NOT include index 10
		System.out.println("subExample.substring(6, 10): " + subExample.substring(6, 10));
		String subExmapleSubstring = subExample.substring(6, 10);
		System.out.println("subExmapleSubstring: " + subExmapleSubstring);
		System.out.println("subExample take 2: " + subExample);
		
		// String are immutable (which means they can't change)
		// - when we update a String it is really creating a new
		// String and updating the reference location in the variable
		//
		// - String methods (substring, toUpperCase)
		// do NOT modify the original String. If you want to 
		// update the String to the new value, you reassign
		// the return to the same variable which will update
		// the reference location. Like so:
		
		subExample = subExample.substring(6, 10);
		System.out.println("subExample  after update: " + subExample);
		
		// you can hold on to the reference location by storing it in another
		// variable
		String holdExample = "Initial String";
		String holdVar = holdExample;
		holdExample = holdExample.toUpperCase();
		System.out.println("holdExample: " + holdExample);
		System.out.println("holdVar: " + holdVar);
		
		// going back to that pesky question om the quiz
		boolean [] firstSet = { true, true, false, false };
		// secondSet refers to SAME location as firstSet
		boolean [] secondSet  = firstSet;
		
		// updating either affects BOTH because they refer
		// to the same memory locations
		firstSet[1] = false;
		secondSet[2] = true;
		
		System.out.println("firstSet[2]" + firstSet[2]);
		System.out.println("secondSet[1]" + firstSet[1]);
		
		// this will output location rather than data
		System.out.println("firstSet:"  + firstSet);
		System.out.println("secondSet:"  + secondSet);
		
		for (int i = 0; i < firstSet.length; i++) {
			System.out.println("firstSet[" + i + "]: " + firstSet[i]);
			System.out.println("secondSet[ " + i + "]: " + secondSet[i]);
		}
		
		
		// primitive types do not refer to locations so...
		
		int a = 5;
		int b = a;
		a = 7;
		
		// b does NOT get updated when we update a because they
		// do not refer to memory locations.. just values
		System.out.println("b: " + b);
		
		String equal1 = "equal";
		String equal2 = "equal";
		String ending = "ity";
		
		// in this case the two conditions are NOT equal
		// because they refer to memory locations
		// and NOT content
		if ( (equal1 + ending) == (equal2 + ending)) {
			System.out.println("Strings equal");
		} else {
			System.out.println("Strings NOT equal");
		}
		
		// this compares the CONTENTS of the memory
		// rather than the locations
		if ( (equal1 + ending).equals(equal2 + ending)) {
			System.out.println("Strings contents equal");
		} else {
			System.out.println("Strings contents NOT equal");
		}
		
		// when comparing objects ALWAYS use equals
		
		// you can use equalsIgnoreCase rather than equals
		// toi compare strings but ignore case differences
		String ignoreCaseExample = "Hello";
		if (ignoreCaseExample.equalsIgnoreCase("HELLO")) {
			System.out.println("content equals when ignoring case");
		} else {
			System.out.println("content NOT equal");
		}
				
		
		
		
		
		
		/*
		System.out.println();
		System.out.println("**********************");
		System.out.println("****** EQUALITY ******");
		System.out.println("**********************");
		System.out.println();
		*/



		
	}
}
