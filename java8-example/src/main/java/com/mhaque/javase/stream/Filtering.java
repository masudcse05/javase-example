package com.mhaque.javase.stream;

import java.util.stream.*;
import java.util.*;

import static com.mhaque.javase.stream.Dish.menu;
import static java.util.stream.Collectors.toList;

public class Filtering {

    public static void main(String... args) {
        // Counting

        menu.stream().filter(m ->{
            System.out.println("Vegetarian Name "+m.getName());
          return   m.isVegetarian();
        });


        Map<Boolean, List<Dish>> partition= menu.stream().collect(Collectors.partitioningBy(Dish::isVegetarian));

        System.out.println(partition.get(true));
        System.out.println(partition.get(false));


//        System.out.println(vegetarianCount);
        // Filtering with predicate
        List<Dish> vegetarianMenu =
                menu.stream()
                        .filter(Dish::isVegetarian)
                        .collect(toList());

        vegetarianMenu.forEach(System.out::println);

        // Filtering unique elements
        List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
        numbers.stream()
                .filter(i -> i % 2 == 0)
                .distinct()
                .forEach(System.out::println);

        // Truncating a stream
        List<Dish> dishesLimit3 =
                menu.stream()
                        .filter(d -> d.getCalories() > 300)
                        .limit(3)
                        .collect(toList());

        dishesLimit3.forEach(System.out::println);

        // Skipping elements
        List<Dish> dishesSkip2 =
                menu.stream()
                        .filter(d -> d.getCalories() > 300)
                        .skip(2)
                        .collect(toList());

        dishesSkip2.forEach(System.out::println);
    }
}
