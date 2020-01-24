package com.mhaque.hackerrank.sorting;

import java.util.Arrays;

public class FindTheMedian {
	static int findMedian(int[] arr) {
	   Arrays.sort(arr);
       int median = arr.length/2;
       return arr[median];
    }
}
