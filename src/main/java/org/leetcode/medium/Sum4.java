package org.leetcode.medium;

/**
 * <b>#18 - Sum4</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Two Pointers, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:
 * 
 * 	
 * 0 &lt;= a, b, c, d &lt; n
 * 	
 * a, b, c, and d are distinct.
 * 	
 * nums[a] + nums[b] + nums[c] + nums[d] == target
 * 
 * You may return the answer in any order.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: nums = [1,0,-1,0,-2,2], target = 0
 * Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
 * 
 * Example 2:
 * 
 * Input: nums = [2,2,2,2,2], target = 8
 * Output: [[2,2,2,2]]
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= nums.length &lt;= 200
 * 	
 * -109 &lt;= nums[i] &lt;= 109
 * 	
 * -109 &lt;= target &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints available — try to figure out the category and approach first!
 *
 * <h2>Approach</h2>
 * Generalised two-pointer: sort, then fix two outer indices i &lt; j, and run
 * two pointers on the remaining array. Skip duplicates at every level.
 *
 * <h2>Complexity</h2>
* Time: O(n³)  |  Space: O(1) excluding output
 *
 * @see <a href="https://leetcode.com/problems/4sum/">LeetCode #18</a>
 */
public class Sum4 {

    /**
     * Finds all unique quadruplets [a,b,c,d] such that a+b+c+d == target.
     *
     * @param nums   input array
     * @param target required sum
     * @return       list of all unique quadruplets
     */
    public java.util.List<java.util.List<Integer>> fourSum(int[] nums, int target) {
        java.util.Arrays.sort(nums);
        java.util.List<java.util.List<Integer>> res = new java.util.ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                int left = j + 1, right = n - 1;
                while (left < right) {
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum == target) {
                        res.add(java.util.Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        while (left < right && nums[left] == nums[left + 1]) left++;
                        while (left < right && nums[right] == nums[right - 1]) right--;
                        left++; right--;
                    } else if (sum < target) left++;
                    else right--;
                }
            }
        }
        return res;
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== Sum4 ===");
        System.out.println("See class methods for usage.");
    }
}
