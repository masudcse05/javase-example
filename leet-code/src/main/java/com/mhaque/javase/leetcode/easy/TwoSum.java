/**
 * Created by @authoer haquem on Jan 11, 2020 
 */
package com.mhaque.javase.leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author haquem
 *
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i< nums.length; i++) {
        	int complement = target - nums[i];
        	if(map.containsKey(complement)) {
        		return new int[] {map.get(complement), i};
        	}
        	map.put(nums[i], i);
        }
        throw new IllegalArgumentException();
    }
}
