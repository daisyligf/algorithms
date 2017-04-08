package leetcode.SingleNumber;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by daisyli on 2017/4/6.
 */
public class Solution {
    public int singleNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new RuntimeException("error");
        }

        if (nums.length == 1) {
            return nums[0];
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int m : nums) {
            Integer count = map.get(m);
            if (count != null) {
                map.remove(m);
            } else {
                map.put(m, 1);
            }
        }
        Iterator<Integer> it = map.keySet().iterator();
        return it.next();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {2,2, 3,3, 5,6,6, 4,4};
        System.out.println(s.singleNumber(nums));
    }
}
