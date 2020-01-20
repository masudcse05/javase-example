package com.mhaque.hackerrank.strings;

import static org.junit.Assert.*;

import org.junit.Test;

public class SuperReducedStringTest {

	@Test
	public void testSuperReducedString() {
	    assertEquals("ab", SuperReducedString.superReducedString("ab"));
		assertEquals("Empty String", SuperReducedString.superReducedString("baab"));
        assertEquals("tqauhujtmxnsbzpykwlvpfyqijvdhuhirdmuxiobyvxupqwydkpbxmfvxhgicuzdealkgxlfmjiucasokrdznmtlwh", SuperReducedString.superReducedString("zztqooauhujtmxnsbzpykwlvpfyqijvdhuhiroodmuxiobyvwwxupqwydkpeebxmfvxhgicuzdealkgxlfmjiucasokrdznmtlwh"));
	}

}
