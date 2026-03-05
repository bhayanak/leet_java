package org.leetcode.hard;


/**
 * <b>#2472 - Maximum Number of Non-overlapping Palindrome Substrings</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Two Pointers, String, Dynamic Programming, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string s and a positive integer k.
 *
 *
 * Select a set of non-overlapping substrings from the string s that satisfy the following conditions:
 *
 *
 * The length of each substring is at least k.
 *
 * Each substring is a palindrome.
 *
 * Return the maximum number of substrings in an optimal selection.
 *
 *
 * A substring is a contiguous sequence of characters within a string.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abaccdbbd", k = 3
 * Output: 2
 * Explanation: We can select the substrings underlined in s = "abaccdbbd". Both "aba" and "dbbd" are palindromes and have a length of at least k = 3.
 * It can be shown that we cannot find a selection with more than two valid substrings.
 *
 * Example 2:
 *
 * Input: s = "adbcda", k = 2
 * Output: 0
 * Explanation: There is no palindrome substring of length at least 2 in the string.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= k &lt;= s.length &lt;= 2000
 *
 * s consists of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Try to use dynamic programming to solve the problem.
 * Hint 2: let dp[i] be the answer for the prefix s[0…i].
 * Hint 3: The final answer to the problem will be dp[n-1]. How do you compute this dp?
 *
 * <h2>Approach</h2>
 * Think about the category (Two Pointers, String, Dynamic Programming, Greedy).
 *
 * @see <a href="https://leetcode.com/problems/maximum-number-of-non-overlapping-palindrome-substrings/">LeetCode #2472</a>
 */
public class MaximumNumberOfNonOverlappingPalindromeSubstrings {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Number of Non-overlapping Palindrome Substrings");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximumNumberOfNonOverlappingPalindromeSubstrings ===");
        MaximumNumberOfNonOverlappingPalindromeSubstrings sol = new MaximumNumberOfNonOverlappingPalindromeSubstrings();
        System.out.println(sol.solve(null));
    }
}
