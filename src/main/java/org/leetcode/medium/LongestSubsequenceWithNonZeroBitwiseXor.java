package org.leetcode.medium;


/**
 * <b>#3702 - Longest Subsequence With Non-Zero Bitwise XOR</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Bit Manipulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums.
 *
 *
 * Return the length of the longest subsequence in nums whose bitwise XOR is non-zero. If no such subsequence exists, return 0.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3]
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * One longest subsequence is [2, 3]. The bitwise XOR is computed as 2 XOR 3 = 1, which is non-zero.
 *
 * Example 2:
 *
 * Input: nums = [2,3,4]
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 * The longest subsequence is [2, 3, 4]. The bitwise XOR is computed as 2 XOR 3 XOR 4 = 5, which is non-zero.
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
 * Hint 1: What happens if you take the entire array?
 * Hint 2: If the XOR of the entire array is 0, can removing one element help?
 * Hint 3: What if all elements are 0?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Bit Manipulation).
 *
 * @see <a href="https://leetcode.com/problems/longest-subsequence-with-non-zero-bitwise-xor/">LeetCode #3702</a>
 */
public class LongestSubsequenceWithNonZeroBitwiseXor {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Longest Subsequence With Non-Zero Bitwise XOR");
    }

    public static void main(String[] args) {
        System.out.println("=== LongestSubsequenceWithNonZeroBitwiseXor ===");
        LongestSubsequenceWithNonZeroBitwiseXor sol = new LongestSubsequenceWithNonZeroBitwiseXor();
        System.out.println(sol.solve(null));
    }
}
