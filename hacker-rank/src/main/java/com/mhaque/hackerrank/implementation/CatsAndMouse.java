/**
 * Created by @authoer haquem on Feb 11, 2020 
 */
package com.mhaque.hackerrank.implementation;

/**
 * @author haquem
 *
 */
public class CatsAndMouse {
	static String catAndMouse(int x, int y, int z) {
        int catADistance = Math.abs(z-x);
        int catBDistance = Math.abs(z-y);
        if(catADistance> catBDistance) {
        	return "Cat A";
        }
        else if(catADistance < catBDistance) {
        	return "Cat B";
        }
        else {
        	return "Mouse C";
        }
    }
}
