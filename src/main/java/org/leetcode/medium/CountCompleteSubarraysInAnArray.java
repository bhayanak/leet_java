package org.leetcode.medium;


/**
 * <b>#2799 - Count Complete Subarrays in an Array</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Sliding Window</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array nums consisting of positive integers.
 *
 *
 * We call a subarray of an array complete if the following condition is satisfied:
 *
 *
 * The number of distinct elements in the subarray is equal to the number of distinct elements in the whole array.
 *
 * Return the number of complete subarrays.
 *
 *
 * A subarray is a contiguous non-empty part of an array.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,3,1,2,2]
 * Output: 4
 * Explanation: The complete subarrays are the following: [1,3,1,2], [1,3,1,2,2], [3,1,2] and [3,1,2,2].
 *
 * Example 2:
 *
 * Input: nums = [5,5,5,5]
 * Output: 10
 * Explanation: The array consists only of the integer 5, so any subarray is complete. The number of subarrays that we can choose is 10.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 1000
 *
 * 1 &lt;= nums[i] &lt;= 2000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Let’s say k is the number of distinct elements in the array. Our goal is to find the number of subarrays with k distinct elements.
 * Hint 2: Since the constraints are small, you can check every subarray.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Sliding Window).
 *
 * @see <a href="https://leetcode.com/problems/count-complete-subarrays-in-an-array/">LeetCode #2799</a>
 */
public class CountCompleteSubarraysInAnArray {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Complete Subarrays in an Array");
    }

    public static void main(String[] args) {
        System.out.println("=== CountCompleteSubarraysInAnArray ===");
        CountCompleteSubarraysInAnArray sol = new CountCompleteSubarraysInAnArray();
        System.out.println(sol.solve(null));
    }
}
