package com.techelevator;

public class Mod1Day6LectureScratchpad {

	public static void main(String[] args) {
		
		String myNumString = "550";
		
		// uses the Integer wrapper class to create an int
		// from the String
		int myNum = Integer.parseInt(myNumString);
		
		System.out.println("myNum: " + myNum);
		
		// uses the Double wrapper class to create a double
		// from the String
		double myDoubleNum = Double.parseDouble(myNumString);
		
		System.out.println("myDoubleNum: " + myDoubleNum);
		
		
		// loop through array example
		String [] numStringArray = { "5", "100", "34", "2500"};
		
		// declare sum variable - this is declared OUTSIDE of
		// loop so it is in scope when we are done
		
		int sum = 0;
		
		// loop through every element in the array
		for (int index = 0; index < numStringArray.length; index++) {
			// access current element using inedex
			
			String curNumString = numStringArray[index];
			
			// convert to int using Integer wrapper class
			int curNum = Integer.parseInt(curNumString);
			
			// add int value to sum
			sum += curNum;
		}
		
		// print sum value  after loop
		System.out.println("sum: " + sum);

	}

}
