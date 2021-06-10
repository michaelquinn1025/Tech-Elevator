package com.techelevator;

import java.io.File;

import com.techelevator.view.Inventory;
import com.techelevator.view.Menu;

public class VendingMachineCLI {

	private static final String MAIN_MENU_OPTION_DISPLAY_ITEMS = "Display Vending Machine Items";
	private static final String MAIN_MENU_OPTION_PURCHASE = "Purchase";
	private static final String MAIN_MENU_OPTION_EXIT = "Exit";
	
	private static final String[] MAIN_MENU_OPTIONS = { MAIN_MENU_OPTION_DISPLAY_ITEMS,
			MAIN_MENU_OPTION_PURCHASE, MAIN_MENU_OPTION_EXIT };
	
	private static final File RAW_INVENTORY_DATA = new File("vendingmachine.csv");
		
	private Menu menu;
	private Inventory inventory;
	private Cashier cashier;
	private File data = RAW_INVENTORY_DATA;

	public VendingMachineCLI(Menu menu, Inventory inventory, Cashier cashier) {
		this.menu = menu;
		this.inventory = inventory;
		this.cashier = cashier;
	}

	public void run() {
		
		// Stock vending machine
		// (will stock up upon every restart)
		inventory.restock(data);
		
		boolean inMainMenu = true;
		while (inMainMenu) {
			
			// Display main menu options
			System.out.println();
			System.out.println("********** MAIN MENU **********");
			String choice = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);

			if ( choice.equals(MAIN_MENU_OPTION_DISPLAY_ITEMS) ) {
				
				// Display remaining vending machine items.
				inventory.displayRemainingItems();
				
			} else if ( choice.equals(MAIN_MENU_OPTION_PURCHASE )) {
				
				// Open cashier
				cashier.runCashier();
								
			} else if ( choice.equals(MAIN_MENU_OPTION_EXIT) ) {
				
				// Close program
				inMainMenu = false;
				
			}
		}
	}

	public static void main(String[] args) {
		
		// Initialize essential objects
		Menu menu = new Menu(System.in, System.out);
		Inventory inventory = new Inventory();
		Cashier cashier = new Cashier(inventory);
		
		// Create vending machine and run it
		VendingMachineCLI cli = new VendingMachineCLI(menu, inventory, cashier);
		cli.run();
	}
}
