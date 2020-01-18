package com.mhaque.algorithm.dp;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import org.junit.Test;

public class BinPackingTest {

	@Test
	public void testBestFit() {
		Integer[] arr = { 2, 5, 4, 7, 1, 3, 8,2};
		 Arrays.sort(arr, Collections.reverseOrder());
		assertEquals(3, BinPacking.firstFit(arr, arr.length, 10));
	}

}
