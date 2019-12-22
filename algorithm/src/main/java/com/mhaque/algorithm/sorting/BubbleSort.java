package com.mhaque.algorithm.sorting;

public class BubbleSort {

	public static int[] sort(int[] input) {
		for(int i=0; i< input.length; i++) {
			for(int j=0; j< input.length-1; j++) {
				if(input[j] > input[j+1]) {
					swap(input, j);
				}
			}
		}
		return input;
	}

	private static void swap(int[] input, int j) {
		int temp = input[j];
		input[j] = input[j+1];
		input[j+1]= temp;
	}
}
