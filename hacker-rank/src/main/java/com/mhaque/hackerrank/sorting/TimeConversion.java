package com.mhaque.hackerrank.sorting;

public class TimeConversion {

	protected static String timeConversion(String input) {
		String[] strArr = input.split(":");
		boolean isPM = strArr[2].endsWith("PM");
		int hour = Integer.parseInt(strArr[0]);
		if(hour==12) {
			hour=0;
		}
		if(isPM) {
			hour+=12;
		}
		return String.format("%02d:%s:%s", hour, strArr[1], strArr[2].substring(0,2));
	}
}
