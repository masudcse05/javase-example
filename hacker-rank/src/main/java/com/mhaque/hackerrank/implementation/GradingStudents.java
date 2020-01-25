package com.mhaque.hackerrank.implementation;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {
	public static List<Integer> gradingStudents(List<Integer> grades) {
		List<Integer> result = new ArrayList<>();
		for (Integer g : grades) {
			if (g > 37) {
				int remainder = g % 5;
				if(remainder>2) {
					g= g+(5 - remainder);
				}
			}
			result.add(g);
		}
		return result;
	}
}
