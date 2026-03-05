package org.leetcode.medium;

/**
 * <b>#377 - Combination Sum IV</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array of distinct integers nums and a target integer target, return the number of possible combinations that add up to target.
 * 
 * 
 * The test cases are generated so that the answer can fit in a 32-bit integer.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: nums = [1,2,3], target = 4
 * Output: 7
 * Explanation:
 * The possible combination ways are:
 * (1, 1, 1, 1)
 * (1, 1, 2)
 * (1, 2, 1)
 * (1, 3)
 * (2, 1, 1)
 * (2, 2)
 * (3, 1)
 * Note that different sequences are counted as different combinations.
 * 
 * Example 2:
 * 
 * Input: nums = [9], target = 3
 * Output: 0
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= nums.length &lt;= 200
 * 	
 * 1 &lt;= nums[i] &lt;= 1000
 * 	
 * All the elements of nums are unique.
 * 	
 * 1 &lt;= target &lt;= 1000
 * 
 *  
 * 
 * Follow up: What if negative numbers are allowed in the given array? How does it change the problem? What limitation we need to add to the question to allow negative numbers?
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — study the examples carefully.
 *
 * <h2>Approach</h2>
 * DP: dp[i] = number of ways to reach sum i.
 * For each amount from 1..target, add dp[i-coin] for all valid coins.
 *
 * <h2>Complexity</h2>
* Time: O(target·coins)  |  Space: O(target)
 *
 * @see <a href="https://leetcode.com/problems/combination-sum-iv/">LeetCode #377</a>
 */
public class CombinationSumIv {

    /**
     * Solves the problem: Combination sum4.
     * Uses dynamic programming to build solutions bottom-up.
     *
     * @param nums the nums (int[])
     * @param target the target (int)
     * @return the computed int result
     */
    public int combinationSum4(int[] nums, int target) {
        int[] dp=new int[target+1]; dp[0]=1;
        for(int i=1;i<=target;i++)
            for(int n:nums) if(i>=n) dp[i]+=dp[i-n];
        return dp[target];
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        CombinationSumIv sol = new CombinationSumIv();
        System.out.println(sol.combinationSum4(new int[]{1,2,3},4)); // 7
        System.out.println(sol.combinationSum4(new int[]{9},3));     // 0
    }
}
