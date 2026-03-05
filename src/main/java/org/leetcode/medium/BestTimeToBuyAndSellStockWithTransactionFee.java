package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #714: Best Time to Buy and Sell Stock with Transaction Fee
 * @see <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/">Problem</a>
 */
public class BestTimeToBuyAndSellStockWithTransactionFee {

    /**
     * LeetCode #714 – Best Time to Buy and Sell Stock with Transaction Fee
     * Difficulty: MEDIUM
     * Topics: Array, Dynamic Programming, Greedy
     *
     * You are given an array prices where prices[i] is the price of a given stock
     * on the ith day, and an integer fee representing a transaction fee.
     * 
     * 
     * Find the maximum profit you can achieve. You may complete as many
     * transactions as you like, but you need to pay the transaction fee for each
     * transaction.
     * 
     * 
     * Note:
     * 
     * 
     * You may not engage in multiple transactions simultaneously (i.e., you must
     * sell the stock before you buy again).
     * 
     * The transaction fee is only charged once for each stock purchase and sale.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: prices = [1,3,2,8,4,9], fee = 2
     * Output: 8
     * Explanation: The maximum profit can be achieved by:
     * - Buying at prices[0] = 1
     * - Selling at prices[3] = 8
     * - Buying at prices[4] = 4
     * - Selling at prices[5] = 9
     * The total profit is ((8 - 1) - 2) + ((9 - 4) - 2) = 8.
     * 
     * Example 2:
     * 
     * Input: prices = [1,3,7,5,10,3], fee = 3
     * Output: 6
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= prices.length &lt;= 5 * 104
     * 
     * 1 &lt;= prices[i] &lt; 5 * 104
     * 
     * 0 &lt;= fee &lt; 5 * 104
     */
    // DP: hold = max profit holding stock; free = max profit without stock
    /**
     * Computes the maximum Max profit.
     *
     * @param prices the prices (int[])
     * @param fee the fee (int)
     * @return the computed int result
     */
    public int maxProfit(int[] prices, int fee) {
        int hold = -prices[0], free = 0;
        for (int i = 1; i < prices.length; i++) {
            hold = Math.max(hold, free - prices[i]);
            free = Math.max(free, hold + prices[i] - fee);
        }
        return free;
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStockWithTransactionFee sol = new BestTimeToBuyAndSellStockWithTransactionFee();
        System.out.println(sol.maxProfit(new int[]{1,2,3}, 0));
    }
}
