package com.mhaque.camel.file;


import javax.jms.ConnectionFactory;

import org.apache.activemq.spring.ActiveMQConnectionFactory;
import org.apache.camel.CamelContext;
import org.apache.camel.Component;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jms.JmsComponent;
import org.apache.camel.impl.DefaultCamelContext;

public class SendMessageToActiveMq {

	public static void main(String[] args) throws Exception { 
		ConnectionFactory connectionFactory = new ActiveMQConnectionFactory();  
		CamelContext context = new DefaultCamelContext();
		context.addComponent("jms", JmsComponent.jmsComponentAutoAcknowledge(connectionFactory));  
		context.addRoutes(new RouteBuilder() {

			@Override
			public void configure() throws Exception {
				from("file:from_input")
				.to("activemq:queue:camel_example");
				 
			}
			
		});
		
		while(true) {
			context.start();
		}
	}
}
