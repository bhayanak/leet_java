package org.leetcode.medium;


/**
 * <b>#3220 - Odd and Even Transactions</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Database</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Table: transactions
 *
 * +------------------+------+
 * | Column Name      | Type | 
 * +------------------+------+
 * | transaction_id   | int  |
 * | amount           | int  |
 * | transaction_date | date |
 * +------------------+------+
 * The transactions_id column uniquely identifies each row in this table.
 * Each row of this table contains the transaction id, amount and transaction date.
 *
 * Write a solution to find the sum of amounts for odd and even transactions for each day. If there are no odd or even transactions for a specific date, display as 0.
 *
 *
 * Return the result table ordered by transaction_date in ascending order.
 *
 *
 * The result format is in the following example.
 *
 *
 *
 *
 * Example:
 *
 * Input:
 *
 *
 * transactions table:
 *
 * +----------------+--------+------------------+
 * | transaction_id | amount | transaction_date |
 * +----------------+--------+------------------+
 * | 1              | 150    | 2024-07-01       |
 * | 2              | 200    | 2024-07-01       |
 * | 3              | 75     | 2024-07-01       |
 * | 4              | 300    | 2024-07-02       |
 * | 5              | 50     | 2024-07-02       |
 * | 6              | 120    | 2024-07-03       |
 * +----------------+--------+------------------+
 *
 *
 * Output:
 *
 * +------------------+---------+----------+
 * | transaction_date | odd_sum | even_sum |
 * +------------------+---------+----------+
 * | 2024-07-01       | 75      | 350      |
 * | 2024-07-02       | 0       | 350      |
 * | 2024-07-03       | 0       | 120      |
 * +------------------+---------+----------+
 *
 *
 * Explanation:
 *
 *
 * For transaction dates:
 *
 *
 *
 * 2024-07-01:
 *
 *
 *
 * Sum of amounts for odd transactions: 75
 *
 * Sum of amounts for even transactions: 150 + 200 = 350
 *
 *
 *
 * 2024-07-02:
 *
 *
 *
 * Sum of amounts for odd transactions: 0
 *
 * Sum of amounts for even transactions: 300 + 50 = 350
 *
 *
 *
 * 2024-07-03:
 *
 *
 *
 * Sum of amounts for odd transactions: 0
 *
 * Sum of amounts for even transactions: 120
 *
 *
 *
 *
 *
 * Note: The output table is ordered by transaction_date in ascending order.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints -- trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Database).
 *
 * @see <a href="https://leetcode.com/problems/odd-and-even-transactions/">LeetCode #3220</a>
 */
public class OddAndEvenTransactions {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Odd and Even Transactions");
    }

    public static void main(String[] args) {
        System.out.println("=== OddAndEvenTransactions ===");
        OddAndEvenTransactions sol = new OddAndEvenTransactions();
        System.out.println(sol.solve(null));
    }
}
