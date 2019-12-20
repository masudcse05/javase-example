package com.mhaque.algorithm.recursion;

public class Factorial {
	
	public static void main(String[] args) {

        int sum = fact(10);
        System.out.println(sum);
	}
	
	static int fact(int n) {
		if(n==1) {
			return 1;
		}
		else {
			return n* fact(n-1);
		}
	}

}
