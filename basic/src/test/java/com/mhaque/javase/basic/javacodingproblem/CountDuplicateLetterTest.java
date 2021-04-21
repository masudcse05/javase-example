package com.mhaque.javase.basic.javacodingproblem;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountDuplicateLetterTest {

	@Test
	public void testCountDuplicateLetter() {
		System.out.println(CountDuplicateLetter.countDuplicateLetter("HelloWorld"));
		System.out.println(CountDuplicateLetter.countDuplicateLetterLambda("HelloWorld"));
	}

}
