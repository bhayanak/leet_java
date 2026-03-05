package org.leetcode.hard;

/**
 * <b>#123 - Best Time to Buy and Sell Stock III</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * 
 * 
 * Find the maximum profit you can achieve. You may complete at most two transactions.
 * 
 * 
 * Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: prices = [3,3,5,0,0,3,1,4]
 * Output: 6
 * Explanation: Buy on day 4 (price = 0) and sell on day 6 (price = 3), profit = 3-0 = 3.
 * Then buy on day 7 (price = 1) and sell on day 8 (price = 4), profit = 4-1 = 3.
 * 
 * Example 2:
 * 
 * Input: prices = [1,2,3,4,5]
 * Output: 4
 * Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
 * Note that you cannot buy on day 1, buy on day 2 and sell them later, as you are engaging multiple transactions at the same time. You must sell before buying again.
 * 
 * Example 3:
 * 
 * Input: prices = [7,6,4,3,1]
 * Output: 0
 * Explanation: In this case, no transaction is done, i.e. max profit = 0.
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= prices.length &lt;= 105
 * 	
 * 0 &lt;= prices[i] &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — work through examples manually first.
 *
 * <h2>Approach</h2>
 * Think about the category first (see tags above), then:
 * 1. Try a brute-force solution to understand the problem.
 * 2. Identify the bottleneck and optimise with the right data structure or algorithm.
 * 3. Consider: sorting, hashing, two pointers, sliding window,
 *    binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: TBD  |  Space: TBD
 *
 * @see <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/">LeetCode #123</a>
 */
public class BestTimeToBuyAndSellStockIii {

    /**
     * TODO: Implement solution for "Best Time to Buy and Sell Stock III".
     * @param args placeholder — replace with actual parameter(s)
     * @return     placeholder — replace with actual return type
     */
    public Object solve(Object args) {
        throw new UnsupportedOperationException("Not yet implemented: Best Time to Buy and Sell Stock III");
    }

    // ─── Run & Demo ──────────────────────────────────────────────
    /**
     * Runs sample test cases to demonstrate the solution.
     * Execute: javac BestTimeToBuyAndSellStockIii.java &amp;&amp; java org.leetcode.hard.BestTimeToBuyAndSellStockIii
     *
     * @param args not used
     */
    public static void main(String[] args) {
        System.out.println("=== BestTimeToBuyAndSellStockIii ===");
        BestTimeToBuyAndSellStockIii sol = new BestTimeToBuyAndSellStockIii();
        System.out.println(sol.solve(null));
    }
}
