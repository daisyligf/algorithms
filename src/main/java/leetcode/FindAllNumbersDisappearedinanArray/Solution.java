package leetcode.FindAllNumbersDisappearedinanArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by daisyli on 2017/4/7.
 *
 */
public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<Integer>();
        if (nums == null || nums.length == 0) {
            return res;
        }

        int[] num = new int[nums.length];
        Arrays.fill(num, -1);
        for (int i = 0; i < nums.length; i++) {
            num[nums[i]-1] = nums[i];
        }

        for (int i = 0; i < num.length; i++) {
            if (num[i] < 0) {
                res.add(i + 1);
            }
        }
        return res;

    }
}
