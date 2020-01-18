package com.mhaque.algorithm.dp;

public class BinPacking {
	protected static int bestFit(int[] elements, int capcity) {
    	 int res=0;
    	 int[] binRem = new int[elements.length];
    	 for(int i=0; i< elements.length; i++) {
    		 int min = capcity+1, bi =0;
    		
    	 }
    	 return res;
     }

	protected static int nextFit(int weight[], int c) {

		// Initialize result (Count of bins) and remaining
		// capacity in current bin.
		int res = 0, binRem = c;

		// Place items one by one
		for (int i = 0; i < weight.length; i++) {
			// If this item can't fit in current bin
			if (weight[i] > binRem) {
				res++; // Use a new bin
				binRem = c - weight[i];
			} else {
				binRem -= weight[i];
			}
		}
		return res;
	}
	
	static int firstFit(Integer weight[], int n, int c) 
	{ 
	    // Initialize result (Count of bins) 
	    int res = 0; 
	  
	    // Create an array to store remaining space in bins 
	    // there can be at most n bins 
	    int bin_rem[] = new int[n]; 
	  
	    // Place items one by one 
	    for (int i = 0; i < n; i++) { 
	        // Find the first bin that can accommodate 
	        // weight[i] 
	        int j; 
	        for (j = 0; j < res; j++) { 
	            if (bin_rem[j] >= weight[i]) { 
	                bin_rem[j] = bin_rem[j] - weight[i]; 
	                break; 
	            } 
	        } 
	  
	        // If no bin could accommodate weight[i] 
	        if (j == res) { 
	            bin_rem[res] = c - weight[i]; 
	            res++; 
	        } 
	    } 
	    return res; 
	} 
}
