package com.mhaque.hackerrank.sorting;

import static org.junit.Assert.*;

import org.junit.Test;

import com.mhaque.hackerrank.sorting.TimeConversion;

public class TimeConversionTest {

	@Test
	public void testTimeConversion() {
		assertEquals("09:05:45", TimeConversion.timeConversion("09:05:45AM"));
		assertEquals("19:05:45", TimeConversion.timeConversion("07:05:45PM"));
		assertEquals("00:00:00", TimeConversion.timeConversion("12:00:00AM"));
		assertEquals("23:05:45", TimeConversion.timeConversion("11:05:45PM"));
		assertEquals("12:45:54", TimeConversion.timeConversion("12:45:54PM"));
	}

}
