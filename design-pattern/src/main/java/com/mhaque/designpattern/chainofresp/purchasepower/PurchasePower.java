/**
 * Created by @authoer haquem on Mar 1, 2020 
 */
package com.mhaque.designpattern.chainofresp.purchasepower;

/**
 * @author haquem
 *
 */
public abstract class PurchasePower {
	public static final double BASE=1000;
    public abstract String getRole();
    public abstract double getAllowable();
    
    private PurchasePower successor;

    public PurchasePower getSuccessor() {
		return successor;
	}

	public void setSuccessor(PurchasePower successor) {
		this.successor = successor;
	}
    
	public void processRequest(PurchaseRequest purchaseRequest) {
		if(purchaseRequest.getAmount()< getAllowable()) {
			  System.out.println(this.getRole() + " will aprove $" + purchaseRequest.getAmount());
		}
		else if(successor!=null) {
			successor.processRequest(purchaseRequest);
		}
	}
    
}
