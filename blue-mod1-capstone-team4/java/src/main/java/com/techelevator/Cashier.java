package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.techelevator.view.Inventory;
import com.techelevator.view.Menu;

public class Cashier {
	
	// Constants
	
	// General Exit Option
	private static final String EXIT_MENU = "EXIT";
	
	// Purchase Menu Constants
	private static final String PURCHASING_PROCESS_MENU_FEED_MONEY = "(1) Feed Money";
	private static final String PURCHASING_PROCESS_MENU_SELECT_PRODUCT = "(2) Select Product";
	private static final String PURCHASING_PROCESS_MENU_FINISH_TRANSACTION = "(3) Finish Transaction";
	
	private static final String[] PURCHASING_PROCESS_OPTIONS = { PURCHASING_PROCESS_MENU_FEED_MONEY,
			PURCHASING_PROCESS_MENU_SELECT_PRODUCT, PURCHASING_PROCESS_MENU_FINISH_TRANSACTION};
	
	// Deposit Menu Constants
	private static final String DEPOSIT_CHOICE_ONE_DOLLAR_BILL = "1";
	private static final String DEPOSIT_CHOICE_TWO_DOLLAR_BILL = "2";
	private static final String DEPOSIT_CHOICE_FIVE_DOLLAR_BILL = "5";
	private static final String DEPOSIT_CHOICE_TEN_DOLLAR_BILL = "10";
	private static final String DEPOSIT_CHOICE_TWENTY_DOLLAR_BILL = "20";
		
	private static final String[] DEPOSIT_CHOICE_OPTIONS = { DEPOSIT_CHOICE_ONE_DOLLAR_BILL, DEPOSIT_CHOICE_TWO_DOLLAR_BILL,
			DEPOSIT_CHOICE_FIVE_DOLLAR_BILL, DEPOSIT_CHOICE_TEN_DOLLAR_BILL, DEPOSIT_CHOICE_TWENTY_DOLLAR_BILL, EXIT_MENU };
	
	private static final String LOG_FILE_PATH = "VendingMachineCLI-Log.txt";
	
	// Instance Variables
	
	private Menu cashierMenu = new Menu(System.in, System.out);
	private BigDecimal wallet = BigDecimal.ZERO;
	private Inventory inventory;
	private File logFile = new File(LOG_FILE_PATH);
	
	// Constructors
	
	public Cashier(Inventory inventory) {
		this.inventory = inventory;
	}

