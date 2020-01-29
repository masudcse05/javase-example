package com.mhaque.javase.interfaces;

public interface Sized{
    public int size();
    public default boolean isEmpty() { 
        return size() == 0; 
    }
}

