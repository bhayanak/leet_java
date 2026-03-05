package org.leetcode.medium;


/**
 * <b>#1567 - Maximum Length of Subarray With Positive Product</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array of integers nums, find the maximum length of a subarray where the product of all its elements is positive.
 *
 *
 * A subarray of an array is a consecutive sequence of zero or more values taken out of that array.
 *
 *
 * Return the maximum length of a subarray with positive product.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,-2,-3,4]
 * Output: 4
 * Explanation: The array nums already has a positive product of 24.
 *
 * Example 2:
 *
 * Input: nums = [0,1,-2,-3,-4]
 * Output: 3
 * Explanation: The longest subarray with positive product is [1,-2,-3] which has a product of 6.
 * Notice that we cannot include 0 in the subarray since that'll make the product 0 which is not positive.
 *
 * Example 3:
 *
 * Input: nums = [-1,-2,-3,0,1]
 * Output: 2
 * Explanation: The longest subarray with positive product is [-1,-2] or [-2,-3].
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * -109 &lt;= nums[i] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Split the whole array into subarrays by zeroes since a subarray with positive product cannot contain any zero.
 * Hint 2: If the subarray has even number of negative numbers, the whole subarray has positive product.
 * Hint 3: Otherwise, we have two choices, either - remove the prefix till the first negative element in this subarray, or remove the suffix starting from the last negative element in this subarray.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Greedy).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/maximum-length-of-subarray-with-positive-product/">LeetCode #1567</a>
 */
public class MaximumLengthOfSubarrayWithPositiveProduct {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Length of Subarray With Positive Product");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MaximumLengthOfSubarrayWithPositiveProduct ===");
        MaximumLengthOfSubarrayWithPositiveProduct sol = new MaximumLengthOfSubarrayWithPositiveProduct();
        System.out.println(sol.solve(null));
    }
}
