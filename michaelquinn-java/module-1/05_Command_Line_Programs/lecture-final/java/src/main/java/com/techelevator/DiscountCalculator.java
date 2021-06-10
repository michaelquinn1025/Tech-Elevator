package com.techelevator;

import java.util.Scanner;

class DiscountCalculator {

    /**
     * The main method is the start and end of our program
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Discount Calculator");

        // Prompt the user for a discount amount
        // The answer needs to be saved as a double
        System.out.print("Enter the discount amount (w/out percentage): ");
        
        String discount = scanner.nextLine();
        
        int discountNum = Integer.parseInt(discount);
        
        double discountPercent = discountNum / 100.0;


        // Prompt the user for a series of prices
        System.out.print("Please provide a series of prices (space separated): ");
        

        // read a line of prices separated by spaces
        String prices = scanner.nextLine();
        
        // convert string input to an array of strings  using split (space)
        String [] priceArray = prices.split(" ");
        
        for (int i = 0; i < priceArray.length; i++) {
        	String curPrice = priceArray[i];
        	
        	double price = Double.parseDouble(curPrice);
        	
        	double salePrice = price - (price * discountPercent);
        	
        	System.out.println("Price: " + price + " Sale Price: " + salePrice);
        }







    }

}