package org.leetcode.medium;


/**
 * <b>#3115 - Maximum Prime Difference</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Math, Number Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums.
 *
 *
 * Return an integer that is the maximum distance between the indices of two (not necessarily different) prime numbers in nums.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [4,2,9,5,3]
 *
 *
 * Output: 3
 *
 *
 * Explanation: nums[1], nums[3], and nums[4] are prime. So the answer is |4 - 1| = 3.
 *
 * Example 2:
 *
 * Input: nums = [4,8,2,8]
 *
 *
 * Output: 0
 *
 *
 * Explanation: nums[2] is prime. Because there is just one prime number, the answer is |2 - 2| = 0.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 3 * 105
 *
 * 1 &lt;= nums[i] &lt;= 100
 *
 * The input is generated such that the number of prime numbers in the nums is at least one.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Find all prime numbers in the <code>nums</code>.
 * Hint 2: Find the first and the last prime number in the <code>nums</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Number Theory).
 *
 * @see <a href="https://leetcode.com/problems/maximum-prime-difference/">LeetCode #3115</a>
 */
public class MaximumPrimeDifference {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Prime Difference");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximumPrimeDifference ===");
        MaximumPrimeDifference sol = new MaximumPrimeDifference();
        System.out.println(sol.solve(null));
    }
}
