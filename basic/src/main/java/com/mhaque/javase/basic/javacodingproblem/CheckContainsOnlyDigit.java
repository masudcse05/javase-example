package com.mhaque.javase.basic.javacodingproblem;

public class CheckContainsOnlyDigit {
	 public static boolean containsOnlyDigitsRegex(String input ) {
    	 return input.matches("[0-9]+");
     }
	 public static boolean containsOnlyDigitsStream(String input ) {
    	 return input.chars().allMatch(ch -> Character.isDigit(ch));
     }
	 
	 public static boolean containsOnlyDigitsBruteForce(String input ) {
    	 for(Character ch : input.toCharArray()) {
    		 if(!Character.isDigit(ch)) {
    			 return false;
    		 }
    	 }
    	 return true;
     }
}
