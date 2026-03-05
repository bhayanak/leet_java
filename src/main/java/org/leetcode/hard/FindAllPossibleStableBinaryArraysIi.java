package org.leetcode.hard;


/**
 * <b>#3130 - Find All Possible Stable Binary Arrays II</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Dynamic Programming, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given 3 positive integers zero, one, and limit.
 *
 *
 * A binary array arr is called stable if:
 *
 *
 * The number of occurrences of 0 in arr is exactly zero.
 *
 * The number of occurrences of 1 in arr is exactly one.
 *
 * Each subarray of arr with a size greater than limit must contain both 0 and 1.
 *
 * Return the total number of stable binary arrays.
 *
 *
 * Since the answer may be very large, return it modulo 109 + 7.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: zero = 1, one = 1, limit = 2
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * The two possible stable binary arrays are [1,0] and [0,1].
 *
 * Example 2:
 *
 * Input: zero = 1, one = 2, limit = 1
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * The only possible stable binary array is [1,0,1].
 *
 * Example 3:
 *
 * Input: zero = 3, one = 3, limit = 2
 *
 *
 * Output: 14
 *
 *
 * Explanation:
 *
 *
 * All the possible stable binary arrays are [0,0,1,0,1,1], [0,0,1,1,0,1], [0,1,0,0,1,1], [0,1,0,1,0,1], [0,1,0,1,1,0], [0,1,1,0,0,1], [0,1,1,0,1,0], [1,0,0,1,0,1], [1,0,0,1,1,0], [1,0,1,0,0,1], [1,0,1,0,1,0], [1,0,1,1,0,0], [1,1,0,0,1,0], and [1,1,0,1,0,0].
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= zero, one, limit &lt;= 1000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Let <code>dp[x][y][z = 0/1]</code> be the number of stable arrays with exactly <code>x</code> zeros, <code>y</code> ones, and the last element is <code>z</code>. (0 or 1).
<code>dp[x][y][0] + dp[x][y][1]</code> is the answer for given <code>(x, y)</code>.
 * Hint 2: If we have already placed <code>x</code> 1 and <code>y</code> 0, if we place a group of <code>k</code> 0, the number of ways is <code>dp[x-k][y][1]</code>. We can place a group with size <code>i</code>, where <code>i</code> varies from 1 to <code>min(limit, zero - x)</code>.
Similarly, we can solve by placing a group of ones.
 * Hint 3: Speed up the calculation using prefix arrays to store the sum of <code>dp</code> states.
 *
 * <h2>Approach</h2>
 * Think about the category (Dynamic Programming, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/find-all-possible-stable-binary-arrays-ii/">LeetCode #3130</a>
 */
public class FindAllPossibleStableBinaryArraysIi {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find All Possible Stable Binary Arrays II");
    }

    public static void main(String[] args) {
        System.out.println("=== FindAllPossibleStableBinaryArraysIi ===");
        FindAllPossibleStableBinaryArraysIi sol = new FindAllPossibleStableBinaryArraysIi();
        System.out.println(sol.solve(null));
    }
}
