package com.mhaque.javase.lambda;

/**
 * Created by Masud on 5/4/14.
 */
public interface Jukebox {
    public default String rock() {
        return "... all over the world!";
    }
}
