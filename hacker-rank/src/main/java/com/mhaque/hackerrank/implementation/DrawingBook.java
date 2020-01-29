package com.mhaque.hackerrank.implementation;

public class DrawingBook {
	 static int pageCount(int n, int p) {
		boolean isEven = n%2==0;
        int diff = isEven? n-p+1 : n-p;
        int min = Math.min(diff, p);
        return min/2;
	 }
}
