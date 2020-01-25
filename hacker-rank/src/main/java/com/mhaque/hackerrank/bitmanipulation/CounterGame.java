/**
 * Created by @authoer haquem on Jan 20, 2020 
 */
package com.mhaque.hackerrank.bitmanipulation;

/**
 * @author haquem
 *
 */
public class CounterGame {
	 static String counterGame(long n) {
       boolean louseWin = (Long.bitCount(n-1) & 1)!=0;
       return louseWin ? "Louise" : "Richard";
	 }
}
