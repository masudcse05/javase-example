package com.mhaque.javase.stream;

import java.util.Comparator;
import java.util.stream.Stream;

/**
 * Created by Masud on 5/4/14.
 */
public class CollectorTest {
    public static void main(String[] args) {
        Stream<String> names = Stream.of("John Lennon", "Paul McCartney",
                "George Harrison", "Ringo Starr", "Pete Best", "Stuart Sutcliffe");

        String res=names.max(Comparator.comparing(String::length)).get();

        System.out.println(res);

    }
}
