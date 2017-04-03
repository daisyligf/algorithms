package leetcode.HammingDistance;

/**
 * Created by daisyli on 2017/4/1.
 * The Hamming Distance between two integers is the number of positions at which the corresponding bits are different.
 */
public class Solution {
    public static int hammingDistance(int x, int y) {

        String z = Integer.toBinaryString(x ^ y);
        int diff = 0;
        for (int i = 0; i < z.length(); i++) {
            if (z.charAt(i) == '1') {
                diff++;
            }
        }
        return diff;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Solution.hammingDistance(1, 4));
    }
}
