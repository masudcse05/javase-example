package com.mhaque.hackerrank.datastructure;

public class Java1DArray {
	public static boolean canWin(int leap, int[] game) {
        boolean res =false;
        for(int i = leap; i< game.length; i++) {
        	if(game[i]== game[leap]) {
        		res = true;
        	}
        	else {
        		res = false;
        	}
        }
        return res;
    }
}
