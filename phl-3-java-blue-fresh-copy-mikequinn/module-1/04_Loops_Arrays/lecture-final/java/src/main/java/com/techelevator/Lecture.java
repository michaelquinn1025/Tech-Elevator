
package com.techelevator;

public class Lecture {
	
	// If you access an index in an array that is beyond the available slots you will
	// get a runtime error which is ArrayOutOfBoundsException
	
	
	// CODE FROM QUESTIONS ASKED PRIOR TO WORKING THROUGH EXAMPLES ARE BELOW
	// TODAY's LECTURE CODE FOLLOWS AFTER THAT
	
	
	public static void main(String[] args) {
		// Casting
		
		long longNum = 30000000000L;
		int shortNum = 4;
		// long + int will yield long
		long resultLong = longNum + shortNum;
		
		// can force into int with cast
		int resultShort = (int)longNum + shortNum;
		
		// long data will be correct but int data may not
		System.out.println("long: " + resultLong);
		System.out.println("int: " + resultShort);
		
		// ternary operator example
		
		int num = 5;
		
		// ? indicates "if" condition to left
		// if true, value is the one to the left of :
		// if false, value is the one to the right of :
		String isNumEvenOrOdd = num % 2 == 0 ? "Even" : "Odd";
		
		// range of numbers
		// check if a number is between 10 and 20 inclusive
		int rangeNum = 11;
		// this will not work
		// if (rangeNum >= 10 && <= 20)
		// variable needs to be speicifed in each condition
		if (rangeNum >= 10 && rangeNum <= 20) {
			System.out.println("In range");
		} else {
			System.out.println("Not in range");
		}
		
		int x = 7;

		int y = x % 2;

		boolean answer = y >= 3;
		
		System.out.println("answer: " + answer);

		// CALL returnArray
		
		int [] myArray = returnArray();

	}
	
	/*
	 2. We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
	 We are in trouble if they are both smiling or if neither of them is smiling. Return true if we
	 are in trouble.
	 monkeyTrouble(true, true) → true
	 monkeyTrouble(false, false) → true
	 monkeyTrouble(true, false) → false
	 */
	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
//		return false;
		
