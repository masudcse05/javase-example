package com.mhaque.hackerrank.implementation;

public class AppleAndOrange {
	 static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
		int applesCount = getCount(s, t, a, apples);
		int orangeCount = getCount(s, t, b, oranges);
		System.out.println(applesCount);
		System.out.println(orangeCount);
	 }
	 
	 private static int getCount(int houseStart, int houseEnd, int treePosition, int[] fruts) {
		 int result=0;
		 for(int i=0; i<fruts.length;i++) {
			 int value= treePosition+ fruts[i];
			 if(value>=houseStart && value <= houseEnd) {
				 result++;
			 }
		 }
		 return result;
	 }
}
