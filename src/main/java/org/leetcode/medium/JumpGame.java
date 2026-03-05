package org.leetcode.medium;

/**
 * <b>#55 - Jump Game</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.
 * 
 * 
 * Return true if you can reach the last index, or false otherwise.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: nums = [2,3,1,1,4]
 * Output: true
 * Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
 * 
 * Example 2:
 * 
 * Input: nums = [3,2,1,0,4]
 * Output: false
 * Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= nums.length &lt;= 104
 * 	
 * 0 &lt;= nums[i] &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints available — try to figure out the category and approach first!
 *
 * <h2>Approach</h2>
 * Greedy: track the maximum reachable index.
 * If we ever reach an index beyond maxReach, we're stuck.
 * If maxReach &gt;= last index before the loop ends, return true.
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(1)
 *
 * @see <a href="https://leetcode.com/problems/jump-game/">LeetCode #55</a>
 */
public class JumpGame {

    /**
     * Determines whether the last index is reachable from index 0.
     * nums[i] is the maximum jump length from position i.
     *
     * @param nums jump length array
     * @return     true if the last index is reachable
     */
    public boolean canJump(int[] nums) {
        int maxReach = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) return false; // can't reach this index
            maxReach = Math.max(maxReach, i + nums[i]);
        }
        return true;
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
                JumpGame sol = new JumpGame();
                System.out.println(sol.canJump(new int[]{2,3,1,1,4})); // true
                System.out.println(sol.canJump(new int[]{3,2,1,0,4})); // false
    }
}
