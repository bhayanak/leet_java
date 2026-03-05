package org.leetcode.medium;


/**
 * <b>#1031 - Maximum Sum of Two Non-Overlapping Subarrays</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Sliding Window</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer array nums and two integers firstLen and secondLen, return the maximum sum of elements in two non-overlapping subarrays with lengths firstLen and secondLen.
 *
 *
 * The array with length firstLen could occur before or after the array with length secondLen, but they have to be non-overlapping.
 *
 *
 * A subarray is a contiguous part of an array.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [0,6,5,2,2,5,1,9,4], firstLen = 1, secondLen = 2
 * Output: 20
 * Explanation: One choice of subarrays is [9] with length 1, and [6,5] with length 2.
 *
 * Example 2:
 *
 * Input: nums = [3,8,1,3,2,1,8,9,0], firstLen = 3, secondLen = 2
 * Output: 29
 * Explanation: One choice of subarrays is [3,8,1] with length 3, and [8,9] with length 2.
 *
 * Example 3:
 *
 * Input: nums = [2,1,5,6,0,9,5,0,3,8], firstLen = 4, secondLen = 3
 * Output: 31
 * Explanation: One choice of subarrays is [5,6,0,9] with length 4, and [0,3,8] with length 3.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= firstLen, secondLen &lt;= 1000
 *
 * 2 &lt;= firstLen + secondLen &lt;= 1000
 *
 * firstLen + secondLen &lt;= nums.length &lt;= 1000
 *
 * 0 &lt;= nums[i] &lt;= 1000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: We can use prefix sums to calculate any subarray sum quickly.
For each L length subarray, find the best possible M length subarray that occurs before and after it.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Sliding Window).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/maximum-sum-of-two-non-overlapping-subarrays/">LeetCode #1031</a>
 */
public class MaximumSumOfTwoNonOverlappingSubarrays {

    /**
     * TODO: Implement "Maximum Sum of Two Non-Overlapping Subarrays".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Sum of Two Non-Overlapping Subarrays");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac MaximumSumOfTwoNonOverlappingSubarrays.java &amp;&amp; java org.leetcode.medium.MaximumSumOfTwoNonOverlappingSubarrays</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== MaximumSumOfTwoNonOverlappingSubarrays ===");
        MaximumSumOfTwoNonOverlappingSubarrays sol = new MaximumSumOfTwoNonOverlappingSubarrays();
        System.out.println(sol.solve(null));
    }
}
