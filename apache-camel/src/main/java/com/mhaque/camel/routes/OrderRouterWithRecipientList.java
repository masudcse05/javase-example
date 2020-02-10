package com.mhaque.camel.routes;

import java.io.File;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;

public class OrderRouterWithRecipientList extends RouteBuilder {

	@Override
	public void configure() throws Exception {
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
		
//		from("file:data?noop=true").to("jms:xmlOrders");
//		from("jms:incomingOrder").process(new Processor() {
//
//			@Override
//			public void process(Exchange exchange) throws Exception {
//				Object input = exchange.getIn().getBody();
//				if (input instanceof File) {
//					File file = (File) input;
//
//					System.out.println(file.getName());
//				}
//				System.out.println(input.getClass());
//			}
//		});

		from("jms:xmlOrders").setHeader("customer", xpath("/order/@customer")).process(new Processor() {
			public void process(Exchange exchange) throws Exception {
				String recipients = "jms:accounting";
				String customer = exchange.getIn().getHeader("customer", String.class);
				if (customer.equals("honda")) {
					recipients += ",jms:production";
				}
				exchange.getIn().setHeader("recipients", recipients);
			}
		}).recipientList(header("recipients"));

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
