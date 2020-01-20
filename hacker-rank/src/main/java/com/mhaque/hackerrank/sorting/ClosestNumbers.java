package com.mhaque.hackerrank.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClosestNumbers {
	 static int[] closestNumbers(int[] arr) {
		 Arrays.sort(arr);
		 int maxDiff = getMinDiff(arr);

		 List<Integer> intList = new ArrayList<>();
		 for(int i=0; i< arr.length-1; i++) {
			 if(maxDiff == arr[i+1] - arr[i]) {
				 intList.add(arr[i]);
				 intList.add(arr[i+1]);
			 }
		 }
		 
		 return intList.stream().mapToInt(i -> i).toArray();
     }

	private static int getMinDiff(int[] arr) {
		int min = Integer.MAX_VALUE;
		for(int i=0; i< arr.length-1; i++) {
			if(min > arr[i+1] - arr[i]){
				min = arr[i+1] - arr[i];
			}
		}
		return min;
	}
}
