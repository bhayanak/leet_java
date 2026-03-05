package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #516: Longest Palindromic Subsequence
 * @see <a href="https://leetcode.com/problems/longest-palindromic-subsequence/">Problem</a>
 */
public class LongestPalindromicSubsequence {

    /**
     * LeetCode #516 – Longest Palindromic Subsequence
     * Difficulty: MEDIUM
     * Topics: String, Dynamic Programming
     *
     * Given a string s, find the longest palindromic subsequence's length in s.
     * 
     * 
     * A subsequence is a sequence that can be derived from another sequence by
     * deleting some or no elements without changing the order of the remaining
     * elements.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: s = "bbbab"
     * Output: 4
     * Explanation: One possible longest palindromic subsequence is "bbbb".
     * 
     * Example 2:
     * 
     * Input: s = "cbbd"
     * Output: 2
     * Explanation: One possible longest palindromic subsequence is "bb".
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= s.length &lt;= 1000
     * 
     * s consists only of lowercase English letters.
     */
    // DP: dp[i][j] = LPS length for s[i..j]
    /**
     * Finds the longest Longest palindrome subseq.
     * Uses dynamic programming to build solutions bottom-up.
     *
     * @param s the s (String)
     * @return the computed int result
     */
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) dp[i][i] = 1;
        for (int len = 2; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                if (s.charAt(i) == s.charAt(j)) dp[i][j] = dp[i+1][j-1] + 2;
                else dp[i][j] = Math.max(dp[i+1][j], dp[i][j-1]);
            }
        }
        return dp[0][n-1];
    }

    public static void main(String[] args) {
        LongestPalindromicSubsequence sol = new LongestPalindromicSubsequence();
        System.out.println(sol.longestPalindromeSubseq("hello"));
    }
}
