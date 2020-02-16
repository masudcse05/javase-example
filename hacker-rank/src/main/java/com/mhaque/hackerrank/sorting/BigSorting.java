/**
 * Created by @authoer haquem on Feb 16, 2020 
 */
package com.mhaque.hackerrank.sorting;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author haquem
 *
 */
public class BigSorting {
	 static String[] bigSorting(String[] unsorted) {
        Arrays.sort(unsorted, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(o1.length()==o2.length()) {
					return o1.compareTo(o2);
				}
				return o1.length()-o2.length();
			}
		});
        return unsorted;
	 }
}
