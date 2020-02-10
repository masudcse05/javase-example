package com.mhaque.camel.file;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.jms.ConnectionFactory;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jms.JmsComponent;
import org.apache.camel.impl.DefaultCamelContext;

public class OrderRouterWithParallelMulticast {
	public static void main(String args[]) throws Exception {
        // create CamelContext
        CamelContext context = new DefaultCamelContext();
		ConnectionFactory connectionFactory = new ActiveMQConnectionFactory();
		context.addComponent("jms", JmsComponent.jmsComponentAutoAcknowledge(connectionFactory)); 

        // add our route to the CamelContext
        context.addRoutes(new RouteBuilder() {
            @Override
            public void configure() {
                // load file orders from src/data into the JMS queue
                from("file:data?noop=true").to("jms:incomingOrders");
        
                // content-based router
                from("jms:incomingOrders")
                .choice()
                    .when(header("CamelFileName").endsWith(".xml"))
                        .to("jms:xmlOrders")  
                    .when(header("CamelFileName").regex("^.*(csv|csl)$"))
                        .to("jms:csvOrders")
                    .otherwise()
                        .to("jms:badOrders");        
                
                ExecutorService executor = Executors.newFixedThreadPool(16);
                
                from("jms:xmlOrders")
                    .multicast().parallelProcessing().executorService(executor)
                    .to("jms:accounting", "jms:production");
                
                // test that our route is working
                from("jms:accounting").process(new Processor() {
                    public void process(Exchange exchange) throws Exception {
                        System.out.println("Accounting received order: " 
                                + exchange.getIn().getHeader("CamelFileName"));   
                    }
                });                
                from("jms:production").process(new Processor() {
                    public void process(Exchange exchange) throws Exception {
                        System.out.println("Production received order: " 
                                + exchange.getIn().getHeader("CamelFileName"));   
                    }
                });
            }
        });

        while(true) {
			context.start();
		}
    }
}
