/**
 * Created by @authoer haquem on Dec 24, 2019 
 */
package com.mhaque.javase.networking;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

/**
 * @author haquem
 *
 */
public class NetworkInterfaceIps {

	/**
	 * @param args
	 * @throws SocketException 
	 */
	public static void main(String[] args) throws SocketException {
		for (final Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces(); interfaces
				.hasMoreElements();) {
			final NetworkInterface cur = interfaces.nextElement();

			if (cur.isLoopback()) {
				continue;
			}

			System.out.println("interface " + cur.getName());

			for (final InterfaceAddress addr : cur.getInterfaceAddresses()) {
				final InetAddress inet_addr = addr.getAddress();

				if (!(inet_addr instanceof Inet4Address)) {
					continue;
				}

				System.out.println("  address: " + inet_addr.getHostAddress() + "/" + addr.getNetworkPrefixLength());

				System.out.println("  broadcast address: " + addr.getBroadcast().getHostAddress());
			}
		}

	}

}
