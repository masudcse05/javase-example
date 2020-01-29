package com.mhaque.javase.lambda;

interface Sayable{  
    void say();  
}
public class MethodReference {
	public MethodReference(){  
	        System.out.println("Hello, this is constructor.");  
	}
    public static void main(String[] args) {
    	Sayable s = MethodReference::new;
    	s.say();
	}
}
