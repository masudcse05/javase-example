package com.mhaque.desingpattern.singleton.threadsafe;

import static org.junit.Assert.*;

import org.junit.Test;

public class SingletonTest {

	@Test
	public void testGetDescription() {
		Singleton singleton = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		assertTrue(singleton==singleton2);
		assertEquals("I'm a thread safe Singleton!", singleton.getDescription());
	}

}
