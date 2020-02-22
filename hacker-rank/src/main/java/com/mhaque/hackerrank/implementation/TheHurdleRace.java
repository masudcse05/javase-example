/**
 * Created by @authoer haquem on Feb 17, 2020 
 */
package com.mhaque.hackerrank.implementation;

import java.util.Arrays;

/**
 * @author haquem
 *
 */
public class TheHurdleRace {
	
	static int hurdleRace(int k, int[] heights) {
       int result = 0;
       int maxHeight = getMaxHeight(heights);
       if(maxHeight>k) {
    	   result = maxHeight - k;
       }
       return result;
    }

	/**
	 * @param height
	 * @return
	 */
	private static int getMaxHeight(int[] heights) {
 	   int maxHeight=0;
		for(int h: heights) {
			if(maxHeight<h) {
	    		   maxHeight= h;
	    	   }
	       }
		return maxHeight;
	}
}
