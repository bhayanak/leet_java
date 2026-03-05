package org.leetcode.medium;


/**
 * <b>#3644 - Maximum K to Sort a Permutation</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Bit Manipulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums of length n, where nums is a permutation of the numbers in the range [0..n - 1].
 *
 *
 * You may swap elements at indices i and j only if nums[i] AND nums[j] == k, where AND denotes the bitwise AND operation and k is a non-negative integer.
 *
 *
 * Return the maximum value of k such that the array can be sorted in non-decreasing order using any number of such swaps. If nums is already sorted, return 0.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [0,3,2,1]
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * Choose k = 1. Swapping nums[1] = 3 and nums[3] = 1 is allowed since nums[1] AND nums[3] == 1, resulting in a sorted permutation: [0, 1, 2, 3].
 *
 * Example 2:
 *
 * Input: nums = [0,1,3,2]
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * Choose k = 2. Swapping nums[2] = 3 and nums[3] = 2 is allowed since nums[2] AND nums[3] == 2, resulting in a sorted permutation: [0, 1, 2, 3].
 *
 * Example 3:
 *
 * Input: nums = [3,2,1,0]
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 *
 * Only k = 0 allows sorting since no greater k allows the required swaps where nums[i] AND nums[j] == k.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n == nums.length &lt;= 105
 *
 * 0 &lt;= nums[i] &lt;= n - 1
 *
 * nums is a permutation of integers from 0 to n - 1.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Take the bitwise AND of all elements that are not in their correct position.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Bit Manipulation).
 *
 * @see <a href="https://leetcode.com/problems/maximum-k-to-sort-a-permutation/">LeetCode #3644</a>
 */
public class MaximumKToSortAPermutation {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum K to Sort a Permutation");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximumKToSortAPermutation ===");
        MaximumKToSortAPermutation sol = new MaximumKToSortAPermutation();
        System.out.println(sol.solve(null));
    }
}
