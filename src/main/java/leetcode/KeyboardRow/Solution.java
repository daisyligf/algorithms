package leetcode.KeyboardRow;

import java.util.*;

/**
 * Created by daisyli on 2017/4/1.
 * Given a List of words, return the words that can be typed using letters of alphabet on only one row's of American keyboard like the image below.
 */
public class Solution {

    private static Set<Character> set1 = new HashSet<>();
    private static Set<Character> set2 = new HashSet<>();
    private static Set<Character> set3 = new HashSet<>();
    static {
        init();
    }
    public String[] findWords(String[] words) {
        List<String> result = new ArrayList<String>();
        if (words == null || words.length == 0) {
            return (String[])result.toArray(new String[0]);
        }
        for (String word : words) {
            boolean firstRow = false;
            boolean secondRow = false;
            boolean thirdRow = false;
            String word_upper = word.toUpperCase();
            for (int i = 0; i < word_upper.length(); i++) {
                char ch = word_upper.charAt(i);
                if(set1.contains(ch)) {
                    firstRow = true;
                }

                if (set2.contains(ch)) {
                    secondRow = true;
                }

                if (set3.contains(ch)) {
                    thirdRow = true;
                }

                if (firstRow && secondRow) {
                    break;
                }

                if (firstRow && thirdRow) {
                    break;
                }

                if (secondRow && thirdRow) {
                    break;
                }
            }
            if ((firstRow && !secondRow && !thirdRow) || (!firstRow && secondRow && !thirdRow) || (!firstRow && !secondRow && thirdRow)) {
                result.add(word);
            }



        }
        return (String[])result.toArray(new String[result.size()]);

    }

    public static void init() {
        set1.add('Q');
        set1.add('W');
        set1.add('E');
        set1.add('R');
        set1.add('T');
        set1.add('Y');
        set1.add('U');
        set1.add('I');
        set1.add('O');
        set1.add('P');

        set2.add('A');
        set2.add('S');
        set2.add('D');
        set2.add('F');
        set2.add('G');
        set2.add('H');
        set2.add('J');
        set2.add('K');
        set2.add('L');

        set3.add('Z');
        set3.add('X');
        set3.add('C');
        set3.add('V');
        set3.add('B');
        set3.add('N');
        set3.add('M');

    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] words = {"Hello", "Alaska", "Dad", "Peace", "oper", "friend"};
        words = solution.findWords(words);
        for (String word: words) {
            System.out.println(word);
        }

    }
}
