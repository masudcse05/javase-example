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
public class FactorialTest {

	/**
	 * Test method for {@link com.mhaque.algorithm.recursion.Factorial#fact(int)}.
	 */
	@Test
	public void testFact() {
		assertEquals(3628800, Factorial.fact(10));
	}

}
