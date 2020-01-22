package com.mhaque.hackerrank.implementation;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class GradingStudentsTest {

	@Test
	public void testGradingStudents() {
		List<Integer> grades = List.of(73, 67, 38, 33);
		assertEquals(List.of(75, 67, 40, 33), GradingStudents.gradingStudents(new ArrayList<Integer>(grades)));
	}

}
