/**
 * Created by @authoer haquem on Dec 28, 2019 
 */
package com.mhaque.datastructure.stack;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author haquem
 *
 */
public class DiskStackTest {

	@Test
	public void test() {
		DiskStack stack = new DiskStack(6);
		assertTrue(stack.isEmpty());
		stack.push(3);
		stack.push(13);
		stack.push(9);
		stack.push(4);
		stack.push(8);
		stack.push(17);
		assertTrue(stack.isFull());
		
		assertEquals(17, stack.peek());
		
		stack.pop();
		assertEquals(8, stack.peek());
		
	}

}
