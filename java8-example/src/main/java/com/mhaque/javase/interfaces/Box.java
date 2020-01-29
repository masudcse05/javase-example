package com.mhaque.javase.interfaces;
import java.util.Iterator;
public class Box<T> implements Sized, Foreachable<T>{

    public int size(){
        return 0;
    }

    public Iterator<T> iterator(){
        // TODO
        return null;
    }
} 
