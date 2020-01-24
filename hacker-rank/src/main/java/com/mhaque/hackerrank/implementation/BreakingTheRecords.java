package com.mhaque.hackerrank.implementation;

public class BreakingTheRecords {
	static int[] breakingRecords(int[] scores) {
		int[] result = new int[2];
		int min= scores[0];
		int max =scores[0];
		int minCount=0, maxCount=0;
		for(int i=1; i<scores.length; i++) {
			if(max < scores[i]) {
				max = scores[i];
				maxCount++;
			}
			else if (min > scores[i]){
				min = scores[i];
				minCount++;
			}
		}
		result[0]= maxCount;
		result[1]= minCount;
		
       return result;
    }

}
