package com.mhaque.javase.basic.javacodingproblem;

import java.util.HashMap;
import java.util.Map;
import static java.util.stream.Collectors.*;

public class CountDuplicateLetter {

	public static Map<Character, Integer> countDuplicateLetter(String input){
		Map<Character, Integer> result = new HashMap<>();
		for(char ch : input.toCharArray()) {
			result.compute(ch, (k, v)-> (v==null) ? 1: ++v);
		}
		return result;
	}
	
	public static Map<Character, Long> countDuplicateLetterLambda(String input){
		return input.chars().mapToObj(c-> (char) c).collect(groupingBy(c->c, counting()));
	}

}
