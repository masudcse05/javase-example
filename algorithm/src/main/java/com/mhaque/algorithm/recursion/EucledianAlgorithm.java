package com.mhaque.algorithm.recursion;

public class EucledianAlgorithm {
    public static void main(String[] args) {
		int gcd = gcdRecursive(100,30);
		System.out.println(gcd);
		int gcd2 = gcdIterative(100,30);
		System.out.println(gcd2);
	}

	private static int gcdRecursive(int num1, int num2) {
		if(num2==0) return num1;
		
		return gcdRecursive(num2, num1%num2);
	}
	
	private static int gcdIterative(int num1, int num2) {
		while(num2!=0) {
			int temp = num2;
			num2 = num1 %num2;
			num1 = temp;
		}
	    return num1;
	}
}
