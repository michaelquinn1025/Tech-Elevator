package com.techelevator.view;

import java.io.File;

import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Inventory {
	
	// Constants
	
	private static final int MAX_NUMBER_OF_ITEMS = 5;
	private static final int ITEM_CODE_FIELD = 0;
	private static final int NAME_FIELD = 1;
	private static final int PRICE_FIELD = 2;
	private static final int ITEM_TYPE_FIELD = 3;
	
	// Instance variables
	
	private int maxItems = MAX_NUMBER_OF_ITEMS;
	private Map<String, Item> remainingItems = new TreeMap<>();
	private Map<String, String> itemMessages = new TreeMap<>();
	
	// Getters and Setters

	public Map<String, Item> getRemainingItems() {
		return remainingItems;
	}
	
	public void setRemainingItems(Map<String, Item> remainingItems) {
		this.remainingItems = remainingItems;
	}
	
	public Map<String, String> getItemMessages() {
		return itemMessages;
	}
	
	public void setItemMessages(Map<String, String> itemMessages) {
		this.itemMessages = itemMessages;
	}
	
	// When program starts, this method will
	// read from file and "stock" machine with items
	public void restock(File inventoryList) {
		
		if ( inventoryList != null ) {

			try (Scanner updatedInventory = new Scanner(inventoryList)) {
				
				while (updatedInventory.hasNextLine()) {
					
					// Parse and store data
					String itemInfo = updatedInventory.nextLine();
					String[] arrayInfo = itemInfo.split("\\|");
					
					// Create variables from data
					String name = arrayInfo[NAME_FIELD];
					Double price = Double.parseDouble(arrayInfo[PRICE_FIELD]);
					String itemCode = arrayInfo[ITEM_CODE_FIELD];
					String itemType = arrayInfo[ITEM_TYPE_FIELD];
					int numberRemaining = maxItems;
					
					// Create item
					Item item = new Item(name, price, itemCode, itemType, numberRemaining);
					
					// Adds item to inventory
					remainingItems.put(itemCode, item);
				}
				
				// Set item type messages
				itemMessages.put("Chip", "Crunch Crunch, Yum!");
				itemMessages.put("Candy", "Munch Munch, Yum!");
				itemMessages.put("Drink", "Glug Glug, Yum!");
				itemMessages.put("Gum", "Chew Chew, Yum!");
				
			} catch (FileNotFoundException e) {
				System.out.println("Exception: " + e.getMessage());
			}
			
		}
		
	}
	
	// Returns appropriate message when purchasing an item
	public String specialMessage(String itemType) {
		return itemMessages.get(itemType);
	}
		
	// Displays updated inventory to user
	public void displayRemainingItems() {
		
		if ( remainingItems != null ) {
			
			System.out.println();
			System.out.println("********** REMAINING ITEMS **********");
			System.out.println();
			
			// Variable to display in case item is sold out
			String soldOut = "SOLD OUT";
			
			for ( Map.Entry<String, Item> item : remainingItems.entrySet() ) {
				
				// Create variables
				String name = item.getValue().getName();
				BigDecimal price = item.getValue().getPrice();
				String itemCode = item.getKey();
				int numLeft = item.getValue().getNumberRemaining();
				
				System.out.println( itemCode + ": " + name + ", " + price + "; Remaining: "
						+ ((numLeft <= 0) ? soldOut : numLeft) ); // If no items left, print soldOut
			}
		}
	}
	
	// Reduces item count upon purchase
	public void decreaseItemCountBy1(String itemCode) {
		
		int count = remainingItems.get(itemCode).getNumberRemaining();
		if(count > 0) {
			count--;
		}
		remainingItems.get(itemCode).setNumberRemaining(count);
	}
}
