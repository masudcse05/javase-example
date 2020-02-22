/**
 * Created by @authoer haquem on Feb 17, 2020 
 */
package com.mhaque.hackerrank.implementation;

import java.util.HashMap;
import java.util.Map;

/**
 * @author haquem
 *
 */
public class UtopianTree {
	 static Map<Integer, Integer> map = new HashMap<>();
	 static {
		 int value = 0;
		 for(int i =0; i<=60;i++) {
			 if(i%2==0) {
				 value+=1;
			 }
			 else {
				 value*=2;
			 }
			 map.put(i, value);
		 }
	 }
	 static int utopianTree(int n) {
		 return map.get(n);
     }
}
