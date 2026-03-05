package org.leetcode.medium;


/**
 * <b>#3334 - Find the Maximum Factor Score of Array</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Math, Number Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums.
 *
 *
 * The factor score of an array is defined as the product of the LCM and GCD of all elements of that array.
 *
 *
 * Return the maximum factor score of nums after removing at most one element from it.
 *
 *
 * Note that both the LCM and GCD of a single number are the number itself, and the factor score of an empty array is 0.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,4,8,16]
 *
 *
 * Output: 64
 *
 *
 * Explanation:
 *
 *
 * On removing 2, the GCD of the rest of the elements is 4 while the LCM is 16, which gives a maximum factor score of 4 * 16 = 64.
 *
 * Example 2:
 *
 * Input: nums = [1,2,3,4,5]
 *
 *
 * Output: 60
 *
 *
 * Explanation:
 *
 *
 * The maximum factor score of 60 can be obtained without removing any elements.
 *
 * Example 3:
 *
 * Input: nums = [3]
 *
 *
 * Output: 9
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 100
 *
 * 1 &lt;= nums[i] &lt;= 30
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use brute force approach with two loops.
 * Hint 2: Optimize using prefix and suffix arrays.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Number Theory).
 *
 * @see <a href="https://leetcode.com/problems/find-the-maximum-factor-score-of-array/">LeetCode #3334</a>
 */
public class FindTheMaximumFactorScoreOfArray {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find the Maximum Factor Score of Array");
    }

    public static void main(String[] args) {
        System.out.println("=== FindTheMaximumFactorScoreOfArray ===");
        FindTheMaximumFactorScoreOfArray sol = new FindTheMaximumFactorScoreOfArray();
        System.out.println(sol.solve(null));
    }
}
