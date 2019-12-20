package com.mhaque.algorithm.recursion;

public class Search {

	static int array[] = {2,5,7,10,11,22,42,52,66,78,85,88,99,102,114};
    public static void main(String[] args) {
		int index = binarySearch(0, array.length-1, 114);
		System.out.println(index);
	}

	private static int binarySearch(int startIndex, int endIndex, int item) {
		if(endIndex < startIndex) {
			return -1;
		}
		int middleIndex = (startIndex + endIndex)/2;
		if(array[middleIndex]== item) {
			return middleIndex;
		}
		else if(array[middleIndex] > item) {
			return binarySearch(startIndex, middleIndex-1, item);
		}
		else {
			return binarySearch( middleIndex+1, endIndex, item);
		}
	}
}
