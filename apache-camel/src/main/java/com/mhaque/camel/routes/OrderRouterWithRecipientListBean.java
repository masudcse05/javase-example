package com.mhaque.camel.routes;

import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jms.JmsComponent;
import org.apache.camel.impl.DefaultCamelContext;

public class OrderRouterWithRecipientListBean extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		// load file orders from src/data into the JMS queue
        from("file:src/data?noop=true").to("jms:incomingOrders");

        // content-based router
        from("jms:incomingOrders")
        .choice()
            .when(header("CamelFileName").endsWith(".xml"))
                .to("jms:xmlOrders")  
            .when(header("CamelFileName").regex("^.*(csv|csl)$"))
                .to("jms:csvOrders")
            .otherwise()
                .to("jms:badOrders");        
        
        from("jms:xmlOrders").bean(RecipientListBean.class);
        
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

}
