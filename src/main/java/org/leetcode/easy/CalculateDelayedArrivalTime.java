package org.leetcode.easy;


/**
 * <b>#2651 - Calculate Delayed Arrival Time</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Math</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a positive integer arrivalTime denoting the arrival time of a train in hours, and another positive integer delayedTime denoting the amount of delay in hours.
 *
 *
 * Return the time when the train will arrive at the station.
 *
 *
 * Note that the time in this problem is in 24-hours format.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: arrivalTime = 15, delayedTime = 5 
 * Output: 20 
 * Explanation: Arrival time of the train was 15:00 hours. It is delayed by 5 hours. Now it will reach at 15+5 = 20 (20:00 hours).
 *
 * Example 2:
 *
 * Input: arrivalTime = 13, delayedTime = 11
 * Output: 0
 * Explanation: Arrival time of the train was 13:00 hours. It is delayed by 11 hours. Now it will reach at 13+11=24 (Which is denoted by 00:00 in 24 hours format so return 0).
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= arrivaltime &lt; 24
 *
 * 1 &lt;= delayedTime &lt;= 24
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use the modulo operator to handle the case when the arrival time plus the delayed time goes beyond 24 hours.
 * Hint 2: If the arrival time plus the delayed time is greater than or equal to 24, you can also subtract 24 to get the time in the 24-hour format.
 *
 * <h2>Approach</h2>
 * Think about the category (Math).
 *
 * @see <a href="https://leetcode.com/problems/calculate-delayed-arrival-time/">LeetCode #2651</a>
  *
  * <p><b>Explanation:</b> Uses dynamic programming with a 1D/2D table to avoid recomputing overlapping subproblems.</p>
  */
public class CalculateDelayedArrivalTime {

    /**
     * Calculates Calculate minimum h p.
     * Uses dynamic programming to build solutions bottom-up.
     *
     * @param dungeon the dungeon (int[][])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Uses dynamic programming with a 1D/2D table to avoid recomputing overlapping subproblems.</p>
      */
    public int calculateMinimumHP(int[][] dungeon) {
        // Classic DP - reuse dungeon array
        int m=dungeon.length, n=dungeon[0].length;
        int[][] dp=new int[m][n];
        dp[m-1][n-1]=Math.max(1,1-dungeon[m-1][n-1]);
        for (int i=m-2;i>=0;i--) dp[i][n-1]=Math.max(1,dp[i+1][n-1]-dungeon[i][n-1]);
        for (int j=n-2;j>=0;j--) dp[m-1][j]=Math.max(1,dp[m-1][j+1]-dungeon[m-1][j]);
        for (int i=m-2;i>=0;i--) for (int j=n-2;j>=0;j--)
            dp[i][j]=Math.max(1,Math.min(dp[i+1][j],dp[i][j+1])-dungeon[i][j]);
        return dp[0][0];
    }

    public static void main(String[] args) {
        CalculateDelayedArrivalTime sol = new CalculateDelayedArrivalTime();
        System.out.println(sol.calculateMinimumHP(new int[][]{{1,2},{3,4}}));
    }
}
