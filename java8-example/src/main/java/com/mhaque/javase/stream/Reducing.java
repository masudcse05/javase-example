package com.mhaque.javase.stream;
import java.util.function.BinaryOperator;
import java.util.stream.*;

import static com.mhaque.javase.stream.Dish.menu;

import java.util.*;

public class Reducing{

    public static void main(String...args){

        List<Integer> numbers = Arrays.asList(3,4,5,1,2);
        int sum = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum);

        BinaryOperator<Integer> op=(a,b) -> a+b;
        int s=numbers.stream().reduce(0, op);
        System.out.println(s);
        int sum2 = numbers.stream().reduce(0, Integer::sum);
        System.out.println(sum2);

        int max = numbers.stream().reduce(0, (a, b) -> Integer.max(a, b));
        System.out.println(max);

        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        min.ifPresent(System.out::println);

        int calories = menu.stream()
                           .map(Dish::getCalories)
                           .reduce(0, Integer::sum);
        System.out.println("Number of calories:" + calories);
    }
}
