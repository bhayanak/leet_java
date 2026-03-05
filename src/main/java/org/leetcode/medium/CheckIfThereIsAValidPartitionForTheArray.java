package org.leetcode.medium;


/**
 * <b>#2369 - Check if There is a Valid Partition For The Array</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed integer array nums. You have to partition the array into one or more contiguous subarrays.
 *
 *
 * We call a partition of the array valid if each of the obtained subarrays satisfies one of the following conditions:
 *
 *
 * The subarray consists of exactly 2, equal elements. For example, the subarray [2,2] is good.
 *
 * The subarray consists of exactly 3, equal elements. For example, the subarray [4,4,4] is good.
 *
 * The subarray consists of exactly 3 consecutive increasing elements, that is, the difference between adjacent elements is 1. For example, the subarray [3,4,5] is good, but the subarray [1,3,5] is not.
 *
 * Return true if the array has at least one valid partition. Otherwise, return false.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [4,4,4,5,6]
 * Output: true
 * Explanation: The array can be partitioned into the subarrays [4,4] and [4,5,6].
 * This partition is valid, so we return true.
 *
 * Example 2:
 *
 * Input: nums = [1,1,1,2]
 * Output: false
 * Explanation: There is no valid partition for this array.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 106
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: How can you reduce the problem to checking if there is a valid partition for a smaller array?
 * Hint 2: Use dynamic programming to reduce the problem until you have an empty array.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming).
 *
 * @see <a href="https://leetcode.com/problems/check-if-there-is-a-valid-partition-for-the-array/">LeetCode #2369</a>
 */
public class CheckIfThereIsAValidPartitionForTheArray {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Check if There is a Valid Partition For The Array");
    }

    public static void main(String[] args) {
        System.out.println("=== CheckIfThereIsAValidPartitionForTheArray ===");
        CheckIfThereIsAValidPartitionForTheArray sol = new CheckIfThereIsAValidPartitionForTheArray();
        System.out.println(sol.solve(null));
    }
}
