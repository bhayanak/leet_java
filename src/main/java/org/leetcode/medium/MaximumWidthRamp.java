package org.leetcode.medium;


/**
 * <b>#962 - Maximum Width Ramp</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Two Pointers, Stack, Monotonic Stack</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * A ramp in an integer array nums is a pair (i, j) for which i &lt; j and nums[i] &lt;= nums[j]. The width of such a ramp is j - i.
 *
 *
 * Given an integer array nums, return the maximum width of a ramp in nums. If there is no ramp in nums, return 0.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [6,0,8,2,1,5]
 * Output: 4
 * Explanation: The maximum width ramp is achieved at (i, j) = (1, 5): nums[1] = 0 and nums[5] = 5.
 *
 * Example 2:
 *
 * Input: nums = [9,8,1,0,1,9,4,0,4,1]
 * Output: 7
 * Explanation: The maximum width ramp is achieved at (i, j) = (2, 9): nums[2] = 1 and nums[9] = 1.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= nums.length &lt;= 5 * 104
 *
 * 0 &lt;= nums[i] &lt;= 5 * 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Two Pointers, Stack, Monotonic Stack).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/maximum-width-ramp/">LeetCode #962</a>
 */
public class MaximumWidthRamp {

    /**
     * TODO: Implement "Maximum Width Ramp".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Width Ramp");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac MaximumWidthRamp.java &amp;&amp; java org.leetcode.medium.MaximumWidthRamp</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== MaximumWidthRamp ===");
        MaximumWidthRamp sol = new MaximumWidthRamp();
        System.out.println(sol.solve(null));
    }
}
