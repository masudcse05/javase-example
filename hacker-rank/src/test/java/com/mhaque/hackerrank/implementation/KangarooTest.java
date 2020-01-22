package com.mhaque.hackerrank.implementation;

import static org.junit.Assert.*;

import org.junit.Test;

public class KangarooTest {

	@Test
	public void testKangaroo() {
		assertEquals("YES", Kangaroo.kangaroo(0, 3, 4, 2));
		assertEquals("NO", Kangaroo.kangaroo(0, 2, 5, 3));
	}

}
