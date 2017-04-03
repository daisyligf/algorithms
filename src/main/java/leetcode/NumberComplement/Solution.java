package leetcode.NumberComplement;

/**
 * Created by daisyli on 2017/4/1.
 * Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.
 */
public class Solution {
    public int findComplement(int num) {
        int count = Integer.toBinaryString(num).length();
        String num_bin_string = Integer.toBinaryString(~num);
        System.out.println("num_bin_string:" + num_bin_string + ", count:" + count);
        return Integer.parseInt(num_bin_string.substring(32 - count), 2);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findComplement(4));
    }
}
