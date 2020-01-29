package com.mhaque.javase.lambda;

/**
 * Created by Masud on 5/4/14.
 */
public interface Carriage {
    public default String rock() {
        return "... from side to side";
    }
}
