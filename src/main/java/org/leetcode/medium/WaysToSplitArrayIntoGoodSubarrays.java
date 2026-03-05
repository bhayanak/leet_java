package org.leetcode.medium;


/**
 * <b>#2750 - Ways to Split Array Into Good Subarrays</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Math, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a binary array nums.
 *
 *
 * A subarray of an array is good if it contains exactly one element with the value 1.
 *
 *
 * Return an integer denoting the number of ways to split the array nums into good subarrays. As the number may be too large, return it modulo 109 + 7.
 *
 *
 * A subarray is a contiguous non-empty sequence of elements within an array.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [0,1,0,0,1]
 * Output: 3
 * Explanation: There are 3 ways to split nums into good subarrays:
 * - [0,1] [0,0,1]
 * - [0,1,0] [0,1]
 * - [0,1,0,0] [1]
 *
 * Example 2:
 *
 * Input: nums = [0,1,0]
 * Output: 1
 * Explanation: There is 1 way to split nums into good subarrays:
 * - [0,1,0]
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 0 &lt;= nums[i] &lt;= 1
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: If the array consists of only 0s answer is 0.
 * Hint 2: In the final split, exactly one separation point exists between two consecutive 1s.
 * Hint 3: In how many ways can separation points be put?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Dynamic Programming).
 *
 * @see <a href="https://leetcode.com/problems/ways-to-split-array-into-good-subarrays/">LeetCode #2750</a>
 */
public class WaysToSplitArrayIntoGoodSubarrays {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Ways to Split Array Into Good Subarrays");
    }

    public static void main(String[] args) {
        System.out.println("=== WaysToSplitArrayIntoGoodSubarrays ===");
        WaysToSplitArrayIntoGoodSubarrays sol = new WaysToSplitArrayIntoGoodSubarrays();
        System.out.println(sol.solve(null));
    }
}
