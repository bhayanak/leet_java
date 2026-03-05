package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #647: Palindromic Substrings
 * @see <a href="https://leetcode.com/problems/palindromic-substrings/">Problem</a>
 */
public class PalindromicSubstrings {

    /**
     * LeetCode #647 – Palindromic Substrings
     * Difficulty: MEDIUM
     * Topics: Two Pointers, String, Dynamic Programming
     *
     * Given a string s, return the number of palindromic substrings in it.
     * 
     * 
     * A string is a palindrome when it reads the same backward as forward.
     * 
     * 
     * A substring is a contiguous sequence of characters within the string.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: s = "abc"
     * Output: 3
     * Explanation: Three palindromic strings: "a", "b", "c".
     * 
     * Example 2:
     * 
     * Input: s = "aaa"
     * Output: 6
     * Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= s.length &lt;= 1000
     * 
     * s consists of lowercase English letters.
     */
    // Expand around center for odd and even length palindromes
    /**
     * Counts Count substrings.
     *
     * @param s the s (String)
     * @return the computed int result
     */
    public int countSubstrings(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count += expand(s, i, i);   // odd
            count += expand(s, i, i+1); // even
        }
        return count;
    }
    private int expand(String s, int l, int r) {
        int count = 0;
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            count++; l--; r++;
        }
        return count;
    }

    public static void main(String[] args) {
        PalindromicSubstrings sol = new PalindromicSubstrings();
        System.out.println(sol.countSubstrings("hello"));
    }
}
