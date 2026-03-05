package org.leetcode.easy;


/**
 * <b>#3467 - Transform Array by Parity</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Sorting, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums. Transform nums by performing the following operations in the exact order specified:
 *
 *
 * Replace each even number with 0.
 *
 * Replace each odd numbers with 1.
 *
 * Sort the modified array in non-decreasing order.
 *
 * Return the resulting array after performing these operations.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [4,3,2,1]
 *
 *
 * Output: [0,0,1,1]
 *
 *
 * Explanation:
 *
 *
 * Replace the even numbers (4 and 2) with 0 and the odd numbers (3 and 1) with 1. Now, nums = [0, 1, 0, 1].
 *
 * After sorting nums in non-descending order, nums = [0, 0, 1, 1].
 *
 * Example 2:
 *
 * Input: nums = [1,5,1,4,2]
 *
 *
 * Output: [0,0,1,1,1]
 *
 *
 * Explanation:
 *
 *
 * Replace the even numbers (4 and 2) with 0 and the odd numbers (1, 5 and 1) with 1. Now, nums = [1, 1, 1, 0, 0].
 *
 * After sorting nums in non-descending order, nums = [0, 0, 1, 1, 1].
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 100
 *
 * 1 &lt;= nums[i] &lt;= 1000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Let <code>x</code> be the number of even numbers, and <code>y</code> be the number of odd numbers. Output <code>0</code> <code>x</code> times, followed by <code>1</code> <code>y</code> times.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Sorting, Counting).
 *
 * @see <a href="https://leetcode.com/problems/transform-array-by-parity/">LeetCode #3467</a>
  *
  * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
  */
public class TransformArrayByParity {

    /**
     * Solves the problem: Transform array.
     *
     * @param nums the nums (int[])
     * @return the computed long result
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public long transformArray(int[] nums) {
        // Count swaps to sort
        int inv=0, n=nums.length;
        for (int i=0;i<n;i++) for (int j=i+1;j<n;j++) if (nums[i]>nums[j]) inv++;
        return inv;
    }

    public static void main(String[] args) {
        TransformArrayByParity sol = new TransformArrayByParity();
                System.out.println(sol.transformArray(new int[]{4,3,2,1})); // 6
                System.out.println(sol.transformArray(new int[]{1,2,3,4})); // 0
    }
}
