package com.mhaque.designpattern.builder;

import static com.mhaque.designpattern.builder.NyPizza.Size.SMALL;
import static com.mhaque.designpattern.builder.Pizza.Topping.HAM;
import static com.mhaque.designpattern.builder.Pizza.Topping.ONION;
import static com.mhaque.designpattern.builder.Pizza.Topping.SAUSAGE;
import static org.junit.Assert.*;

import org.junit.Test;

public class PizzaTest {

	@Test
	public void test() {
		NyPizza pizza = new NyPizza.Builder(SMALL).addTopping(SAUSAGE).addTopping(ONION).build();
		Calzone calzone = new Calzone.Builder().addTopping(HAM).sauceInside().build();

		assertEquals("New York Pizza with [ONION, SAUSAGE]", pizza.toString());
		assertEquals("Calzone with [HAM] and sauce on the inside", calzone.toString());
	}

}
