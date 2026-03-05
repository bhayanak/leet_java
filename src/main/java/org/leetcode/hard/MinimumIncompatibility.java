package org.leetcode.hard;


/**
 * <b>#1681 - Minimum Incompatibility</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Hash Table, Dynamic Programming, Bit Manipulation, Bitmask</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums​​​ and an integer k. You are asked to distribute this array into k subsets of equal size such that there are no two equal elements in the same subset.
 *
 *
 * A subset's incompatibility is the difference between the maximum and minimum elements in that array.
 *
 *
 * Return the minimum possible sum of incompatibilities of the k subsets after distributing the array optimally, or return -1 if it is not possible.
 *
 *
 * A subset is a group integers that appear in the array with no particular order.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,1,4], k = 2
 * Output: 4
 * Explanation: The optimal distribution of subsets is [1,2] and [1,4].
 * The incompatibility is (2-1) + (4-1) = 4.
 * Note that [1,1] and [2,4] would result in a smaller sum, but the first subset contains 2 equal elements.
 *
 * Example 2:
 *
 * Input: nums = [6,3,8,1,3,1,2,2], k = 4
 * Output: 6
 * Explanation: The optimal distribution of subsets is [1,2], [2,3], [6,8], and [1,3].
 * The incompatibility is (2-1) + (3-2) + (8-6) + (3-1) = 6.
 *
 * Example 3:
 *
 * Input: nums = [5,3,3,6,3,3], k = 3
 * Output: -1
 * Explanation: It is impossible to distribute nums into 3 subsets where no two elements are equal in the same subset.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= k &lt;= nums.length &lt;= 16
 *
 * nums.length is divisible by k
 *
 * 1 &lt;= nums[i] &lt;= nums.length
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The constraints are small enough for a backtrack solution but not any backtrack solution
 * Hint 2: If we use a naive n^k don't you think it can be optimized
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Dynamic Programming, Bit Manipulation, Bitmask).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/minimum-incompatibility/">LeetCode #1681</a>
 */
public class MinimumIncompatibility {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Incompatibility");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MinimumIncompatibility ===");
        MinimumIncompatibility sol = new MinimumIncompatibility();
        System.out.println(sol.solve(null));
    }
}
