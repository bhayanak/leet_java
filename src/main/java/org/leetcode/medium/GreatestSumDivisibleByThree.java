package org.leetcode.medium;


/**
 * <b>#1262 - Greatest Sum Divisible by Three</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Greedy, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer array nums, return the maximum possible sum of elements of the array such that it is divisible by three.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [3,6,5,1,8]
 * Output: 18
 * Explanation: Pick numbers 3, 6, 1 and 8 their sum is 18 (maximum sum divisible by 3).
 *
 * Example 2:
 *
 * Input: nums = [4]
 * Output: 0
 * Explanation: Since 4 is not divisible by 3, do not pick any number.
 *
 * Example 3:
 *
 * Input: nums = [1,2,3,4,4]
 * Output: 12
 * Explanation: Pick numbers 1, 3, 4 and 4 their sum is 12 (maximum sum divisible by 3).
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 4 * 104
 *
 * 1 &lt;= nums[i] &lt;= 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Represent the state as DP[pos][mod]: maximum possible sum starting in the position "pos" in the array where the current sum modulo 3 is equal to mod.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Greedy, Sorting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/greatest-sum-divisible-by-three/">LeetCode #1262</a>
 */
public class GreatestSumDivisibleByThree {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Greatest Sum Divisible by Three");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== GreatestSumDivisibleByThree ===");
        GreatestSumDivisibleByThree sol = new GreatestSumDivisibleByThree();
        System.out.println(sol.solve(null));
    }
}
