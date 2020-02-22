/**
 * Created by @authoer haquem on Feb 17, 2020 
 */
package com.mhaque.hackerrank.implementation;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

/**
 * @author haquem
 *
 */
public class PickingNumbersTest {

	/**
	 * Test method for {@link com.mhaque.hackerrank.implementation.PickingNumbers#pickingNumbers(java.util.List)}.
	 */
	@Test
	public void testPickingNumbers() {
		assertEquals(5, PickingNumbers.pickingNumbers(Arrays.asList(1,1,2,2,4,4,5,5,5)));
		assertEquals(3, PickingNumbers.pickingNumbers(Arrays.asList(4, 6, 5, 3, 3, 1)));
		assertEquals(5, PickingNumbers.pickingNumbers(Arrays.asList(1, 2, 2, 3, 1, 2)));
	}

}
