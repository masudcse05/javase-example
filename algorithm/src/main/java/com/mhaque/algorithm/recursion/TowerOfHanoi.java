package com.mhaque.algorithm.recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
		solveHanoi(3, 'A', 'B', 'C');
	}

	private static void solveHanoi(int n, char fromRod, char middleRod, char toRod) {
		if(n==1) {
			System.out.println("Move plate 1 from "+ fromRod + " to "+ toRod);
			return;
		}
		solveHanoi(n-1, fromRod, toRod, middleRod);
		System.out.println("Move plate "+n+" from "+ fromRod + " to "+ toRod);
		solveHanoi(n-1, middleRod, fromRod, toRod);
	}
}
