package leetcode.Subsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by daisyli on 2017/4/8.
 * Given a set of distinct integers, nums, return all possible subsets.
 * Note:The solution set must not contain duplicate subsets.
 */
public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        if (nums == null)
            return null;

        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<List<Integer>>();

        for (int i = 0; i < nums.length; i++) {
            List<List<Integer>> temp = new ArrayList<List<Integer>>();

            //get sets that are already in result
            for (List<Integer> a : result) {
                temp.add(new ArrayList<Integer>(a));
            }

            //add S[i] to existing sets
            for (List<Integer> a : temp) {
                a.add(nums[i]);
            }

            //add S[i] only as a set
            ArrayList<Integer> single = new ArrayList<Integer>();
            single.add(nums[i]);
            temp.add(single);

            result.addAll(temp);
        }

        //add empty set
        result.add(new ArrayList<Integer>());
        return result;


    }
}
