package org.leetcode.hard;


/**
 * <b>#940 - Distinct Subsequences II</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> String, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a string s, return the number of distinct non-empty subsequences of s. Since the answer may be very large, return it modulo 109 + 7.
 * A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abc"
 * Output: 7
 * Explanation: The 7 distinct subsequences are "a", "b", "c", "ab", "ac", "bc", and "abc".
 *
 * Example 2:
 *
 * Input: s = "aba"
 * Output: 6
 * Explanation: The 6 distinct subsequences are "a", "b", "ab", "aa", "ba", and "aba".
 *
 * Example 3:
 *
 * Input: s = "aaa"
 * Output: 3
 * Explanation: The 3 distinct subsequences are "a", "aa" and "aaa".
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 2000
 *
 * s consists of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Dynamic Programming).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/distinct-subsequences-ii/">LeetCode #940</a>
 */
public class DistinctSubsequencesIi {

    /**
     * TODO: Implement "Distinct Subsequences II".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Distinct Subsequences II");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac DistinctSubsequencesIi.java &amp;&amp; java org.leetcode.hard.DistinctSubsequencesIi</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== DistinctSubsequencesIi ===");
        DistinctSubsequencesIi sol = new DistinctSubsequencesIi();
        System.out.println(sol.solve(null));
    }
}
