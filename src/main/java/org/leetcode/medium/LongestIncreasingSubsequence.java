package org.leetcode.medium;

/**
 * <b>#300 - Longest Increasing Subsequence</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Binary Search, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer array nums, return the length of the longest strictly increasing subsequence.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: nums = [10,9,2,5,3,7,101,18]
 * Output: 4
 * Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.
 * 
 * Example 2:
 * 
 * Input: nums = [0,1,0,3,2,3]
 * Output: 4
 * 
 * Example 3:
 * 
 * Input: nums = [7,7,7,7,7,7,7]
 * Output: 1
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= nums.length &lt;= 2500
 * 	
 * -104 &lt;= nums[i] &lt;= 104
 * 
 *  
 * 
 * Follow up: Can you come up with an algorithm that runs in O(n log(n)) time complexity?
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — study the examples carefully.
 *
 * <h2>Approach</h2>
 * Binary search (patience sorting): maintain 'tails' array where tails[i] is the
 * smallest tail of all increasing subsequences of length i+1.
 * Binary search to find where each element fits.
 *
 * <h2>Complexity</h2>
* Time: O(n log n)  |  Space: O(n)
 *
 * @see <a href="https://leetcode.com/problems/longest-increasing-subsequence/">LeetCode #300</a>
 */
public class LongestIncreasingSubsequence {

    /**
     * Solves the problem: Length of l i s.
     * Uses binary search for O(log n) lookup.
     *
     * @param nums the nums (int[])
     * @return the computed int result
     */
    public int lengthOfLIS(int[] nums) {
        java.util.List<Integer> tails=new java.util.ArrayList<>();
        for(int n:nums){
            int lo=0,hi=tails.size();
            while(lo<hi){int mid=lo+(hi-lo)/2;if(tails.get(mid)<n)lo=mid+1;else hi=mid;}
            if(lo==tails.size()) tails.add(n);
            else tails.set(lo,n);
        }
        return tails.size();
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        LongestIncreasingSubsequence sol = new LongestIncreasingSubsequence();
        System.out.println(sol.lengthOfLIS(new int[]{10,9,2,5,3,7,101,18})); // 4 [2,3,7,101]
        System.out.println(sol.lengthOfLIS(new int[]{0,1,0,3,2,3}));         // 4
        System.out.println(sol.lengthOfLIS(new int[]{7,7,7,7,7,7,7}));       // 1
    }
}
