/**
 * Created by @authoer haquem on Jan 11, 2020 
 */
package com.mhaque.javase.leetcode.easy;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author haquem
 *
 */
public class TwoSumTest {

	
	
	@Test
	public void testTwoSum() {
	    TwoSum twoSum = new TwoSum();
	    assertArrayEquals(new int[] {0, 1}, twoSum.twoSum(new int[] {2,7,11,13}, 9));
	}

}
