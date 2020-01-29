package com.mhaque.hackerrank.implementation;

import static org.junit.Assert.*;

import org.junit.Test;

public class DrawingBookTest {

	@Test
	public void testPageCount() {
		assertEquals(0,DrawingBook.pageCount(5, 4));
		assertEquals(1,DrawingBook.pageCount(6, 2));
		assertEquals(1,DrawingBook.pageCount(6, 5));
	}

}
