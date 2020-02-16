/**
 * Created by @authoer haquem on Feb 15, 2020 
 */
package com.mhaque.hackerrank.implementation;

/**
 * @author haquem
 *
 */
public class ElectronicsShop {
	static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int maxMoney =0;
        for(int i =0 ; i< keyboards.length; i++) {
        	for(int j=0; j< drives.length; j++) {
        		int cost = keyboards[i]+ drives[j];
        		if(maxMoney < cost && cost <= b) {
        			maxMoney = cost;
        		}
        	}
        }
        return maxMoney == 0? -1: maxMoney;
    }
}
