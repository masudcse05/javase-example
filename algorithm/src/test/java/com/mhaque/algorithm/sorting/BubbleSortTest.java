package com.mhaque.algorithm.sorting;

import static org.junit.Assert.*;

import org.junit.Test;

public class BubbleSortTest {

	@Test
	public void testSort() {
		int[] input = {6,5,4,9,2,1,3,7,0,8};
		int[] output= {0,1,2,3,4,5,6,7,8,9};
		assertArrayEquals(output, BubbleSort.sort(input));
	}

}
