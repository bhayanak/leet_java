package org.leetcode.medium;

/**
 * <b>#309 - Best Time to Buy and Sell Stock with Cooldown</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * 
 * 
 * Find the maximum profit you can achieve. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times) with the following restrictions:
 * 
 * 	
 * After you sell your stock, you cannot buy stock on the next day (i.e., cooldown one day).
 * 
 * Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: prices = [1,2,3,0,2]
 * Output: 3
 * Explanation: transactions = [buy, sell, cooldown, buy, sell]
 * 
 * Example 2:
 * 
 * Input: prices = [1]
 * Output: 0
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= prices.length &lt;= 5000
 * 	
 * 0 &lt;= prices[i] &lt;= 1000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — study the examples carefully.
 *
 * <h2>Approach</h2>
 * DP with states: hold (have stock), sold (just sold → cooldown), rest (no stock, can buy).
 * Transitions: hold=max(hold,rest-price), sold=hold+price, rest=max(rest,sold).
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(1)
 *
 * @see <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/">LeetCode #309</a>
 */
public class BestTimeToBuyAndSellStockWithCooldown {

    /**
     * Computes the maximum Max profit.
     *
     * @param prices the prices (int[])
     * @return the computed int result
     */
    public int maxProfit(int[] prices) {
        int hold=Integer.MIN_VALUE, sold=0, rest=0;
        for(int p:prices){
            int prevSold=sold;
            sold=hold+p;
            hold=Math.max(hold,rest-p);
            rest=Math.max(rest,prevSold);
        }
        return Math.max(sold,rest);
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        BestTimeToBuyAndSellStockWithCooldown sol = new BestTimeToBuyAndSellStockWithCooldown();
        System.out.println(sol.maxProfit(new int[]{1,2,3,0,2})); // 3 (buy@1,sell@3,cooldown,buy@0,sell@2)
        System.out.println(sol.maxProfit(new int[]{1}));          // 0
    }
}
