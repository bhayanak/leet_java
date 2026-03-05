package org.leetcode.medium;


/**
 * <b>#3760 - Maximum Substrings With Distinct Start</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Hash Table, String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string s consisting of lowercase English letters.
 *
 *
 * Return an integer denoting the maximum number of substrings you can split s into such that each substring starts with a distinct character (i.e., no two substrings start with the same character).
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abab"
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * Split "abab" into "a" and "bab".
 *
 * Each substring starts with a distinct character i.e 'a' and 'b'. Thus, the answer is 2.
 *
 * Example 2:
 *
 * Input: s = "abcd"
 *
 *
 * Output: 4
 *
 *
 * Explanation:
 *
 *
 * Split "abcd" into "a", "b", "c", and "d".
 *
 * Each substring starts with a distinct character. Thus, the answer is 4.
 *
 * Example 3:
 *
 * Input: s = "aaaa"
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * All characters in "aaaa" are 'a'.
 *
 * Only one substring can start with 'a'. Thus, the answer is 1.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 105
 *
 * s consists of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Count the number of distinct characters in <code>s</code>
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String).
 *
 * @see <a href="https://leetcode.com/problems/maximum-substrings-with-distinct-start/">LeetCode #3760</a>
 */
public class MaximumSubstringsWithDistinctStart {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Substrings With Distinct Start");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximumSubstringsWithDistinctStart ===");
        MaximumSubstringsWithDistinctStart sol = new MaximumSubstringsWithDistinctStart();
        System.out.println(sol.solve(null));
    }
}
