package com.techelevator.exceptions;

import java.util.Scanner;

public class ExceptionsLecture {
	
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		//arrayIndexOutOfBoundsExample();
		
		//bubbleUpExample();
		
		//polymorphicExceptionExample();
		
		//ourOwnExceptionsExample();
	
		//mustHandleOrThrowCheckedExceptionsExample();

		//stackTraceExample();
		
		
	
				
		
		
				
		
	}
	
	/* this method does not need to declare that it throws an IllegalArgumentException because
	 * it is a subclass of RuntimeException.  These are known as "unchecked exceptions" because
	 * the compiler does not force us to catch them. */
	private static double calculateHotelRoomCharges(int nights, int numberOfGuests) {
		final double EXTRA_GUEST_CHARGE = 20;
		final double ROOM_RATE = 85;
		
		/* The throw statements below demonstrate how to throw a new Exception. */
		if(nights < 1) {
			throw new IllegalArgumentException("Minimum number of nights is 1");
		} else if(numberOfGuests < 1) {
			throw new IllegalArgumentException("Minimum number of guests is 1");
		}
		
		int numberOfExtraGuests = 0;
		if(numberOfGuests > 4) {
			numberOfExtraGuests = numberOfGuests - 4;
		}
		
		double dailyRate = ROOM_RATE + (EXTRA_GUEST_CHARGE * numberOfExtraGuests);
		return dailyRate * nights;
	}
	
	/* OverdraftException is a "checked exception" (i.e. it is a subclass of java.lang.Exception)
	 * so we need to either catch it or declare that it is thrown.  This method declares that 
	 * it can throw an OverdraftException using the "throws" keyword */
	public static double withdraw(double currentBalance, double amountToWithdraw) throws OverdraftException {
		double newBalance;
		if(amountToWithdraw <= currentBalance) {
			newBalance = currentBalance - amountToWithdraw;
		} else {
			throw new OverdraftException("The requested withdrawal amount is greater than the current balance", Math.abs(currentBalance - amountToWithdraw));
		}
		return newBalance;		
	}

	private static void doSomethingDangerous() {
		int[] numbers = new int[5];
		for(int i = 0; i < 10; i++) {
			numbers[i] = i;  // this line will throw an Exception once i reaches 5
		}
		System.out.println("Look Ma, no Exceptions!");  // This line will not execute because an Exception will be thrown inside the for loop
	}
	
	public static void arrayIndexOutOfBoundsExample() {
		
		
		System.out.println("The following cities: ");
		String[] cities = new String[] { "Cleveland", "Columbus", "Cincinatti" };
		
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);  // This statement will throw an ArrayIndexOutOfBoundsException
		System.out.println("are all in Ohio."); // This line won't execute because the previous statement throws an Exception
		
 
		
		System.out.println();
		
	}
	
	public static void bubbleUpExample() {
		
		System.out.println("Hey ya'll, watch this!");
		doSomethingDangerous();  // throws an ArrayIndexOutOfBoundsException
		System.out.println("See, I told you nothing would go wrong!");
		
		
	}
	
	public static void polymorphicExceptionExample() {
		
		System.out.println("The standard work week is 40 hours.");
		System.out.print("How many hours did you work this week? >>> ");
		int hoursWorked = Integer.valueOf( scan.nextLine() ); 
		int overtimeHours = hoursWorked - 40;
		System.out.println("You worked "+overtimeHours+" hours of overtime.");
		
		
		System.out.println();
	}
	
	public static void ourOwnExceptionsExample() {
		/* we can throw our own Exceptions in response to exceptional cases 
		 * see the source code of calculateHotelRoomCharges for an example */
		int nights = -3;
		int numberOfGuests = 2;
		
		double amountOwed = calculateHotelRoomCharges(nights, numberOfGuests);
		System.out.println("Total owed for "+numberOfGuests+" guests for "+nights+" nights is $"+amountOwed);
		
		
		
		/* if we try to call the withdraw method outside of a try/catch, it will cause a compiler error */
		//withdraw(currentBalance, amountToWithdraw);
		
	}
	
	public static void mustHandleOrThrowCheckedExceptionsExample() {
		
		
		
		/* The withdraw method can throw a checked exception (i.e. OverdraftException) so we need to catch it since
		 * the main method does not declare that it throws any exceptions. */
		double currentBalance = 250;
		double amountToWithdraw = 300;
		
//		double newBalance = withdraw(currentBalance, amountToWithdraw);
//		System.out.println("new balance is "+newBalance);
		
		System.out.println();
	}
	
	public static void stackTraceExample() {
		
		doSomethingDangerous(); 
		
	}

}
