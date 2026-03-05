package org.leetcode.hard;


/**
 * <b>#2218 - Maximum Value of K Coins From Piles</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There are n piles of coins on a table. Each pile consists of a positive number of coins of assorted denominations.
 *
 *
 * In one move, you can choose any coin on top of any pile, remove it, and add it to your wallet.
 *
 *
 * Given a list piles, where piles[i] is a list of integers denoting the composition of the ith pile from top to bottom, and a positive integer k, return the maximum total value of coins you can have in your wallet if you choose exactly k coins optimally.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: piles = [[1,100,3],[7,8,9]], k = 2
 * Output: 101
 * Explanation:
 * The above diagram shows the different ways we can choose k coins.
 * The maximum total we can obtain is 101.
 *
 * Example 2:
 *
 * Input: piles = [[100],[100],[100],[100],[100],[100],[1,1,1,1,1,1,700]], k = 7
 * Output: 706
 * Explanation:
 * The maximum total can be obtained if we choose all coins from the last pile.
 *
 *
 *
 * Constraints:
 *
 *
 * n == piles.length
 *
 * 1 &lt;= n &lt;= 1000
 *
 * 1 &lt;= piles[i][j] &lt;= 105
 *
 * 1 &lt;= k &lt;= sum(piles[i].length) &lt;= 2000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: For each pile i, what will be the total value of coins we can collect if we choose the first j coins?
 * Hint 2: How can we use dynamic programming to combine the results from different piles to find the most optimal answer?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/maximum-value-of-k-coins-from-piles/">LeetCode #2218</a>
 */
public class MaximumValueOfKCoinsFromPiles {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Value of K Coins From Piles");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximumValueOfKCoinsFromPiles ===");
        MaximumValueOfKCoinsFromPiles sol = new MaximumValueOfKCoinsFromPiles();
        System.out.println(sol.solve(null));
    }
}
