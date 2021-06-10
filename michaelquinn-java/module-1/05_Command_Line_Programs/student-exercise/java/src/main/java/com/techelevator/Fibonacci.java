package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		int initial = 0;
		int addInitial = 1;
		int keepInitial = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please  enter an integer: ");
		
		int topNumber = input.nextInt();
		input.hasNextLine();
		
		System.out.print(0 + " ");
		
		for (int nextNum = 1; nextNum <= topNumber;) {
			
			System.out.print(nextNum + " ");
			
			keepInitial = initial;
			initial = nextNum;
			nextNum = nextNum + keepInitial;
		}

	}

}
