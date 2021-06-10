package com.techelevator.crm;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.techelevator.Pet;

public class PetTests {
	
	@Test
	public void listVaccinations_withValidData_shouldReturnExpectedResult() {
		Pet pet = new Pet("Dog", "Canine");
		pet.getVaccinations().add("Rabies");
		pet.getVaccinations().add("Distemper");
		pet.getVaccinations().add("Parvo");
		
		String expected = "Rabies, Distemper, Parvo";
		
		String result = pet.listVaccinations();
		
		assertEquals(expected, result);
				
	}
	
	@Test
	public void listVaccinations_withEmptyData_shouldReturnExpectedResult() {
		Pet pet = new Pet ("Dog", "Canine");
		
		assertTrue(pet.listVaccinations().isEmpty());
	}
	
	@Test
	public void listVaccinations_withOneElement_shouldReturnExpectedResult() {
		Pet pet = new Pet("Dog", "Canine");
		pet.getVaccinations().add("Rabies");
		
		
		String expected = "Rabies";
		
		String result = pet.listVaccinations();
		
		
		
		assertEquals(expected, result);
	}
}
