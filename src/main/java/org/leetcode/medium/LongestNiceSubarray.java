package org.leetcode.medium;


/**
 * <b>#2401 - Longest Nice Subarray</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Bit Manipulation, Sliding Window</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array nums consisting of positive integers.
 *
 *
 * We call a subarray of nums nice if the bitwise AND of every pair of elements that are in different positions in the subarray is equal to 0.
 *
 *
 * Return the length of the longest nice subarray.
 *
 *
 * A subarray is a contiguous part of an array.
 *
 *
 * Note that subarrays of length 1 are always considered nice.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,3,8,48,10]
 * Output: 3
 * Explanation: The longest nice subarray is [3,8,48]. This subarray satisfies the conditions:
 * - 3 AND 8 = 0.
 * - 3 AND 48 = 0.
 * - 8 AND 48 = 0.
 * It can be proven that no longer nice subarray can be obtained, so we return 3.
 *
 * Example 2:
 *
 * Input: nums = [3,1,5,11,13]
 * Output: 1
 * Explanation: The length of the longest nice subarray is 1. Any subarray of length 1 can be chosen.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: What is the maximum possible length of a nice subarray?
 * Hint 2: If two numbers have bitwise AND equal to zero, they do not have any common set bit. A number <code>x &lt;= 10<sup>9</sup></code> only has 30 bits, hence the length of the longest nice subarray cannot exceed 30.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Bit Manipulation, Sliding Window).
 *
 * @see <a href="https://leetcode.com/problems/longest-nice-subarray/">LeetCode #2401</a>
 */
public class LongestNiceSubarray {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Longest Nice Subarray");
    }

    public static void main(String[] args) {
        System.out.println("=== LongestNiceSubarray ===");
        LongestNiceSubarray sol = new LongestNiceSubarray();
        System.out.println(sol.solve(null));
    }
}
