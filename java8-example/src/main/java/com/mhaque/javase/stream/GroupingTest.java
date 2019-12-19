package com.mhaque.javase.stream;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Masud on 5/4/14.
 */
public class GroupingTest {
    public static void main(String[] args) {
        Stream<String> names = Stream.of("John", "Paul", "George", "John",
                "Paul", "John");

        Map<String,Long> nameMap= names.collect(Collectors.groupingBy(n->n, Collectors.counting()));

        System.out.println(nameMap);
    }
}
