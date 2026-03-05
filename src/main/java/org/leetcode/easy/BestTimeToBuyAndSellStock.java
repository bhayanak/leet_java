package org.leetcode.easy;

/**
 * <b>#121 - Best Time to Buy and Sell Stock</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * 
 * 
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 * 
 * 
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: prices = [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 * Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
 * 
 * Example 2:
 * 
 * Input: prices = [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transactions are done and the max profit = 0.
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= prices.length &lt;= 105
 * 	
 * 0 &lt;= prices[i] &lt;= 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — work through examples manually first.
 *
 * <h2>Approach</h2>
 * One pass: track the minimum price seen so far.
 * For each price, compute potential profit (price - minPrice) and update the max profit.
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(1)
 *
 * @see <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock/">LeetCode #121</a>
  *
  * <p><b>Explanation:</b> Tracks the running maximum in a single O(n) scan without extra space.</p>
  */
public class BestTimeToBuyAndSellStock {

    /**
     * Finds the maximum profit from a single buy-sell transaction.
     * @param prices daily stock prices
     * @return maximum profit (0 if no profit possible)
      *
      * <p><b>Explanation:</b> Tracks the running maximum in a single O(n) scan without extra space.</p>
      */
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE, maxProfit = 0;
        for (int price : prices) {
            minPrice  = Math.min(minPrice, price);
            maxProfit = Math.max(maxProfit, price - minPrice);
        }
        return maxProfit;
    }

    // ─── Run & Demo ──────────────────────────────────────────────
    /**
     * Runs sample test cases to demonstrate the solution.
     * Execute: javac BestTimeToBuyAndSellStock.java &amp;&amp; java org.leetcode.easy.BestTimeToBuyAndSellStock
     *
     * @param args not used
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        BestTimeToBuyAndSellStock sol = new BestTimeToBuyAndSellStock();
        System.out.println(sol.maxProfit(new int[]{7,1,5,3,6,4})); // 5 (buy 1, sell 6)
        System.out.println(sol.maxProfit(new int[]{7,6,4,3,1}));   // 0 (no profit)
    }
}
