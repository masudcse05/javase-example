package com.mhaque.hackerrank.implementation;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

public class MigratoryBirdsTest {

	@Test
	public void testMigratoryBirds() throws NumberFormatException, IOException {
//		assertEquals(2, MigratoryBirds.migratoryBirds(Arrays.asList(1,2,4,3,3,5,6,2,7,2,8,2)));
		ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(classloader.getResourceAsStream("MigratoryBirds.txt")));

		  int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

	        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
	            .map(Integer::parseInt)
	            .collect(Collectors.toList());

	        int result = MigratoryBirds.migratoryBirds(arr);
	   assertEquals(3, result);     
	}

}
