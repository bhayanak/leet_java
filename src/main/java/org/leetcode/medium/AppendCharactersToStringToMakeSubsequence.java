package org.leetcode.medium;


/**
 * <b>#2486 - Append Characters to String to Make Subsequence</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Two Pointers, String, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two strings s and t consisting of only lowercase English letters.
 *
 *
 * Return the minimum number of characters that need to be appended to the end of s so that t becomes a subsequence of s.
 *
 *
 * A subsequence is a string that can be derived from another string by deleting some or no characters without changing the order of the remaining characters.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "coaching", t = "coding"
 * Output: 4
 * Explanation: Append the characters "ding" to the end of s so that s = "coachingding".
 * Now, t is a subsequence of s ("coachingding").
 * It can be shown that appending any 3 characters to the end of s will never make t a subsequence.
 *
 * Example 2:
 *
 * Input: s = "abcde", t = "a"
 * Output: 0
 * Explanation: t is already a subsequence of s ("abcde").
 *
 * Example 3:
 *
 * Input: s = "z", t = "abcde"
 * Output: 5
 * Explanation: Append the characters "abcde" to the end of s so that s = "zabcde".
 * Now, t is a subsequence of s ("zabcde").
 * It can be shown that appending any 4 characters to the end of s will never make t a subsequence.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length, t.length &lt;= 105
 *
 * s and t consist only of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Find the longest prefix of t that is a subsequence of s.
 * Hint 2: Use two variables to keep track of your location in s and t. If the characters match, increment both variables. Otherwise, only increment the variable for s.
 * Hint 3: The remaining characters in t must be appended to the end of s.
 *
 * <h2>Approach</h2>
 * Think about the category (Two Pointers, String, Greedy).
 *
 * @see <a href="https://leetcode.com/problems/append-characters-to-string-to-make-subsequence/">LeetCode #2486</a>
 */
public class AppendCharactersToStringToMakeSubsequence {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Append Characters to String to Make Subsequence");
    }

    public static void main(String[] args) {
        System.out.println("=== AppendCharactersToStringToMakeSubsequence ===");
        AppendCharactersToStringToMakeSubsequence sol = new AppendCharactersToStringToMakeSubsequence();
        System.out.println(sol.solve(null));
    }
}
