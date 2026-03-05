package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * LeetCode #500: Keyboard Row
 * @see <a href="https://leetcode.com/problems/keyboard-row/">Problem</a>
 */
public class KeyboardRow {

    /**
     * LeetCode #500 – Keyboard Row
     * Difficulty: EASY
     * Topics: Array, Hash Table, String
     *
     * Given an array of strings words, return the words that can be typed using
     * letters of the alphabet on only one row of American keyboard like the image
     * below.
     * 
     * 
     * Note that the strings are case-insensitive, both lowercased and uppercased
     * of the same letter are treated as if they are at the same row.
     * 
     * 
     * In the American keyboard:
     * 
     * 
     * the first row consists of the characters "qwertyuiop",
     * 
     * the second row consists of the characters "asdfghjkl", and
     * 
     * the third row consists of the characters "zxcvbnm".
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: words = ["Hello","Alaska","Dad","Peace"]
     * 
     * 
     * Output: ["Alaska","Dad"]
     * 
     * 
     * Explanation:
     * 
     * 
     * Both "a" and "A" are in the 2nd row of the American keyboard due to case
     * insensitivity.
     * 
     * Example 2:
     * 
     * Input: words = ["omk"]
     * 
     * 
     * Output: []
     * 
     * Example 3:
     * 
     * Input: words = ["adsdf","sfd"]
     * 
     * 
     * Output: ["adsdf","sfd"]
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= words.length &lt;= 20
     * 
     * 1 &lt;= words[i].length &lt;= 100
     * 
     * words[i] consists of English letters (both lowercase and uppercase).
      *
      * <p><b>Explanation:</b> Searches through the input, returning the first element or index satisfying the target condition.</p>
      */
    public String[] findWords(String[] words) {
        String[] rows = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        List<String> result = new ArrayList<>();
        for (String word : words) {
            for (String row : rows) {
                boolean ok = true;
                for (char c : word.toLowerCase().toCharArray())
                    if (row.indexOf(c) == -1) { ok = false; break; }
                if (ok) { result.add(word); break; }
            }
        }
        return result.toArray(new String[0]);
    }

    public static void main(String[] args) {
        KeyboardRow sol = new KeyboardRow();
        System.out.println(sol.findWords(new String[]{"a","b","c"}));
    }
}
