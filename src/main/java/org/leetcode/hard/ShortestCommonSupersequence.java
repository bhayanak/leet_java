package org.leetcode.hard;


/**
 * <b>#1092 - Shortest Common Supersequence </b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> String, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given two strings str1 and str2, return the shortest string that has both str1 and str2 as subsequences. If there are multiple valid strings, return any of them.
 *
 *
 * A string s is a subsequence of string t if deleting some number of characters from t (possibly 0) results in the string s.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: str1 = "abac", str2 = "cab"
 * Output: "cabac"
 * Explanation: 
 * str1 = "abac" is a subsequence of "cabac" because we can delete the first "c".
 * str2 = "cab" is a subsequence of "cabac" because we can delete the last "ac".
 * The answer provided is the shortest such string that satisfies these properties.
 *
 * Example 2:
 *
 * Input: str1 = "aaaaaaaa", str2 = "aaaaaaaa"
 * Output: "aaaaaaaa"
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= str1.length, str2.length &lt;= 1000
 *
 * str1 and str2 consist of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: We can find the length of the longest common subsequence between str1[i:] and str2[j:] (for all (i, j)) by using dynamic programming.
 * Hint 2: We can use this information to recover the shortest common supersequence.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Dynamic Programming).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/shortest-common-supersequence/">LeetCode #1092</a>
 */
public class ShortestCommonSupersequence {

    /**
     * TODO: Implement "Shortest Common Supersequence ".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Shortest Common Supersequence ");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac ShortestCommonSupersequence.java &amp;&amp; java org.leetcode.hard.ShortestCommonSupersequence</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== ShortestCommonSupersequence ===");
        ShortestCommonSupersequence sol = new ShortestCommonSupersequence();
        System.out.println(sol.solve(null));
    }
}
