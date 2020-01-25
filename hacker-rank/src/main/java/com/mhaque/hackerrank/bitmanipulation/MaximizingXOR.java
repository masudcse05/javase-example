/**
 * Created by @authoer haquem on Jan 20, 2020 
 */
package com.mhaque.hackerrank.bitmanipulation;

/**
 * @author haquem
 *
 */
public class MaximizingXOR {
	static int maximizingXor(int l, int r) {
	   int max =0;
       for(int i=l; i<=r; i++) {
    	   for(int j=l+1; j<=r; j++) {
    		   int value = i^j;
    		   if(max< value) {
    			   max = value;
    		   }
    	   }
       }
       return max;
    }
}
