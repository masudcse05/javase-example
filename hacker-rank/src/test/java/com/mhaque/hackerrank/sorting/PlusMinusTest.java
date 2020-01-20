package com.mhaque.hackerrank.sorting;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.Test;

import com.mhaque.hackerrank.sorting.PlusMinus;

public class PlusMinusTest {

	@Test
	public void testPlusMinus() throws NumberFormatException, IOException {
		ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(classloader.getResourceAsStream("PlusMinus.txt")));

		int n = Integer.parseInt(bufferedReader.readLine().trim());
		 int[] arr = new int[n];

	        String[] arrItems = bufferedReader.readLine().split(" ");

	        for (int i = 0; i < n; i++) {
	            int arrItem = Integer.parseInt(arrItems[i]);
	            arr[i] = arrItem;
	        }

	        PlusMinus.plusMinus(arr);
	}

}