		//using xor
		if (aSmile ^ bSmile) {
			return false;
		}
		return true;
	}
	
	/*
	 8. Return true if the given non-negative number is a multiple of 3 or a multiple of 5.
	 (Hint: Think "mod".)
	 or35(3) → true
	 or35(10) → true
	 or35(8) → false
	 */
	public boolean or35(int n) {
		/*
		 * 1) if mult of 3 -> return true
		 * 2) if mult of 5 -> return true
		 * 3) otherwise return false
		 */
		
		/* using else if
		if (n % 3 == 0) {
			return true;
		} else if (n % 5 == 0) {
			return true;
		}
		// either else or fall-through is ok
//		else {
//			return false;
//		} 
*/
		// using or
		if ( (n % 3 == 0) || (n % 5 == 0)) {
			return true;
		}
		
		return false;
	}
	
	/*
	 32. Given three ints, a b c, return true if b is greater than a, and c is greater than b. However, with
	 the exception that if "bOk" is true, b does not need to be greater than a.
	 inOrder(1, 2, 4, false) → true
	 inOrder(1, 2, 1, false) → false
	 inOrder(1, 1, 2, true) → true
	 */
	public boolean inOrder(int a, int b, int c, boolean bOk) {
		/*
		 * 1) when bOk is true: return true if c is greater than b
		 * 2) return true if b is greater than a, and c is greater than b
		 * 3) return false
		 * 
		 * 
		 */
		// if bOk is true
		if (bOk) {
			// method 1:
			/*
			if (c > b) {
				return true;
			} else {
				return false;
			}
			*/
			
			// method 2:
			return (c > b);
		} else {
			return (b > a && c > b);
		}
		
		// if I had used else if instead of else we would need to return false because
		// we may not have handled all situations. Java understands syntax but not
		// necessarily data
		
//		return false;
	}
	
	
	
	
	// If you access an index in an array that is beyond the available slots you will
	// get a runtime error which is ArrayOutOfBoundsException
	

    /*
    1. Here, a variable is defined within a block. How can we get the value of that outside of the block in order to
       return it? There are a couple of different ways of doing this, what can you come up with?
    */
    public int returnVariableFromBlock(int number) {
    	
    	// ORIGINAL CODE WE WERE SUPPOSED TO MODIFY:
    	
    	//scope of number is the method block

    	/*
    	
        { // A new block with scoped variables

            int result = number * 5;

        } // the result variable disappears here

        return number;
        
        */
    	
    	/*
        
    	/// SECOND EXAMPLE (COMMENTS INTER-MINGLED).. CLEAN FINAL EXAMPLE FOLLOWS
    	// need to declare result outside of block
    	int result;
    	
        { // A new block with scoped variables

//            int result = number * 5;
        	
        	// instead of declaring we just update (assing)
    		result = number * 5;

        } // the result variable disappears here

        // result is accessible because we declared in the main method block
        return result;
        */
    	
    	/// FINAL EXAMPLE
    	int result;
    	
        { 

    		result = number * 5;

        }
        return result;
    }

    /*
    2. What will the variable result be at the end of the method? Change the number in the logic expression so that
       it returns true.
    */
    public boolean returnOperationInBlock() {
        int result = 5;

        {
            int multiplier = 10;
            result *= multiplier;
        }

        // result would be 50
        return result == 50; // <-- Change the number to match result and make this be true
    }

    /*
    3. Return the only variable that is in scope at the return statement.
    */
    public double returnInScopeVariable() {
        double one = 1.0;
        {
            double three = 3.0;
            one += three;
            {
                double four = 4.0;
                three = four - one;
                one++;
            }

            double five = 5.0;
            double eight = five + three;
        }

        return one;
    }

    /*
    4. Return the created array
    */
    // DON"T WORRY ABOUT static KEYWORK... just ignore for now
    public static int[] returnArray() {
        int [] array = { 80, 8080, 443 };
        return array;
    }

    /*
    5. Return the first element of the array
    */
    public int returnFirstElement() {
        int[] portNumbers = { 80, 8080, 443 };
        return portNumbers[0];
    }

    /*
    6. Return the first element of the array from the parameters
    */
    public int returnFirstElementOfParam(int[] passedInArray) {
        return passedInArray[0];
    }

    

    /*
    7. Return the last element of the array
    */
    public int returnLastElement() {
        int[] portNumbers = { 80, 8080, 443 };
        return portNumbers[2];
        
    }

    /*
    8. Return the last element of the array from the parameters
    */
    public int returnLastElementOfParam(int[] passedInArray) {
        return passedInArray[passedInArray.length - 1];
    }

    

    /*
    9. How many times do we go through this loop? Change the number in the logic expression so that it returns true.
    */
    public boolean returnCounterFromLoop() {

        int[] arrayToLoopThrough = { 3, 4, 2, 9 };

        int counter = 0; // Must be started outside the block so that have access to it after the block

        for (int i = 0; i < arrayToLoopThrough.length; i++) {
            counter++;
        }

        return counter == 4; // What should the number be to return true?
    }

    /*
    10. This loop is counting incorrectly. What needs to change in the loop for it to count properly?
    */
    public boolean returnCorrectCount() {
        int[] arrayToLoopThrough = { 4, 23, 9 };

        int counter = 0;

        //     Start;       Keep going while         Increment by one;
        for (int i = 0; i < arrayToLoopThrough.length; i++) {
            counter += 1;
        }

        return counter == 3;
    }

    /*
    11. This loop is counting incorrectly. What needs to change in the loop for it to count properly?
    */
    public boolean returnCountCorrectTimes() {
        int[] arrayToLoopThrough = { 4, 23, 9, 4, 33 };

        int counter = 0;

        //     Start;       Keep going while         Increment by one;
        // index should start a 0 NOT 1
        for (int i = 0; i < arrayToLoopThrough.length; i++) {
            counter = counter + 1;
        }

        return counter == 5;
    }

    /*
    12. We want this loop to only count every other item starting at zero. What needs to change in the loop for
        it to do that?
    */
    public boolean returnSumEveryOtherNumber() {
        int[] arrayToLoopThrough = { 4, 3, 4, 1, 4, 6 };

        int sum = 0;

        //     Start;       Keep going while       Increment by;
        // must be < arrayToLoopThrough.length NOT <=
        for (int i = 0; i < arrayToLoopThrough.length; i = i + 2) {
            sum = sum + arrayToLoopThrough[i];
        }

        return sum == 12;
    }
}