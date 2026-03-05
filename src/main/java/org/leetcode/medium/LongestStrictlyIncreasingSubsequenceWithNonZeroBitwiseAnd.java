package org.leetcode.medium;


/**
 * <b>#3825 - Longest Strictly Increasing Subsequence With Non-Zero Bitwise AND</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Binary Search, Bit Manipulation, Enumeration</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums.
 *
 *
 * Return the length of the longest strictly increasing subsequence in nums whose bitwise AND is non-zero. If no such subsequence exists, return 0.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [5,4,7]
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * One longest strictly increasing subsequence is [5, 7]. The bitwise AND is 5 AND 7 = 5, which is non-zero.
 *
 * Example 2:
 *
 * Input: nums = [2,3,6]
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 * The longest strictly increasing subsequence is [2, 3, 6]. The bitwise AND is 2 AND 3 AND 6 = 2, which is non-zero.
 *
 * Example 3:
 *
 * Input: nums = [0,1]
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * One longest strictly increasing subsequence is [1]. The bitwise AND is 1, which is non-zero.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 0 &lt;= nums[i] &lt;= 109​​​​​​​
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Solve bit-by-bit for each <code>b</code> in <code>0..30</code>.
 * Hint 2: Filter: take elements with bit <code>b</code> set, preserving order.
 * Hint 3: On that filtered sequence compute the longest increasing subsequence (LIS).
 * Hint 4: Return the maximum LIS over all bits; if no candidates return <code>0</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search, Bit Manipulation, Enumeration).
 *
 * @see <a href="https://leetcode.com/problems/longest-strictly-increasing-subsequence-with-non-zero-bitwise-and/">LeetCode #3825</a>
 */
public class LongestStrictlyIncreasingSubsequenceWithNonZeroBitwiseAnd {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Longest Strictly Increasing Subsequence With Non-Zero Bitwise AND");
    }

    public static void main(String[] args) {
        System.out.println("=== LongestStrictlyIncreasingSubsequenceWithNonZeroBitwiseAnd ===");
        LongestStrictlyIncreasingSubsequenceWithNonZeroBitwiseAnd sol = new LongestStrictlyIncreasingSubsequenceWithNonZeroBitwiseAnd();
        System.out.println(sol.solve(null));
    }
}
