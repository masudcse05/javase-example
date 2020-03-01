package com.mhaque.desingpattern.strategy.duck;

public class Squeak implements QuackBehavior {
	public void quack() {
		System.out.println("Squeak");
	}
}
