package org.leetcode.hard;


/**
 * <b>#2412 - Minimum Money Required Before Transactions</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Greedy, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed 2D integer array transactions, where transactions[i] = [costi, cashbacki].
 *
 *
 * The array describes transactions, where each transaction must be completed exactly once in some order. At any given moment, you have a certain amount of money. In order to complete transaction i, money &gt;= costi must hold true. After performing a transaction, money becomes money - costi + cashbacki.
 *
 *
 * Return the minimum amount of money required before any transaction so that all of the transactions can be completed regardless of the order of the transactions.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: transactions = [[2,1],[5,0],[4,2]]
 * Output: 10
 * Explanation:
 * Starting with money = 10, the transactions can be performed in any order.
 * It can be shown that starting with money &lt; 10 will fail to complete all transactions in some order.
 *
 * Example 2:
 *
 * Input: transactions = [[3,0],[0,3]]
 * Output: 3
 * Explanation:
 * - If transactions are in the order [[3,0],[0,3]], the minimum money required to complete the transactions is 3.
 * - If transactions are in the order [[0,3],[3,0]], the minimum money required to complete the transactions is 0.
 * Thus, starting with money = 3, the transactions can be performed in any order.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= transactions.length &lt;= 105
 *
 * transactions[i].length == 2
 *
 * 0 &lt;= costi, cashbacki &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Split transactions that have cashback greater or equal to cost apart from transactions that have cashback less than cost. You will always <strong>earn</strong> money in the first scenario.
 * Hint 2: For transactions that have cashback greater or equal to cost, sort them by cost in descending order.
 * Hint 3: For transactions that have cashback less than cost, sort them by cashback in ascending order.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Greedy, Sorting).
 *
 * @see <a href="https://leetcode.com/problems/minimum-money-required-before-transactions/">LeetCode #2412</a>
 */
public class MinimumMoneyRequiredBeforeTransactions {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Money Required Before Transactions");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumMoneyRequiredBeforeTransactions ===");
        MinimumMoneyRequiredBeforeTransactions sol = new MinimumMoneyRequiredBeforeTransactions();
        System.out.println(sol.solve(null));
    }
}
