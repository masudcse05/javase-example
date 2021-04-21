package com.mhaque.desingpattern.strategy.lambda;

@FunctionalInterface
public interface RemoveStrategy {
	String execute(String str);
}
