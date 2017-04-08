package leetcode.MissingNumber;

/**
 * Created by daisyli on 2017/4/8.
 * Given an array containing n distinct numbers taken from 0,1,2,...,n,find the one that is missing from the array.
 *
 * Note:
 * Your algorithm should run in linear runtime complexity.
 * Could you implement it using only constant extra space complexity?
 */
public class Solution {
    public int missingNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new RuntimeException("wrong input!");
        }
        int[] res = new int[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {
            res[nums[i]] = 1;
        }

        for (int i = 0; i < res.length; i++) {
            if (res[i] == 0) {
                return i;
            }
        }

        throw new RuntimeException("wrong input!");
    }
}
