package com.techelevator;

import java.math.BigDecimal;

public class BigDecimalExamples {

	public static void main(String[] args) {
		
		
		double num1 = 0.04;
		double num2 = 0.03;
		
		double difference = num1 - num2;
		
		System.out.println("difference using doubles: " + difference);
		
		
		
		// We can create new BigDecimal Objects using Strings
		BigDecimal bigDecimalFromString1 = new BigDecimal("0.04");
		BigDecimal bigDecimalFromString2 = new BigDecimal("0.03");
		
		// We can use the objects methods to do math
		BigDecimal bigDecimalDifference = bigDecimalFromString1.subtract(bigDecimalFromString2);
		
		System.out.println("difference using BigDecimals: " + bigDecimalDifference);
		
		
		
		// We can also use the BigDecimal class static method valueOf to create  BigDecimal Objects
		// from doubles.
	
		BigDecimal bigDecimalFromDouble1 = BigDecimal.valueOf(num1);
		BigDecimal bigDecimalFromDouble2 = BigDecimal.valueOf(num2);
		
		BigDecimal bigDecimalDifference2 = bigDecimalFromDouble1.subtract(bigDecimalFromDouble2);
		
		System.out.println("difference using BigDecimals: " + bigDecimalDifference2);
		
		// We can create a BigDecimal using new with a double as a param but
		// we SHOULD NOT because the double already has the inherent
		// inaccuracy and will cause BigDecimal to behave similarly to the double
		BigDecimal bdFromDouble1 = new BigDecimal(num1);
		BigDecimal bdFromDouble2 = new BigDecimal(num2);
		
		BigDecimal bigDecimalDifference3 = bdFromDouble1.subtract(bdFromDouble2);
		
		System.out.println("difference using BigDecimals with doubles: " + bigDecimalDifference3);
		
		
		// some other math functions
		System.out.println("addition: " + bigDecimalFromDouble1.add(bigDecimalFromDouble2));
		System.out.println("multiplication: " + bigDecimalFromDouble1.multiply(bigDecimalFromDouble2));
		
		// using division and BigDecimal constant
		System.out.println("divison: " + bigDecimalFromDouble1.divide(BigDecimal.TEN));
		
		System.out.println("power: " + bigDecimalFromDouble1.pow(2));
		


	}

}
