package org.leetcode.medium;


/**
 * <b>#3179 - Find the N-th Value After K Seconds</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Math, Simulation, Combinatorics, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two integers n and k.
 *
 *
 * Initially, you start with an array a of n integers where a[i] = 1 for all 0 &lt;= i &lt;= n - 1. After each second, you simultaneously update each element to be the sum of all its preceding elements plus the element itself. For example, after one second, a[0] remains the same, a[1] becomes a[0] + a[1], a[2] becomes a[0] + a[1] + a[2], and so on.
 *
 *
 * Return the value of a[n - 1] after k seconds.
 *
 *
 * Since the answer may be very large, return it modulo 109 + 7.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 4, k = 5
 *
 *
 * Output: 56
 *
 *
 * Explanation:
 *
 *
 *
 *
 *
 * 			Second
 * 			State After
 *
 *
 *
 *
 * 			0
 * 			[1,1,1,1]
 *
 *
 *
 *
 * 			1
 * 			[1,2,3,4]
 *
 *
 *
 *
 * 			2
 * 			[1,3,6,10]
 *
 *
 *
 *
 * 			3
 * 			[1,4,10,20]
 *
 *
 *
 *
 * 			4
 * 			[1,5,15,35]
 *
 *
 *
 *
 * 			5
 * 			[1,6,21,56]
 *
 *
 *
 *
 * Example 2:
 *
 * Input: n = 5, k = 3
 *
 *
 * Output: 35
 *
 *
 * Explanation:
 *
 *
 *
 *
 *
 * 			Second
 * 			State After
 *
 *
 *
 *
 * 			0
 * 			[1,1,1,1,1]
 *
 *
 *
 *
 * 			1
 * 			[1,2,3,4,5]
 *
 *
 *
 *
 * 			2
 * 			[1,3,6,10,15]
 *
 *
 *
 *
 * 			3
 * 			[1,4,10,20,35]
 *
 *
 *
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n, k &lt;= 1000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Calculate the prefix sum array of <code>nums</code>, <code>k</code> times.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Simulation, Combinatorics, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/find-the-n-th-value-after-k-seconds/">LeetCode #3179</a>
 */
public class FindTheNThValueAfterKSeconds {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find the N-th Value After K Seconds");
    }

    public static void main(String[] args) {
        System.out.println("=== FindTheNThValueAfterKSeconds ===");
        FindTheNThValueAfterKSeconds sol = new FindTheNThValueAfterKSeconds();
        System.out.println(sol.solve(null));
    }
}
