package org.leetcode.hard;


/**
 * <b>#3768 - Minimum Inversion Count in Subarrays of Fixed Length</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Segment Tree, Sliding Window</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums of length n and an integer k.
 *
 *
 * An inversion is a pair of indices (i, j) from nums such that i &lt; j and nums[i] &gt; nums[j].
 *
 *
 * The inversion count of a subarray is the number of inversions within it.
 *
 *
 * Return the minimum inversion count among all subarrays of nums with length k.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [3,1,2,5,4], k = 3
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 *
 * We consider all subarrays of length k = 3 (indices below are relative to each subarray):
 *
 *
 * [3, 1, 2] has 2 inversions: (0, 1) and (0, 2).
 *
 * [1, 2, 5] has 0 inversions.
 *
 * [2, 5, 4] has 1 inversion: (1, 2).
 *
 * The minimum inversion count among all subarrays of length 3 is 0, achieved by subarray [1, 2, 5].
 *
 * Example 2:
 *
 * Input: nums = [5,3,2,1], k = 4
 *
 *
 * Output: 6
 *
 *
 * Explanation:
 *
 *
 * There is only one subarray of length k = 4: [5, 3, 2, 1].
 *
 * Within this subarray, the inversions are: (0, 1), (0, 2), (0, 3), (1, 2), (1, 3), and (2, 3).
 *
 * Total inversions is 6, so the minimum inversion count is 6.
 *
 * Example 3:
 *
 * Input: nums = [2,1], k = 1
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 *
 * All subarrays of length k = 1 contain only one element, so no inversions are possible.
 *
 * The minimum inversion count is therefore 0.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n == nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 109
 *
 * 1 &lt;= k &lt;= n
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Compress all numbers to integers in the range <code>1</code> to <code>n</code>.
 * Hint 2: Use a Fenwick tree (BIT) to maintain counts of the numbers.
 * Hint 3: When adding an element at the back, query how many elements are larger than it; when deleting an element from the front, query how many elements are smaller and update the tree accordingly.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Segment Tree, Sliding Window).
 *
 * @see <a href="https://leetcode.com/problems/minimum-inversion-count-in-subarrays-of-fixed-length/">LeetCode #3768</a>
 */
public class MinimumInversionCountInSubarraysOfFixedLength {

    public static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Inversion Count in Subarrays of Fixed Length");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumInversionCountInSubarraysOfFixedLength ===");
        MinimumInversionCountInSubarraysOfFixedLength sol = new MinimumInversionCountInSubarraysOfFixedLength();
        System.out.println(sol.solve(null));
    }
}
