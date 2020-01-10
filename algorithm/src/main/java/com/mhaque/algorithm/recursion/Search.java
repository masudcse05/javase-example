package com.mhaque.algorithm.recursion;

public class Search {
    
	static int[] array;
    
    public static int binarySearch(int[] anArray, int item) {
    	array = anArray;
    	return binarySearch(0, array.length, item);
    }
    
    public static int binarySearch(int startIndex, int endIndex, int item) {
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
