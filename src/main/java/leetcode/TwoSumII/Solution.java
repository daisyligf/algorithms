package leetcode.TwoSumII;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by daisyli on 2017/4/8.
 * Given an array of integers that is already sorted in ascending order,find two numbers such that they add up to a specific target number.
 * The function twoSum shold return indices of the two numbers such that they add up to the target, where index1 must be less than index2.
 * Please note that your returned answers (both index1 and index2) are not zero-based.
 * You may assume that each input would have exactly one solution and you may not use the same element twice.
 *
 */
public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];

        if (numbers == null || numbers.length == 0) {
            return result;
        }

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            int temp = target - numbers[i];
            if (map.containsKey(temp)) {
                result[0] = map.get(temp)+1;
                result[1] = i+1;
                break;
            }
            map.put(numbers[i], i);
        }
        return result;
    }
}
