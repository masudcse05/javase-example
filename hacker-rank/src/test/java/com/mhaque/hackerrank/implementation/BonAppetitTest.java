package com.mhaque.hackerrank.implementation;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class BonAppetitTest {

	@Test
	public void testBonAppetit() {
		List<Integer> list = Arrays.asList(3,10,2,9);
		BonAppetit.bonAppetit(new ArrayList<Integer>(list), 1, 12);
		BonAppetit.bonAppetit(new ArrayList<Integer>(list), 1, 7);
	}

}
