package com.mhaque.hackerrank.strings;

public class Pangrams {
	static String aToZ = "abcdefghijklmnopqrstuvwxyz";
	 static String pangrams(String s) {
       boolean isPan = false ;
       if(s.length()>=26) {
    	   s = s.toLowerCase();
    	   for(int i=0; i<aToZ.length(); i++) {
    		   char ch = aToZ.charAt(i);
    		   int index = s.indexOf(ch);
    		   if(index== -1) {
    			   isPan= false;
    			   break;
    		   }
    		   else {
    			   isPan = true;
    		   }
    	   }
       }
       return isPan? "pangram" : "not pangram";
	 }
}
