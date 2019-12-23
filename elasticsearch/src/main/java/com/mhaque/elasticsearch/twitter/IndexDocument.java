/**
 * Created by @authoer haquem on Dec 23, 2019 
 */
package com.mhaque.elasticsearch.twitter;

import java.net.InetAddress;
import java.util.Date;

import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import static org.elasticsearch.common.xcontent.XContentFactory.*;

/**
 * @author haquem
 *
 */
public class IndexDocument {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// on startup

		TransportClient client = new PreBuiltTransportClient(Settings.EMPTY)
		        .addTransportAddress(new TransportAddress(InetAddress.getByName("localhost"), 9300));

		// on shutdown

		IndexResponse response = client.prepareIndex("twitter", "_doc", "1")
		        .setSource(jsonBuilder()
		                    .startObject()
		                        .field("user", "kimchy")
		                        .field("postDate", new Date())
		                        .field("message", "trying out Elasticsearch")
		                    .endObject()
		                  )
		        .get();
		client.close();

	}

}
