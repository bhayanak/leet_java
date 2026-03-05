package org.leetcode.medium;


/**
 * <b>#1164 - Product Price at a Given Date</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Database</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Table: Products
 *
 * +---------------+---------+
 * | Column Name   | Type    |
 * +---------------+---------+
 * | product_id    | int     |
 * | new_price     | int     |
 * | change_date   | date    |
 * +---------------+---------+
 * (product_id, change_date) is the primary key (combination of columns with unique values) of this table.
 * Each row of this table indicates that the price of some product was changed to a new price at some date.
 *
 * Initially, all products have price 10.
 *
 *
 * Write a solution to find the prices of all products on the date 2019-08-16.
 *
 *
 * Return the result table in any order.
 *
 *
 * The result format is in the following example.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: 
 * Products table:
 * +------------+-----------+-------------+
 * | product_id | new_price | change_date |
 * +------------+-----------+-------------+
 * | 1          | 20        | 2019-08-14  |
 * | 2          | 50        | 2019-08-14  |
 * | 1          | 30        | 2019-08-15  |
 * | 1          | 35        | 2019-08-16  |
 * | 2          | 65        | 2019-08-17  |
 * | 3          | 20        | 2019-08-18  |
 * +------------+-----------+-------------+
 * Output: 
 * +------------+-------+
 * | product_id | price |
 * +------------+-------+
 * | 2          | 50    |
 * | 1          | 35    |
 * | 3          | 10    |
 * +------------+-------+
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
 * @see <a href="https://leetcode.com/problems/product-price-at-a-given-date/">LeetCode #1164</a>
 */
public class ProductPriceAtAGivenDate {

    /**
     * TODO: Implement "Product Price at a Given Date".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Product Price at a Given Date");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac ProductPriceAtAGivenDate.java &amp;&amp; java org.leetcode.medium.ProductPriceAtAGivenDate</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== ProductPriceAtAGivenDate ===");
        ProductPriceAtAGivenDate sol = new ProductPriceAtAGivenDate();
        System.out.println(sol.solve(null));
    }
}
