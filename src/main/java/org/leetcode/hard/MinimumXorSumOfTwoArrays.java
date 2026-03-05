package org.leetcode.hard;


/**
 * <b>#1879 - Minimum XOR Sum of Two Arrays</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Bit Manipulation, Bitmask</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two integer arrays nums1 and nums2 of length n.
 *
 *
 * The XOR sum of the two integer arrays is (nums1[0] XOR nums2[0]) + (nums1[1] XOR nums2[1]) + ... + (nums1[n - 1] XOR nums2[n - 1]) (0-indexed).
 *
 *
 * For example, the XOR sum of [1,2,3] and [3,2,1] is equal to (1 XOR 3) + (2 XOR 2) + (3 XOR 1) = 2 + 0 + 2 = 4.
 *
 * Rearrange the elements of nums2 such that the resulting XOR sum is minimized.
 *
 *
 * Return the XOR sum after the rearrangement.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums1 = [1,2], nums2 = [2,3]
 * Output: 2
 * Explanation: Rearrange nums2 so that it becomes [3,2].
 * The XOR sum is (1 XOR 3) + (2 XOR 2) = 2 + 0 = 2.
 *
 * Example 2:
 *
 * Input: nums1 = [1,0,3], nums2 = [5,3,4]
 * Output: 8
 * Explanation: Rearrange nums2 so that it becomes [5,4,3]. 
 * The XOR sum is (1 XOR 5) + (0 XOR 4) + (3 XOR 3) = 4 + 4 + 0 = 8.
 *
 *
 *
 * Constraints:
 *
 *
 * n == nums1.length
 *
 * n == nums2.length
 *
 * 1 &lt;= n &lt;= 14
 *
 * 0 &lt;= nums1[i], nums2[i] &lt;= 107
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Since n &lt;= 14, we can consider every subset of nums2.
 * Hint 2: We can represent every subset of nums2 using bitmasks.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Bit Manipulation, Bitmask).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/minimum-xor-sum-of-two-arrays/">LeetCode #1879</a>
 */
public class MinimumXorSumOfTwoArrays {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum XOR Sum of Two Arrays");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MinimumXorSumOfTwoArrays ===");
        MinimumXorSumOfTwoArrays sol = new MinimumXorSumOfTwoArrays();
        System.out.println(sol.solve(null));
    }
}
