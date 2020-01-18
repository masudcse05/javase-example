package com.mhaque.hackerrank.sorting;

import java.util.Arrays;

public class MiniMaxSum {

	static void miniMaxSum(int[] arr) {
		Arrays.sort(arr);
		long sum = 0;
		for (int i = 0; i < 5; i++) {
			sum += arr[i];
		}
		System.out.println((sum - arr[4]) + " " + (sum - arr[0]));
	}

	public static void main(String[] args) {
		int[] arr = new int[5];
		String[] arrItems = "256741038 623958417 467905213 714532089 938071625".split(" ");

		for (int i = 0; i < 5; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}
		miniMaxSum(arr);
	}
}
