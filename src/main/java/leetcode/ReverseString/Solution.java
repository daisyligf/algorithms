package leetcode.ReverseString;

/**
 * Created by daisyli on 2017/4/1.
 */
public class Solution {
    public String reverseString(String s) {
        if (s == null || s.length() <= 0) {
            return "";
        }
        StringBuffer sb = new StringBuffer();
        for (int i = s.length() - 1; i > 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
