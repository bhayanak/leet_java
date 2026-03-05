package org.leetcode.medium;


/**
 * <b>#3781 - Maximum Score After Binary Swaps</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, String, Greedy, Heap (Priority Queue)</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums of length n and a binary string s of the same length.
 *
 *
 * Initially, your score is 0. Each index i where s[i] = '1' contributes nums[i] to the score.
 *
 *
 * You may perform any number of operations (including zero). In one operation, you may choose an index i such that 0 &lt;= i &lt; n - 1, where s[i] = '0', and s[i + 1] = '1', and swap these two characters.
 *
 *
 * Return an integer denoting the maximum possible score you can achieve.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,1,5,2,3], s = "01010"
 *
 *
 * Output: 7
 *
 *
 * Explanation:
 *
 *
 * We can perform the following swaps:
 *
 *
 * Swap at index i = 0: "01010" changes to "10010"
 *
 * Swap at index i = 2: "10010" changes to "10100"
 *
 * Positions 0 and 2 contain '1', contributing nums[0] + nums[2] = 2 + 5 = 7. This is maximum score achievable.
 *
 * Example 2:
 *
 * Input: nums = [4,7,2,9], s = "0000"
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 *
 * There are no '1' characters in s, so no swaps can be performed. The score remains 0.
 *
 *
 *
 * Constraints:
 *
 *
 * n == nums.length == s.length
 *
 * 1 &lt;= n &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 109
 *
 * s[i] is either '0' or '1'
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The problem can be solved greedily
 * Hint 2: The operation only allows <code>'1'</code>s to move backward
 * Hint 3: Going from left to right, maintain a priority queue (max heap)
 * Hint 4: When at a <code>'1'</code>, pop the top of the priority queue if it is not empty
 *
 * <h2>Approach</h2>
 * Think about the category (Array, String, Greedy, Heap (Priority Queue)).
 *
 * @see <a href="https://leetcode.com/problems/maximum-score-after-binary-swaps/">LeetCode #3781</a>
 */
public class MaximumScoreAfterBinarySwaps {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Score After Binary Swaps");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximumScoreAfterBinarySwaps ===");
        MaximumScoreAfterBinarySwaps sol = new MaximumScoreAfterBinarySwaps();
        System.out.println(sol.solve(null));
    }
}
