package com.mhaque.hackerrank.strings;

import static org.junit.Assert.*;

import org.junit.Test;

public class WeightedUniformStringsTest {

	@Test
	public void testWeightedUniformStrings() {
		assertArrayEquals(new String[] {"Yes", "Yes", "Yes", "Yes", "Yes" ,"No","No"}, WeightedUniformStrings.weightedUniformStrings("abccdddde", new int[] {1,3,12,16,5,9,10}));
	}

}
