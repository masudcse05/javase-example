/**
 * Created by @authoer haquem on Feb 23, 2020 
 */
package com.mhaque.hackerrank.strings;

/**
 * @author haquem
 *
 */
public class MarsExploration {
	   static int marsExploration(String s) {
		   int count=0;
		   for(int i=0; i< s.length(); i+=3) {
			   String substring = s.substring(i, i+3);
			   count+= countSOS(substring);
		   }
		   return count;
       }

	private static int countSOS(String substring) {
		int count=0; 
		count+= checkChar(substring.charAt(0), 'S');
		count+= checkChar(substring.charAt(1), 'O');
		count+= checkChar(substring.charAt(2), 'S');
		return count;
	}

	private static int checkChar(char actual, char expected) {
		return actual==expected ? 0 : 1;
	}
}
