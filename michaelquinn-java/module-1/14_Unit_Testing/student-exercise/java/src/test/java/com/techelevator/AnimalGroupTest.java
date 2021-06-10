package com.techelevator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AnimalGroupTest {
	
	@Test
	public void testGetHerd_withFoundKey_shouldReturnCorrectValue() {
		AnimalGroupName animalGroupName = new AnimalGroupName();
		
		String expected = "Herd";
		
		
		
		
		String result = animalGroupName.getHerd("elephant");
		
		assertEquals(expected, result);
		
	}
	
	@Test
	public void testGetHerd_withFoundKeyInWrongCase_shouldReturnCorrectValue() {
		AnimalGroupName animalGroupName = new AnimalGroupName();
		
		String expected = "Herd";
		
		
		
		
		String result = animalGroupName.getHerd("ElepHant");
		
		assertEquals(expected, result);
		
	}
	
	@Test
	public void testGetHerd_withNotFoundKey_shouldReturnUnknown() {
		AnimalGroupName animalGroupName = new AnimalGroupName();
		
		String expected = "unknown";
		
		
		
		
		String result = animalGroupName.getHerd("djfjdfh");
		
		assertEquals(expected, result);
		
	}
	
	@Test
	public void testGetHerdNull_shouldReturnUnknown() {
		AnimalGroupName animalGroupName = new AnimalGroupName();
		
		String expected = "unknown";
		
		
		
		
		String result = animalGroupName.getHerd("null");
		
		assertEquals(expected, result);
		
	}
	
	@Test
	public void testGetHerdEmpty_shouldReturnUnknown() {
		AnimalGroupName animalGroupName = new AnimalGroupName();
		
		String expected = "unknown";
		
		
		
		
		String result = animalGroupName.getHerd("");
		
		assertEquals(expected, result);
		
	}
	
	

}
