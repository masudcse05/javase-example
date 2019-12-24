/**
 * Created by @authoer haquem on Dec 24, 2019 
 */
package com.mhaque.javase.networking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * @author haquem
 *
 */
public class WhatIsMyIp {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		URL url = new URL("http://bot.whatismyipaddress.com");
		BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
		String line = null;
		while ((line = reader.readLine()) != null) {
			System.out.println(line);
		}
	}

}
