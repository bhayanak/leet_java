package org.leetcode.medium;


/**
 * <b>#1674 - Minimum Moves to Make Array Complementary</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums of even length n and an integer limit. In one move, you can replace any integer from nums with another integer between 1 and limit, inclusive.
 *
 *
 * The array nums is complementary if for all indices i (0-indexed), nums[i] + nums[n - 1 - i] equals the same number. For example, the array [1,2,3,4] is complementary because for all indices i, nums[i] + nums[n - 1 - i] = 5.
 *
 *
 * Return the minimum number of moves required to make nums complementary.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,4,3], limit = 4
 * Output: 1
 * Explanation: In 1 move, you can change nums to [1,2,2,3] (underlined elements are changed).
 * nums[0] + nums[3] = 1 + 3 = 4.
 * nums[1] + nums[2] = 2 + 2 = 4.
 * nums[2] + nums[1] = 2 + 2 = 4.
 * nums[3] + nums[0] = 3 + 1 = 4.
 * Therefore, nums[i] + nums[n-1-i] = 4 for every i, so nums is complementary.
 *
 * Example 2:
 *
 * Input: nums = [1,2,2,1], limit = 2
 * Output: 2
 * Explanation: In 2 moves, you can change nums to [2,2,2,2]. You cannot change any number to 3 since 3 &gt; limit.
 *
 * Example 3:
 *
 * Input: nums = [1,2,1,2], limit = 2
 * Output: 0
 * Explanation: nums is already complementary.
 *
 *
 *
 * Constraints:
 *
 *
 * n == nums.length
 *
 * 2 &lt;= n &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= limit &lt;= 105
 *
 * n is even.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Given a target sum x, each pair of nums[i] and nums[n-1-i] would either need 0, 1, or 2 modifications.
 * Hint 2: Can you find the optimal target sum x value such that the sum of modifications is minimized?
 * Hint 3: Create a difference array to efficiently sum all the modifications.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Prefix Sum).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/minimum-moves-to-make-array-complementary/">LeetCode #1674</a>
 */
public class MinimumMovesToMakeArrayComplementary {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Moves to Make Array Complementary");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MinimumMovesToMakeArrayComplementary ===");
        MinimumMovesToMakeArrayComplementary sol = new MinimumMovesToMakeArrayComplementary();
        System.out.println(sol.solve(null));
    }
}
