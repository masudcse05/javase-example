/**
 * Created by @authoer haquem on Mar 1, 2020 
 */
package com.mhaque.designpattern.chainofresp.purchasepower;

/**
 * @author haquem
 *
 */
public class VPPurchasePower extends PurchasePower{

	@Override
	public String getRole() {
		return "VP";
	}

	@Override
	public double getAllowable() {
		return BASE*10;
	}

}
