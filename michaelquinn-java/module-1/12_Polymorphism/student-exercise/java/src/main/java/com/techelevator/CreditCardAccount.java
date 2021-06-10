package com.techelevator;

public class CreditCardAccount implements Accountable {
	
	private String accountHolder;
	private String accountNumber;
	private int debt;
	
	public CreditCardAccount(String accountHolder, String accountNumber) {
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.debt = 0;
	}
	
	public String getaccountHolder() {
		return accountHolder;
	}
	
	public String getaccountNumber() {
		return accountNumber;
	}
	
	public int getDebt() {
		return debt;
	}
	
		
	
	
	

	@Override
	public int getBalance() {
		
		return  -1 * debt;
	}
	
	public int pay(int amountToPay) {
		debt -= amountToPay;
		return debt;
	}
	
	public int charge(int amountToCharge) {
		debt += amountToCharge;
		return debt;
	}

}
