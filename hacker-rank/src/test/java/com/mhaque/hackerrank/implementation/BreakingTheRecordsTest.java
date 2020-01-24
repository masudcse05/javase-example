package com.mhaque.hackerrank.implementation;

import static org.junit.Assert.*;

import org.junit.Test;

public class BreakingTheRecordsTest {

	@Test
	public void testBreakingRecords() {
		assertArrayEquals(new int[] {2, 4}, BreakingTheRecords.breakingRecords(new int[] {10, 5, 20, 20, 4, 5, 2,25, 1}));
		assertArrayEquals(new int[] {4, 0}, BreakingTheRecords.breakingRecords(new int[] {3, 4, 21, 36, 10, 28, 35, 5, 24, 42}));
	}

}
