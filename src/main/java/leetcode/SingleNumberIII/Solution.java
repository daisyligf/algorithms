package leetcode.SingleNumberIII;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by daisyli on 2017/4/8.
 * Given an array of numbers nums, in which exactly two elements appear only once and all the other elements appear exactly twice.
 * Find the two elements that appear only once.
 * For example:
 * Given nums = [1, 2, 1, 3, 2, 5], return [3, 5].
 * Note:
 * 1.The order of the result is not important. So in the above example, [5, 3] is also correct.
 * 2.Your algorithm should run in linear runtime complexity. Could you implement it using only constant space complexity?
 *
 *
 */
public class Solution {
    public int[] singleNumber(int[] nums) {
        int[] res = new int[2];
        if (nums == null || nums.length == 0) {
            return res;
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer count = map.get(nums[i]);
            if (count == null) {
                map.put(nums[i], 1);
            } else {
                map.remove(nums[i]);
            }
        }

        Iterator<Integer> it = map.keySet().iterator();
        res[0] = it.next();
        res[1] = it.next();
        return res;
    }
}
