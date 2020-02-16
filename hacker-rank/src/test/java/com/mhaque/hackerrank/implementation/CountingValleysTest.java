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
public class CountingValleysTest {

	/**
	 * Test method for {@link com.mhaque.hackerrank.implementation.CountingValleys#countingValleys(int, java.lang.String)}.
	 */
	@Test
	public void testCountingValleys() {
		assertEquals(1, CountingValleys.countingValleys(8, "UDDDUDUU"));
		assertEquals(2, CountingValleys.countingValleys(12, "DDUUDDUDUUUD"));
	}

}
