package com.mhaque.camel.file;

import org.apache.camel.CamelContext;
import org.apache.camel.ConsumerTemplate;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

public class ProdConsumeExample {
	public static void main(String[] args) throws Exception {
		CamelContext context = new DefaultCamelContext();
		context.addRoutes(new RouteBuilder() {
			
			@Override
			public void configure() throws Exception {
				from("direct:start")
				.process(new Processor() {
					
					public void process(Exchange exchange) throws Exception {
						System.out.println("I am a processor");
						String input =  exchange.getIn().getBody(String.class);
						input+= "world";
						exchange.getMessage().setBody(input);
					}
				})
				.to("seda:end");
			}
		});
        context.start();
        
        
        ProducerTemplate producerTemplate = context.createProducerTemplate();
        producerTemplate.sendBody("direct:start", "Hello ");
        
        ConsumerTemplate consumerTemplate = context.createConsumerTemplate();
        String msg = consumerTemplate.receiveBody("seda:end", String.class);
        System.out.println(msg);
        
	}
}
