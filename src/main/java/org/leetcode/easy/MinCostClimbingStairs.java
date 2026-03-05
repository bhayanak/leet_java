package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #746: Min Cost Climbing Stairs
 * @see <a href="https://leetcode.com/problems/min-cost-climbing-stairs/">Problem</a>
 */
public class MinCostClimbingStairs {

    /**
     * LeetCode #746 – Min Cost Climbing Stairs
     * Difficulty: EASY
     * Topics: Array, Dynamic Programming
     *
     * You are given an integer array cost where cost[i] is the cost of ith step
     * on a staircase. Once you pay the cost, you can either climb one or two
     * steps.
     * 
     * 
     * You can either start from the step with index 0, or the step with index 1.
     * 
     * 
     * Return the minimum cost to reach the top of the floor.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: cost = [10,15,20]
     * Output: 15
     * Explanation: You will start at index 1.
     * - Pay 15 and climb two steps to reach the top.
     * The total cost is 15.
     * 
     * Example 2:
     * 
     * Input: cost = [1,100,1,1,1,100,1,1,100,1]
     * Output: 6
     * Explanation: You will start at index 0.
     * - Pay 1 and climb two steps to reach index 2.
     * - Pay 1 and climb two steps to reach index 4.
     * - Pay 1 and climb two steps to reach index 6.
     * - Pay 1 and climb one step to reach index 7.
     * - Pay 1 and climb two steps to reach index 9.
     * - Pay 1 and climb one step to reach the top.
     * The total cost is 6.
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 2 &lt;= cost.length &lt;= 1000
     * 
     * 0 &lt;= cost[i] &lt;= 999
      *
      * <p><b>Explanation:</b> Tracks the running minimum in a single O(n) scan.</p>
      */
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int a = cost[0], b = cost[1];
        for (int i = 2; i < n; i++) {
            int c = cost[i] + Math.min(a, b);
            a = b; b = c;
        }
        return Math.min(a, b);
    }

    public static void main(String[] args) {
        MinCostClimbingStairs sol = new MinCostClimbingStairs();
        System.out.println(sol.minCostClimbingStairs(new int[]{1,2,3}));
    }
}
