package leetcode.TwoSum;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by daisyli on 2017/4/8.
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly on solution, and you may not use the same element twice.
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        if (nums == null || nums.length == 0) {
            return result;
        }

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (map.containsKey(temp)) {
                result[0] = map.get(temp);
                result[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}
