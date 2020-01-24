package com.mhaque.hackerrank.strings;

import java.util.HashSet;
import java.util.Set;

public class WeightedUniformStrings {
	static String[] weightedUniformStrings(String s, int[] queries) {
		String[] results = new String[queries.length];
		Set<Integer> weightSet = generateWeightSet(s);
		generateResults(queries, results, weightSet);
		return results;
	}

	private static void generateResults(int[] queries, String[] results, Set<Integer> weightedMap) {
		for (int i = 0; i < queries.length; i++) {
			String result = "No";
			if (weightedMap.contains(queries[i])) {
				result = "Yes";
			}
			results[i] = result;
		}
	}

	private static Set<Integer> generateWeightSet(String s) {
		Set<Integer> weightSet = new HashSet<>();
		int countChar =1;
		int lastWeight =0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			int weight = ch-'a'+1;
			if (weight == lastWeight) {
				countChar++;
			} else {
				countChar = 1;
				lastWeight = weight;
			}
			weightSet.add(countChar* weight);
		}
		return weightSet;
	}
}
