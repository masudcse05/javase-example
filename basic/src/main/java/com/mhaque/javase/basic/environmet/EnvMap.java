/**
 * Created by @authoer haquem on Dec 24, 2019 
 */
package com.mhaque.javase.basic.environmet;

import java.util.Map;

/**
 * @author haquem
 *
 */
public class EnvMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String, String> env = System.getenv();
        env.forEach((key, value) ->{
        	System.out.println(key + " = "+value);
        });
	}

}
