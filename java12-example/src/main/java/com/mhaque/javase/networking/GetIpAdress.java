/**
 * Created by @authoer haquem on Dec 24, 2019 
 */
package com.mhaque.javase.networking;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author haquem
 *
 */
public class GetIpAdress {

	/**
	 * @param args
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException {
		// print the IP Address of your machine (inside your local network)
        System.out.println(InetAddress.getLocalHost().getHostAddress());

        // print the IP Address of a web site
        System.out.println(InetAddress.getByName("www.javacodegeeks.com"));

        // print all the IP Addresses that are assigned to a certain domain
        InetAddress[] inetAddresses = InetAddress.getAllByName("www.google.com");

        for (InetAddress ipAddress : inetAddresses) {
            System.out.println(ipAddress);
        }
	}

}
