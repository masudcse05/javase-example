/**
 * Created by @authoer haquem on Dec 29, 2019 
 */
package com.mhaque.algorithm.recursion;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author haquem
 *
 */
public class SearchTest {

	/**
	 * Test method for {@link com.mhaque.algorithm.recursion.Search#binarySearch(int, int, int)}.
	 */
	@Test
	public void testBinarySearch() {
		int array[] = {2,5,7,10,11,22,42,52,66,78,85,88,99,102,114};
		int position = Search.binarySearch(array, 114);
		assertEquals(14, position);
	}

}
