package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #557: Reverse Words in a String III
 * @see <a href="https://leetcode.com/problems/reverse-words-in-a-string-iii/">Problem</a>
 */
public class ReverseWordsInAStringIii {

    /**
     * LeetCode #557 – Reverse Words in a String III
     * Difficulty: EASY
     * Topics: Two Pointers, String
     *
     * Given a string s, reverse the order of characters in each word within a
     * sentence while still preserving whitespace and initial word order.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: s = "Let's take LeetCode contest"
     * Output: "s'teL ekat edoCteeL tsetnoc"
     * 
     * Example 2:
     * 
     * Input: s = "Mr Ding"
     * Output: "rM gniD"
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= s.length &lt;= 5 * 104
     * 
     * s contains printable ASCII characters.
     * 
     * s does not contain any leading or trailing spaces.
     * 
     * There is at least one word in s.
     * 
     * All the words in s are separated by a single space.
      *
      * <p><b>Explanation:</b> Uses StringBuilder for O(1) amortized character appends, avoiding O(n^2) String concatenation.</p>
      */
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        for (String word : s.split(" ")) {
            result.append(new StringBuilder(word).reverse()).append(" ");
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        ReverseWordsInAStringIii sol = new ReverseWordsInAStringIii();
        System.out.println(sol.reverseWords("hello"));
    }
}
