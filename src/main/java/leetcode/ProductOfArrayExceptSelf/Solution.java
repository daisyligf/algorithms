package leetcode.ProductOfArrayExceptSelf;

/**
 * Created by daisyli on 2017/3/31.
 */
public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int[] frontwd = new int[n];
        int[] behindwd = new int[n];
        frontwd[0] = 1;
        behindwd[n - 1] = 1;
        for (int i = 1; i < n; ++i) {
            frontwd[i] = frontwd[i - 1] * nums[i - 1];
        }
        for (int i = n - 2; i >= 0; --i) {
            behindwd[i] = behindwd[i + 1] * nums[i + 1];
        }
        for (int i = 0; i < n; ++i) {
            res[i] = frontwd[i] * behindwd[i];
        }
        return res;
    }




}
