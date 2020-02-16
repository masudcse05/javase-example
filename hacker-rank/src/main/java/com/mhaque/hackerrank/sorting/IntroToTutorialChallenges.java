/**
 * Created by @authoer haquem on Feb 16, 2020 
 */
package com.mhaque.hackerrank.sorting;

import java.util.Arrays;

/**
 * @author haquem
 *
 */
public class IntroToTutorialChallenges {
	 static int introTutorial(int V, int[] arr) {
         return Arrays.binarySearch(arr, V);
      }
}
