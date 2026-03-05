package org.leetcode.hard;


/**
 * <b>#1224 - Maximum Equal Frequency</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Hash Table</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array nums of positive integers, return the longest possible length of an array prefix of nums, such that it is possible to remove exactly one element from this prefix so that every number that has appeared in it will have the same number of occurrences.
 *
 *
 * If after removing one element there are no remaining elements, it's still considered that every appeared number has the same number of ocurrences (0).
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,2,1,1,5,3,3,5]
 * Output: 7
 * Explanation: For the subarray [2,2,1,1,5,3,3] of length 7, if we remove nums[4] = 5, we will get [2,2,1,1,3,3], so that each number will appear exactly twice.
 *
 * Example 2:
 *
 * Input: nums = [1,1,1,2,2,2,3,3,3,4,4,4,5]
 * Output: 13
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Keep track of the min and max frequencies.
 * Hint 2: The number to be eliminated must have a frequency of 1, same as the others or the same +1.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/maximum-equal-frequency/">LeetCode #1224</a>
 */
public class MaximumEqualFrequency {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Equal Frequency");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MaximumEqualFrequency ===");
        MaximumEqualFrequency sol = new MaximumEqualFrequency();
        System.out.println(sol.solve(null));
    }
}
