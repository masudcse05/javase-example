package com.mhaque.hackerrank.implementation;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppleAndOrangeTest {

	@Test
	public void testCountApplesAndOranges() {
		AppleAndOrange.countApplesAndOranges(7, 11, 5, 15,new int[] {-2,2,1} , new int[] {5, -6});
		AppleAndOrange.countApplesAndOranges(7, 10, 4, 12,new int[] {2,3,-4} , new int[] {3, -2,-4 });
	}

}
