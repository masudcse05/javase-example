package com.mhaque.hackerrank.implementation;

import static org.junit.Assert.*;

import org.junit.Test;

public class DivisibleSumPairsTest {

	@Test
	public void testDivisibleSumPairs() {
		assertEquals(5, DivisibleSumPairs.divisibleSumPairs(6, 3, new int[] {1, 3, 2, 6, 1, 2}));
	}

}
