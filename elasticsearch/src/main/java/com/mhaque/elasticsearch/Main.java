/**
 * Created by @authoer haquem on Dec 23, 2019 
 */
package com.mhaque.elasticsearch;



import java.net.InetAddress;
import java.net.UnknownHostException;

import org.elasticsearch.action.admin.indices.create.CreateIndexRequestBuilder;
import org.elasticsearch.action.admin.indices.create.CreateIndexResponse;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
/**
 * @author haquem
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		Client client = new PreBuiltTransportClient(
				  Settings.builder().put("client.transport.sniff", true)
				                    .put("cluster.name","elasticsearch").build()) 
				  .addTransportAddress(new TransportAddress(InetAddress.getByName("127.0.0.1"), 9300));
		
		String jsonObject = "{\"age\":10,\"dateOfBirth\":1471466076564,"
			      +"\"fullName\":\"John Doe\"}";
			    IndexResponse response = client.prepareIndex("test1", "Doe")
			      .setSource(jsonObject, XContentType.JSON).get();
			       
			    String id = response.getId();
			    String index = response.getIndex();
			    String type = response.getType();
			    long version = response.getVersion();
			    System.out.println(index);
			    System.out.println(type);
			    System.out.println(version);
			    System.out.println(id);
//			        
//			    assertEquals(Result.CREATED, response.getResult());
//			    assertEquals(0, version);
//			    assertEquals("people", index);
//			    assertEquals("Doe", type);

	}

}
