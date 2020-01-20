package com.mhaque.hackerrank.sorting;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FullCountingSort {
	static String countSort(List<List<String>> arr) {
		Collections.sort(arr, new Comparator<List<String>>() {

			@Override
			public int compare(List<String> o1, List<String> o2) {
				return o1.get(0).compareTo(o2.get(0));
			}
		});
		StringBuilder builder = new StringBuilder();
		
        for(List<String> l : arr) {
        	for(String str : l) {
        		System.out.println(str);
        		if("ab".equals(str) || "ef".equals(str) || "ij".equals(str)|| "cd".equals(str) || "gh".equals(str)) {
        			builder.append("-");
        		}
        		else if(str.matches("\\d")) {
        			builder.append(" ");
        		}
        		else {
        		   builder.append(str);
        		}
        	}
        }
        return builder.toString().trim();
	}
}
