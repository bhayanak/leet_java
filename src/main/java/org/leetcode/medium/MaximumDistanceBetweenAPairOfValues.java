package org.leetcode.medium;


/**
 * <b>#1855 - Maximum Distance Between a Pair of Values</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Two Pointers, Binary Search</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two non-increasing 0-indexed integer arrays nums1​​​​​​ and nums2​​​​​​.
 *
 *
 * A pair of indices (i, j), where 0 &lt;= i &lt; nums1.length and 0 &lt;= j &lt; nums2.length, is valid if both i &lt;= j and nums1[i] &lt;= nums2[j]. The distance of the pair is j - i​​​​.
 *
 *
 * Return the maximum distance of any valid pair (i, j). If there are no valid pairs, return 0.
 *
 *
 * An array arr is non-increasing if arr[i-1] &gt;= arr[i] for every 1 &lt;= i &lt; arr.length.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums1 = [55,30,5,4,2], nums2 = [100,20,10,10,5]
 * Output: 2
 * Explanation: The valid pairs are (0,0), (2,2), (2,3), (2,4), (3,3), (3,4), and (4,4).
 * The maximum distance is 2 with pair (2,4).
 *
 * Example 2:
 *
 * Input: nums1 = [2,2,2], nums2 = [10,10,1]
 * Output: 1
 * Explanation: The valid pairs are (0,0), (0,1), and (1,1).
 * The maximum distance is 1 with pair (0,1).
 *
 * Example 3:
 *
 * Input: nums1 = [30,29,19,5], nums2 = [25,25,25,25,25]
 * Output: 2
 * Explanation: The valid pairs are (2,2), (2,3), (2,4), (3,3), and (3,4).
 * The maximum distance is 2 with pair (2,4).
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums1.length, nums2.length &lt;= 105
 *
 * 1 &lt;= nums1[i], nums2[j] &lt;= 105
 *
 * Both nums1 and nums2 are non-increasing.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Since both arrays are sorted in a non-increasing way this means that for each value in the first array. We can find the farthest value smaller than it using binary search.
 * Hint 2: There is another solution using a two pointers approach since the first array is non-increasing the farthest j such that nums2[j] ≥ nums1[i] is at least as far as the farthest j such that nums2[j] ≥ nums1[i-1]
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Two Pointers, Binary Search).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/maximum-distance-between-a-pair-of-values/">LeetCode #1855</a>
 */
public class MaximumDistanceBetweenAPairOfValues {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Distance Between a Pair of Values");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MaximumDistanceBetweenAPairOfValues ===");
        MaximumDistanceBetweenAPairOfValues sol = new MaximumDistanceBetweenAPairOfValues();
        System.out.println(sol.solve(null));
    }
}
