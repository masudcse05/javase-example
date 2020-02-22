/**
 * Created by @authoer haquem on Feb 17, 2020 
 */
package com.mhaque.hackerrank.implementation;

import java.util.Collections;
import java.util.List;

/**
 * @author haquem
 *
 */
public class PickingNumbers {
	 public static int pickingNumbers(List<Integer> a) {
		// Collections.sort(a); 
		 int count =1, maxCount=0;
		 Integer first = a.get(0);
		 for(int i=1; i< a.size(); i++) {
			int value = a.get(i);
			int diff = value - first;
			if(diff<=1) {
				count++;
			}
			else {
				count=1;
			}
			if(maxCount< count) {
				maxCount=count;
			}
			first = value;
		 }
		 return count;
     }
}
