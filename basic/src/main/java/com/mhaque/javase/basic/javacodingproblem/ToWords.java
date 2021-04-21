package com.mhaque.javase.basic.javacodingproblem;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ToWords {
	public static List<String> toWords(String line) {
		List<String> sentence = Arrays.asList(line.split("[ ,']+"));
		return sentence.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());
	}

	public static long countMatchingWords(List<String> lines, String word) {
		Map<String, Long> map = new HashMap<>();
		for (String line : lines) {
			String words[] = line.split("[ ,;']+");
			for (String w : words) {
				map.compute(w, (k, v) -> v == null ? 1 : ++v);
			}
		}
		return map.get(word) == null ? 0 : map.get(word);
	}

    public static List<String> wordsMostCommonFirst(List<String> lines) {
    	Map<String, Long> map = new HashMap<>();
    	for(String line : lines) {
    		String words[] = line.split("[ ,;']+");
    		for(String w: words) {
    		  map.compute(w, (k,v) -> v==null? 1: ++v);
    		}
    	}
    	return map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
    			.map(p-> p.getKey().toLowerCase())
    			.collect(Collectors.toList());
    }
}
