package org.leetcode.hard;


/**
 * <b>#1793 - Maximum Score of a Good Subarray</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Two Pointers, Binary Search, Stack, Monotonic Stack</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array of integers nums (0-indexed) and an integer k.
 *
 *
 * The score of a subarray (i, j) is defined as min(nums[i], nums[i+1], ..., nums[j]) * (j - i + 1). A good subarray is a subarray where i &lt;= k &lt;= j.
 *
 *
 * Return the maximum possible score of a good subarray.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,4,3,7,4,5], k = 3
 * Output: 15
 * Explanation: The optimal subarray is (1, 5) with a score of min(4,3,7,4,5) * (5-1+1) = 3 * 5 = 15. 
 *
 * Example 2:
 *
 * Input: nums = [5,5,4,5,4,1,1,1], k = 0
 * Output: 20
 * Explanation: The optimal subarray is (0, 4) with a score of min(5,5,4,5,4) * (4-0+1) = 4 * 5 = 20.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 2 * 104
 *
 * 0 &lt;= k &lt; nums.length
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Try thinking about the prefix before index k and the suffix after index k as two separate arrays.
 * Hint 2: Using two pointers or binary search, we can find the maximum prefix of each array where the numbers are less than or equal to a certain value
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Two Pointers, Binary Search, Stack, Monotonic Stack).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/maximum-score-of-a-good-subarray/">LeetCode #1793</a>
 */
public class MaximumScoreOfAGoodSubarray {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Score of a Good Subarray");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MaximumScoreOfAGoodSubarray ===");
        MaximumScoreOfAGoodSubarray sol = new MaximumScoreOfAGoodSubarray();
        System.out.println(sol.solve(null));
    }
}
