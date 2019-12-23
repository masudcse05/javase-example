/**
 * Created by @authoer haquem on Dec 23, 2019 
 */
package com.mhaque.elasticsearch;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;

/**
 * @author haquem
 *
 */
public class GetResponseDemo {

	/**
	 * @param args
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException {
		Client client = new PreBuiltTransportClient(
				  Settings.builder().put("client.transport.sniff", true)
				                    .put("cluster.name","elasticsearch").build()) 
				  .addTransportAddress(new TransportAddress(InetAddress.getByName("127.0.0.1"), 9300));
		
		GetResponse response = client.prepareGet("test1",null, "84SDNG8BCNI9nQ4iWDXN").get();
		String age = (String) response.getField("age").getValue();
		System.out.println(age);
		// Process other fields
//		DeleteResponse response = client.prepareDelete("people", "Doe", "5")
//		  .get();

	}

}
