package com.mhaque.hackerrank.implementation;

import java.util.HashMap;
import java.util.Map;

public class SockMerchant {
	static int sockMerchant(int n, int[] ar) {
		Map<Integer, Integer> countMap = generateCountMap(ar);
		return getResult(countMap);
	}

	private static int getResult(Map<Integer, Integer> countMap) {
		int res = 0;
		for (int count : countMap.values()) {
			res += count / 2;
		}
		return res;
	}

	private static Map<Integer, Integer> generateCountMap(int[] ar) {
		Map<Integer, Integer> countMap = new HashMap<>();
		for (int i = 0; i < ar.length; i++) {
			if (countMap.containsKey(ar[i])) {
				countMap.put(ar[i], countMap.get(ar[i]) + 1);
			} else {
				countMap.put(ar[i], 1);
			}
		}
		return countMap;
	}
}
