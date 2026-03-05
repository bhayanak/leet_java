package org.leetcode.hard;


/**
 * <b>#2040 - Kth Smallest Product of Two Sorted Arrays</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Binary Search</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given two sorted 0-indexed integer arrays nums1 and nums2 as well as an integer k, return the kth (1-based) smallest product of nums1[i] * nums2[j] where 0 &lt;= i &lt; nums1.length and 0 &lt;= j &lt; nums2.length.
 *
 *
 *
 * Example 1:
 *
 * Input: nums1 = [2,5], nums2 = [3,4], k = 2
 * Output: 8
 * Explanation: The 2 smallest products are:
 * - nums1[0] * nums2[0] = 2 * 3 = 6
 * - nums1[0] * nums2[1] = 2 * 4 = 8
 * The 2nd smallest product is 8.
 *
 * Example 2:
 *
 * Input: nums1 = [-4,-2,0,3], nums2 = [2,4], k = 6
 * Output: 0
 * Explanation: The 6 smallest products are:
 * - nums1[0] * nums2[1] = (-4) * 4 = -16
 * - nums1[0] * nums2[0] = (-4) * 2 = -8
 * - nums1[1] * nums2[1] = (-2) * 4 = -8
 * - nums1[1] * nums2[0] = (-2) * 2 = -4
 * - nums1[2] * nums2[0] = 0 * 2 = 0
 * - nums1[2] * nums2[1] = 0 * 4 = 0
 * The 6th smallest product is 0.
 *
 * Example 3:
 *
 * Input: nums1 = [-2,-1,0,1,2], nums2 = [-3,-1,2,4,5], k = 3
 * Output: -6
 * Explanation: The 3 smallest products are:
 * - nums1[0] * nums2[4] = (-2) * 5 = -10
 * - nums1[0] * nums2[3] = (-2) * 4 = -8
 * - nums1[4] * nums2[0] = 2 * (-3) = -6
 * The 3rd smallest product is -6.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums1.length, nums2.length &lt;= 5 * 104
 *
 * -105 &lt;= nums1[i], nums2[j] &lt;= 105
 *
 * 1 &lt;= k &lt;= nums1.length * nums2.length
 *
 * nums1 and nums2 are sorted.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Can we split this problem into four cases depending on the sign of the numbers?
 * Hint 2: Can we binary search the value?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search).
 *
 * @see <a href="https://leetcode.com/problems/kth-smallest-product-of-two-sorted-arrays/">LeetCode #2040</a>
 */
public class KthSmallestProductOfTwoSortedArrays {

    /**
     * Solves the problem and Solve.
     * Sorts the input first to enable efficient processing.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Kth Smallest Product of Two Sorted Arrays");
    }

    public static void main(String[] args) {
        System.out.println("=== KthSmallestProductOfTwoSortedArrays ===");
        KthSmallestProductOfTwoSortedArrays sol = new KthSmallestProductOfTwoSortedArrays();
        System.out.println(sol.solve(null));
    }
}
