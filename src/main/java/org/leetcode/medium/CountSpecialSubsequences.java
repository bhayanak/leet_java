package org.leetcode.medium;


/**
 * <b>#3404 - Count Special Subsequences</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Math, Enumeration</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array nums consisting of positive integers.
 *
 *
 * A special subsequence is defined as a subsequence of length 4, represented by indices (p, q, r, s), where p &lt; q &lt; r &lt; s. This subsequence must satisfy the following conditions:
 *
 *
 * nums[p] * nums[r] == nums[q] * nums[s]
 *
 * There must be at least one element between each pair of indices. In other words, q - p &gt; 1, r - q &gt; 1 and s - r &gt; 1.
 *
 * Return the number of different special subsequences in nums.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,4,3,6,1]
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * There is one special subsequence in nums.
 *
 *
 * (p, q, r, s) = (0, 2, 4, 6):
 *
 *
 *
 *
 * This corresponds to elements (1, 3, 3, 1).
 *
 * nums[p] * nums[r] = nums[0] * nums[4] = 1 * 3 = 3
 *
 * nums[q] * nums[s] = nums[2] * nums[6] = 3 * 1 = 3
 *
 *
 *
 * Example 2:
 *
 * Input: nums = [3,4,3,4,3,4,3,4]
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 * There are three special subsequences in nums.
 *
 *
 * (p, q, r, s) = (0, 2, 4, 6):
 *
 *
 *
 *
 * This corresponds to elements (3, 3, 3, 3).
 *
 * nums[p] * nums[r] = nums[0] * nums[4] = 3 * 3 = 9
 *
 * nums[q] * nums[s] = nums[2] * nums[6] = 3 * 3 = 9
 *
 *
 *
 * (p, q, r, s) = (1, 3, 5, 7):
 *
 *
 *
 * This corresponds to elements (4, 4, 4, 4).
 *
 * nums[p] * nums[r] = nums[1] * nums[5] = 4 * 4 = 16
 *
 * nums[q] * nums[s] = nums[3] * nums[7] = 4 * 4 = 16
 *
 *
 *
 * (p, q, r, s) = (0, 2, 5, 7):
 *
 *
 *
 * This corresponds to elements (3, 3, 4, 4).
 *
 * nums[p] * nums[r] = nums[0] * nums[5] = 3 * 4 = 12
 *
 * nums[q] * nums[s] = nums[2] * nums[7] = 3 * 4 = 12
 *
 *
 *
 *
 *
 * Constraints:
 *
 *
 * 7 &lt;= nums.length &lt;= 1000
 *
 * 1 &lt;= nums[i] &lt;= 1000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Count pairs where <code>nums[p] / nums[q]</code> equals <code>nums[s] / nums[r]</code>, using GCD to handle ratios efficiently.
 * Hint 2: Try iterating over <code>(p, q)</code> pairs and efficiently count valid <code>(r, s)</code> pairs with the same ratio.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Math, Enumeration).
 *
 * @see <a href="https://leetcode.com/problems/count-special-subsequences/">LeetCode #3404</a>
 */
public class CountSpecialSubsequences {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Special Subsequences");
    }

    public static void main(String[] args) {
        System.out.println("=== CountSpecialSubsequences ===");
        CountSpecialSubsequences sol = new CountSpecialSubsequences();
        System.out.println(sol.solve(null));
    }
}
