package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #424: Longest Repeating Character Replacement
 * @see <a href="https://leetcode.com/problems/longest-repeating-character-replacement/">Problem</a>
 */
public class LongestRepeatingCharacterReplacement {

    /**
     * LeetCode #424 – Longest Repeating Character Replacement
     * Difficulty: MEDIUM
     * Topics: Hash Table, String, Sliding Window
     *
     * You are given a string s and an integer k. You can choose any character of
     * the string and change it to any other uppercase English character. You can
     * perform this operation at most k times.
     * 
     * 
     * Return the length of the longest substring containing the same letter you
     * can get after performing the above operations.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: s = "ABAB", k = 2
     * Output: 4
     * Explanation: Replace the two 'A's with two 'B's or vice versa.
     * 
     * Example 2:
     * 
     * Input: s = "AABABBA", k = 1
     * Output: 4
     * Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
     * The substring "BBBB" has the longest repeating letters, which is 4.
     * There may exists other ways to achieve this answer too.
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= s.length &lt;= 105
     * 
     * s consists of only uppercase English letters.
     * 
     * 0 &lt;= k &lt;= s.length
     */
    // Sliding window: window size - max frequency <= k
    /**
     * Solves the problem: Character replacement.
     * Uses a sliding window to scan subarrays in linear time.
     *
     * @param s the s (String)
     * @param k the k (int)
     * @return the computed int result
     */
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int maxCount = 0, maxLen = 0, left = 0;
        for (int right = 0; right < s.length(); right++) {
            maxCount = Math.max(maxCount, ++count[s.charAt(right) - 'A']);
            while (right - left + 1 - maxCount > k) count[s.charAt(left++) - 'A']--;
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        LongestRepeatingCharacterReplacement sol = new LongestRepeatingCharacterReplacement();
        System.out.println(sol.characterReplacement("hello", 0));
    }
}
