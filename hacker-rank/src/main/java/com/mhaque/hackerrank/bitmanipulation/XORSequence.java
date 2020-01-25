/**
 * Created by @authoer haquem on Jan 20, 2020 
 */
package com.mhaque.hackerrank.bitmanipulation;

import java.util.ArrayList;
import java.util.List;

/**
 * @author haquem
 *
 */
public class XORSequence {
	static long xorSequence(long l, long r) {
		List<Long> arr = new ArrayList<>();
		for (long i = 1; i < 15; i++) {
			    long j = i+1;
				long value = i ^ j;
				arr.add(value);
		}
		System.out.println(arr);
		long sum=0;

		return sum;
	}
}
