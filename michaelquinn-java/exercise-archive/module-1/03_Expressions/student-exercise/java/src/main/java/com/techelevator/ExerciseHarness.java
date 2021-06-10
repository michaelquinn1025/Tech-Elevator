package com.techelevator;

public class ExerciseHarness {

	public static void main(String[] args) {
		Exercises exercises = new Exercises();
		
		// you can change the method exercises calls 
		// to call that method in the Exercises
		System.out.println("sleepIn(false, false)");
		System.out.println(exercises.sleepIn(false, false));
		
		// add as many calls as you want
		System.out.println("sleepIn(true, false)");
		System.out.println(exercises.sleepIn(true, false));

	}

}
