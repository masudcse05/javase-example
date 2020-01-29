package com.mhaque.hackerrank.datastructure;

import static org.junit.Assert.*;

import org.junit.Test;

public class Java1DArrayTest {

	@Test
	public void testCanWin() {
		assertTrue(Java1DArray.canWin(3, new int[] {0, 0, 0, 0, 0}));
		assertTrue(Java1DArray.canWin(5, new int[] {0, 0, 0, 1, 1, 1}));
		assertFalse(Java1DArray.canWin(3, new int[] {0, 0, 1, 1, 1, 0}));
		assertFalse(Java1DArray.canWin(1, new int[] {0, 1, 0}));
		assertTrue(Java1DArray.canWin(2, new int[] {0,1, 0, 1, 0, 1}));
	}

}
