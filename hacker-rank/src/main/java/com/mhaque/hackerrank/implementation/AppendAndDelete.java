/**
 * Created by @authoer haquem on Feb 15, 2020 
 */
package com.mhaque.hackerrank.implementation;

/**
 * @author haquem
 *
 */
public class AppendAndDelete {
	static String appendAndDelete(String s, String t, int k) {
		return canConvert(s, t, k) ? "Yes" : "No";
	}

	private static boolean canConvert(String s, String t, int k) {
		if (s.length() + t.length() <= k) {
			return true;
		}

		int i = 0; // represents index of 1st non-matching character
		for (; i < s.length() && i < t.length(); i++) {
			if (s.charAt(i) != t.charAt(i)) {
				break;
			}
		}
		int minOperations = (s.length() - i) + (t.length() - i);
		return k >= minOperations && (k - minOperations) % 2 == 0;
	}
}
