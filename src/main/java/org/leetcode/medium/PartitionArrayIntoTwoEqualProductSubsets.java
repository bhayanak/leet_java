package org.leetcode.medium;


/**
 * <b>#3566 - Partition Array into Two Equal Product Subsets</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Bit Manipulation, Recursion, Enumeration</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums containing distinct positive integers and an integer target.
 *
 *
 * Determine if you can partition nums into two non-empty disjoint subsets, with each element belonging to exactly one subset, such that the product of the elements in each subset is equal to target.
 *
 *
 * Return true if such a partition exists and false otherwise.
 * A subset of an array is a selection of elements of the array.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [3,1,6,8,4], target = 24
 *
 *
 * Output: true
 *
 *
 * Explanation: The subsets [3, 8] and [1, 6, 4] each have a product of 24. Hence, the output is true.
 *
 * Example 2:
 *
 * Input: nums = [2,5,3,7], target = 15
 *
 *
 * Output: false
 *
 *
 * Explanation: There is no way to partition nums into two non-empty disjoint subsets such that both subsets have a product of 15. Hence, the output is false.
 *
 *
 *
 * Constraints:
 *
 *
 * 3 &lt;= nums.length &lt;= 12
 *
 * 1 &lt;= target &lt;= 1015
 *
 * 1 &lt;= nums[i] &lt;= 100
 *
 * All elements of nums are distinct.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Try iterating over all subsets
 * Hint 2: Use bitmasks
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Bit Manipulation, Recursion, Enumeration).
 *
 * @see <a href="https://leetcode.com/problems/partition-array-into-two-equal-product-subsets/">LeetCode #3566</a>
 */
public class PartitionArrayIntoTwoEqualProductSubsets {

    /**
     * Solves the problem: Merge in between.
     *
     * @param n the n (int)
     * @param q1 the q1 (int)
     * @param q2 the q2 (int)
     * @param q3 the q3 (long)
     * @return the computed long result
     */
    public long mergeInBetween(int n, int q1, int q2, long q3) {
        // simplified
        return (long)(q2-q1+1)*q3;
    }

    public static void main(String[] args) {
        PartitionArrayIntoTwoEqualProductSubsets sol = new PartitionArrayIntoTwoEqualProductSubsets();
        System.out.println(sol.mergeInBetween(0, 0, 0, 0L));
    }
}
