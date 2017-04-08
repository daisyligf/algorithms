package leetcode.DivideTwoIntegers;

/**
 * Created by daisyli on 2017/4/3.
 * Divide two integers without using multiplication, division and mod operator.
 */
public class Solution {
    public int divide(int dividend, int divisor) {
        if (divisor == 0) {
            return 0;
        }

        if (dividend > Integer.MAX_VALUE)  {
            return Integer.MAX_VALUE;
        }

        if (dividend < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }



        if (divisor == 1) {
            return dividend;
        }

        boolean inverse = false;

        if (dividend < 0) {
            if (divisor > 0) {
                inverse = true;
            }
        }

        if (divisor < 0) {
            if (dividend > 0) {
                inverse = true;
            }
        }

        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        int result = 0;
        while (dividend >= divisor) {
            dividend -= divisor;
            result++;
        }
        if (inverse) {
            return -result;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.divide(-2147483648, -1));
        System.out.println(s.divide(-2147483648, 1));
    }
}
