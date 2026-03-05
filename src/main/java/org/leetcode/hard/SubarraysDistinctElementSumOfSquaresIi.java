package org.leetcode.hard;


/**
 * <b>#2916 - Subarrays Distinct Element Sum of Squares II</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Binary Indexed Tree, Segment Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed integer array nums.
 *
 *
 * The distinct count of a subarray of nums is defined as:
 *
 *
 * Let nums[i..j] be a subarray of nums consisting of all the indices from i to j such that 0 &lt;= i &lt;= j &lt; nums.length. Then the number of distinct values in nums[i..j] is called the distinct count of nums[i..j].
 *
 * Return the sum of the squares of distinct counts of all subarrays of nums.
 *
 *
 * Since the answer may be very large, return it modulo 109 + 7.
 *
 *
 * A subarray is a contiguous non-empty sequence of elements within an array.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,1]
 * Output: 15
 * Explanation: Six possible subarrays are:
 * [1]: 1 distinct value
 * [2]: 1 distinct value
 * [1]: 1 distinct value
 * [1,2]: 2 distinct values
 * [2,1]: 2 distinct values
 * [1,2,1]: 2 distinct values
 * The sum of the squares of the distinct counts in all subarrays is equal to 12 + 12 + 12 + 22 + 22 + 22 = 15.
 *
 * Example 2:
 *
 * Input: nums = [2,2]
 * Output: 3
 * Explanation: Three possible subarrays are:
 * [2]: 1 distinct value
 * [2]: 1 distinct value
 * [2,2]: 1 distinct value
 * The sum of the squares of the distinct counts in all subarrays is equal to 12 + 12 + 12 = 3.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Consider the sum of the count of distinct values of subarrays ending with index <code>i</code>, let’s call it <code>sum</code>. Now if you need the sum of all subarrays ending with index <code>i + 1</code> think how it can be related to <code>sum</code> and what extra will be needed to add to this.
 * Hint 2: You can find that extra sum using the segment tree.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Binary Indexed Tree, Segment Tree).
 *
 * @see <a href="https://leetcode.com/problems/subarrays-distinct-element-sum-of-squares-ii/">LeetCode #2916</a>
 */
public class SubarraysDistinctElementSumOfSquaresIi {

    public static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Subarrays Distinct Element Sum of Squares II");
    }

    public static void main(String[] args) {
        System.out.println("=== SubarraysDistinctElementSumOfSquaresIi ===");
        SubarraysDistinctElementSumOfSquaresIi sol = new SubarraysDistinctElementSumOfSquaresIi();
        System.out.println(sol.solve(null));
    }
}