	// Runs the purchasing section of the menu
	public void runCashier() {
		
		// Create logger to record transactions
		boolean append = logFile.exists() ? true : false;
		try (PrintWriter logger = new PrintWriter(new FileOutputStream(logFile), append)) {
					
			// Create item selection menu:
			
			int selectionMenuSize = inventory.getRemainingItems().size() + 1;
			Object[] selectionMenuChoices = new Object[selectionMenuSize]; // Create menu array to pass into menu functions
			Object[] itemCodes = inventory.getRemainingItems().keySet().toArray(); // Create key array from inventory
			
			// Copy item codes from key array to menu array
			// (we cannot just pass key array into menu because
			// we need one extra space at the end for "EXIT")
			for ( int i = 0; i < selectionMenuChoices.length - 1; i++ ) {
				selectionMenuChoices[i] = itemCodes[i];
			}
			selectionMenuChoices[inventory.getRemainingItems().size()] = EXIT_MENU; // Set the last choice in menu array to EXIT
			
			boolean inPurchaseMenu = true;
			while (inPurchaseMenu) {
			
				// Display purchasing menu
				String currentWallet = wallet.setScale(2, RoundingMode.HALF_UP).toString();
				System.out.println();
				System.out.println("**********PURCHASE MENU**********");
				System.out.println();
				System.out.println("Current Money Provided: $" + currentWallet);
				
				// Get choice from user:
				String buyChoice = (String) cashierMenu.getChoiceFromOptions(PURCHASING_PROCESS_OPTIONS);
				
				// Choice 1) Add money to wallet;
				if (buyChoice.equals(PURCHASING_PROCESS_MENU_FEED_MONEY)) {
					
					System.out.println();
					System.out.println("How much are you inserting?");
					System.out.println("$1, $2, $5, $10 or $20?");
					
						try {
							String depositChoice = (String) cashierMenu.getChoiceFromOptions(DEPOSIT_CHOICE_OPTIONS);
							
							if ( ! depositChoice.equals(EXIT_MENU) ) {
								
								// Update wallet
								BigDecimal deposit = new BigDecimal(depositChoice);
								wallet = wallet.add(deposit);
								String updatedWallet = wallet.setScale(2, RoundingMode.HALF_UP).toString();
								
								// Log transaction
								logger.write(getDateTimeString() + " FEED MONEY: $" + depositChoice + ".00 $" + updatedWallet + "\n");
							}
																				
						} catch (NumberFormatException e) {
							System.out.println("Exception: " + e.getMessage());
						}
					
				// Choice 2) Buy an item;
				} else if ( buyChoice.equals(PURCHASING_PROCESS_MENU_SELECT_PRODUCT) ) {
					
					// Display list of available products
					inventory.displayRemainingItems();
					
					// Get user selection
					String itemCodeOfPurchase = (String) cashierMenu.getChoiceFromOptions(selectionMenuChoices);
					
					if ( ! itemCodeOfPurchase.equals(EXIT_MENU) ) {
						
						boolean enoughMoney = inventory.getRemainingItems().get(itemCodeOfPurchase).getPrice().compareTo(wallet) != 1;
						int numberRemaining = inventory.getRemainingItems().get(itemCodeOfPurchase).getNumberRemaining();
						
						// Checks if item is sold out
						if ( numberRemaining <= 0 ) {
							
							System.out.println();
							System.out.println("****SORRY SOLD OUT****");
						
						// Checks if there is enough money to buy the item
						} else if ( enoughMoney ) {
							
							// Purchase is successful:
							
							// Create variables
							String itemName = inventory.getRemainingItems().get(itemCodeOfPurchase).getName();
							BigDecimal cost = inventory.getRemainingItems().get(itemCodeOfPurchase).getPrice();
							String itemType = inventory.getRemainingItems().get(itemCodeOfPurchase).getItemType();
							
							// Update wallet
							String walletBeforePurchase = wallet.setScale(2, RoundingMode.HALF_UP).toString();
							wallet = wallet.subtract(cost);
							String walletAfterPurchase = wallet.setScale(2, RoundingMode.HALF_UP).toString();
							
							// Update inventory
							inventory.decreaseItemCountBy1(itemCodeOfPurchase);
							
							// Log transaction
							logger.write(getDateTimeString() + " " + itemName + " " + itemCodeOfPurchase +
									" $" + walletBeforePurchase + " $" + walletAfterPurchase + "\n");
							
							// Print result and special message
							System.out.println();
							System.out.println("Item bought: " + itemName + ", Price: $" + cost.toString()
											+ ", Remaining Funds: $" + walletAfterPurchase);
							System.out.println();
							System.out.println(inventory.specialMessage(itemType));
							
						// If not enough money, print message
						} else {
							System.out.println();
							System.out.println("****SORRY NOT ENOUGH MONEY****");
						}		
					}
					
				// Choice 3) Cash out and return to main menu;
				} else if (buyChoice.equals(PURCHASING_PROCESS_MENU_FINISH_TRANSACTION)) {
					
					// Return change and empty wallet	
					int quartersUsed = 0;
					int dimesUsed = 0;
					int nickelsUsed = 0;
					
					// Loop will decrease amount of wallet 0.25 at a time (in order to count
					// the quarters needed), then by 0.10 at a time (for dimes) and lastly
					// by 0.05 (if a nickel is needed)
					String moneyReturned = wallet.setScale(2, RoundingMode.HALF_UP).toString();
					while (wallet.compareTo(BigDecimal.ZERO) == 1) { // Checks if wallet is not zero
						
						if (wallet.compareTo(BigDecimal.valueOf(0.25)) != -1) {
							wallet = wallet.subtract(BigDecimal.valueOf(0.25));
							quartersUsed++;
							
						} else if (wallet.compareTo(BigDecimal.valueOf(0.1)) != -1) {
							wallet = wallet.subtract(BigDecimal.valueOf(0.1));
							dimesUsed++;
							
						} else if (wallet.compareTo(BigDecimal.valueOf(0.05)) != -1) {
							wallet = wallet.subtract(BigDecimal.valueOf(0.05));
							nickelsUsed++;
						}
						
					}
					String resetWallet = wallet.setScale(2, RoundingMode.HALF_UP).toString();
					
					// Log transaction
					logger.write(getDateTimeString() + " GIVE CHANGE: $" + moneyReturned + " $" + resetWallet + "\n");
					
					// Print info to user
					System.out.println();
					System.out.println("Change returned: $" + moneyReturned);
					System.out.println(quartersUsed + " quarter" + (quartersUsed == 1 ? "" : "s") + ", "
										+ dimesUsed + " dime" + (dimesUsed == 1 ? "" : "s") + " and "
										+ nickelsUsed + " nickel" + (nickelsUsed == 1 ? "" : "s") + " dispensed.");
										// Ternary operators check for plurals
					
					// End loop to return to main menu
					inPurchaseMenu = false;
				}
			}

		} catch (FileNotFoundException e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}
	
	// Returns time stamp for logger
	public String getDateTimeString() {
		LocalDateTime timestamp = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy KK:mm:ss a");
		return timestamp.format(formatter);
	}

}
