package com.mhaque.algorithm.recursion;

public class Addition {
	
	public static void main(String[] args) {

        int sum = add(10);
        System.out.println(sum);
	}
	
	static int add(int n) {
		if(n==1) {
			return 1;
		}
		else {
			return n+ add(n-1);
		}
	}

}
