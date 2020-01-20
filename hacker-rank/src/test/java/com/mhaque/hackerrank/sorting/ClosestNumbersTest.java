package com.mhaque.hackerrank.sorting;

import static org.junit.Assert.*;

import org.junit.Test;

import com.mhaque.hackerrank.sorting.ClosestNumbers;

public class ClosestNumbersTest {

	@Test
	public void testClosestNumbers() {
	    assertArrayEquals(new int[] {2, 3,3,4,4,5}, ClosestNumbers.closestNumbers( new int[] {5,4,3,2}));
		assertArrayEquals(new int[] {-520,-470,-20,30}, ClosestNumbers.closestNumbers( new int[] {-20,-3916237,-357920,-3620601,7374819,-7330761,30,6246457,-6461594,266854,-520,-470}));
		assertArrayEquals(new int[] {-20,30}, ClosestNumbers.closestNumbers( new int[] {-20,-3916237,-357920,-3620601,7374819,-7330761,30,6246457,-6461594,266854}));
	}

}
