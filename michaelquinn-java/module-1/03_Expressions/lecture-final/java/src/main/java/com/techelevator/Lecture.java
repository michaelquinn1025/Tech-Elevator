package com.techelevator;

public class Lecture {
	
	// FROM LECTURE DISCUSSION
	public static void main(String[] args) {
		
		int myNum = 5;
		
		//// INCREMENT/DECRMENT EXAMPLES
		
		// increments AFTER printing so will  print 5
		System.out.println(myNum++);
		
		// will be 6 BEFORE call because of above
		// will increment BEFORE printing so will print 7
		System.out.println(++myNum);
		
		//// IF/ELSE EXAMPLES
		boolean isItFall = true;
		
		// use the if block format always
		if (isItFall == true) {
			System.out.println("1. It's fall!");
		} else {
			System.out.println("1. It's NOT fall!");
		}
		
		isItFall = false;
		
		if (isItFall == true) {
			System.out.println("2. It's fall!");
		} else {
			System.out.println("2. It's NOT fall!");
		}
		
		isItFall = true;
		
		// using only boolean value.. not ==
		// use this when possible (more readable)
		if (isItFall) {
			System.out.println("3. It's fall!");
		} else {
			System.out.println("3. It's NOT fall!");
		}
		
		isItFall = true;
		
		// ! negates the boolean value so will run
		// if variable is false (in this case it's true so 
		// we will get the else part of the code
		if (!isItFall) {
			System.out.println("4. It's NOT fall!");
		} else {
			System.out.println("4. It's  fall!");
		}
		
		isItFall = false;
		
		// isItFall IS false (the condition ("is isItFall 
		// false?" evaluates to true)
		if (!isItFall) {
			System.out.println("4.5 It's NOT fall!");
		} else {
			System.out.println("4.5 It's  fall!");
		}
		
		////// ALL THESE IF CASES ARE THING TO BE AWARE
		////// OF BUT YOU WANT TO WRITE CODE AS ABOVE
		
		
		// still false
		if (!isItFall)
			System.out.println("5. Hello");	
			System.out.println("5. It's NOT fall!");
		
		// since if does not contain a block, the 
		// second line will get executed even though the
		// condition evaluate to false (isItFall is NOT true)
		if (isItFall)
			System.out.println("6. Hello");
			// this DOES get printed because the if is not
			// block
			System.out.println("6. It's  fall!");
		
		// still false
		// if IS a block and condition not met so NEITHER prints
		if (isItFall) {
				System.out.println("7. Hello block!");	
				System.out.println("7. It's  fall!");
		}
		
		// one thing to be aware of is that the operator !
		// is NEGATION. It DOES NOT mean false
		boolean flippedConidtion = false;
		
		// evaluates true (!flippedConidtion)
		if (!flippedConidtion) {
			System.out.println("FLIPPED!");
		}
		
		// evaluates to false (flippedConidtion)
		if (flippedConidtion) {
			System.out.println("NOT FLIPPED!");
		}
		
		/////// GO BACK TO PAYING ATTENTION 
		
		//IF/ELSE IF/ELSE
		
		//int degrees = 10;
		//int degrees = 60;
		int degrees = 85;
		
		if (degrees < 30) {
			System.out.println("BRRRRRR!!!");
		} else if (degrees < 80) {
			System.out.println("SURE IS NICE OUT!!!");
		} else {
			System.out.println("TOO HOT!!!");
		}
		
		// else NOT required
		// THIS IS VALID
		if (degrees == 50) {
			System.out.println("IT'S 50!!!");
		}
		
		// nested ternary DO NOT DO THIS
		
		// FIX THIS
//		int num = 10;
//		String message = (num % 2) ? ( (num == 10) ? "TEN" : "EVEN") : "ODD";
//		
		
		// REWRITE AND/OR EXAMPLE TO WITH ELSE IF
		int gradePercentage = 70;
		
		if (gradePercentage >= 90) {
			System.out.println("A");
		} else if (gradePercentage >= 80 && gradePercentage < 90 ) {
			System.out.println("B");
		} else if (gradePercentage >= 70 && gradePercentage < 80) {
			System.out.println("C");
			// if below is <= 70 this WILL NOT EXECUTE BECAUSE
			// C ALREADY OCCURRED
		} else if (gradePercentage >= 60 && gradePercentage < 70) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}

	}
	
    /*
    1. This method is named returnNotOne and it returns an int. Change
    it so that it returns something other than a 1.
    */
    public int returnNotOne() {
        return 7;
    }

    /*
    2. This method is named returnNotHalf and it returns a double. Change
    it so that it returns something other than a 0.5.
    */
    public double returnNotHalf() {
        return 1.5;
    }

    /*
    3. This method needs to return a String. Fix it to return a valid String.
    */
    public String returnName() {
        return "Words";
    }

    /*
    4. This method currently returns an int. Change it so that it returns a double.
    */
    public double returnDoubleOfTwo() {
        return 2;
    }

    /*
    5. This method should return the language that you're learning. Change
    it so that it does that.
    */
    public String returnNameOfLanguage() {
        return "Java";
    }

    /*
    6. This method uses an if statement to define what to return. Have it
    return true if the if statement passes.
    */
    public boolean returnTrueFromIf() {
        if (true) {
            return true;
        } 
        
        return false;

        
    }

    /*
    7. This method uses an if to check to make sure that one is equal
    to one. Make sure it returns true when one equals one.
    */
    public boolean returnTrueWhenOneEqualsOne() {
        if (1 == 1) {
            return true;
        }

        return false;
    }

    /*
    8. This method checks a parameter passed to the method to see if it's
    greater than 5 and returns true if it is.
    */
    public boolean returnTrueWhenGreaterThanFive(int number) {
        if (number > 5) {
        	// return stops the method execution when returning the value
        	return true;
        } else {

        }
        return false;
    }

    /*
    9. If you think about it, we really don't need the if statement above.
    How can we rewrite exercise 8 to have only one line of code?
    */
    public boolean returnTrueWhenGreaterThanFiveInOneLine(int number) {
       // return false; // What can we put here that returns a boolean that we want?
    	return (number > 5) ? true : false;
    }

    /*
    10. This method will take a number and do the following things to it:
    * If addThree is true, we'll add three to that number
    * If addFive is true, we'll add five to that number
    * We'll then return the result
    */
    public int returnNumberAfterAddThreeAndAddFive(int number, boolean addThree, boolean addFive) {
        if (addThree) {
            number = number + 3;
        }

        // We can't use an else here. They could both be true, so we have to check each one.

        if (addFive) {
            number += 5;
        }

        return number;
    }

    /*
    11. Write an if statement that returns "Fizz" if the parameter is 3 and returns an empty String for anything else.
    */
    public String returnFizzIfThree(int number) {
    	if (number == 3) {
    		return "Fizz";
    	}
        return "";
    }

    /*
    12. Now write the above using the Ternary operator ?:. If you're not sure what this is, you can Google it.
    */
    public String returnFizzIfThreeUsingTernary(int number) {
        //return "";
    	return number == 3 ? "Fizz" : "";
    }

    /*
    13. Write an if/else statement that returns "Fizz" if the parameter is 3, "Buzz" if the parameter is 5 and an empty String for anything else.
    */
    public String returnFizzOrBuzzOrNothing(int number) {
    	if (number == 3) {
    		return "Fizz";
    	} else if (number == 5) {
    		return "Buzz";
    	}
        return "";
    }

    /*
    14. Write an if statement that checks if the parameter number is either equal to or greater than 18. Return "Adult" if it is or "Minor" if it's not.
    */
    public String returnAdultOrMinor(int number) {
        if (number >= 18) {
            return "Adult";
        } else {
            return "Minor";
        }
    }

    /*
    15. Now, do it again with a different boolean opeation.
    */
    public String returnAdultOrMinorAgain(int number) {
//        if (true) {
//            return "Adult";
//        } else {
//            return "Minor";
//        }
    	return  (number >= 18) ? "Adult" : "Minor";
    }

    /*
    16. Return as above, but also return "Teen" if the number is between 13 and 17 inclusive.
    */
    public String returnAdultOrMinorOrTeen(int number) {
        if (number >= 18) {
            return "Adult";
        } else if (number >= 13 && number <= 17) {
            return "Teen";
        } else {
            return "Minor";
        }
    }

}