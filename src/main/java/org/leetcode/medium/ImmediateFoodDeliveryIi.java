package org.leetcode.medium;


/**
 * <b>#1174 - Immediate Food Delivery II</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Database</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Table: Delivery
 *
 * +-----------------------------+---------+
 * | Column Name                 | Type    |
 * +-----------------------------+---------+
 * | delivery_id                 | int     |
 * | customer_id                 | int     |
 * | order_date                  | date    |
 * | customer_pref_delivery_date | date    |
 * +-----------------------------+---------+
 * delivery_id is the column of unique values of this table.
 * The table holds information about food delivery to customers that make orders at some date and specify a preferred delivery date (on the same order date or after it).
 *
 *
 *
 *
 * If the customer's preferred delivery date is the same as the order date, then the order is called immediate; otherwise, it is called scheduled.
 *
 *
 * The first order of a customer is the order with the earliest order date that the customer made. It is guaranteed that a customer has precisely one first order.
 *
 *
 * Write a solution to find the percentage of immediate orders in the first orders of all customers, rounded to 2 decimal places.
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
 * Delivery table:
 * +-------------+-------------+------------+-----------------------------+
 * | delivery_id | customer_id | order_date | customer_pref_delivery_date |
 * +-------------+-------------+------------+-----------------------------+
 * | 1           | 1           | 2019-08-01 | 2019-08-02                  |
 * | 2           | 2           | 2019-08-02 | 2019-08-02                  |
 * | 3           | 1           | 2019-08-11 | 2019-08-12                  |
 * | 4           | 3           | 2019-08-24 | 2019-08-24                  |
 * | 5           | 3           | 2019-08-21 | 2019-08-22                  |
 * | 6           | 2           | 2019-08-11 | 2019-08-13                  |
 * | 7           | 4           | 2019-08-09 | 2019-08-09                  |
 * +-------------+-------------+------------+-----------------------------+
 * Output: 
 * +----------------------+
 * | immediate_percentage |
 * +----------------------+
 * | 50.00                |
 * +----------------------+
 * Explanation: 
 * The customer id 1 has a first order with delivery id 1 and it is scheduled.
 * The customer id 2 has a first order with delivery id 2 and it is immediate.
 * The customer id 3 has a first order with delivery id 5 and it is scheduled.
 * The customer id 4 has a first order with delivery id 7 and it is immediate.
 * Hence, half the customers have immediate first orders.
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
 * @see <a href="https://leetcode.com/problems/immediate-food-delivery-ii/">LeetCode #1174</a>
 */
public class ImmediateFoodDeliveryIi {

    /**
     * TODO: Implement "Immediate Food Delivery II".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Immediate Food Delivery II");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac ImmediateFoodDeliveryIi.java &amp;&amp; java org.leetcode.medium.ImmediateFoodDeliveryIi</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== ImmediateFoodDeliveryIi ===");
        ImmediateFoodDeliveryIi sol = new ImmediateFoodDeliveryIi();
        System.out.println(sol.solve(null));
    }
}
