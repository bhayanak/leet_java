package org.leetcode.medium;

/**
 * <b>#16 - Sum3 Closest</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Two Pointers, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer array nums of length n and an integer target, find three integers at distinct indices in nums such that the sum is closest to target.
 * 
 * 
 * Return the sum of the three integers.
 * 
 * 
 * You may assume that each input would have exactly one solution.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: nums = [-1,2,1,-4], target = 1
 * Output: 2
 * Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 * 
 * Example 2:
 * 
 * Input: nums = [0,0,0], target = 1
 * Output: 0
 * Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 3 &lt;= nums.length &lt;= 500
 * 	
 * -1000 &lt;= nums[i] &lt;= 1000
 * 	
 * -104 &lt;= target &lt;= 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints available — try to figure out the category and approach first!
 *
 * <h2>Approach</h2>
 * Sort, then for each element use two pointers for the remaining pair.
 * Track the sum closest to target. Update if |sum-target| is smaller.
 *
 * <h2>Complexity</h2>
* Time: O(n²)  |  Space: O(1)
 *
 * @see <a href="https://leetcode.com/problems/3sum-closest/">LeetCode #16</a>
 */
public class Sum3Closest {

    /**
     * Finds the sum of three integers in nums closest to target.
     *
     * @param nums   input array (length ≥ 3)
     * @param target the target sum
     * @return       the sum of the three integers closest to target
     */
    public int threeSumClosest(int[] nums, int target) {
        java.util.Arrays.sort(nums);
        int closest = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (Math.abs(sum - target) < Math.abs(closest - target)) closest = sum;
                if (sum < target) left++;
                else if (sum > target) right--;
                else return sum; // exact match
            }
        }
        return closest;
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== Sum3Closest ===");
        System.out.println("See class methods for usage.");
    }
}
