package com.techelevator;

import java.math.BigDecimal;

public class Mod1Day7LectureScratchPad {

	public static void main(String[] args) {
		// this is some sample text in a string
		String sample = "This is some text";
		
		// cannot add ti chars together or assign chars
		// to a String
//		String result = sample.charAt(0) + sample.charAt(1);
		
		// We use String.valueOf(char) to make a String 
		// literal out of a char
		String result = String.valueOf(sample.charAt(0))
				+ String.valueOf(sample.charAt(1));
		
		// here we CAN add a char because we are working
		// with an existing String so the compiler
		// knows it needs to convert the char we are
		// adding to a String (kind of like adding a bouble and
		// an int and getting a double)
		result = result + sample.charAt(3);
		
		// indexOf example
		String indexOfExample = "Taco Tuesday is the best!";
		
		// indexOf will give you index of first instance
		// of search string in the String you are working with
		int indexofTuesday = indexOfExample.indexOf("Tuesday");
		System.out.println("indexofTuesday: " + indexofTuesday);
		
		// indexOf will return -1 if the String is not
		// found
		int indexOfFriday = indexOfExample.indexOf("Friday");
		System.out.println("indexOfFriday: " + indexOfFriday);
		
		// if you just want to search and don't
		// care about the index you can use contains
		System.out.println(indexOfExample.contains("Tuesday"));
		
		// declared but not intialized (doesn't reference anything)
		BigDecimal nullException;
		
		// compiler won't let us do this but if it did
		// we would get a NullPointerException during run time
		//nullException.add(BigDecimal.TEN);
		
		// scope example
		int sum = 0;
		int prev = 0;
		
		for (int i = 0; i < 10; i++) {
			
//			sum = 0;
			sum = prev + i;
			
			prev = sum;
		}
		
		System.out.println(sum);

	}

}
