package org.leetcode.hard;


/**
 * <b>#3165 - Maximum Sum of Subsequence With Non-adjacent Elements</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Divide and Conquer, Dynamic Programming, Segment Tree</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array nums consisting of integers. You are also given a 2D array queries, where queries[i] = [posi, xi].
 *
 *
 * For query i, we first set nums[posi] equal to xi, then we calculate the answer to query i which is the maximum sum of a subsequence of nums where no two adjacent elements are selected.
 *
 *
 * Return the sum of the answers to all queries.
 *
 *
 * Since the final answer may be very large, return it modulo 109 + 7.
 *
 *
 * A subsequence is an array that can be derived from another array by deleting some or no elements without changing the order of the remaining elements.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [3,5,9], queries = [[1,-2],[0,-3]]
 *
 *
 * Output: 21
 *
 *
 * Explanation:
 *
 * After the 1st query, nums = [3,-2,9] and the maximum sum of a subsequence with non-adjacent elements is 3 + 9 = 12.
 *
 * After the 2nd query, nums = [-3,-2,9] and the maximum sum of a subsequence with non-adjacent elements is 9.
 *
 * Example 2:
 *
 * Input: nums = [0,-1], queries = [[0,-5]]
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 * After the 1st query, nums = [-5,-1] and the maximum sum of a subsequence with non-adjacent elements is 0 (choosing an empty subsequence).
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 5 * 104
 *
 * -105 &lt;= nums[i] &lt;= 105
 *
 * 1 &lt;= queries.length &lt;= 5 * 104
 *
 * queries[i] == [posi, xi]
 *
 * 0 &lt;= posi &lt;= nums.length - 1
 *
 * -105 &lt;= xi &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Can you solve each query in <code>O(nums.length)</code> with dynamic programming?
 * Hint 2: In order to optimize, we will use segment tree where each node contains the maximum value of (front element has been chosen or not, back element has been chosen or not).
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Divide and Conquer, Dynamic Programming, Segment Tree).
 *
 * @see <a href="https://leetcode.com/problems/maximum-sum-of-subsequence-with-non-adjacent-elements/">LeetCode #3165</a>
 */
public class MaximumSumOfSubsequenceWithNonAdjacentElements {

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
        throw new UnsupportedOperationException("Not yet implemented: Maximum Sum of Subsequence With Non-adjacent Elements");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximumSumOfSubsequenceWithNonAdjacentElements ===");
        MaximumSumOfSubsequenceWithNonAdjacentElements sol = new MaximumSumOfSubsequenceWithNonAdjacentElements();
        System.out.println(sol.solve(null));
    }
}
