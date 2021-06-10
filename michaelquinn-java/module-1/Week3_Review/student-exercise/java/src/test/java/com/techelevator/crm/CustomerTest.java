package com.techelevator.crm;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class CustomerTest {
	
	@Test
	public void getBalanceDue_withValidData_shouldReturnCorrectBalance() {
		Customer customer = new Customer("Howdy", "Doody", "215-555-1212");
		
		Map<String, Double> services = new HashMap<>();
		services.put("Walking" , 15.00);
		services.put("Grooming" , 25.50);
		services.put("Sitting" , 50.00);
		
		
		Double expected = 15.00 + 25.50 + 50.00;
		
		Double result = customer.getBalanceDue(services);
		
		assertEquals(expected, result);
		
		
		
	}
	
	@Test
	public void getBalanceDue_withEmpty_shouldReturnCorrectBalance() {
		Customer customer = new Customer("Howdy", "Doody", "215-555-1212");
		
		Map<String, Double> services = new HashMap<>();
		
		
		Double result = customer.getBalanceDue(services);
		
		assertEquals(Double.valueOf(0.0), result);
		}
	
	@Test
	public void getBalanceDue_withNullCost_shouldReturnCorrectBalance() {
		Customer customer = new Customer("Howdy", "Doody", "215-555-1212");
		
		Map<String, Double> services = new HashMap<>();
		services.put("Walking" , 15.00);
		services.put("Grooming" , null);
		
		
		
		Double result = customer.getBalanceDue(services);
		
		assertEquals(Double.valueOf(15.00), result);
		}
	
	@Test
	public void getBalanceDue_withNullMap_shouldReturnCorrectBalance() {
		Customer customer = new Customer("Howdy", "Doody", "215-555-1212");
		
		
		
		Double result = customer.getBalanceDue(null);
		
		assertEquals(Double.valueOf(0.0), result);
		}

}
