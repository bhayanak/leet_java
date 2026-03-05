package org.leetcode.medium;


/**
 * <b>#1775 - Equal Sum Arrays With Minimum Number of Operations</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Greedy, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two arrays of integers nums1 and nums2, possibly of different lengths. The values in the arrays are between 1 and 6, inclusive.
 *
 *
 * In one operation, you can change any integer's value in any of the arrays to any value between 1 and 6, inclusive.
 *
 *
 * Return the minimum number of operations required to make the sum of values in nums1 equal to the sum of values in nums2. Return -1​​​​​ if it is not possible to make the sum of the two arrays equal.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums1 = [1,2,3,4,5,6], nums2 = [1,1,2,2,2,2]
 * Output: 3
 * Explanation: You can make the sums of nums1 and nums2 equal with 3 operations. All indices are 0-indexed.
 * - Change nums2[0] to 6. nums1 = [1,2,3,4,5,6], nums2 = [6,1,2,2,2,2].
 * - Change nums1[5] to 1. nums1 = [1,2,3,4,5,1], nums2 = [6,1,2,2,2,2].
 * - Change nums1[2] to 2. nums1 = [1,2,2,4,5,1], nums2 = [6,1,2,2,2,2].
 *
 * Example 2:
 *
 * Input: nums1 = [1,1,1,1,1,1,1], nums2 = [6]
 * Output: -1
 * Explanation: There is no way to decrease the sum of nums1 or to increase the sum of nums2 to make them equal.
 *
 * Example 3:
 *
 * Input: nums1 = [6,6], nums2 = [1]
 * Output: 3
 * Explanation: You can make the sums of nums1 and nums2 equal with 3 operations. All indices are 0-indexed. 
 * - Change nums1[0] to 2. nums1 = [2,6], nums2 = [1].
 * - Change nums1[1] to 2. nums1 = [2,2], nums2 = [1].
 * - Change nums2[0] to 4. nums1 = [2,2], nums2 = [4].
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums1.length, nums2.length &lt;= 105
 *
 * 1 &lt;= nums1[i], nums2[i] &lt;= 6
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Let's note that we want to either decrease the sum of the array with a larger sum or increase the array's sum with the smaller sum.
 * Hint 2: You can maintain the largest increase or decrease you can make in a binary search tree and each time get the maximum one.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Greedy, Counting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/equal-sum-arrays-with-minimum-number-of-operations/">LeetCode #1775</a>
 */
public class EqualSumArraysWithMinimumNumberOfOperations {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Equal Sum Arrays With Minimum Number of Operations");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== EqualSumArraysWithMinimumNumberOfOperations ===");
        EqualSumArraysWithMinimumNumberOfOperations sol = new EqualSumArraysWithMinimumNumberOfOperations();
        System.out.println(sol.solve(null));
    }
}
