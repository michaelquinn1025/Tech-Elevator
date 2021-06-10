package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
			System.out.print("Please enter in a series of decimal values (seperated by spaces):");
			
			String decimalValuesEntered = input.nextLine();
			String[] decimalValuesSeperated = decimalValuesEntered.split(" ");
			
			for (int i = 0; i < decimalValuesSeperated.length; i++) {
				int inputNumber = Integer.parseInt(decimalValuesSeperated[i]);
				System.out.print(input + "in binary is ");
				
				decimalToBinary(inputNumber);
				System.out.print(" ");
			}

	}
	
	public static void decimalToBinary(int inputNumber) {
		int binaryNumber[] = new int[40];
		int index = 0;
		
		while (inputNumber > 0) {
			
			binaryNumber[index++] = inputNumber % 2;
			inputNumber = inputNumber / 2;
		}
		for(int i = index-1;i >= 0;i--) {
			System.out.print(binaryNumber[i]);
		}
	}

}

