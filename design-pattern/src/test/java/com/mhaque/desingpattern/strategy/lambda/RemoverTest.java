package com.mhaque.desingpattern.strategy.lambda;

import static org.junit.Assert.*;

import org.junit.Test;

public class RemoverTest {

	@Test
	public void testRemove() {
		String str = "I was born in 1987.";
		String withoutSpace = Remover.remove(str, s -> s.replaceAll("\\s", ""));
		assertEquals("Iwasbornin1987.", withoutSpace);
		String withoutNumber = Remover.remove(withoutSpace, s -> s.replaceAll("\\d", ""));
		assertEquals("Iwasbornin.", withoutNumber);
	}

}
