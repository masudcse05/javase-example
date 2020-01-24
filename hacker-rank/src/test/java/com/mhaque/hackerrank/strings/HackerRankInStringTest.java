package com.mhaque.hackerrank.strings;

import static org.junit.Assert.*;

import org.junit.Test;

public class HackerRankInStringTest {

	@Test
	public void testHackerrankInString() {
		assertEquals("YES", HackerRankInString.hackerrankInString("hhaacckkekraraannk"));
		assertEquals("NO", HackerRankInString.hackerrankInString("hackerworld"));
		assertEquals("NO", HackerRankInString.hackerrankInString("rhbaasdndfsdskgbfefdbrsdfhuyatrjtcrtyytktjjt"));
	}

}
