/**
 * Created by @authoer haquem on Mar 1, 2020 
 */
package com.mhaque.decorator.starbuzz;

import static org.junit.Assert.*;

import org.junit.Test;

import com.mhaque.designpattern.decorator.starbuzz.Beverage;
import com.mhaque.designpattern.decorator.starbuzz.HouseBlend;
import com.mhaque.designpattern.decorator.starbuzz.Mocha;
import com.mhaque.designpattern.decorator.starbuzz.Soy;

/**
 * @author haquem
 *
 */
public class HouseBlendTest {

	@Test
	public void test() {
		Beverage houseBlend = new HouseBlend();
		houseBlend = new Soy(houseBlend);
		houseBlend = new Mocha(houseBlend);
		assertEquals(1.24, houseBlend.cost(), 0.01);
	}

}
