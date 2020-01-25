/**
 * Created by @authoer haquem on Jan 20, 2020 
 */
package com.mhaque.hackerrank.bitmanipulation;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author haquem
 *
 */
public class LonelyInteger {
	static int lonelyinteger(int[] integers) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for(Integer value : integers) {
        	if(countMap.containsKey(value)) {
        		countMap.put(value, countMap.get(value)+1);
        	}
        	else {
        		countMap.put(value, 1);
        	}
        }
        
        return getLonlyValue(countMap);
    }

	/**
	 * @param countMap
	 * @return
	 */
	private static int getLonlyValue(Map<Integer, Integer> countMap) {
		int res =0;
		for(Entry<Integer, Integer> e : countMap.entrySet()) {
			if(e.getValue()==1) {
				res = e.getKey();
			}
		}
		return res;
	}
}
