/**
 * Created by @authoer haquem on Jan 11, 2020 
 */
package easy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author haquem
 *
 */
public class Acm10550Test {

	/**
	 * Test method for {@link easy.Acm10550#solution(int, int, int, int)}.
	 */
	@Test
	public void testSolution() {
		assertEquals(1350, Acm10550.solution(0,30,0,30));
		assertEquals(1350, Acm10550.solution(5,35,5,35));//5 35 5 35
	}

}
