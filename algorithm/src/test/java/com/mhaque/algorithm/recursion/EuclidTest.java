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
public class EuclidTest {

	/**
	 * Test method for {@link com.mhaque.algorithm.recursion.Euclid#gcdRecursive(int, int)}.
	 */
	@Test
	public void testGcdRecursive() {
	    assertEquals(2, Euclid.gcdRecursive(22, 6));
	    assertEquals(10, Euclid.gcdRecursive(100, 30));
	}

	/**
	 * Test method for {@link com.mhaque.algorithm.recursion.Euclid#gcdIterative(int, int)}.
	 */
	@Test
	public void testGcdIterative() {
	    assertEquals(2, Euclid.gcdIterative(22, 6));
	    assertEquals(10, Euclid.gcdIterative(100, 30));
	}

}
