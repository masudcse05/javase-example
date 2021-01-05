/**
 * Created by @authoer haquem on Jan 21, 2020 
 */
package com.mhaque.javase.model;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import static java.util.Comparator.*;

/**
 * @author haquem
 *
 */
public class AppleTest {

	private List<Apple> apples;

	@Before
	public void setUp() {
		apples = Arrays.asList(new Apple(80, "green"), new Apple(80, "yellow"), new Apple(155, "green"),
				new Apple(120, "red"));
	}

	@Test
	public void testCompareInJava7() {
		ArrayList<Apple> applesToSort = new ArrayList<Apple>(apples);
		Collections.sort(applesToSort, new Comparator<Apple>() {

			@Override
			public int compare(Apple a1, Apple a2) {
				return a1.getWeight() - a2.getWeight();
			}
		});
		System.out.println(applesToSort);
	}

	@Test
	public void testCompareInJava8() {
		ArrayList<Apple> applesToSort = new ArrayList<Apple>(apples);
		//Step 1
		Collections.sort(applesToSort, (Apple a1, Apple a2) -> {
			return a1.getWeight() - a2.getWeight();
		});
		//Step 2
		Collections.sort(applesToSort, (a1, a2) -> {
			return a1.getWeight() - a2.getWeight();
		});
		
		// Step 3
		Collections.sort(applesToSort, comparing(Apple::getWeight));
		
		// Sort in reverse order
		Collections.sort(applesToSort, comparing(Apple::getWeight).reversed());
		
		//Sort in multiple values
		Collections.sort(applesToSort, comparing(Apple::getWeight).thenComparing(Apple::getColor));
		
		//Even Collections is not needed
		applesToSort.sort(comparing(Apple::getWeight));
		
		System.out.println(applesToSort);
	}

}
