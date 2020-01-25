package com.mhaque.hackerrank.strings;

import java.util.Stack;

public class HackerRankInString {
	
	 static String hackerrankInString(String s) {
       Stack<Character> stack = new Stack<>();
       for(Character ch : "knarrekcah".toCharArray()) {
    	   stack.push(ch);
       }
       System.out.println(stack);
       boolean isYes = false;
       for(Character ch : s.toCharArray()) {
    	   if(ch==stack.peek()) {
    		   stack.pop();
    	   }
    	   if(stack.isEmpty()) {
    		   isYes=true;
    		   break;
    	   }
       }
       return isYes? "YES" : "NO";
	 }
}
