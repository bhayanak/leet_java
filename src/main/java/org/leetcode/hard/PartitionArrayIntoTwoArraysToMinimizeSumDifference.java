package org.leetcode.hard;


/**
 * <b>#2035 - Partition Array Into Two Arrays to Minimize Sum Difference</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Two Pointers, Binary Search, Dynamic Programming, Bit Manipulation, Sorting, Ordered Set, Bitmask</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums of 2 * n integers. You need to partition nums into two arrays of length n to minimize the absolute difference of the sums of the arrays. To partition nums, put each element of nums into one of the two arrays.
 *
 *
 * Return the minimum possible absolute difference.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [3,9,7,3]
 * Output: 2
 * Explanation: One optimal partition is: [3,9] and [7,3].
 * The absolute difference between the sums of the arrays is abs((3 + 9) - (7 + 3)) = 2.
 *
 * Example 2:
 *
 * Input: nums = [-36,36]
 * Output: 72
 * Explanation: One optimal partition is: [-36] and [36].
 * The absolute difference between the sums of the arrays is abs((-36) - (36)) = 72.
 *
 * Example 3:
 *
 * Input: nums = [2,-1,0,4,-2,-9]
 * Output: 0
 * Explanation: One optimal partition is: [2,4,-9] and [-1,0,-2].
 * The absolute difference between the sums of the arrays is abs((2 + 4 + -9) - (-1 + 0 + -2)) = 0.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 15
 *
 * nums.length == 2 * n
 *
 * -107 &lt;= nums[i] &lt;= 107
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The target sum for the two partitions is sum(nums) / 2.
 * Hint 2: Could you reduce the time complexity if you arbitrarily divide nums into two halves (two arrays)? Meet-in-the-Middle?
 * Hint 3: For both halves, pre-calculate a 2D array where the kth index will store all possible sum values if only k elements from this half are added.
 * Hint 4: For each sum of k elements in the first half, find the best sum of n-k elements in the second half such that the two sums add up to a value closest to the target sum from hint 1. These two subsets will form one array of the partition.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Two Pointers, Binary Search, Dynamic Programming, Bit Manipulation, Sorting, Ordered Set, Bitmask).
 *
 * @see <a href="https://leetcode.com/problems/partition-array-into-two-arrays-to-minimize-sum-difference/">LeetCode #2035</a>
 */
public class PartitionArrayIntoTwoArraysToMinimizeSumDifference {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Partition Array Into Two Arrays to Minimize Sum Difference");
    }

    public static void main(String[] args) {
        System.out.println("=== PartitionArrayIntoTwoArraysToMinimizeSumDifference ===");
        PartitionArrayIntoTwoArraysToMinimizeSumDifference sol = new PartitionArrayIntoTwoArraysToMinimizeSumDifference();
        System.out.println(sol.solve(null));
    }
}
