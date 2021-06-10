package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the temperature:");
		
		int temp = input.nextInt();
		input.nextLine();
		
		System.out.print("Is the temperature in (C)elsius, or (f)arenheit? ");
		
		String forC = input.nextLine();
		
		System.out.print(temp + forC + "is" + doConversion(temp, forC) + (forC.toUpperCase().startsWith("F") ? "C" : "F"));
	}
		
		public static int doConversion (int temp, String forC) {
			
			if (forC.toUpperCase().startsWith("F")) {
				int resultTempC = (int) (( temp - 32) / 1.8);
				return resultTempC; 
			
			} else { 
				int resultTempF = ((int)(temp * 1.8 + 32 ));
				return resultTempF;
						
			}
		}
 
	}


