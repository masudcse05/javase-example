/**
 * Created by @authoer haquem on Feb 15, 2020 
 */
package com.mhaque.hackerrank.implementation;

/**
 * @author haquem
 *
 */
public class CountingValleys {
	  static int countingValleys(int n, String s) {
         int count=0;
         int level=0;
         for(int i =0; i<n; i++) {
        	 char ch = s.charAt(i);
        	 if(ch=='D') {
        		 level--;
        	 }
        	 else {
        		 level++;
        	 }
        	 
        	 if(level==0 && ch=='U') {
        		 count++;
        	 }
         }
         return count;
	  }
}
