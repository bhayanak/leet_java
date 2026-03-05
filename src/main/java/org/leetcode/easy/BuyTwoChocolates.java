package org.leetcode.easy;


/**
 * <b>#2706 - Buy Two Chocolates</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Greedy, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array prices representing the prices of various chocolates in a store. You are also given a single integer money, which represents your initial amount of money.
 *
 *
 * You must buy exactly two chocolates in such a way that you still have some non-negative leftover money. You would like to minimize the sum of the prices of the two chocolates you buy.
 *
 *
 * Return the amount of money you will have leftover after buying the two chocolates. If there is no way for you to buy two chocolates without ending up in debt, return money. Note that the leftover must be non-negative.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: prices = [1,2,2], money = 3
 * Output: 0
 * Explanation: Purchase the chocolates priced at 1 and 2 units respectively. You will have 3 - 3 = 0 units of money afterwards. Thus, we return 0.
 *
 * Example 2:
 *
 * Input: prices = [3,2,3], money = 3
 * Output: 3
 * Explanation: You cannot buy 2 chocolates without going in debt, so we return 3.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= prices.length &lt;= 50
 *
 * 1 &lt;= prices[i] &lt;= 100
 *
 * 1 &lt;= money &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Sort the array and check if the money is more than or equal to the sum of the two cheapest elements.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Greedy, Sorting).
 *
 * @see <a href="https://leetcode.com/problems/buy-two-chocolates/">LeetCode #2706</a>
  *
  * <p><b>Explanation:</b> Sorts the input first to simplify subsequent search or comparison steps.</p>
  */
public class BuyTwoChocolates {

    /**
     * Solves the problem: Buy choco.
     * Sorts the input first to enable efficient processing.
     *
     * @param prices the prices (int[])
     * @param money the money (int)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Sorts the input first to simplify subsequent search or comparison steps.</p>
      */
    public int buyChoco(int[] prices, int money) {
        java.util.Arrays.sort(prices);
        int cost=prices[0]+prices[1];
        return cost<=money?money-cost:money;
    }

    public static void main(String[] args) {
        BuyTwoChocolates sol = new BuyTwoChocolates();
                System.out.println(sol.buyChoco(new int[]{1,2,2},3)); // 0
                System.out.println(sol.buyChoco(new int[]{3,2,3},3)); // 3
    }
}
