/**
 * Created by @authoer haquem on Dec 20, 2019 
 */
package com.mhaque.algorithm.sorting;

/**
 * 
 * <pre>
 * algorithm quicksort(A, lo, hi) is 
 *     if lo < hi then 
 *       p := partition(A, lo, hi)
 *       quicksort(A, lo, p - 1) 
 *       quicksort(A, p + 1, hi)
 * 
 * algorithm partition(A, lo, hi) is
 *     pivot := A[hi]
 *      i := lo 
 *      for j := lo to hi do
 *          if A[j] < pivot 
 *                then swap A[i] with A[j] 
 *                i := i + 1 
 *      swap A[i] with A[hi]
 * return i
 * </pre>
 * @author haquem
 *
 */
public class QuickSort {

	public static int[] sort(int[] input) {
		quickSort(input, 0, input.length - 1);
		return input;
	}

	private static void quickSort(int[] arr, int lo, int hi) {
		int p = 0;
		if (lo < hi) {
			p = partition(arr, lo, hi);
			quickSort(arr, lo, p - 1);
			quickSort(arr, p + 1, hi);
		}
	}

	private static int partition(int[] arr, int lo, int hi) {
		int pivot = arr[hi];
		int i = lo;
		for (int j = lo; j < hi; j++) {
			if (arr[j] < pivot) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
			}
		}
		int temp = arr[i];
		arr[i] = arr[hi];
		arr[hi] = temp;
		return i;
	}

}
