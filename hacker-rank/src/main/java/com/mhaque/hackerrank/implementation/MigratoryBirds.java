package com.mhaque.hackerrank.implementation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MigratoryBirds {
	 static int migratoryBirds(List<Integer> arr) {
       int mostFrequent=0, maxCount=0;
       Map<Integer, Integer> countMap = new TreeMap<>();
       for(Integer num: arr) {
    	   int count = 1;
    	   if(countMap.containsKey(num)) {
    	     count = countMap.get(num)+1;
    	   }
    	   countMap.put(num, count);
       }
       for(Entry<Integer, Integer> entry : countMap.entrySet()) {
    	   if(maxCount< entry.getValue()) {
    		   maxCount= entry.getValue();
    		   mostFrequent = entry.getKey();
    	   }
       }
       return mostFrequent;
     }
}
