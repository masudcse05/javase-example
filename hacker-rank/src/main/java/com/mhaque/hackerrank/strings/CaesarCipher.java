package com.mhaque.hackerrank.strings;

public class CaesarCipher {
	public static String caesarCipher(String s, int k) {
		char[] output = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
            output[i] = getCeaserCipher(c, k); 
		}
		return new String(output);
	}

	private static char getCeaserCipher(char c, int k) {
		int offset = k%26;
		if ((c>=65 && c<=90)) {
			return (char)getOuput(c, offset, 90);
		}
		else if(c>=97 && c<=122) {
			return (char)getOuput(c, offset, 122);
		}
		else {
		  return c;
		}
	}
	
	private static int getOuput(char c, int offset, int maxValue) {
		int output = c + offset;
		if(output>maxValue) {
			output-=26;
		}
		return output;
	}
}
