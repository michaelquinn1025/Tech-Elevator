package com.techelevator;

public class Lecture {

	public static void main(String[] args) {
		
		/*
		1. Create a variable to hold an int and call it numberOfExercises.
			Then set it to 26.
		*/
		
		int numberOfExercises = 26;

		// to uncomment or comment click on the line and 
		// push ctrl /
		System.out.println(numberOfExercises);

		/*
		2. Create a variable to hold a double and call it half.
			Set it to 0.5.
		*/
		
		double half = 0.5;

		System.out.println(half);

		/*
		3. Create a variable to hold a String and call it name.
			Set it to "TechElevator".
		*/
		
		String name = "TechElevator";

		System.out.println(name);

		/*
		4. Create a variable called seasonsOfFirefly and set it to 1.
		*/
		
		int seasonsOfFirefly = 1;

		System.out.println(seasonsOfFirefly);

		/*
		5. Create a variable called myFavoriteLanguage and set it to "Java".
		*/
		
		String myFavoriteLanguage = "Java";

		System.out.println(myFavoriteLanguage);

		/*
		6. Create a variable called pi and set it to 3.1416.
		*/
		
		double pi = 3.1416;

		System.out.println(pi);

		/*
		7. Create and set a variable that holds your name.
		*/

		// name already declared must use different variable name
		String myName = "Yoav Morahg";
		
		System.out.println(myName);
		
		/*
		8. Create and set a variable that holds the number of buttons on your mouse.
		*/

		// we want a descriptive variable name
		int mouseButtons = 2;
		/*
		9. Create and set a variable that holds the percentage of battery left on
		your phone.
		*/
		
		double batteryPercentLeft = 0.85;
		
		// modulus example
		int studentsPerRoom = 26 / 4;
		System.out.println(studentsPerRoom);
		
		// % gives you the remainder of 26 / 4  (which is 2)
		int remainder = 26 % 4;
		System.out.println(remainder);
		
		// operator/assignment
		int total = 1;
		total = total + 1;
		
		//another way
		total += 1;
		
		// will be converted to 5.0
		double zeroTest = 5;

		/*
		10. Create an int variable that holds the difference between 121 and 27.
		*/
		
		int difference = 121 - 27;

		/*
		11. Create a double that holds the addition of 12.3 and 32.1.
		*/
		
		double sum = 12.3 + 32.1;

		/*
		12. Create a String that holds your full name.
		*/
		
		String fullname = "Yoav MOrahg";

		/*
		13. Create a String that holds the word "Hello, " concatenated onto your
		name from above.
		*/
		
		String helloString = "Hello, " + fullname;

		/*
		14. Add a " Esquire" onto the end of your full name and save it back to
		the same variable.
		*/
		
		fullname = fullname + ", Esquire";
		
		// this works too because you are adding to the same variable
//		fullname += ", Esquire";

		/*
		15. Now do the same as exercise 14, but use the += operator.
		*/

		/*
		16. Create a variable to hold "Saw" and add a 2 onto the end of it.
		*/
		
		String movie = "saw";
		
		// will convert 2 to "2" because we are working with a String
		String newMovie = movie + 2;				

		/*
		17. Add a 0 onto the end of the variable from exercise 16.
		*/
		
		// because newMovie is  a String it converts 0 to "0"
		newMovie += 0;

		/*
		18. What is 4.4 divided by 2.2?
		*/
		
		double result1 = 4.4 / 2.2;

		/*
		19. What is 5.4 divided by 2?
		*/
		
		// since it contain a double 2 will be converted to double (2.0)
		double result2 = 4.4 / 2;

		/*
		20. What is 5 divided by 2?
		*/

		// value is 2 because you only get the whole number
		int divResult1 = 5 / 2;
		
		
		/*
		21. What is 5.0 divided by 2?
		*/
		
		

		/*
		22. What is 66.6 divided by 100? Is the answer you get right or wrong?
		*/
		
		// doubles can be imprecise due to precision issue
		// wouldn't want to use doubles for finance applications (there are other options)
		
		double roundingExample = 66.6 / 100;
		System.out.println(roundingExample);
		
		roundingExample = 66.6 / 100.0;
		System.out.println(roundingExample);

		/*
		23. If I divide 5 by 2, what's my remainder?
		*/

		// the remainder of the division (1)
		int divRemaidner = 5 % 2;
		/*
		24. What is 1,000,000,000 * 3?
		*/
		

		// value is too big for int so results are unpredictable
		// dividing two ints yields an int even if the value is too big for an int
		// (compiler does not know that)
		int overflow = 1000000000 * 3;
		System.out.println(overflow);
		

		/*
		25. Create a variable that holds a boolean called doneWithExercises and
		set it to false.
		*/
		
		boolean doneWithExercises = false;

		/*
		26. Now set doneWithExercise to true.
		*/
		doneWithExercises = true;
	}

}
