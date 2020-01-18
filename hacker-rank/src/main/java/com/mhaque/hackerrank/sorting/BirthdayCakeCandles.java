package com.mhaque.hackerrank.sorting;

public class BirthdayCakeCandles {

	public static int birthdayCakeCandles(int[] ar) {
		int res =0;
		int max = getMax(ar);
		for(int a: ar) {
			if(max==a) {
				res++;
			}
		}
		return res;
    }
	
	public static int getMax(int[] ar) {
		int max =0;
		for(int a : ar) {
			if(a> max) {
				max =a;
			}
		}
		return max;
	}
}
