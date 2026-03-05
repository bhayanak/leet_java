package org.leetcode.medium;


/**
 * <b>#1081 - Smallest Subsequence of Distinct Characters</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String, Stack, Greedy, Monotonic Stack</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a string s, return the lexicographically smallest subsequence of s that contains all the distinct characters of s exactly once.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "bcabc"
 * Output: "abc"
 *
 * Example 2:
 *
 * Input: s = "cbacdcbc"
 * Output: "acdb"
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 1000
 *
 * s consists of lowercase English letters.
 *
 *
 * Note: This question is the same as 316: https://leetcode.com/problems/remove-duplicate-letters/
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Greedily try to add one missing character. How to check if adding some character will not cause problems ? Use bit-masks to check whether you will be able to complete the sub-sequence if you add the character at some index i.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Stack, Greedy, Monotonic Stack).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/smallest-subsequence-of-distinct-characters/">LeetCode #1081</a>
 */
public class SmallestSubsequenceOfDistinctCharacters {

    /**
     * TODO: Implement "Smallest Subsequence of Distinct Characters".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Smallest Subsequence of Distinct Characters");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac SmallestSubsequenceOfDistinctCharacters.java &amp;&amp; java org.leetcode.medium.SmallestSubsequenceOfDistinctCharacters</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== SmallestSubsequenceOfDistinctCharacters ===");
        SmallestSubsequenceOfDistinctCharacters sol = new SmallestSubsequenceOfDistinctCharacters();
        System.out.println(sol.solve(null));
    }
}
