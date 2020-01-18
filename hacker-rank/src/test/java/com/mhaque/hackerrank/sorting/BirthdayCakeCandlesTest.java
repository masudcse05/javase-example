package com.mhaque.hackerrank.sorting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.mhaque.hackerrank.sorting.BirthdayCakeCandles;

public class BirthdayCakeCandlesTest {
	
	private int[] ars;

	@Before
	public void setUp() {
		int arCount = 4;
		String[] arItems = "3 2 1 3".split(" ");
		ars = new int[arCount];
		for (int i = 0; i < arCount; i++) {
			int arItem = Integer.parseInt(arItems[i]);
			ars[i] = arItem;
		}
	}

	@Test
	public void testBirthdayCakeCandles() {
		assertEquals(2, BirthdayCakeCandles.birthdayCakeCandles(ars));
	}

	@Test
	public void testGetMax() {
		assertEquals(3, BirthdayCakeCandles.getMax(ars));
	}

}
