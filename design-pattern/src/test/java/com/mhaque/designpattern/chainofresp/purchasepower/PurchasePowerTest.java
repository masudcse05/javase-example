/**
 * Created by @authoer haquem on Mar 1, 2020 
 */
package com.mhaque.designpattern.chainofresp.purchasepower;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author haquem
 *
 */
public class PurchasePowerTest {

	@Test
	public void test() {
		CEOPurchasePower ceoPP= new CEOPurchasePower();
		
		VPPurchasePower vpPP= new VPPurchasePower();
		vpPP.setSuccessor(ceoPP);
		
		ManagerPurchasePower managerPP= new ManagerPurchasePower();
		managerPP.setSuccessor(vpPP);
		
		managerPP.processRequest(new PurchaseRequest(500, "Travel"));
		managerPP.processRequest(new PurchaseRequest(3500, "Laptop"));
		managerPP.processRequest(new PurchaseRequest(35000, "Office"));
	}

}
