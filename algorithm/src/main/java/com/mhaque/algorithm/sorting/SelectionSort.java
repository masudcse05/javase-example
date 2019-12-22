/**
 * Created by @authoer haquem on Dec 20, 2019 
 */
package com.mhaque.algorithm.sorting;

/**
 * @author haquem
 *
 */
public class SelectionSort {

	public static int[] sort(int[] input) {
		for(int i=0; i< input.length; i++) {
			int index = i;
			for(int j=i+1; j< input.length; j++) {
				if(input[j] < input[index]) {
					index = j;
				}
			}
			if(index!=i) {
				swap(input, index, i);
			}
		}
		return input;
	}

	private static void swap(int[] input, int index, int i) {
		int temp = input[index];
		input[index] = input[i];
		input[i]= temp;
	}

}
