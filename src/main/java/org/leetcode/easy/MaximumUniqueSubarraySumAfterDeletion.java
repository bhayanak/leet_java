package org.leetcode.easy;


/**
 * <b>#3487 - Maximum Unique Subarray Sum After Deletion</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Hash Table, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums.
 *
 *
 * You are allowed to delete any number of elements from nums without making it empty. After performing the deletions, select a subarray of nums such that:
 *
 *
 * All elements in the subarray are unique.
 *
 * The sum of the elements in the subarray is maximized.
 *
 * Return the maximum sum of such a subarray.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,4,5]
 *
 *
 * Output: 15
 *
 *
 * Explanation:
 *
 *
 * Select the entire array without deleting any element to obtain the maximum sum.
 *
 * Example 2:
 *
 * Input: nums = [1,1,0,1,1]
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * Delete the element nums[0] == 1, nums[1] == 1, nums[2] == 0, and nums[3] == 1. Select the entire array [1] to obtain the maximum sum.
 *
 * Example 3:
 *
 * Input: nums = [1,2,-1,-2,1,0,-1]
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 * Delete the elements nums[2] == -1 and nums[3] == -2, and select the subarray [2, 1] from [1, 2, 1, 0, -1] to obtain the maximum sum.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 100
 *
 * -100 &lt;= nums[i] &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: If the maximum element in the array is less than zero, the answer is the maximum element.
 * Hint 2: Otherwise, the answer is the sum of all unique values that are greater than or equal to zero.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Greedy).
 *
 * @see <a href="https://leetcode.com/problems/maximum-unique-subarray-sum-after-deletion/">LeetCode #3487</a>
  *
  * <p><b>Explanation:</b> Sorts the input first to simplify subsequent search or comparison steps.</p>
  */
public class MaximumUniqueSubarraySumAfterDeletion {

    /**
     * Computes the maximum Max product.
     * Sorts the input first to enable efficient processing.
     *
     * @param nums the nums (int[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Sorts the input first to simplify subsequent search or comparison steps.</p>
      */
    public int maxProduct(int[] nums) {
        java.util.Arrays.sort(nums);
        int n=nums.length;
        // Either two positives or two negatives (absolute values)
        int pos=(nums[n-1])*(nums[n-2]);
        int neg=nums[0]*nums[1];
        return Math.max(pos,neg);
    }

    public static void main(String[] args) {
        MaximumUniqueSubarraySumAfterDeletion sol = new MaximumUniqueSubarraySumAfterDeletion();
        System.out.println(sol.maxProduct(new int[]{1,2,3}));
    }
}
