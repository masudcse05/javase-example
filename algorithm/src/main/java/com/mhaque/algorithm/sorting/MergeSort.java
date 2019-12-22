/**
 * Created by @authoer haquem on Dec 20, 2019 
 */
package com.mhaque.algorithm.sorting;

/**
 * <pre>
 * function merge_sort(list m) is
    // Base case. A list of zero or one elements is sorted, by definition.
    if length of m ≤ 1 then
        return m

    // Recursive case. First, divide the list into equal-sized sublists
    // consisting of the first half and second half of the list.
    // This assumes lists start at index 0.
    var left := empty list
    var right := empty list
    for each x with index i in m do
        if i < (length of m)/2 then
            add x to left
        else
            add x to right

    // Recursively sort both sublists.
    left := merge_sort(left)
    right := merge_sort(right)

    // Then merge the now-sorted sublists.
    return merge(left, right)
 * </pre>
 * 
 * @author haquem
 *
 */
public class MergeSort {

	public static int[] sort(int[] input) {
		mergeSort(input, input.length);
		return input;
	}

	/**
	 * For the implementation, we'll write a mergeSort function which takes in the
	 * input array and its length as the parameters. This will be a recursive
	 * function so we need the base and the recursive conditions.
	 * 
	 * The base condition checks if the array length is 1 and it will just return.
	 * For the rest of the cases, the recursive call will be executed.
	 * 
	 * For the recursive case, we get the middle index and create two temporary
	 * arrays l[] and r[]. The mergeSort function is then called recursively for
	 * both the sub-arrays:
	 * 
	 * @param a
	 * @param n
	 */
	public static void mergeSort(int[] a, int n) {
		if (n <= 1) {
			return;
		}
		int mid = n / 2;
		int[] l = new int[mid];
		int[] r = new int[n - mid];

		for (int i = 0; i < mid; i++) {
			l[i] = a[i];
		}
		for (int i = mid; i < n; i++) {
			r[i - mid] = a[i];
		}
		mergeSort(l, mid);
		mergeSort(r, n - mid);

		merge(a, l, r, mid, n - mid);
	}

	/**
	 * We then call the merge function which takes in the input and both the
	 * sub-arrays and the starting and end indices of both the sub arrays.
	 * 
	 * The merge function compares the elements of both sub-arrays one by one and
	 * places the smaller element into the input array.
	 * 
	 * @param a
	 * @param l
	 * @param r
	 * @param left
	 * @param right
	 */
	public static void merge(int[] a, int[] l, int[] r, int left, int right) {

		int i = 0, j = 0, k = 0;
		while (i < left && j < right) {
			if (l[i] <= r[j]) {
				a[k++] = l[i++];
			} else {
				a[k++] = r[j++];
			}
		}
		while (i < left) {
			a[k++] = l[i++];
		}
		while (j < right) {
			a[k++] = r[j++];
		}
	}
}
