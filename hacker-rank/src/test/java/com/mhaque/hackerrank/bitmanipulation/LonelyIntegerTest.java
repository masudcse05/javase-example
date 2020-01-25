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
public class LonelyIntegerTest {

	/**
	 * Test method for {@link com.mhaque.hackerrank.bitmanipulation.LonelyInteger#lonelyinteger(int[])}.
	 */
	@Test
	public void testLonelyinteger() {
		assertEquals(2, LonelyInteger.lonelyinteger(new int[] {1, 1, 2}));
		assertEquals(2, LonelyInteger.lonelyinteger(new int[] {0, 0, 1, 2, 1}));
	}

}
