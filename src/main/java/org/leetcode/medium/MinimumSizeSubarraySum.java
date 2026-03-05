package org.leetcode.medium;

/**
 * <b>#209 - Minimum Size Subarray Sum</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Binary Search, Sliding Window, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: target = 7, nums = [2,3,1,2,4,3]
 * Output: 2
 * Explanation: The subarray [4,3] has the minimal length under the problem constraint.
 * 
 * Example 2:
 * 
 * Input: target = 4, nums = [1,4,4]
 * Output: 1
 * 
 * Example 3:
 * 
 * Input: target = 11, nums = [1,1,1,1,1,1,1,1]
 * Output: 0
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= target &lt;= 109
 * 	
 * 1 &lt;= nums.length &lt;= 105
 * 	
 * 1 &lt;= nums[i] &lt;= 104
 * 
 *  
 * Follow up: If you have figured out the O(n) solution, try coding another solution of which the time complexity is O(n log(n)).
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — study the examples carefully.
 *
 * <h2>Approach</h2>
 * Sliding window: expand right, then shrink left while sum &gt;= target.
 * Track minimum window length each time condition is met.
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(1)
 *
 * @see <a href="https://leetcode.com/problems/minimum-size-subarray-sum/">LeetCode #209</a>
 */
public class MinimumSizeSubarraySum {

    /**
     * Computes the minimum Min sub array len.
     *
     * @param target the target (int)
     * @param nums the nums (int[])
     * @return the computed int result
     */
    public int minSubArrayLen(int target, int[] nums) {
        int l=0, sum=0, min=Integer.MAX_VALUE;
        for (int r=0; r<nums.length; r++) {
            sum += nums[r];
            while (sum >= target) {
                min = Math.min(min, r-l+1);
                sum -= nums[l++];
            }
        }
        return min==Integer.MAX_VALUE ? 0 : min;
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        MinimumSizeSubarraySum sol = new MinimumSizeSubarraySum();
        System.out.println(sol.minSubArrayLen(7, new int[]{2,3,1,2,4,3})); // 2 ([4,3])
        System.out.println(sol.minSubArrayLen(4, new int[]{1,4,4}));       // 1 ([4])
        System.out.println(sol.minSubArrayLen(11,new int[]{1,1,1,1,1,1,1,1})); // 0
    }
}
