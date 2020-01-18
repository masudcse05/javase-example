package com.mhaque.hackerrank.sorting;

import static java.util.stream.Collectors.toList;
import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.Test;

import com.mhaque.hackerrank.sorting.DiagonalDifeerence;

public class DiagonalDifeerenceTest {

	@Test
	public void testDiagonalDifference() throws Exception { 
	
		ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(classloader.getResourceAsStream("DiagonalDifeerence.txt")));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<List<Integer>> arr = new ArrayList<>();

		IntStream.range(0, n).forEach(i -> {
			try {
				arr.add(Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
						.collect(toList()));
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});
		
		assertEquals(15, DiagonalDifeerence.diagonalDifference(arr));
	}

}
