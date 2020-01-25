package com.mhaque.hackerrank.implementation;

public class Kangaroo {
	static String kangaroo(int x1, int v1, int x2, int v2) {
       String result ="NO";
       int first=x1, second = x2;
       if(v1==v2 && x1 !=x2) {
    	   return result;
       }
       while(true) {
    	   first +=v1;
    	   second+=v2;
    	   if(first== second) {
    		   result= "YES";
    		   break;
    	   }
    	   else if((v1> v2 && first> second) || (v2> v1 && second> first)  ) {
    		   break;
    	   }
       }
       return result;
    }
}
