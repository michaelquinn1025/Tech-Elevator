package com.techelevator;

public class LectureExerciseReview {

	/*
	 Given a string and an int n, return a string made of the first and last n chars from the string. The
	 string length will be at least n.
	 nTwice("Hello", 2) → "Helo"
	 nTwice("Chocolate", 3) → "Choate"
	 nTwice("Chocolate", 1) → "Ce"
	 */
	public String nTwice(String str, int n) {
		
		String firstNChars = str.substring(0, n);
		String lastNChars = str.substring(str.length() - n, str.length());
		
		// you can also use the version of substring that take one param
		// it will start at the index and go to the end of the String
		//
		// String lastNChars = str.substring(str.length() - n);
		
		return firstNChars + lastNChars;
	}
	
	/*
	 Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string
	 on the outside and the longer string on the inside. The strings will not be the same length, but
	 they may be empty (length 0).
	 comboString("Hello", "hi") → "hiHellohi"
	 comboString("hi", "Hello") → "hiHellohi"
	 comboString("aaa", "b") → "baaab"
	 */
	public String comboString(String a, String b) {
		String shorter = (a.length() < b.length()) ? a : b;
		String longer = (a.length() > b.length()) ? a : b;
		
		// this works because shorter is a reference variable which
		// refers to same location as a
		//String longer = (shorter != a) ? a : b;
		
		
		return shorter  + longer + shorter;
	}

}
