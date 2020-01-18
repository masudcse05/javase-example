package com.mhaque.hackerrank.strings;

public class StrongPassword {
	static String numbers = "0123456789";
	static String lower_case = "abcdefghijklmnopqrstuvwxyz";
	static String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	static String special_characters = "!@#$%^&*()-+";
	
    static int minimumNumber(int n, String password) {
        int number = 0;
        boolean hasNumber = false, hasLower=false, hasUpper = false, hasSpec = false;
        for(int i=0; i< n; i++) {
        	char ch = password.charAt(i);
        	if(numbers.indexOf(ch)!= -1 && !hasNumber) {
        		hasNumber=true;
        		number++;
        	}
        	if( lower_case.indexOf(ch)!= -1 && !hasLower) {
        		hasLower =true;
        		number++;
        	}
        	if(upper_case.indexOf(ch) != -1 && !hasUpper) {
        		hasUpper = true;
        		number++;
        	}
        	if(special_characters.indexOf(ch) != -1 && !hasSpec) {
        		hasSpec = true;
        		number++;
        	}
        }
        if(n>= 6 && number==4) {
            return 0;
        }
        else if(n <6 && number==4) {
            return 6 -n;
        }
        else if(n>= 6 && number<4) {
            return 4-number;
        }
        else {
            return 6 - n;
        }
    }
}
