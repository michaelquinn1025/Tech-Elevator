package com.techelevator.view;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Item {
	
	// Instance Variables
	
	private String name;
	private BigDecimal price;
	private String itemCode;
	private String itemType;
	private int numberRemaining;
	
	// Constructor
	
	public Item(String name, Double price, String itemCode, String itemType, int numberRemaining) {
		this.setName(name);
		this.setPrice(price);
		this.setItemCode(itemCode);
		this.setItemType(itemType);
		this.setNumberRemaining(numberRemaining);
	}

	// Getters and Setters
	
	public String getItemType() {
		return itemType;
	}
	
	public void setItemType(String itemType) {
		this.itemType = itemType;
		
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(Double price) { // Sets format to $x.xx
		this.price = BigDecimal.valueOf(price).setScale(2, RoundingMode.HALF_UP);
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public int getNumberRemaining() {
		return numberRemaining;
	}

	public void setNumberRemaining(int numberRemaining) {
		this.numberRemaining = numberRemaining;
	}
	
}
