/**
 * Created by @authoer haquem on Feb 17, 2020 
 */
package com.mhaque.hackerrank.implementation;

/**
 * @author haquem
 *
 */
public class AngryProfessor {
	 static String angryProfessor(int k, int[] arr) {
		 boolean isCancelled= false;
		 int presenceStudents = 0;
		 for(int a : arr) {
			 if(a<=0) {
				 presenceStudents++;
			 }
		 }
		 isCancelled = presenceStudents>=k;
		 return isCancelled ? "YES": "NO";
     }
}
