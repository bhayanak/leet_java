package org.leetcode.hard;


/**
 * <b>#1703 - Minimum Adjacent Swaps for K Consecutive Ones</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Greedy, Sliding Window, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array, nums, and an integer k. nums comprises of only 0's and 1's. In one move, you can choose two adjacent indices and swap their values.
 *
 *
 * Return the minimum number of moves required so that nums has k consecutive 1's.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,0,0,1,0,1], k = 2
 * Output: 1
 * Explanation: In 1 move, nums could be [1,0,0,0,1,1] and have 2 consecutive 1's.
 *
 * Example 2:
 *
 * Input: nums = [1,0,0,0,0,0,1,1], k = 3
 * Output: 5
 * Explanation: In 5 moves, the leftmost 1 can be shifted right until nums = [0,0,0,0,0,1,1,1].
 *
 * Example 3:
 *
 * Input: nums = [1,1,0,1], k = 2
 * Output: 0
 * Explanation: nums already has 2 consecutive 1's.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * nums[i] is 0 or 1.
 *
 * 1 &lt;= k &lt;= sum(nums)
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Choose k 1s and determine how many steps are required to move them into 1 group.
 * Hint 2: Maintain a sliding window of k 1s, and maintain the steps required to group them.
 * Hint 3: When you slide the window across, should you move the group to the right? Once you move the group to the right, it will never need to slide to the left again.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Greedy, Sliding Window, Prefix Sum).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/minimum-adjacent-swaps-for-k-consecutive-ones/">LeetCode #1703</a>
 */
public class MinimumAdjacentSwapsForKConsecutiveOnes {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Adjacent Swaps for K Consecutive Ones");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MinimumAdjacentSwapsForKConsecutiveOnes ===");
        MinimumAdjacentSwapsForKConsecutiveOnes sol = new MinimumAdjacentSwapsForKConsecutiveOnes();
        System.out.println(sol.solve(null));
    }
}
