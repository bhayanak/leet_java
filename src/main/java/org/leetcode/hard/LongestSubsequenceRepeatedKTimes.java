package org.leetcode.hard;


/**
 * <b>#2014 - Longest Subsequence Repeated k Times</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Hash Table, Two Pointers, String, Backtracking, Counting, Enumeration</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string s of length n, and an integer k. You are tasked to find the longest subsequence repeated k times in string s.
 *
 *
 * A subsequence is a string that can be derived from another string by deleting some or no characters without changing the order of the remaining characters.
 *
 *
 * A subsequence seq is repeated k times in the string s if seq * k is a subsequence of s, where seq * k represents a string constructed by concatenating seq k times.
 *
 *
 * For example, "bba" is repeated 2 times in the string "bababcba", because the string "bbabba", constructed by concatenating "bba" 2 times, is a subsequence of the string "bababcba".
 *
 * Return the longest subsequence repeated k times in string s. If multiple such subsequences are found, return the lexicographically largest one. If there is no such subsequence, return an empty string.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "letsleetcode", k = 2
 * Output: "let"
 * Explanation: There are two longest subsequences repeated 2 times: "let" and "ete".
 * "let" is the lexicographically largest one.
 *
 * Example 2:
 *
 * Input: s = "bb", k = 2
 * Output: "b"
 * Explanation: The longest subsequence repeated 2 times is "b".
 *
 * Example 3:
 *
 * Input: s = "ab", k = 2
 * Output: ""
 * Explanation: There is no subsequence repeated 2 times. Empty string is returned.
 *
 *
 *
 * Constraints:
 *
 *
 * n == s.length
 *
 * 2 &lt;= k &lt;= 2000
 *
 * 2 &lt;= n &lt; min(2001, k * 8)
 *
 * s consists of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The length of the longest subsequence does not exceed n/k. Do you know why?
 * Hint 2: Find the characters that could be included in the potential answer. A character occurring more than or equal to k times can be used in the answer up to (count of the character / k) times.
 * Hint 3: Try all possible candidates in reverse lexicographic order, and check the string for the subsequence condition.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, Two Pointers, String, Backtracking, Counting, Enumeration).
 *
 * @see <a href="https://leetcode.com/problems/longest-subsequence-repeated-k-times/">LeetCode #2014</a>
 */
public class LongestSubsequenceRepeatedKTimes {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Longest Subsequence Repeated k Times");
    }

    public static void main(String[] args) {
        System.out.println("=== LongestSubsequenceRepeatedKTimes ===");
        LongestSubsequenceRepeatedKTimes sol = new LongestSubsequenceRepeatedKTimes();
        System.out.println(sol.solve(null));
    }
}
