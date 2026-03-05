package org.leetcode.medium;


/**
 * <b>#1045 - Customers Who Bought All Products</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Database</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Table: Customer
 *
 * +-------------+---------+
 * | Column Name | Type    |
 * +-------------+---------+
 * | customer_id | int     |
 * | product_key | int     |
 * +-------------+---------+
 * This table may contain duplicates rows. 
 * customer_id is not NULL.
 * product_key is a foreign key (reference column) to Product table.
 *
 *
 *
 *
 * Table: Product
 *
 * +-------------+---------+
 * | Column Name | Type    |
 * +-------------+---------+
 * | product_key | int     |
 * +-------------+---------+
 * product_key is the primary key (column with unique values) for this table.
 *
 *
 *
 *
 * Write a solution to report the customer ids from the Customer table that bought all the products in the Product table.
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
 * Customer table:
 * +-------------+-------------+
 * | customer_id | product_key |
 * +-------------+-------------+
 * | 1           | 5           |
 * | 2           | 6           |
 * | 3           | 5           |
 * | 3           | 6           |
 * | 1           | 6           |
 * +-------------+-------------+
 * Product table:
 * +-------------+
 * | product_key |
 * +-------------+
 * | 5           |
 * | 6           |
 * +-------------+
 * Output: 
 * +-------------+
 * | customer_id |
 * +-------------+
 * | 1           |
 * | 3           |
 * +-------------+
 * Explanation: 
 * The customers who bought all the products (5 and 6) are customers with IDs 1 and 3.
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
 * @see <a href="https://leetcode.com/problems/customers-who-bought-all-products/">LeetCode #1045</a>
 */
public class CustomersWhoBoughtAllProducts {

    /**
     * TODO: Implement "Customers Who Bought All Products".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Customers Who Bought All Products");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac CustomersWhoBoughtAllProducts.java &amp;&amp; java org.leetcode.medium.CustomersWhoBoughtAllProducts</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== CustomersWhoBoughtAllProducts ===");
        CustomersWhoBoughtAllProducts sol = new CustomersWhoBoughtAllProducts();
        System.out.println(sol.solve(null));
    }
}
