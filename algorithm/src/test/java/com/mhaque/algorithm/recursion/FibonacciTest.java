package com.mhaque.algorithm.recursion;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciTest {

	@Test
	public void testFibRecursion() {
		assertEquals(55,Fibonacci.fibRecursion(10) );
		assertEquals(55,Fibonacci.fibDP(10) );
		assertEquals(55,Fibonacci.fibSpaceOptimized(10) );
		assertEquals(55,Fibonacci.fibMatrix(10) );
		assertEquals(55,Fibonacci.fibMatrixOptimized(10) );
	}

}
