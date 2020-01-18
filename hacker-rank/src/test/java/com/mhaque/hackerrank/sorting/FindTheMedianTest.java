package com.mhaque.hackerrank.sorting;

import static org.junit.Assert.*;

import org.junit.Test;

public class FindTheMedianTest {

	@Test
	public void testFindMedian() {
		assertEquals(3, FindTheMedian.findMedian(new int[] {0,1,2,4,6,5,3}));
	}

}
