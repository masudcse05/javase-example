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
public class QuickSortTest {

	/**
	 * Test method for {@link com.mhaque.algorithm.sorting.QuickSort#sort(int[])}.
	 */
	@Test
	public void testSort() {
		int[] input = {6,5,4,9,2,1,3,7,0,8};
		int[] output= {0,1,2,3,4,5,6,7,8,9};
		assertArrayEquals(output, QuickSort.sort(input));
	}

}
