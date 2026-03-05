package org.leetcode.medium;


/**
 * <b>#2070 - Most Beautiful Item for Each Query</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Binary Search, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 2D integer array items where items[i] = [pricei, beautyi] denotes the price and beauty of an item respectively.
 *
 *
 * You are also given a 0-indexed integer array queries. For each queries[j], you want to determine the maximum beauty of an item whose price is less than or equal to queries[j]. If no such item exists, then the answer to this query is 0.
 *
 *
 * Return an array answer of the same length as queries where answer[j] is the answer to the jth query.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: items = [[1,2],[3,2],[2,4],[5,6],[3,5]], queries = [1,2,3,4,5,6]
 * Output: [2,4,5,5,6,6]
 * Explanation:
 * - For queries[0]=1, [1,2] is the only item which has price &lt;= 1. Hence, the answer for this query is 2.
 * - For queries[1]=2, the items which can be considered are [1,2] and [2,4]. 
 *   The maximum beauty among them is 4.
 * - For queries[2]=3 and queries[3]=4, the items which can be considered are [1,2], [3,2], [2,4], and [3,5].
 *   The maximum beauty among them is 5.
 * - For queries[4]=5 and queries[5]=6, all items can be considered.
 *   Hence, the answer for them is the maximum beauty of all items, i.e., 6.
 *
 * Example 2:
 *
 * Input: items = [[1,2],[1,2],[1,3],[1,4]], queries = [1]
 * Output: [4]
 * Explanation: 
 * The price of every item is equal to 1, so we choose the item with the maximum beauty 4. 
 * Note that multiple items can have the same price and/or beauty.  
 *
 * Example 3:
 *
 * Input: items = [[10,1000]], queries = [5]
 * Output: [0]
 * Explanation:
 * No item has a price less than or equal to 5, so no item can be chosen.
 * Hence, the answer to the query is 0.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= items.length, queries.length &lt;= 105
 *
 * items[i].length == 2
 *
 * 1 &lt;= pricei, beautyi, queries[j] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Can we process the queries in a smart order to avoid repeatedly checking the same items?
 * Hint 2: How can we use the answer to a query for other queries?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search, Sorting).
 *
 * @see <a href="https://leetcode.com/problems/most-beautiful-item-for-each-query/">LeetCode #2070</a>
 */
public class MostBeautifulItemForEachQuery {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Most Beautiful Item for Each Query");
    }

    public static void main(String[] args) {
        System.out.println("=== MostBeautifulItemForEachQuery ===");
        MostBeautifulItemForEachQuery sol = new MostBeautifulItemForEachQuery();
        System.out.println(sol.solve(null));
    }
}
