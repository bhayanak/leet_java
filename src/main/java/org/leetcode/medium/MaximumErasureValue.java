package org.leetcode.medium;


/**
 * <b>#1695 - Maximum Erasure Value</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Sliding Window</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array of positive integers nums and want to erase a subarray containing unique elements. The score you get by erasing the subarray is equal to the sum of its elements.
 *
 *
 * Return the maximum score you can get by erasing exactly one subarray.
 *
 *
 * An array b is called to be a subarray of a if it forms a contiguous subsequence of a, that is, if it is equal to a[l],a[l+1],...,a[r] for some (l,r).
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [4,2,4,5,6]
 * Output: 17
 * Explanation: The optimal subarray here is [2,4,5,6].
 *
 * Example 2:
 *
 * Input: nums = [5,2,1,2,5,2,1,2,5]
 * Output: 8
 * Explanation: The optimal subarray here is [5,2,1] or [1,2,5].
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The main point here is for the subarray to contain unique elements for each index. Only the first subarrays starting from that index have unique elements.
 * Hint 2: This can be solved using the two pointers technique
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Sliding Window).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/maximum-erasure-value/">LeetCode #1695</a>
 */
public class MaximumErasureValue {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Erasure Value");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MaximumErasureValue ===");
        MaximumErasureValue sol = new MaximumErasureValue();
        System.out.println(sol.solve(null));
    }
}
