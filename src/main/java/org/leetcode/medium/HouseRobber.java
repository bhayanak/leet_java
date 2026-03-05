package org.leetcode.medium;

/**
 * <b>#198 - House Robber</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
 * 
 * 
 * Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: nums = [1,2,3,1]
 * Output: 4
 * Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
 * Total amount you can rob = 1 + 3 = 4.
 * 
 * Example 2:
 * 
 * Input: nums = [2,7,9,3,1]
 * Output: 12
 * Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
 * Total amount you can rob = 2 + 9 + 1 = 12.
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= nums.length &lt;= 100
 * 	
 * 0 &lt;= nums[i] &lt;= 400
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — work through examples manually first.
 *
 * <h2>Approach</h2>
 * DP: at each house, choose max(rob_this + prev_prev, skip_this = prev).
 * Only need the last two states, not a full array.
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(1)
 *
 * @see <a href="https://leetcode.com/problems/house-robber/">LeetCode #198</a>
 */
public class HouseRobber {

    /**
     * Finds the maximum amount you can rob without robbing two adjacent houses.
     * @param nums money at each house
     * @return maximum money robbed
     */
    public int rob(int[] nums) {
        int prev2 = 0, prev1 = 0;
        for (int n : nums) {
            int curr = Math.max(prev1, prev2 + n); // rob current or skip
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }

    // ─── Run & Demo ──────────────────────────────────────────────
    /**
     * Runs sample test cases to demonstrate the solution.
     * Execute: javac HouseRobber.java &amp;&amp; java org.leetcode.medium.HouseRobber
     *
     * @param args not used
     */
    public static void main(String[] args) {
        HouseRobber sol = new HouseRobber();
        System.out.println(sol.rob(new int[]{1,2,3,1}));      // 4 (house 1 + house 3)
        System.out.println(sol.rob(new int[]{2,7,9,3,1}));    // 12 (house 1+3+5)
    }
}
