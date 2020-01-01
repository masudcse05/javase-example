package com.mhaque.algorithm.recursion;

public class Addition {
	
	/**
	 * Add number 1 to n using recursion.
	 * @param n
	 * @return
	 */
	public static int add(int n) {
		if(n==1) {
			return 1;
		}
		else {
			return n+ add(n-1);
		}
	}

}
