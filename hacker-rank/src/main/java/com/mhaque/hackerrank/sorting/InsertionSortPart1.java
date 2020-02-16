/**
 * Created by @authoer haquem on Feb 16, 2020 
 */
package com.mhaque.hackerrank.sorting;

/**
 * @author haquem
 *
 */
public class InsertionSortPart1 {
	static void insertionSort1(int n, int[] arr) {
		int a = arr[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			if (arr[i] < a) {
				arr[i + 1] = a;
				printArr(arr);
				break;
			} else {
				arr[i + 1] = arr[i];
				printArr(arr);
				if (i == 0) {
					arr[i] = a;
					printArr(arr);
				}
			}
		}
	}

	static void printArr(int[] arr) {
		for (int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
	}
}
