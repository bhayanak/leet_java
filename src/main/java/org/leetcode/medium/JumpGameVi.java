package org.leetcode.medium;


/**
 * <b>#1696 - Jump Game VI</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Queue, Heap (Priority Queue), Monotonic Queue</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed integer array nums and an integer k.
 *
 *
 * You are initially standing at index 0. In one move, you can jump at most k steps forward without going outside the boundaries of the array. That is, you can jump from index i to any index in the range [i + 1, min(n - 1, i + k)] inclusive.
 *
 *
 * You want to reach the last index of the array (index n - 1). Your score is the sum of all nums[j] for each index j you visited in the array.
 *
 *
 * Return the maximum score you can get.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,-1,-2,4,-7,3], k = 2
 * Output: 7
 * Explanation: You can choose your jumps forming the subsequence [1,-1,4,3] (underlined above). The sum is 7.
 *
 * Example 2:
 *
 * Input: nums = [10,-5,-2,4,0,3], k = 3
 * Output: 17
 * Explanation: You can choose your jumps forming the subsequence [10,4,3] (underlined above). The sum is 17.
 *
 * Example 3:
 *
 * Input: nums = [1,-5,-20,4,-1,3,-6,-3], k = 2
 * Output: 0
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length, k &lt;= 105
 *
 * -104 &lt;= nums[i] &lt;= 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Let dp[i] be "the maximum score to reach the end starting at index i". The answer for dp[i] is nums[i] + max{dp[i+j]} for 1 &lt;= j &lt;= k. That gives an O(n*k) solution.
 * Hint 2: Instead of checking every j for every i, keep track of the largest dp[i] values in a heap and calculate dp[i] from right to left. When the largest value in the heap is out of bounds of the current index, remove it and keep checking.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Queue, Heap (Priority Queue), Monotonic Queue).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/jump-game-vi/">LeetCode #1696</a>
 */
public class JumpGameVi {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Jump Game VI");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== JumpGameVi ===");
        JumpGameVi sol = new JumpGameVi();
        System.out.println(sol.solve(null));
    }
}
