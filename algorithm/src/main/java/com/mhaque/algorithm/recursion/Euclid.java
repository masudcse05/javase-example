package com.mhaque.algorithm.recursion;

/**
 * Euclid algorithm
 * It calculates GCD(A,B) - Greteast common divisor between A and B.
 * @author haquem
 *
 */
public class Euclid {
    /**
     * Implementaion using recusion <br/>
     * For example, 22 and 6
     * <pre>
     *    22%6 remaining 4
     *    6%4  remaining 2
     *    4%2  remaining 0  
     * </pre>
     * @param number
     * @param divisor
     * @return
     */
	public static int gcdRecursive(int number, int divisor) {
		int remaing = number%divisor;
		if(remaing!=0) {
			return gcdRecursive(divisor, remaing);
		}
		else {
			return divisor;
		}
	}
	

    /**
     * Implementaion without recusion <br/>
     * For example, 22 and 6
     * <pre>
     *    22%6 remaining 4
     *    6%4  remaining 2
     *    4%2  remaining 0  
     * </pre>
     * @param number
     * @param divisor
     * @return
     */
	public static int gcdIterative(int number, int divisor) {
		while(divisor!=0) {
			int temp =  divisor;
			divisor = number % divisor;
			number = temp;
		}
	    return number;
	}
}
