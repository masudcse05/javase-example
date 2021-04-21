package com.mhaque.designpattern.templatemethod;

import static org.junit.Assert.*;

import org.junit.Test;

public class PizzaLambdaTest {

	@Test
	public void test() {
		Pizza sPizza = new Pizza();
		new PizzaLambda().make(sPizza, (Pizza p)
		-> System.out.println("Add: bits of tomato, onion, anchovies, and herbs "));
	}

}
