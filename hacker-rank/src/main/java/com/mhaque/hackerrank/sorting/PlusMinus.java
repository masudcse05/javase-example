package com.mhaque.hackerrank.sorting;

public class PlusMinus {
	static void plusMinus(int[] arr) {
       int plus=0, minus=0, zero=0;
       for(int i=0; i<arr.length;i++) {
    	   if(arr[i]>0) {
    		   plus++;
    	   }
    	   else if(arr[i]<0) {
    		   minus++;
    	   }
    	   else {
    		   zero++;
    	   }
       }
       int len = arr.length;
	   System.out.printf("%.6f%n", (double)plus/len);
	   System.out.printf("%.6f%n", (double)minus/len);
	   System.out.printf("%.6f%n", (double)zero/len);
    }
}
