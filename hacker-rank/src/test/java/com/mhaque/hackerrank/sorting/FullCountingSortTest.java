package com.mhaque.hackerrank.sorting;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import org.junit.Test;

import com.mhaque.hackerrank.sorting.FullCountingSort;

public class FullCountingSortTest {

	@Test
	public void testCountSort() throws NumberFormatException, IOException {
		ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(classloader.getResourceAsStream("FullCountingSort.txt")));

		int n = Integer.parseInt(bufferedReader.readLine().trim());
		List<List<String>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        assertEquals("- - - - - to be or not to be - that is the question - - - -", FullCountingSort.countSort(arr));
	}

}
