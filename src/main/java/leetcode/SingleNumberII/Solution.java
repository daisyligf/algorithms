package leetcode.SingleNumberII;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by daisyli on 2017/4/8.
 * Given an array of integers, every element appears three times except for one, which appears exactly once.
 * Find that single one.
 * Note:
 * Your algorithm shold have a linear runtime complexity.
 * Could you implement it without using extra memory?
 *
 */
public class Solution {

    public static int singleNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new RuntimeException("wrong input");
        }

        if (nums.length == 1) {
            return nums[0];
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i < nums.length; i++) {
            Integer count = map.get(nums[i]);
            if (count == null) {
                map.put(nums[i], 1);
            } else {
                count++;
                map.put(nums[i], count);
            }

            if (count != null && count == 3) {
                map.remove(nums[i]);
            }


        }
        Iterator<Integer> it = map.keySet().iterator();
        return it.next();
    }

    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 2};
        System.out.println(Solution.singleNumber(nums));
    }
}
