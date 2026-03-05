package org.leetcode.medium;


/**
 * <b>#2741 - Special Permutations</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Bit Manipulation, Bitmask</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed integer array nums containing n distinct positive integers. A permutation of nums is called special if:
 *
 *
 * For all indexes 0 &lt;= i &lt; n - 1, either nums[i] % nums[i+1] == 0 or nums[i+1] % nums[i] == 0.
 *
 * Return the total number of special permutations. As the answer could be large, return it modulo 109 + 7.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,3,6]
 * Output: 2
 * Explanation: [3,6,2] and [2,6,3] are the two special permutations of nums.
 *
 * Example 2:
 *
 * Input: nums = [1,4,3]
 * Output: 2
 * Explanation: [3,1,4] and [4,1,3] are the two special permutations of nums.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= nums.length &lt;= 14
 *
 * 1 &lt;= nums[i] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Can we solve this problem using DP with bit masking?
 * Hint 2: You just need two states in DP which are last_ind in the permutation and the mask of numbers already used.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Bit Manipulation, Bitmask).
 *
 * @see <a href="https://leetcode.com/problems/special-permutations/">LeetCode #2741</a>
 */
public class SpecialPermutations {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Special Permutations");
    }

    public static void main(String[] args) {
        System.out.println("=== SpecialPermutations ===");
        SpecialPermutations sol = new SpecialPermutations();
        System.out.println(sol.solve(null));
    }
}
