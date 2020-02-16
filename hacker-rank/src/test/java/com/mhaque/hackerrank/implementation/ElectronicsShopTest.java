/**
 * Created by @authoer haquem on Feb 15, 2020 
 */
package com.mhaque.hackerrank.implementation;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author haquem
 *
 */
public class ElectronicsShopTest {

	/**
	 * Test method for {@link com.mhaque.hackerrank.implementation.ElectronicsShop#getMoneySpent(int[], int[], int)}.
	 */
	@Test
	public void testGetMoneySpent() {
		assertEquals(9, ElectronicsShop.getMoneySpent(new int[] {3,1}, new int[] {5, 2, 8}, 10));
		assertEquals(-1, ElectronicsShop.getMoneySpent(new int[] {4}, new int[] {5}, 5));
	}

}
