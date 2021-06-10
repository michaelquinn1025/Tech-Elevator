package com.techelevator.view;

import java.io.File;

import org.junit.Assert;
import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class InventoryTest {
	
	private File testFile = new File("vendingmachine.csv");
	
	@Test
	public void testRestock() {
		
		// Arrange
		Inventory test = new Inventory();
		
		boolean expected = false; // will check if the inventory is empty
		
		// Act
		test.restock(testFile);
		boolean actual = test.getRemainingItems().isEmpty();
		
		// Assert
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testRestockIfFileIsNull() {
		
		// Arrange
		Inventory test = new Inventory();
		File nullFile = null;
		
		boolean expected = true;
		
		// Act
		test.restock(nullFile);
		boolean actual = test.getRemainingItems().isEmpty();
		
		// Assert
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testSpecialMessage() {
		
		// Arrange
		Inventory inventory = new Inventory();
		inventory.restock(testFile);
		
		String expected = "Munch Munch, Yum!";
		
		// Act
		String actual = inventory.specialMessage("Candy");
		
		// Assert
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testDecreaseItemCountBy1() {
		
		// Arrange
		Inventory inventory = new Inventory();
		inventory.restock(testFile); // Initially stocked with five items
		
		int expected = 4;
		
		// Act
		inventory.decreaseItemCountBy1("A1");
		int actual = inventory.getRemainingItems().get("A1").getNumberRemaining();
		
		// Assert
		Assert.assertEquals(expected, actual);
	}
	
	
	
}
