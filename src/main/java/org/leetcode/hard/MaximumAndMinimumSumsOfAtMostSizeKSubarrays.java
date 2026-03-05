package org.leetcode.hard;


/**
 * <b>#3430 - Maximum and Minimum Sums of at Most Size K Subarrays</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Math, Stack, Monotonic Stack</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums and a positive integer k. Return the sum of the maximum and minimum elements of all subarrays with at most k elements.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3], k = 2
 *
 *
 * Output: 20
 *
 *
 * Explanation:
 *
 *
 * The subarrays of nums with at most 2 elements are:
 *
 *
 *
 *
 *
 * 			Subarray
 * 			Minimum
 * 			Maximum
 * 			Sum
 *
 *
 *
 *
 * 			[1]
 * 			1
 * 			1
 * 			2
 *
 *
 *
 *
 * 			[2]
 * 			2
 * 			2
 * 			4
 *
 *
 *
 *
 * 			[3]
 * 			3
 * 			3
 * 			6
 *
 *
 *
 *
 * 			[1, 2]
 * 			1
 * 			2
 * 			3
 *
 *
 *
 *
 * 			[2, 3]
 * 			2
 * 			3
 * 			5
 *
 *
 *
 *
 * 			Final Total
 *
 *
 * 			20
 *
 *
 *
 *
 * The output would be 20.
 *
 * Example 2:
 *
 * Input: nums = [1,-3,1], k = 2
 *
 *
 * Output: -6
 *
 *
 * Explanation:
 *
 *
 * The subarrays of nums with at most 2 elements are:
 *
 *
 *
 *
 *
 * 			Subarray
 * 			Minimum
 * 			Maximum
 * 			Sum
 *
 *
 *
 *
 * 			[1]
 * 			1
 * 			1
 * 			2
 *
 *
 *
 *
 * 			[-3]
 * 			-3
 * 			-3
 * 			-6
 *
 *
 *
 *
 * 			[1]
 * 			1
 * 			1
 * 			2
 *
 *
 *
 *
 * 			[1, -3]
 * 			-3
 * 			1
 * 			-2
 *
 *
 *
 *
 * 			[-3, 1]
 * 			-3
 * 			1
 * 			-2
 *
 *
 *
 *
 * 			Final Total
 *
 *
 * 			-6
 *
 *
 *
 *
 * The output would be -6.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 80000
 *
 * 1 &lt;= k &lt;= nums.length
 *
 * -106 &lt;= nums[i] &lt;= 106
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use a monotonic stack.
 * Hint 2: How can we calculate the number of subarrays where an element is the largest?
 * Hint 3: Enforce the condition on size too.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Stack, Monotonic Stack).
 *
 * @see <a href="https://leetcode.com/problems/maximum-and-minimum-sums-of-at-most-size-k-subarrays/">LeetCode #3430</a>
 */
public class MaximumAndMinimumSumsOfAtMostSizeKSubarrays {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum and Minimum Sums of at Most Size K Subarrays");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximumAndMinimumSumsOfAtMostSizeKSubarrays ===");
        MaximumAndMinimumSumsOfAtMostSizeKSubarrays sol = new MaximumAndMinimumSumsOfAtMostSizeKSubarrays();
        System.out.println(sol.solve(null));
    }
}
