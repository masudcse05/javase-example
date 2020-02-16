/**
 * Created by @authoer haquem on Feb 15, 2020 
 */
package com.mhaque.hackerrank.implementation;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author haquem
 *
 */
public class AppendAndDeleteTest {

	/**
	 * Test method for {@link com.mhaque.hackerrank.implementation.AppendAndDelete#appendAndDelete(java.lang.String, java.lang.String, int)}.
	 */
	@Test
	public void testAppendAndDelete() {
		
		assertEquals("No", AppendAndDelete.appendAndDelete("y", "yu", 2));
		assertEquals("Yes", AppendAndDelete.appendAndDelete("hackerhappy", "hackerrank", 9));
		
		assertEquals("Yes", AppendAndDelete.appendAndDelete("aba", "aba", 7));
		assertEquals("No", AppendAndDelete.appendAndDelete("ashley", "ash", 2));
		assertEquals("Yes", AppendAndDelete.appendAndDelete("aaaaaaaaaa", "aaaaa", 7));
		assertEquals("No", AppendAndDelete.appendAndDelete("asdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcv", "bsdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcvasdfqwertyuighjkzxcv", 100));
	}

}
