package com.mhaque.algorithm.recursion;

public class Factorial {
	
	
	public static int fact(int n) {
		if(n==1) {
			return 1;
		}
		else {
			return n* fact(n-1);
		}
	}

}
