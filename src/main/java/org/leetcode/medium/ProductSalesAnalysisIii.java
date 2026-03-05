package org.leetcode.medium;


/**
 * <b>#1070 - Product Sales Analysis III</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Database</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Table: Sales
 *
 * +-------------+-------+
 * | Column Name | Type  |
 * +-------------+-------+
 * | sale_id     | int   |
 * | product_id  | int   |
 * | year        | int   |
 * | quantity    | int   |
 * | price       | int   |
 * +-------------+-------+
 * (sale_id, year) is the primary key (combination of columns with unique values) of this table.
 * Each row records a sale of a product in a given year.
 * A product may have multiple sales entries in the same year.
 * Note that the per-unit price.
 *
 * Write a solution to find all sales that occurred in the first year each product was sold.
 *
 *
 *
 *
 * For each product_id, identify the earliest year it appears in the Sales table.
 *
 *
 *
 *
 * Return all sales entries for that product in that year.
 *
 *
 * Return a table with the following columns: product_id, first_year, quantity, and price.
 *
 * Return the result in any order.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: 
 * Sales table:
 * +---------+------------+------+----------+-------+
 * | sale_id | product_id | year | quantity | price |
 * +---------+------------+------+----------+-------+ 
 * | 1       | 100        | 2008 | 10       | 5000  |
 * | 2       | 100        | 2009 | 12       | 5000  |
 * | 7       | 200        | 2011 | 15       | 9000  |
 * +---------+------------+------+----------+-------+
 *
 * Output: 
 * +------------+------------+----------+-------+
 * | product_id | first_year | quantity | price |
 * +------------+------------+----------+-------+ 
 * | 100        | 2008       | 10       | 5000  |
 * | 200        | 2011       | 15       | 9000  |
 * +------------+------------+----------+-------+
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
 * @see <a href="https://leetcode.com/problems/product-sales-analysis-iii/">LeetCode #1070</a>
 */
public class ProductSalesAnalysisIii {

    /**
     * TODO: Implement "Product Sales Analysis III".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Product Sales Analysis III");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac ProductSalesAnalysisIii.java &amp;&amp; java org.leetcode.medium.ProductSalesAnalysisIii</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== ProductSalesAnalysisIii ===");
        ProductSalesAnalysisIii sol = new ProductSalesAnalysisIii();
        System.out.println(sol.solve(null));
    }
}
