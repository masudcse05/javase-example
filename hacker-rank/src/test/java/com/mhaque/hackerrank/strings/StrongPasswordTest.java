package com.mhaque.hackerrank.strings;

import static org.junit.Assert.*;

import org.junit.Test;

public class StrongPasswordTest {

	@Test
	public void testMinimumNumber() {
		assertEquals(3, StrongPassword.minimumNumber(3, "Ab1"));
		assertEquals(3, StrongPassword.minimumNumber(3, "abc"));
		assertEquals(4, StrongPassword.minimumNumber(2, "ab"));
		assertEquals(1, StrongPassword.minimumNumber(11, "#HackerRank"));
		assertEquals(3, StrongPassword.minimumNumber(4, "4700"));
		assertEquals(2, StrongPassword.minimumNumber(4, "1z2!"));
	}

}
