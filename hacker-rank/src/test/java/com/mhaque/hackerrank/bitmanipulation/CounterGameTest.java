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
public class CounterGameTest {

	/**
	 * Test method for {@link com.mhaque.hackerrank.bitmanipulation.CounterGame#counterGame(long)}.
	 */
	@Test
	public void testCounterGame() {
		assertEquals("Richard", CounterGame.counterGame(6));
		assertEquals("Louise", CounterGame.counterGame(132));
	}

}
