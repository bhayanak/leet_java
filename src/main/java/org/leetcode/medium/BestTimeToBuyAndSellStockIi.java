package org.leetcode.medium;

/**
 * <b>#122 - Best Time to Buy and Sell Stock II</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
 * 
 * 
 * On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can sell and buy the stock multiple times on the same day, ensuring you never hold more than one share of the stock.
 * 
 * 
 * Find and return the maximum profit you can achieve.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: prices = [7,1,5,3,6,4]
 * Output: 7
 * Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
 * Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
 * Total profit is 4 + 3 = 7.
 * 
 * Example 2:
 * 
 * Input: prices = [1,2,3,4,5]
 * Output: 4
 * Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
 * Total profit is 4.
 * 
 * Example 3:
 * 
 * Input: prices = [7,6,4,3,1]
 * Output: 0
 * Explanation: There is no way to make a positive profit, so we never buy the stock to achieve the maximum profit of 0.
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= prices.length &lt;= 3 * 104
 * 	
 * 0 &lt;= prices[i] &lt;= 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — work through examples manually first.
 *
 * <h2>Approach</h2>
 * Greedy: capture every upward price move. Sum all positive consecutive differences.
 * This is equivalent to buying at each valley and selling at each peak.
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(1)
 *
 * @see <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/">LeetCode #122</a>
 */
public class BestTimeToBuyAndSellStockIi {

    /**
     * Finds the maximum profit when you can buy and sell multiple times.
     * @param prices daily stock prices
     * @return total maximum profit
     */
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++)
            if (prices[i] > prices[i-1]) profit += prices[i] - prices[i-1]; // grab every gain
        return profit;
    }

    // ─── Run & Demo ──────────────────────────────────────────────
    /**
     * Runs sample test cases to demonstrate the solution.
     * Execute: javac BestTimeToBuyAndSellStockIi.java &amp;&amp; java org.leetcode.medium.BestTimeToBuyAndSellStockIi
     *
     * @param args not used
     */
    public static void main(String[] args) {
        BestTimeToBuyAndSellStockIi sol = new BestTimeToBuyAndSellStockIi();
        System.out.println(sol.maxProfit(new int[]{7,1,5,3,6,4})); // 7 (1->5 + 3->6)
        System.out.println(sol.maxProfit(new int[]{1,2,3,4,5}));   // 4
    }
}
