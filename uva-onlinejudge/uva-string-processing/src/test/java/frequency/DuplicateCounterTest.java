package frequency;

import static org.junit.Assert.*;

import org.junit.Test;

public class DuplicateCounterTest {

	@Test
	public void testCountDuplicate() {
		assertEquals(2, DuplicateCounter.countDuplicate("aabb"));
	}

}
