package org.leetcode.medium;


/**
 * <b>#2680 - Maximum OR</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Greedy, Bit Manipulation, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed integer array nums of length n and an integer k. In an operation, you can choose an element and multiply it by 2.
 *
 *
 * Return the maximum possible value of nums[0] | nums[1] | ... | nums[n - 1] that can be obtained after applying the operation on nums at most k times.
 *
 *
 * Note that a | b denotes the bitwise or between two integers a and b.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [12,9], k = 1
 * Output: 30
 * Explanation: If we apply the operation to index 1, our new array nums will be equal to [12,18]. Thus, we return the bitwise or of 12 and 18, which is 30.
 *
 * Example 2:
 *
 * Input: nums = [8,1,2], k = 2
 * Output: 35
 * Explanation: If we apply the operation twice on index 0, we yield a new array of [32,1,2]. Thus, we return 32|1|2 = 35.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 109
 *
 * 1 &lt;= k &lt;= 15
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The optimal solution should apply all the k operations on a single number.
 * Hint 2: Calculate the prefix or and the suffix or and perform k operations over each element, and maximize the answer.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Greedy, Bit Manipulation, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/maximum-or/">LeetCode #2680</a>
 */
public class MaximumOr {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum OR");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximumOr ===");
        MaximumOr sol = new MaximumOr();
        System.out.println(sol.solve(null));
    }
}
