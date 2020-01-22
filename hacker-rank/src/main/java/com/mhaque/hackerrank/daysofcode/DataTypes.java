package com.mhaque.hackerrank.daysofcode;

import java.util.Locale;
import java.util.Scanner;

public class DataTypes {

	 public static void main(String[] args) {
	        int i = 4;
	        double d = 4.0;
	        String s = "HackerRank ";
			
	        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
	        
	        int intInput = Integer.parseInt(scan.nextLine());
	        double doubleInput = Double.parseDouble(scan.nextLine());
	        String input = scan.nextLine();
	        System.out.println(intInput+i);
	        System.out.println(d+doubleInput);
	        System.out.println(s+input);
	        

	        /* Declare second integer, double, and String variables. */

	        /* Read and save an integer, double, and String to your variables.*/
	        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
	        
	        /* Print the sum of both integer variables on a new line. */

	        /* Print the sum of the double variables on a new line. */
			
	        /* Concatenate and print the String variables on a new line; 
	        	the 's' variable above should be printed first. */

	        scan.close();
	    }

}
