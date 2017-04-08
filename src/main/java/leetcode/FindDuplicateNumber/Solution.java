package leetcode.FindDuplicateNumber;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by daisyli on 2017/4/8.
 * Given an array nums containing n+1 integers where each integer is between 1 and n(inclusive),
 * prove that at least one duplicate number must exist.
 * Assume that there is only one duplicate number, find the duplicate one.
 */
public class Solution {
    public int findDuplicate(int[] nums) {
        if (nums == null || nums.length == 0 || nums.length == 1) {
            throw new RuntimeException("wrong input");
        }
        if (nums.length == 2) {
            return nums[0];
        }

        int[] extra = new int[nums.length];

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            Integer count = map.get(nums[i]);
            if (count != null) {
                return nums[i];
            } else {
                map.put(nums[i], 1);
            }
        }

        throw new RuntimeException("wrong input");

    }

}
