package com.mhaque.camel.routes;

import javax.jms.ConnectionFactory;

import org.apache.activemq.spring.ActiveMQConnectionFactory;
import org.apache.camel.CamelContext;
import org.apache.camel.component.jms.JmsComponent;
import org.apache.camel.impl.DefaultCamelContext;

public class Main {

	public static void main(String[] args) throws Exception {
		ConnectionFactory connectionFactory = new ActiveMQConnectionFactory();  
		CamelContext context = new DefaultCamelContext();
		context.addComponent("jms", JmsComponent.jmsComponentAutoAcknowledge(connectionFactory));  
		context.addRoutes(new OrderRouterWithRecipientList());
		
		 while(true) {
				context.start();
		}

	}

}
