/**
 * Created by @authoer haquem on Dec 20, 2019 
 */
package com.mhaque.datastructure.array;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author haquem
 *
 */
public class DynamicArrayTest {

	/**
	 * Test method for {@link com.mhaque.datastructure.array.DynamicArray#getSize()}.
	 */
	@Test
	public void testGetSize() {
		DynamicArray<Integer> array = new DynamicArray<>();
		assertEquals(1, array.getSize());
		array.put(11);
		array.put(11);

		assertEquals(2, array.getSize());
	}

}
