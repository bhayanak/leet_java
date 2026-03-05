package org.leetcode.medium;


/**
 * <b>#2592 - Maximize Greatness of an Array</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Two Pointers, Greedy, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed integer array nums. You are allowed to permute nums into a new array perm of your choosing.
 *
 *
 * We define the greatness of nums be the number of indices 0 &lt;= i &lt; nums.length for which perm[i] &gt; nums[i].
 *
 *
 * Return the maximum possible greatness you can achieve after permuting nums.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,3,5,2,1,3,1]
 * Output: 4
 * Explanation: One of the optimal rearrangements is perm = [2,5,1,3,3,1,1].
 * At indices = 0, 1, 3, and 4, perm[i] &gt; nums[i]. Hence, we return 4.
 *
 * Example 2:
 *
 * Input: nums = [1,2,3,4]
 * Output: 3
 * Explanation: We can prove the optimal perm is [2,3,4,1].
 * At indices = 0, 1, and 2, perm[i] &gt; nums[i]. Hence, we return 3.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 0 &lt;= nums[i] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Can we use sorting and two pointers here?
 * Hint 2: Assign every element the next bigger unused element as many times as possible.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Two Pointers, Greedy, Sorting).
 *
 * @see <a href="https://leetcode.com/problems/maximize-greatness-of-an-array/">LeetCode #2592</a>
 */
public class MaximizeGreatnessOfAnArray {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximize Greatness of an Array");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximizeGreatnessOfAnArray ===");
        MaximizeGreatnessOfAnArray sol = new MaximizeGreatnessOfAnArray();
        System.out.println(sol.solve(null));
    }
}
