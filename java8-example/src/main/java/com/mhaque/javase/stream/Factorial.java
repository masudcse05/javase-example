package com.mhaque.javase.stream;

import java.util.stream.LongStream;

public class Factorial {

	public static void main(String[] args) {
         System.out.println(factorial(20));//2432902008176640000
	}
	
	private static long factorial(int n) {
		Total t = new Total();
		 LongStream.rangeClosed(1, n).parallel().forEach(t::mult);
		 return t.total;
	}
	
	static class Total{
		long total=1;
		public void mult(long n) {
			total*=n;
		}
	}

}
