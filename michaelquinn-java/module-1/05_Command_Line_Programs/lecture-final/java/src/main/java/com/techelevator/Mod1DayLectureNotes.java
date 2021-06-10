package com.techelevator;

import java.util.Scanner;

public class Mod1DayLectureNotes {

	public static void main(String[] args) {
		
//		day4QuizQ1();
//		day4QuizQ2();
//		day4QuizQ3();
//		day4QuizQ5();
//		day4QuizQ6();
//		day4QuizQ7();
	
		System.out.println(numToBinary(500));
		
		int x = 7;
		int y = 8;
		
		int result = addNums(x, y);
		
		

//		System.out.println("Enter your name: ");
//		String userName = readFromKeyBoard();
//		
//		System.out.println(userName);
//		
//		Scanner numReader = new Scanner(System.in);;
//		String numString = numReader.nextLine();
//		int num = Integer.parseInt(numString);
//		
//		int sum = num + 5;
		
//		whyWeUseNextLineExample();
		
//		useSplit();
		readLongFromKeyboard();
		
		
		
	}
	
	public static void whyWeUseNextLineExample() {
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name = userInput.nextLine();
		
		System.out.println("Enter number 1: ");
		int num1 = userInput.nextInt();
		
		// nextInt does not remove the carriage return 
		// from the queue so if we don't do this the
		// next read will just read that so we need to 
		// read from the queu again if we want the 
		// next read to actually wait for input
		//
		// if we don't do this, the next code will print the prompt but
		// not wait for input before moving on to the next batch of code
		String dummy = userInput.nextLine();
		
		System.out.println("Enter another name: ");
		String anotherName = userInput.nextLine();
		
		System.out.println("Enter number 2: ");
		int num2 = userInput.nextInt();
		
		System.out.println("Sum: " + (num1 + num2));
		
	}
	
	public static String readFromKeyBoard() {
		Scanner userInput = new Scanner(System.in);
		String name = userInput.nextLine();
		
		System.out.println("Method got: " + name);
		
		return name;
	}
	
	public static void readLongFromKeyboard() {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		String input = userInput.nextLine();
		
		long longNum = Long.parseLong(input);
	}
	
	public static void useSplit() {
		Scanner userInput = new Scanner(System.in);
//		String data = "Hello, there, class!";
		String data = userInput.nextLine();
		
		
		String [] dataArray = data.split(" ");
		
		System.out.println("dataArray has " + dataArray.length + " elements");
	}

	public static int addNums(int aBlah, int b) {
		return aBlah + b;
	}
	
	public static void day4QuizQ1() {
		int x = 2;
		int y = 5;
		y += x;
		System.out.println(y);
	}
	
	public static void day4QuizQ2() {
		int answer = 0;
		for(int i = 0; i < 10; i++) {
		    if(i % 2 == 0) {
		        answer = answer + i;
		    }
		}
		System.out.println(answer);
	}
	
	// answer: 0 -> 2 -> 6 -> 12 -> 20
	// i: 0 -> i -> 2 -> 3 -> 4 -> -> 5 -> 6 -> 7 -> 8 -> 9 
	
	public static void day4QuizQ3() {
		int sum = 0;
		for(int i = 10; i > 0; i -= 3) {

		    sum += i;

		}
		System.out.println(sum);
	}
	
	// sum: 0 -> 10 -> 17 -> 21 -> 22
	// i: 10 -> 7  -> 4 -> 1 -> -2
	
	public static void day4QuizQ4() {
//		int sum = 0;
//
//		for(int i = 0; i < 10; i++) {
//			sum += i;
//		}
//
//		int count = i;
	}
	
	public static void day4QuizQ5() {
		boolean[] first = { true, true, false, false };
		boolean[] second = first;

		first[0] = false;
		second[2] = true;

		for(int ix = 0; ix < first.length; ix++) {

		    boolean b = first[ix];
		    System.out.print(b+" ");
		}
		
		//first = { false, true, true, false }
		// second = { false, true, true, false }


	}
	
	public static void day4QuizQ6() {
		// original
		for(int i = 0; i < 5; i++) {
	         int sum = 0;

	         sum += i;

	         System.out.print(sum + " ");
	    }
		
		System.out.println();
		// sum2 declared outside of block
		
		int sum2 = 0;
		
		for(int i = 0; i < 5; i++) {
//	         int sum = 0;

	         sum2 += i;

	         System.out.print(sum2 + " ");
	    }
		
		
	}
	
	// i: 0 -> 1 -> 2 -> 3 -> 4 ->5 (stop)
	// sum: 0 -> 0 -> 1 -> 2 -> 3 -> 4
	
	public static void day4QuizQ7() {
		int[] numbers = new int[10];

		for(int ix = 0; ix < numbers.length; ix++) {

		    numbers[ix] = ix * 2;

		}

		int result = numbers[3];
		System.out.print(result);
	}
	
	// numbers: numbers[0]: 0, numbers[1]: 2, numbers[2]: 4, numbers[3]: 6
	// ix: 0 -> 1 -> 2 -> 3
	
	public static String numToBinary(int num) {
		return Integer.toBinaryString(num);
	}
	
}
