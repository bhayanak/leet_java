package org.leetcode.easy;


/**
 * <b>#1800 - Maximum Ascending Subarray Sum</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array of positive integers nums, return the maximum possible sum of an strictly increasing subarray in nums.
 *
 *
 * A subarray is defined as a contiguous sequence of numbers in an array.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [10,20,30,5,10,50]
 * Output: 65
 * Explanation: [5,10,50] is the ascending subarray with the maximum sum of 65.
 *
 * Example 2:
 *
 * Input: nums = [10,20,30,40,50]
 * Output: 150
 * Explanation: [10,20,30,40,50] is the ascending subarray with the maximum sum of 150.
 *
 * Example 3:
 *
 * Input: nums = [12,17,15,13,10,11,12]
 * Output: 33
 * Explanation: [10,11,12] is the ascending subarray with the maximum sum of 33.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 100
 *
 * 1 &lt;= nums[i] &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: It is fast enough to check all possible subarrays
 * Hint 2: The end of each ascending subarray will be the start of the next
 *
 * <h2>Approach</h2>
 * Think about the category (Array).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/maximum-ascending-subarray-sum/">LeetCode #1800</a>
  *
  * <p><b>Explanation:</b> Tracks the running maximum in a single O(n) scan without extra space.</p>
  */
public class MaximumAscendingSubarraySum {

    /**
     * Computes the maximum Max ascending sum.
     *
     * @param nums the nums (int[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Tracks the running maximum in a single O(n) scan without extra space.</p>
      */
    public int maxAscendingSum(int[] nums) {
        int max=nums[0], cur=nums[0];
        for (int i=1;i<nums.length;i++) {
            cur = nums[i]>nums[i-1] ? cur+nums[i] : nums[i];
            max=Math.max(max,cur);
        }
        return max;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        MaximumAscendingSubarraySum sol = new MaximumAscendingSubarraySum();
                System.out.println(sol.maxAscendingSum(new int[]{10,20,30,5,10,50})); // 65
                System.out.println(sol.maxAscendingSum(new int[]{10,20,30,40,50}));   // 150
                System.out.println(sol.maxAscendingSum(new int[]{12,17,15,13,10,11,12})); // 33
    }
}
