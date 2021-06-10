package com.techelevator;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ExampleTest {
	
	@Before
	public void setUp() {
		// do test setup
	}
	
	@After
	public void tearDown() {
		// do test cleanup
	}
	
	@Test
	public void isEven_withEvenValue_shouldReturnTrue() {
		Example example = new Example();
		
		boolean expected = true;
		boolean result = example.isEven(6);
		
		assertEquals(expected, result);
	}
	
	@Test
	public void isEven_withOddValue_shouldReturnFalse() {
		Example example = new Example();
		
		boolean expected = false;
		boolean result = example.isEven(9);
		
		assertEquals(expected, result);
	}

}
