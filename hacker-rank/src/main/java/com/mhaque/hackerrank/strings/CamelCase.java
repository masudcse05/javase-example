package com.mhaque.hackerrank.strings;

public class CamelCase {

	static int camelcase(String input) {
        int res =1;
        for(char ch : input.toCharArray()) {
        	if(Character.isUpperCase(ch)) {
        		res++;
        	}
        }
        return res;
    }
}
