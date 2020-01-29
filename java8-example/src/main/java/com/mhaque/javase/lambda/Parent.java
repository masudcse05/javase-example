package com.mhaque.javase.lambda;

/**
 * Created by Masud on 5/4/14.
 */
public interface Parent {
    public void message(String body);

    public default void welcome() {
        message("Parent: Hi!");
    }

    public String getLastMessage();
}
