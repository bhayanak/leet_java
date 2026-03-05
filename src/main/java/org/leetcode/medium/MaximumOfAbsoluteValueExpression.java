package org.leetcode.medium;


/**
 * <b>#1131 - Maximum of Absolute Value Expression</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Math</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given two arrays of integers with equal lengths, return the maximum value of:
 *
 *
 * |arr1[i] - arr1[j]| + |arr2[i] - arr2[j]| + |i - j|
 *
 *
 * where the maximum is taken over all 0 &lt;= i, j &lt; arr1.length.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: arr1 = [1,2,3,4], arr2 = [-1,4,5,6]
 * Output: 13
 *
 * Example 2:
 *
 * Input: arr1 = [1,-2,-5,0,10], arr2 = [0,-2,-1,-7,-4]
 * Output: 20
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= arr1.length == arr2.length &lt;= 40000
 *
 * -10^6 &lt;= arr1[i], arr2[i] &lt;= 10^6
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use the idea that abs(A) + abs(B) = max(A+B, A-B, -A+B, -A-B).
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/maximum-of-absolute-value-expression/">LeetCode #1131</a>
 */
public class MaximumOfAbsoluteValueExpression {

    /**
     * TODO: Implement "Maximum of Absolute Value Expression".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum of Absolute Value Expression");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac MaximumOfAbsoluteValueExpression.java &amp;&amp; java org.leetcode.medium.MaximumOfAbsoluteValueExpression</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== MaximumOfAbsoluteValueExpression ===");
        MaximumOfAbsoluteValueExpression sol = new MaximumOfAbsoluteValueExpression();
        System.out.println(sol.solve(null));
    }
}
