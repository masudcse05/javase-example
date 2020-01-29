package com.mhaque.javase.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by Masud on 4/12/14.
 */
public class PredicateTest {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8);
        System.out.println("Printing all numbers");
        evaluate(list, e-> true);
        System.out.println("Printing no numbers");
        evaluate(list, e-> false);
        System.out.println("Printing even numbers");
        evaluate(list, e -> e % 2==0);
        System.out.println("Printing odd numbers");
        evaluate(list, (n)-> n%2 == 1 );
    }

    private static void evaluate(List<Integer> list, Predicate<Integer> p) {
        for(Integer n: list)  {
            if(p.test(n)) {
                System.out.println(n + " ");
            }
        }
    }
}
