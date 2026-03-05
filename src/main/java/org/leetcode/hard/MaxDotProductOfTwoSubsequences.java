package org.leetcode.hard;


/**
 * <b>#1458 - Max Dot Product of Two Subsequences</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given two arrays nums1 and nums2.
 *
 *
 * Return the maximum dot product between non-empty subsequences of nums1 and nums2 with the same length.
 *
 *
 * A subsequence of an array is a new array which is formed from the original array by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (ie, [2,3,5] is a subsequence of [1,2,3,4,5] while [1,5,3] is not).
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums1 = [2,1,-2,5], nums2 = [3,0,-6]
 * Output: 18
 * Explanation: Take subsequence [2,-2] from nums1 and subsequence [3,-6] from nums2.
 * Their dot product is (2*3 + (-2)*(-6)) = 18.
 *
 * Example 2:
 *
 * Input: nums1 = [3,-2], nums2 = [2,-6,7]
 * Output: 21
 * Explanation: Take subsequence [3] from nums1 and subsequence [7] from nums2.
 * Their dot product is (3*7) = 21.
 *
 * Example 3:
 *
 * Input: nums1 = [-1,-1], nums2 = [1,1]
 * Output: -1
 * Explanation: Take subsequence [-1] from nums1 and subsequence [1] from nums2.
 * Their dot product is -1.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums1.length, nums2.length &lt;= 500
 *
 * -1000 &lt;= nums1[i], nums2[i] &lt;= 1000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use dynamic programming, define DP[i][j] as the maximum dot product of two subsequences starting in the position i of nums1 and position j of nums2.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/max-dot-product-of-two-subsequences/">LeetCode #1458</a>
 */
public class MaxDotProductOfTwoSubsequences {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Max Dot Product of Two Subsequences");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MaxDotProductOfTwoSubsequences ===");
        MaxDotProductOfTwoSubsequences sol = new MaxDotProductOfTwoSubsequences();
        System.out.println(sol.solve(null));
    }
}
