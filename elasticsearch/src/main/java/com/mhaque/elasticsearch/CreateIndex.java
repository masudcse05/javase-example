/**
 * Created by @authoer haquem on Dec 23, 2019 
 */
package com.mhaque.elasticsearch;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.elasticsearch.action.admin.indices.create.CreateIndexRequestBuilder;
import org.elasticsearch.action.admin.indices.create.CreateIndexResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;

/**
 * @author haquem
 *
 */
public class CreateIndex {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		Settings settings = Settings.builder()
		        .put("cluster.name", "elasticsearch").build();
		TransportClient client = new PreBuiltTransportClient(settings);
		client.addTransportAddress(new TransportAddress(InetAddress.getByName("localhost"), 9300));
	    CreateIndexRequestBuilder createIndexRequestBuilder = client.admin().indices().prepareCreate("test1");
	    CreateIndexResponse response = createIndexRequestBuilder.execute().actionGet();
	    System.out.println(response.isAcknowledged());  

	}

}
