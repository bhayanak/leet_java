package org.leetcode.hard;


/**
 * <b>#2386 - Find the K-Sum of an Array</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Sorting, Heap (Priority Queue)</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums and a positive integer k. You can choose any subsequence of the array and sum all of its elements together.
 *
 *
 * We define the K-Sum of the array as the kth largest subsequence sum that can be obtained (not necessarily distinct).
 *
 *
 * Return the K-Sum of the array.
 *
 *
 * A subsequence is an array that can be derived from another array by deleting some or no elements without changing the order of the remaining elements.
 *
 *
 * Note that the empty subsequence is considered to have a sum of 0.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,4,-2], k = 5
 * Output: 2
 * Explanation: All the possible subsequence sums that we can obtain are the following sorted in decreasing order:
 * 6, 4, 4, 2, 2, 0, 0, -2.
 * The 5-Sum of the array is 2.
 *
 * Example 2:
 *
 * Input: nums = [1,-2,3,4,-10,12], k = 16
 * Output: 10
 * Explanation: The 16-Sum of the array is 10.
 *
 *
 *
 * Constraints:
 *
 *
 * n == nums.length
 *
 * 1 &lt;= n &lt;= 105
 *
 * -109 &lt;= nums[i] &lt;= 109
 *
 * 1 &lt;= k &lt;= min(2000, 2n)
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Start from the largest sum possible, and keep finding the next largest sum until you reach the kth sum.
 * Hint 2: Starting from a sum, what are the two next largest sums that you can obtain from it?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Sorting, Heap (Priority Queue)).
 *
 * @see <a href="https://leetcode.com/problems/find-the-k-sum-of-an-array/">LeetCode #2386</a>
 */
public class FindTheKSumOfAnArray {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find the K-Sum of an Array");
    }

    public static void main(String[] args) {
        System.out.println("=== FindTheKSumOfAnArray ===");
        FindTheKSumOfAnArray sol = new FindTheKSumOfAnArray();
        System.out.println(sol.solve(null));
    }
}
