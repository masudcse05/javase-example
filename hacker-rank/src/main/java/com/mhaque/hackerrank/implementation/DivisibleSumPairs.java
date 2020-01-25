package com.mhaque.hackerrank.implementation;

public class DivisibleSumPairs {
	static int divisibleSumPairs(int n, int k, int[] ar) {
       int count =0;
          for(int i=0;i< ar.length;i++) {
        	  for(int j= i+1; j< ar.length; j++){
        		  int sum = ar[i]+ ar[j];
        		  if(sum%k==0) {
        			  count++;
        		  }
        	  }
          }
       return count;
    }
}
