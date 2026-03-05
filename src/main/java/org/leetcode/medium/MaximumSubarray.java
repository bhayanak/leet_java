package org.leetcode.medium;

/**
 * <b>#53 - Maximum Subarray</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Divide and Conquer, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer array nums, find the subarray with the largest sum, and return its sum.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * Output: 6
 * Explanation: The subarray [4,-1,2,1] has the largest sum 6.
 * 
 * Example 2:
 * 
 * Input: nums = [1]
 * Output: 1
 * Explanation: The subarray [1] has the largest sum 1.
 * 
 * Example 3:
 * 
 * Input: nums = [5,4,-1,7,8]
 * Output: 23
 * Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= nums.length &lt;= 105
 * 	
 * -104 &lt;= nums[i] &lt;= 104
 * 
 *  
 * 
 * Follow up: If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints available — try to figure out the category and approach first!
 *
 * <h2>Approach</h2>
 * Kadane's Algorithm: scan left-to-right, maintaining a running sum.
 * If the running sum goes negative, reset it to 0 (start a new subarray).
 * Track the maximum sum seen.
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(1)
 *
 * @see <a href="https://leetcode.com/problems/maximum-subarray/">LeetCode #53</a>
 */
public class MaximumSubarray {

    /**
     * Finds the contiguous subarray with the largest sum.
     *
     * @param nums input array (at least one element)
     * @return     maximum subarray sum
     */
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0], current = nums[0];
        for (int i = 1; i < nums.length; i++) {
            current = Math.max(nums[i], current + nums[i]); // extend or restart
            maxSum  = Math.max(maxSum, current);
        }
        return maxSum;
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
                MaximumSubarray sol = new MaximumSubarray();
                System.out.println(sol.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4})); // 6
                System.out.println(sol.maxSubArray(new int[]{1}));                      // 1
                System.out.println(sol.maxSubArray(new int[]{5,4,-1,7,8}));            // 23
    }
}
