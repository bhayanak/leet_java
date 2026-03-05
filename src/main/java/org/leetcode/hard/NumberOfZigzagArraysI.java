package org.leetcode.hard;


/**
 * <b>#3699 - Number of ZigZag Arrays I</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Dynamic Programming, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given three integers n, l, and r.
 *
 *
 * A ZigZag array of length n is defined as follows:
 *
 *
 * Each element lies in the range [l, r].
 *
 * No two adjacent elements are equal.
 *
 * No three consecutive elements form a strictly increasing or strictly decreasing sequence.
 *
 * Return the total number of valid ZigZag arrays.
 *
 *
 * Since the answer may be large, return it modulo 109 + 7.
 *
 *
 * A sequence is said to be strictly increasing if each element is strictly greater than its previous one (if exists).
 *
 *
 * A sequence is said to be strictly decreasing if each element is strictly smaller than its previous one (if exists).
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 3, l = 4, r = 5
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * There are only 2 valid ZigZag arrays of length n = 3 using values in the range [4, 5]:
 *
 *
 * [4, 5, 4]
 *
 * [5, 4, 5]​​​​​​​
 *
 * Example 2:
 *
 * Input: n = 3, l = 1, r = 3
 *
 *
 * Output: 10
 *
 *
 * Explanation:
 *
 *
 * There are 10 valid ZigZag arrays of length n = 3 using values in the range [1, 3]:
 *
 *
 * [1, 2, 1], [1, 3, 1], [1, 3, 2]
 *
 * [2, 1, 2], [2, 1, 3], [2, 3, 1], [2, 3, 2]
 *
 * [3, 1, 2], [3, 1, 3], [3, 2, 3]
 *
 * All arrays meet the ZigZag conditions.
 *
 *
 *
 * Constraints:
 *
 *
 * 3 &lt;= n &lt;= 2000
 *
 * 1 &lt;= l &lt; r &lt;= 2000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use dynamic programming: let <code>dp[i][dir][x]</code> be the count of length-<code>i</code> sequences ending at value <code>x</code> where <code>dir</code> is the required next comparison (0 = down, 1 = up).
 * Hint 2: If the required move is <code>up</code> (dir=1) do <code>dp[i+1][0][y] += sum(dp[i][1][x]) for x &lt; y</code>; if the required move is <code>down</code> (dir=0) do <code>dp[i+1][1][y] += sum(dp[i][0][x]) for x &gt; y</code>.
 * Hint 3: Speed up with prefix/suffix sums so each layer updates in O(<code>m</code>) instead of O(<code>m</code><sup>2</sup>); take values mod <code>10<sup>9</sup>+7</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Dynamic Programming, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/number-of-zigzag-arrays-i/">LeetCode #3699</a>
 */
public class NumberOfZigzagArraysI {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Number of ZigZag Arrays I");
    }

    public static void main(String[] args) {
        System.out.println("=== NumberOfZigzagArraysI ===");
        NumberOfZigzagArraysI sol = new NumberOfZigzagArraysI();
        System.out.println(sol.solve(null));
    }
}
