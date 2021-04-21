package com.mhaque.javase.basic.javacodingproblem;

import static org.junit.Assert.*;

import org.junit.Test;

public class CheckContainsOnlyDigitTest {

	@Test
	public void testContainsOnlyDigitsRegex() {
		assertTrue(CheckContainsOnlyDigit.containsOnlyDigitsRegex("123456"));
		assertFalse(CheckContainsOnlyDigit.containsOnlyDigitsRegex("123456sdfa"));
	}

	@Test
	public void testContainsOnlyDigitsStream() {
		assertTrue(CheckContainsOnlyDigit.containsOnlyDigitsStream("123456"));
		assertFalse(CheckContainsOnlyDigit.containsOnlyDigitsStream("123456ere"));
	}

	@Test
	public void testContainsOnlyDigitsBruteForce() {
		assertTrue(CheckContainsOnlyDigit.containsOnlyDigitsBruteForce("123456"));
		assertFalse(CheckContainsOnlyDigit.containsOnlyDigitsBruteForce("asdf123456"));
	}

}
