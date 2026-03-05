package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #680: Valid Palindrome II
 * @see <a href="https://leetcode.com/problems/valid-palindrome-ii/">Problem</a>
 */
public class ValidPalindromeIi {

    /**
     * LeetCode #680 – Valid Palindrome II
     * Difficulty: EASY
     * Topics: Two Pointers, String, Greedy
     *
     * Given a string s, return true if the s can be palindrome after deleting at
     * most one character from it.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: s = "aba"
     * Output: true
     * 
     * Example 2:
     * 
     * Input: s = "abca"
     * Output: true
     * Explanation: You could delete the character 'c'.
     * 
     * Example 3:
     * 
     * Input: s = "abc"
     * Output: false
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= s.length &lt;= 105
     * 
     * s consists of lowercase English letters.
      *
      * <p><b>Explanation:</b> Compares characters from both ends moving inward; returns false on first mismatch.</p>
      */
    public boolean validPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r))
                return isPalin(s, l+1, r) || isPalin(s, l, r-1);
            l++; r--;
        }
        return true;
    }
    private boolean isPalin(String s, int l, int r) {
        while (l < r) { if (s.charAt(l++) != s.charAt(r--)) return false; }
        return true;
    }

    public static void main(String[] args) {
        ValidPalindromeIi sol = new ValidPalindromeIi();
        System.out.println(sol.validPalindrome("hello"));
    }
}
