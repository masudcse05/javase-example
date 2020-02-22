/**
 * Created by @authoer haquem on Feb 17, 2020 
 */
package com.mhaque.hackerrank.implementation;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author haquem
 *
 */
public class UtopianTreeTest {

	/**
	 * Test method for {@link com.mhaque.hackerrank.implementation.UtopianTree#utopianTree(int)}.
	 */
	@Test
	public void testUtopianTree() {
		assertEquals(1, UtopianTree.utopianTree(0));
		assertEquals(2, UtopianTree.utopianTree(1));
		assertEquals(7, UtopianTree.utopianTree(4));
		assertEquals(14, UtopianTree.utopianTree(5));
	}

}
