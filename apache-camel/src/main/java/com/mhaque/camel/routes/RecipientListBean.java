package com.mhaque.camel.routes;

import org.apache.camel.RecipientList;
import org.apache.camel.language.xpath.XPath; 

public class RecipientListBean {
	@RecipientList
    public String[] route(@XPath("/order/@customer") String customer) {
        if (isGoldCustomer(customer)) {
            return new String[] {"jms:accounting", "jms:production"};
        } else {
            return new String[] {"jms:accounting"};
        }
    }

    private boolean isGoldCustomer(String customer) {
        return customer.equals("honda");
    }
}