package com.mhaque.hackerrank.implementation;

public class DayOfTheProgrammer {
	 static String dayOfProgrammer(int year) {
        return java.time.Year.of(year).isLeap()? "12.09."+year:"13.09."+year;
     }
}
