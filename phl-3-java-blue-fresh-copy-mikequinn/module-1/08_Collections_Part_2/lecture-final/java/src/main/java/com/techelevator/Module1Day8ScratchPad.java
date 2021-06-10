package com.techelevator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Module1Day8ScratchPad {

	public static void main(String[] args) {

		// Arrays use length property
		
		// Strings use length() method
		
		// Collections use size()
		
		// Unfortunately different classes handle it
		// differently
		
		List<String> myList = new ArrayList<String>();
		
		myList.size();
		
		
		// BigDecimal is a class we can use
		// to handle floating point math
		// accurately (float / double often
		// have repeating numbers due
		// to small calculation errors
		
		//can create using a (double) String as parameter
		BigDecimal myBigDecimal = new BigDecimal("0.99");
		
		// avoid creating with a double primitive type
		// double or float because the issues with them
		// will carry over to the class
		
		// can  create using a double or variable using
		// the static class method valueOf
		BigDecimal MyValueOfBd = BigDecimal.valueOf(.25);
		
		double num1 = 0.04;
		double num2 = 0.03;
		
		System.out.println("with doubles: " + (num1 - num2));
		
		BigDecimal num1BigDec = BigDecimal.valueOf(num1);
		BigDecimal num2BigDec = BigDecimal.valueOf(num2);
		
		// can use class mwthods to do math correctly
		BigDecimal resultNum = num1BigDec.subtract(num2BigDec);
		
		System.out.println("resultNum: " + resultNum);

		// if you are populating an array you will need the index
		// so you can say myArray[index] = something
		//
		// if you are populating some other collection, a for-each 
		// should work (most of the time)
		
		List<String> sourceList = new ArrayList<String>();
		sourceList.add("Today");
		sourceList.add("is");
		sourceList.add("not");
		sourceList.add("Taco");
		sourceList.add("Tuesday");
		
		List<String> resultList = new ArrayList<String>();
		
		for (String currentString : sourceList) {
			resultList.add(currentString);
		}
	}
	
	// exercises worked through
	
	/*
	 Given an array of Integers, return a List that contains the same Integers (as Strings). Except any multiple of 3
	should be replaced by the String "Fizz", any multiple of 5 should be replaced by the String "Buzz",
	and any multiple of both 3 and 5 should be replaced by the String "FizzBuzz"
	** INTERVIEW QUESTION **
	
	fizzBuzzList( {1, 2, 3} )  ->  [1, 2, "Fizz"]
	 fizzBuzzList( {4, 5, 6} )  ->  [4, "Buzz", 6]
	 fizzBuzzList( {7, 8, 9, 10, 11, 12, 13, 14, 15} )  ->  [7, 8, "Fizz", "Buzz", 11, "Fizz", 13, 14, "FizzBuzz"]
	
	 HINT: To convert an integer x to a string you can call x.toString() in your code (e.g. if x = 1 then x.ToString()
	 equals "1")
	 */
	public List<String> fizzBuzzList(Integer[] integerArray) {
		List<String> fizzBuzzedList = new ArrayList<String>();
		
		
		
		for (Integer number : integerArray) {
			boolean isFizzBuzz = number % 5 == 0 && number % 3 == 0;
			boolean isFizz = number % 3 == 0;
			boolean isBuzz = number % 5 == 0;
			
			if (isFizzBuzz) {
				fizzBuzzedList.add("FizzBuzz");
			} else if (isBuzz) {
				fizzBuzzedList.add("Buzz");
			} else if (isFizz) {
				fizzBuzzedList.add("Fizz");
			} else {
				fizzBuzzedList.add(number.toString());
			}
		}
		
		return fizzBuzzedList;
	}
	
	/*
	 Given an array of Integers, return a List of Integers containing just the odd values.
	 oddOnly( {112, 201, 774, 92, 9, 83, 41872} ) -> [201, 9, 83]
	 oddOnly( {1143, 555, 7, 1772, 9953, 643} ) -> [1143, 555, 7, 9953, 643]
	 oddOnly( {734, 233, 782, 811, 3, 9999} ) -> [233, 811, 3, 9999]
	 */
	public List<Integer> oddOnly(Integer[] integerArray) {
		List<Integer> result = new ArrayList<Integer>();
		
		// iterate through array using for-each
		// and if element we are looking at
		// is odd, add it to the new list
		for (Integer curInt : integerArray) {
			if (curInt % 2 != 0) {
				result.add(curInt);
			}
		}
		
		return result;
	}
	
	/*
	 Given a list of Strings, return an array containing the same Strings in the same order
	 list2Array( ["Apple", "Orange", "Banana"] )  ->  {"Apple", "Orange", "Banana"}
	 list2Array( ["Red", "Orange", "Yellow"] )  ->  {"Red", "Orange", "Yellow"}
	 list2Array( ["Left", "Right", "Forward", "Back"] )  ->  {"Left", "Right", "Forward", "Back"}
	 */
	public String[] list2Array(List<String> stringList) {
		// create new array which is same size as list
		String [] result1 = new String[stringList.size()];
		
		// loop through list data and copy each 
		// element to the array using the index to
		// get the info from the list
		// and put it in the array
		for (int i = 0; i < stringList.size(); i++) {
			result1[i] = stringList.get(i);
		}
		
		// this will just print out the array
		// will iterate through result1 and pull out the next String
		// each time through the loop and put it in curString
		// which we can use in out block
		System.out.println("**************** result1 *****************");
		for (String curString : result1) {
			System.out.println(curString);
		}
		
		// Quick and dirty way
		String [] result2 = stringList.toArray(new String[0]);
		
		System.out.println("**************** result2 *****************");
		for (String curString : result2) {
			System.out.println(curString);
		}
		
		
		return result2;
	}


}
