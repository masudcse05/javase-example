/**
 * Created by @authoer haquem on Jan 20, 2020 
 */
package com.mhaque.hackerrank.bitmanipulation;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author haquem
 *
 */
public class MaximizingXORTest {

	/**
	 * Test method for {@link com.mhaque.hackerrank.bitmanipulation.MaximizingXOR#maximizingXor(int, int)}.
	 */
	@Test
	public void testMaximizingXor() {
		assertEquals(127, MaximizingXOR.maximizingXor(11, 100));
		assertEquals(3, MaximizingXOR.maximizingXor(5, 6));
	}

}
