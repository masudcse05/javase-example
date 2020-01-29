package com.mhaque.javase.lambda;

import static com.mhaque.javase.stream.aggregate.Dish.menu;

import java.util.stream.Collectors;

import com.mhaque.javase.stream.aggregate.Dish;
/**
 * Created by Masud on 5/4/14.
 */
public class Test {
    public static void main(String[] args) {
        String result=menu.stream().map(Dish::getName).collect(Collectors.joining(", ", "[", "}"));
        System.out.println(result);
    }
}
