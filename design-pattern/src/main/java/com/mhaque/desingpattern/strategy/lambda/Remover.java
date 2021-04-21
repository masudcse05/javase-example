package com.mhaque.desingpattern.strategy.lambda;

public class Remover {
     public static String remove(String str, RemoveStrategy strategy) {
    	 return strategy.execute(str);
     }
}
