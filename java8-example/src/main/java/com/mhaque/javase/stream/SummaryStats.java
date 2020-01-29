package com.mhaque.javase.stream;

import static com.mhaque.javase.stream.Dish.menu;

import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;

/**
 * Created by Masud on 5/4/14.
 */
public class SummaryStats {
    public static void main(String[] args) {
        DoubleSummaryStatistics statistics= menu.stream().mapToDouble(Dish::getCalories).summaryStatistics();
        System.out.println("Minimum "+statistics.getMin());
        System.out.println("Maximum "+statistics.getMax());
        System.out.println("Average "+statistics.getAverage());
        System.out.println("Count "+statistics.getCount());
        System.out.println("Sum "+statistics.getSum());
    }
}
