package leetcode.SingleElementinaSortedArray;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by daisyli on 2017/4/8.
 * Given a sorted array consisting of only integers where every element appears twice except for one element which appears once.
 * Find this single element that appears only once.
 */
public class Solution {
    public int singleNonDuplicate(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new RuntimeException("wrong array");
        }

        if (nums.length == 1) {
            return nums[0];
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.get(num) != null) {
                map.remove(num);
            } else {
                map.put(num, 1);
            }
        }

        Iterator<Integer> it = map.keySet().iterator();
        return it.next();

    }
}
