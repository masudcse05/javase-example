package com.mhaque.hackerrank.sorting;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class DiagonalDifeerence {

	/*
	 * Complete the 'diagonalDifference' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts
	 * 2D_INTEGER_ARRAY arr as parameter.
	 */
	public static int diagonalDifference(List<List<Integer>> arr) {
		int leftToRight=0, rightToLeft=0;
		for(int i=0, j= arr.size()-1; i<arr.size();i++, j--) {
			List<Integer> list = arr.get(i);
			leftToRight+= list.get(i);
			List<Integer> right = arr.get(j);
			rightToLeft+= right.get(i);
		}
		return Math.abs(leftToRight - rightToLeft);
	}

}
