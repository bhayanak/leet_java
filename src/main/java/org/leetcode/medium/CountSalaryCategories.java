package org.leetcode.medium;


/**
 * <b>#1907 - Count Salary Categories</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Database</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Table: Accounts
 *
 * +-------------+------+
 * | Column Name | Type |
 * +-------------+------+
 * | account_id  | int  |
 * | income      | int  |
 * +-------------+------+
 * account_id is the primary key (column with unique values) for this table.
 * Each row contains information about the monthly income for one bank account.
 *
 *
 *
 *
 * Write a solution to calculate the number of bank accounts for each salary category. The salary categories are:
 *
 *
 * "Low Salary": All the salaries strictly less than $20000.
 *
 * "Average Salary": All the salaries in the inclusive range [$20000, $50000].
 *
 * "High Salary": All the salaries strictly greater than $50000.
 *
 * The result table must contain all three categories. If there are no accounts in a category, return 0.
 *
 *
 * Return the result table in any order.
 *
 *
 * The result format is in the following example.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: 
 * Accounts table:
 * +------------+--------+
 * | account_id | income |
 * +------------+--------+
 * | 3          | 108939 |
 * | 2          | 12747  |
 * | 8          | 87709  |
 * | 6          | 91796  |
 * +------------+--------+
 * Output: 
 * +----------------+----------------+
 * | category       | accounts_count |
 * +----------------+----------------+
 * | Low Salary     | 1              |
 * | Average Salary | 0              |
 * | High Salary    | 3              |
 * +----------------+----------------+
 * Explanation: 
 * Low Salary: Account 2.
 * Average Salary: No accounts.
 * High Salary: Accounts 3, 6, and 8.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Database).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/count-salary-categories/">LeetCode #1907</a>
 */
public class CountSalaryCategories {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Salary Categories");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== CountSalaryCategories ===");
        CountSalaryCategories sol = new CountSalaryCategories();
        System.out.println(sol.solve(null));
    }
}
