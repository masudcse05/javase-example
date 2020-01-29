package com.mhaque.hackerrank.implementation;

import java.util.List;

public class BonAppetit {
	static void bonAppetit(List<Integer> bills, int k, int b) {
		bills.remove(k);
		int amount = getSum(bills, b);
		if (amount == 0) {
			System.out.println("Bon Appetit");
		} else {
			System.out.println(amount);
		}
	}

	private static int getSum(List<Integer> bills, int b) {
		int sum = 0;
		for (Integer bill : bills) {
			sum += bill;
		}
		int amount = b - sum / 2;
		return amount;
	}
}
