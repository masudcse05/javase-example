package com.mhaque.hackerrank.implementation;

import java.util.List;

public class BirthdayChocolate {
	static int birthday(List<Integer> numbers, int d, int m) {
		int sum = getTotal(numbers), ways = 0;
		for (int i = 0; i < numbers.size() - m + 1; i++) {
			if (sum == d) {
				ways++;
			}
			if (i + m < numbers.size()) {
				sum = sum - numbers.get(i) + numbers.get(i + m);
			}
		}
		return ways;
	}
	
	static int getTotal(List<Integer> numbers) {
		return numbers.stream().mapToInt(Integer::intValue).sum();
	}
}
