package com.techelevator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StringTests {
	
	// Test for substring with 2 params
	
	// Happy path
	@Test
	public void testSubstring_withValidData_shouldReturnCorrectString() {
		String text = "Hello, world!";
		
		String expected = "lo, w";
		String result = text.substring(3, 8);
		
		assertEquals(expected, result);
	}
	
	@Test(expected = StringIndexOutOfBoundsException.class)
	public void testSubstring_withNegativeStartIndex_shouldThrowException() {
		String text = "Hello, world!";
		
		String expected = "lo, w";
		String result = text.substring(-1, 8);
		
		assertEquals(expected, result);
	}
	
	@Test(expected = StringIndexOutOfBoundsException.class)
	public void testSubstring_withEndIndexTooLarge_shouldThrowException() {
		String text = "Hello, world!";
		
		String expected = "lo, w";
		String result = text.substring(0, text.length() + 2);
		
		assertEquals(expected, result);
	}
	
	@Test(expected = StringIndexOutOfBoundsException.class)
	public void testSubstring_withEndGreaterThanStart_shouldReturnCorrectString() {
		String text = "Hello, world!";
		
		String expected = "lo, w";
		String result = text.substring(8, 3);
		
		assertEquals(expected, result);
	}
	
	@Test
	public void testLength_withValidData_shouldReturnCorrect() {
		String text = "Hello, world!";
		
		int expected = 13;
		int result = text.length();
		
		assertEquals(expected, result);
	}
	
	@Test
	public void testIndexOf_withFoundData_shouldReturnCorrectIndex() {
		String text = "Hello, world!";
		
		int expected = 7;
		int result = text.indexOf("world");
		
		assertEquals(expected, result);
	}
	
	@Test
	public void testIndexOf_withNotFoundData_shouldReturnCorrectIndex() {
		String text = "Hello, world!";
		
		int expected = -1;
		int result = text.indexOf("$$$$");
		
		assertEquals(expected, result);
	}
	
	// another way
	@Test
	public void testIndexOf_withNotFoundData_shouldReturnNegativeIndex() {
		String text = "Hello, world!";
		
		int result = text.indexOf("$$$$");
		
		assertTrue(result < 0);
	}
	
	

}
