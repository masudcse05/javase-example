package com.mhaque.designpattern.adapter;

import static org.junit.Assert.*;

import org.junit.Test;

public class AdapterDemoTest {

	@Test
	public void test() {
		 Android android = new Android();
	        Iphone iPhone = new Iphone();

	        System.out.println("Recharging android with MicroUsb");
	        AdapterDemo.rechargeMicroUsbPhone(android);

	        System.out.println("Recharging iPhone with Lightning");
	        AdapterDemo.rechargeLightningPhone(iPhone);

	        System.out.println("Recharging iPhone with MicroUsb");
	        AdapterDemo.rechargeMicroUsbPhone(new LightningToMicroUsbAdapter(iPhone));

	}

}
