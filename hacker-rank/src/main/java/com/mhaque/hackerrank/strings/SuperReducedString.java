package com.mhaque.hackerrank.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Stack;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SuperReducedString {

	static String superReducedString(String input) {
       StringBuilder output = new StringBuilder();
       Stack<Character> stack = new Stack<>();
       
       for(int i=0;i< input.length();i++) {
    	   char ch = input.charAt(i);
    	   if(stack.isEmpty()) {
    		   stack.push(ch);
    	   }
    	   else {
    		   if(ch == stack.peek()) {
    			   stack.pop();
    		   }
    		   else {
    			   stack.push(ch);
    		   }
    	   }
       }
	   for(Character ch : stack) {
		   output.append(ch);
	   }
       if(output.length()==0) {
    	   output.append("Empty String");
       }
       return output.toString();
    }
}
