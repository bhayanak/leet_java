package org.leetcode.medium;


/**
 * <b>#2740 - Find the Value of the Partition</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a positive integer array nums.
 *
 *
 * Partition nums into two arrays, nums1 and nums2, such that:
 *
 *
 * Each element of the array nums belongs to either the array nums1 or the array nums2.
 *
 * Both arrays are non-empty.
 *
 * The value of the partition is minimized.
 *
 * The value of the partition is |max(nums1) - min(nums2)|.
 *
 *
 * Here, max(nums1) denotes the maximum element of the array nums1, and min(nums2) denotes the minimum element of the array nums2.
 *
 *
 * Return the integer denoting the value of such partition.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,3,2,4]
 * Output: 1
 * Explanation: We can partition the array nums into nums1 = [1,2] and nums2 = [3,4].
 * - The maximum element of the array nums1 is equal to 2.
 * - The minimum element of the array nums2 is equal to 3.
 * The value of the partition is |2 - 3| = 1. 
 * It can be proven that 1 is the minimum value out of all partitions.
 *
 * Example 2:
 *
 * Input: nums = [100,1,10]
 * Output: 9
 * Explanation: We can partition the array nums into nums1 = [10] and nums2 = [100,1].
 * - The maximum element of the array nums1 is equal to 10.
 * - The minimum element of the array nums2 is equal to 1.
 * The value of the partition is |10 - 1| = 9.
 * It can be proven that 9 is the minimum value out of all partitions.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Sort the array.
 * Hint 2: The answer is min(nums[i+1] - nums[i]) for all i in the range [0, n-2].
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Sorting).
 *
 * @see <a href="https://leetcode.com/problems/find-the-value-of-the-partition/">LeetCode #2740</a>
 */
public class FindTheValueOfThePartition {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find the Value of the Partition");
    }

    public static void main(String[] args) {
        System.out.println("=== FindTheValueOfThePartition ===");
        FindTheValueOfThePartition sol = new FindTheValueOfThePartition();
        System.out.println(sol.solve(null));
    }
}
