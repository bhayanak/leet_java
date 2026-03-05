package org.leetcode.medium;

/**
 * <b>#322 - Coin Change</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Breadth-First Search</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money.
 * 
 * 
 * Return the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.
 * 
 * 
 * You may assume that you have an infinite number of each kind of coin.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: coins = [1,2,5], amount = 11
 * Output: 3
 * Explanation: 11 = 5 + 5 + 1
 * 
 * Example 2:
 * 
 * Input: coins = [2], amount = 3
 * Output: -1
 * 
 * Example 3:
 * 
 * Input: coins = [1], amount = 0
 * Output: 0
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= coins.length &lt;= 12
 * 	
 * 1 &lt;= coins[i] &lt;= 231 - 1
 * 	
 * 0 &lt;= amount &lt;= 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — study the examples carefully.
 *
 * <h2>Approach</h2>
 * DP: dp[i] = minimum coins to make amount i.
 * For each coin, update dp[coin..amount].
 *
 * <h2>Complexity</h2>
* Time: O(amount·coins)  |  Space: O(amount)
 *
 * @see <a href="https://leetcode.com/problems/coin-change/">LeetCode #322</a>
 */
public class CoinChange {

    /**
     * Solves the problem: Coin change.
     * Uses dynamic programming to build solutions bottom-up.
     *
     * @param coins the coins (int[])
     * @param amount the amount (int)
     * @return the computed int result
     */
    public int coinChange(int[] coins, int amount) {
        int[] dp=new int[amount+1];
        java.util.Arrays.fill(dp,amount+1); // sentinel
        dp[0]=0;
        for(int c:coins) for(int i=c;i<=amount;i++) dp[i]=Math.min(dp[i],dp[i-c]+1);
        return dp[amount]>amount ? -1 : dp[amount];
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        CoinChange sol = new CoinChange();
        System.out.println(sol.coinChange(new int[]{1,5,11}, 15)); // 3 (5+5+5 actually wait: 11+1+1+1+1=5, check: coins {1,5,11} 15=11+... no: 15=5+5+5=3. Yes!)
        System.out.println(sol.coinChange(new int[]{2},3));         // -1
        System.out.println(sol.coinChange(new int[]{1},0));         // 0
    }
}
