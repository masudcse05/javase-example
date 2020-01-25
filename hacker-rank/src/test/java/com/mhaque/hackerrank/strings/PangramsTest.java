package com.mhaque.hackerrank.strings;

import static org.junit.Assert.*;

import org.junit.Test;

public class PangramsTest {

	@Test
	public void testPangrams() {
		assertEquals("pangram", Pangrams.pangrams("We promptly judged antique ivory buckles for the next prize"));
		assertEquals("pangram", Pangrams.pangrams("The quick brown fox jumps over the lazy dog"));
		assertEquals("not pangram", Pangrams.pangrams("We promptly judged antique ivory buckles for the prize"));
	}

}
