package org.leetcode.medium;


/**
 * <b>#2012 - Sum of Beauty in the Array</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed integer array nums. For each index i (1 &lt;= i &lt;= nums.length - 2) the beauty of nums[i] equals:
 *
 *
 * 2, if nums[j] &lt; nums[i] &lt; nums[k], for all 0 &lt;= j &lt; i and for all i &lt; k &lt;= nums.length - 1.
 *
 * 1, if nums[i - 1] &lt; nums[i] &lt; nums[i + 1], and the previous condition is not satisfied.
 *
 * 0, if none of the previous conditions holds.
 *
 * Return the sum of beauty of all nums[i] where 1 &lt;= i &lt;= nums.length - 2.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3]
 * Output: 2
 * Explanation: For each index i in the range 1 &lt;= i &lt;= 1:
 * - The beauty of nums[1] equals 2.
 *
 * Example 2:
 *
 * Input: nums = [2,4,6,4]
 * Output: 1
 * Explanation: For each index i in the range 1 &lt;= i &lt;= 2:
 * - The beauty of nums[1] equals 1.
 * - The beauty of nums[2] equals 0.
 *
 * Example 3:
 *
 * Input: nums = [3,2,1]
 * Output: 0
 * Explanation: For each index i in the range 1 &lt;= i &lt;= 1:
 * - The beauty of nums[1] equals 0.
 *
 *
 *
 * Constraints:
 *
 *
 * 3 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use suffix/prefix arrays.
 * Hint 2: prefix[i] records the maximum value in range (0, i - 1) inclusive.
 * Hint 3: suffix[i] records the minimum value in range (i + 1, n - 1) inclusive.
 *
 * <h2>Approach</h2>
 * Think about the category (Array).
 *
 * @see <a href="https://leetcode.com/problems/sum-of-beauty-in-the-array/">LeetCode #2012</a>
 */
public class SumOfBeautyInTheArray {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Sum of Beauty in the Array");
    }

    public static void main(String[] args) {
        System.out.println("=== SumOfBeautyInTheArray ===");
        SumOfBeautyInTheArray sol = new SumOfBeautyInTheArray();
        System.out.println(sol.solve(null));
    }
}
