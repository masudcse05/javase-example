package com.mhaque.hackerrank.daysofcode;

public class Operators {

	static void solve(double mealCost, int tipPercent, int taxPercent) {
        double sum=mealCost;
        sum+= mealCost* tipPercent/100.0;
        sum+= mealCost* taxPercent/100.0;
        System.out.println(Math.round(sum));
    }

}
