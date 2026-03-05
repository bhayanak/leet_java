package org.leetcode.medium;


/**
 * <b>#2447 - Number of Subarrays With GCD Equal to K</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Math, Number Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer array nums and an integer k, return the number of subarrays of nums where the greatest common divisor of the subarray's elements is k.
 *
 *
 * A subarray is a contiguous non-empty sequence of elements within an array.
 *
 *
 * The greatest common divisor of an array is the largest integer that evenly divides all the array elements.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [9,3,1,2,6,3], k = 3
 * Output: 4
 * Explanation: The subarrays of nums where 3 is the greatest common divisor of all the subarray's elements are:
 * - [9,3,1,2,6,3]
 * - [9,3,1,2,6,3]
 * - [9,3,1,2,6,3]
 * - [9,3,1,2,6,3]
 *
 * Example 2:
 *
 * Input: nums = [4], k = 7
 * Output: 0
 * Explanation: There are no subarrays of nums where 7 is the greatest common divisor of all the subarray's elements.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 1000
 *
 * 1 &lt;= nums[i], k &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The constraints on nums.length are small. It is possible to check every subarray.
 * Hint 2: To calculate GCD, you can use a built-in function or the Euclidean Algorithm.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Number Theory).
 *
 * @see <a href="https://leetcode.com/problems/number-of-subarrays-with-gcd-equal-to-k/">LeetCode #2447</a>
 */
public class NumberOfSubarraysWithGcdEqualToK {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Number of Subarrays With GCD Equal to K");
    }

    public static void main(String[] args) {
        System.out.println("=== NumberOfSubarraysWithGcdEqualToK ===");
        NumberOfSubarraysWithGcdEqualToK sol = new NumberOfSubarraysWithGcdEqualToK();
        System.out.println(sol.solve(null));
    }
}
