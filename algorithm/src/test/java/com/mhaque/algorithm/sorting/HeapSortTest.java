/**
 * Created by @authoer haquem on Dec 20, 2019 
 */
package com.mhaque.algorithm.sorting;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author haquem
 *
 */
public class HeapSortTest {

	/**
	 * Test method for {@link com.mhaque.algorithm.sorting.HeapSort#swap(java.lang.Comparable[], int, int)}.
	 */
	@Test
	public void testSwap() {
	}

	/**
	 * Test method for {@link com.mhaque.algorithm.sorting.HeapSort#heapify(java.lang.Comparable[], int)}.
	 */
	@Test
	public void testHeapify() {
	}

	/**
	 * Test method for {@link com.mhaque.algorithm.sorting.HeapSort#sort(java.lang.Comparable[])}.
	 */
	@Test
	public void testSort() {
		Integer[] input = {6,5,4,9,2,1,3,7,0,8};
		Integer[] output= {0,1,2,3,4,5,6,7,8,9};
		HeapSort.sort(input);
		assertArrayEquals(output, input);
	}

}
