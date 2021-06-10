package com.techelevator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Lucky13Test {
	
	@Test
	public void testGetLucky_withNoUnluckyData_shouldReturnTrue() {
		Lucky13 object = new Lucky13();
		int [] data = new int[] {0, 2, 4};
		
		boolean result = object.getLucky(data);
		
		assertEquals("getLucky([0, 2, 4]: ",true, result);
	}
	
	
	@Test
	public void testGetLucky_withUnluckyData_shouldReturnFalse() {
		Lucky13 object = new Lucky13();
		int [] data = new int[] {1, 2, 4};
		
		boolean result = object.getLucky(data);
		
		assertEquals("getLucky([1, 2, 4]: ",false, result);
	}
	@Test
	public void testGetLucky_withNullData_shouldReturnTrue() {
		Lucky13 object = new Lucky13();
		
		boolean result = object.getLucky(null);
		
		assertEquals("getLucky(null):" , true, result);
		
	}
	
	@Test
	public void testGetLucky_withUnlucky3Data_shouldReturnFalse() {
		Lucky13 object = new Lucky13();
		int [] data = new int[] {3, 2, 4};
		
		boolean result = object.getLucky(data);
		
		assertEquals("getLucky([3, 2, 4]: ",false, result);
	}
	
	@Test
	public void testGetLucky_withUnlucky1Data_shouldReturnFalse() {
		Lucky13 object = new Lucky13();
		int [] data = new int[] {1, 2, 4};
		
		boolean result = object.getLucky(data);
		
		assertEquals("getLucky([1, 2, 4]: ",false, result);
	}


}
 