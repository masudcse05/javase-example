package com.mhaque.hackerrank.implementation;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaArraylist {

	public static void main(String[] args) throws Exception{
//		Scanner sc = new Scanner(System.in);
		Scanner sc = new Scanner(new File("src/main/resources/array.txt"));
		int n = sc.nextInt();
		List<List<Integer>> array = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int number = sc.nextInt();
			List<Integer> row = new ArrayList<>();
			for (int j = 0; j < number; j++) {
				row.add(sc.nextInt());
			}
			array.add(row);
		}
		int output = sc.nextInt();
		for (int i = 0; i < output; i++) {
			int index = sc.nextInt();
			int position = sc.nextInt();
			List<Integer> list = array.get(index - 1);
			try {
				Integer value = list.get(position - 1);
				System.out.println(value);
			} catch (IndexOutOfBoundsException exp) {
				System.out.println("ERROR!");
			}
		}
	}

}
