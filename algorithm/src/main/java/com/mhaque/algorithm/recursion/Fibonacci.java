package com.mhaque.algorithm.recursion;

/**
 * The Fibonacci numbers are the numbers in the following integer sequence.
 * <br/>
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ……..
 * 
 * In mathematical terms, the sequence Fn of Fibonacci numbers is defined by the
 * recurrence relation
 * 
 * @author MasudulHaque
 *
 */
public class Fibonacci {
	/**
	 * Recursive implementation does a lot of repeated work, where time complexity
	 * T(n) = T(n-1)+T(n-2) which is exponential.
	 * 
	 * @param n
	 * @return
	 */
	protected static int fibRecursion(int n) {
		if (n <= 1) {
			return n;
		}
		return fibRecursion(n - 1) + fibRecursion(n - 2);
	}

	/**
	 * Using Dynamic programming we can store repeated value into array.
	 * 
	 * @param n
	 * @return n position value.
	 */
	protected static int fibDP(int n) {
		int[] f = new int[n + 2]; // 1 extra to handle 0;
		f[0] = 0;
		f[1] = 1;
		for (int i = 2; i <= n; i++) {
			f[i] = f[i - 1] + f[i - 2];
		}
		return f[n];
	}

	/**
	 * We can optimize space by replacing array with temporary variable, a, b & c.
	 * 
	 * @param n
	 * @return
	 */
	protected static int fibSpaceOptimized(int n) {
		int a = 0, b = 1, c;
		if (n == 0) {
			return 0;
		}
		for (int i = 2; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return b;
	}

	/**
	 * This another O(n) which relies on the fact that if we n times multiply the
	 * matrix M = {{1,1},{1,0}} to itself (in other words calculate power(M, n )),
	 * then we get the (n+1)th Fibonacci number as the element at row and column (0,
	 * 0) in the resultant matrix.
	 * 
	 * @param n
	 * @return
	 */
	protected static int fibMatrix(int n) {
		int F[][] = new int[][] { { 1, 1 }, { 1, 0 } };
		if (n == 0) {
			return 0;
		}
    	power(F, n - 1);


		return F[0][0];
	}

	/*
	 * Helper function that multiplies 2 matrices F and M of size 2*2, and puts the
	 * multiplication result back to F[][]
	 */
	private static void multiply(int F[][], int M[][]) {
		int x = F[0][0] * M[0][0] + F[0][1] * M[1][0];
		int y = F[0][0] * M[0][1] + F[0][1] * M[1][1];
		int z = F[1][0] * M[0][0] + F[1][1] * M[1][0];
		int w = F[1][0] * M[0][1] + F[1][1] * M[1][1];

		F[0][0] = x;
		F[0][1] = y;
		F[1][0] = z;
		F[1][1] = w;
	}

	/*
	 * Helper function that calculates F[][] raise to the power n and puts the
	 * result in F[][] Note that this function is designed only for fib() and won't
	 * work as general power function
	 */
	private static void power(int F[][], int n) {
		int i;
		int M[][] = new int[][] { { 1, 1 }, { 1, 0 } };

		// n - 1 times multiply the matrix to {{1,0},{0,1}}
		for (i = 2; i <= n; i++)
			multiply(F, M);
	}


	public static int fibMatrixOptimized(int n) {
		int F[][] = new int[][] { { 1, 1 }, { 1, 0 } };
		if (n == 0) {
			return 0;
		}
//		power(F, n - 1);

		powerOptimized(F, n-1);

		return F[0][0];
	}

	private static void powerOptimized(int F[][], int n) {
		int M[][] = new int[][] { { 1, 1 }, { 1, 0 } };
		power(F, n / 2);
		multiply(F, F);
		if (n % 2 != 0) {
			multiply(F, M);
		}
	}
}
