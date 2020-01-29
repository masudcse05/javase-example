package com.mhaque.hackerrank.mathmatics;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class JavaLoopsII {
	
	public static void main(String []argh){

		 double payment = 12344.53232;
        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String us = usFormat.format(payment);
        System.out.println(us);
    }

    private static int getValue(int b, int j){
        int res =0;
        for(int i=0; i<=j ; i++){
           res += b* (int)Math.pow(2, i);
        }
        return res;
    }
    
    
    public static String findDay(int month, int day, int year) {
      LocalDate date = LocalDate.of(year, month, day);
      return date.getDayOfWeek().name();
    }
}
