package com.mhaque.javase.interfaces;
import java.util.Arrays;

public class Application{

    public static void main(String...args){
        BasicList<String> printingList = new PrintingList<>();
        Utils.process(printingList);
    }

}

