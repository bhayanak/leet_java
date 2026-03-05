package org.leetcode.medium;


/**
 * <b>#1017 - Convert to Base -2</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Math</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer n, return a binary string representing its representation in base -2.
 *
 *
 * Note that the returned string should not have leading zeros unless the string is "0".
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 2
 * Output: "110"
 * Explantion: (-2)2 + (-2)1 = 2
 *
 * Example 2:
 *
 * Input: n = 3
 * Output: "111"
 * Explantion: (-2)2 + (-2)1 + (-2)0 = 3
 *
 * Example 3:
 *
 * Input: n = 4
 * Output: "100"
 * Explantion: (-2)2 = 4
 *
 *
 *
 * Constraints:
 *
 *
 * 0 &lt;= n &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Figure out whether you need the ones digit placed or not, then shift by two.
 *
 * <h2>Approach</h2>
 * Think about the category (Math).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/convert-to-base-2/">LeetCode #1017</a>
 */
public class ConvertToBase2 {

    /**
     * TODO: Implement "Convert to Base -2".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Convert to Base -2");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac ConvertToBase2.java &amp;&amp; java org.leetcode.medium.ConvertToBase2</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== ConvertToBase2 ===");
        ConvertToBase2 sol = new ConvertToBase2();
        System.out.println(sol.solve(null));
    }
}
