package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #409: Longest Palindrome
 * @see <a href="https://leetcode.com/problems/longest-palindrome/">Problem</a>
 */
public class LongestPalindrome {

    /**
     * LeetCode #409 – Longest Palindrome
     * Difficulty: EASY
     * Topics: Hash Table, String, Greedy
     *
     * Given a string s which consists of lowercase or uppercase letters, return
     * the length of the longest palindrome that can be built with those letters.
     * 
     * 
     * Letters are case sensitive, for example, "Aa" is not considered a
     * palindrome.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: s = "abccccdd"
     * Output: 7
     * Explanation: One longest palindrome that can be built is "dccaccd", whose
     * length is 7.
     * 
     * Example 2:
     * 
     * Input: s = "a"
     * Output: 1
     * Explanation: The longest palindrome that can be built is "a", whose length
     * is 1.
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= s.length &lt;= 2000
     * 
     * s consists of lowercase and/or uppercase English letters only.
      *
      * <p><b>Explanation:</b> Compares characters from both ends moving inward; returns false on first mismatch.</p>
      */
    // Count character frequencies; add all even counts + largest odd count block
    /**
     * Finds the longest Longest palindrome.
     *
     * @param s the s (String)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Compares characters from both ends moving inward; returns false on first mismatch.</p>
      */
    public int longestPalindrome(String s) {
        int[] count = new int[128];
        for (char c : s.toCharArray()) count[c]++;
        int length = 0;
        boolean oddUsed = false;
        for (int cnt : count) {
            length += cnt / 2 * 2;
            if (cnt % 2 == 1) oddUsed = true;
        }
        return oddUsed ? length + 1 : length;
    }

    public static void main(String[] args) {
        LongestPalindrome sol = new LongestPalindrome();
        System.out.println(sol.longestPalindrome("hello"));
    }
}
