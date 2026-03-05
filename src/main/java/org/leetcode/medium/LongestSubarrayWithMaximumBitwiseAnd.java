package org.leetcode.medium;


/**
 * <b>#2419 - Longest Subarray With Maximum Bitwise AND</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Bit Manipulation, Brainteaser</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums of size n.
 *
 *
 * Consider a non-empty subarray from nums that has the maximum possible bitwise AND.
 *
 *
 * In other words, let k be the maximum value of the bitwise AND of any subarray of nums. Then, only subarrays with a bitwise AND equal to k should be considered.
 *
 * Return the length of the longest such subarray.
 *
 *
 * The bitwise AND of an array is the bitwise AND of all the numbers in it.
 *
 *
 * A subarray is a contiguous sequence of elements within an array.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,3,2,2]
 * Output: 2
 * Explanation:
 * The maximum possible bitwise AND of a subarray is 3.
 * The longest subarray with that value is [3,3], so we return 2.
 *
 * Example 2:
 *
 * Input: nums = [1,2,3,4]
 * Output: 1
 * Explanation:
 * The maximum possible bitwise AND of a subarray is 4.
 * The longest subarray with that value is [4], so we return 1.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 106
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Notice that the bitwise AND of two different numbers will always be strictly less than the maximum of those two numbers.
 * Hint 2: What does that tell us about the nature of the subarray that we should choose?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Bit Manipulation, Brainteaser).
 *
 * @see <a href="https://leetcode.com/problems/longest-subarray-with-maximum-bitwise-and/">LeetCode #2419</a>
 */
public class LongestSubarrayWithMaximumBitwiseAnd {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Longest Subarray With Maximum Bitwise AND");
    }

    public static void main(String[] args) {
        System.out.println("=== LongestSubarrayWithMaximumBitwiseAnd ===");
        LongestSubarrayWithMaximumBitwiseAnd sol = new LongestSubarrayWithMaximumBitwiseAnd();
        System.out.println(sol.solve(null));
    }
}
