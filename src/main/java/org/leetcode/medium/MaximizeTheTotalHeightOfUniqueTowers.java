package org.leetcode.medium;


/**
 * <b>#3301 - Maximize the Total Height of Unique Towers</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Greedy, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array maximumHeight, where maximumHeight[i] denotes the maximum height the ith tower can be assigned.
 *
 *
 * Your task is to assign a height to each tower so that:
 *
 *
 * The height of the ith tower is a positive integer and does not exceed maximumHeight[i].
 *
 * No two towers have the same height.
 *
 * Return the maximum possible total sum of the tower heights. If it's not possible to assign heights, return -1.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: maximumHeight = [2,3,4,3]
 *
 *
 * Output: 10
 *
 *
 * Explanation:
 *
 *
 * We can assign heights in the following way: [1, 2, 4, 3].
 *
 * Example 2:
 *
 * Input: maximumHeight = [15,10]
 *
 *
 * Output: 25
 *
 *
 * Explanation:
 *
 *
 * We can assign heights in the following way: [15, 10].
 *
 * Example 3:
 *
 * Input: maximumHeight = [2,2,1]
 *
 *
 * Output: -1
 *
 *
 * Explanation:
 *
 *
 * It's impossible to assign positive heights to each index so that no two towers have the same height.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= maximumHeight.length &lt;= 105
 *
 * 1 &lt;= maximumHeight[i] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Sort the array <code>maximumHeight</code> in descending order.
 * Hint 2: After sorting, it can be seen that the maximum height that we can assign to the <code>i<sup>th</sup></code> element is <code>min(maximumHeight[i], maximumHeight[i - 1] - 1)</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Greedy, Sorting).
 *
 * @see <a href="https://leetcode.com/problems/maximize-the-total-height-of-unique-towers/">LeetCode #3301</a>
 */
public class MaximizeTheTotalHeightOfUniqueTowers {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximize the Total Height of Unique Towers");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximizeTheTotalHeightOfUniqueTowers ===");
        MaximizeTheTotalHeightOfUniqueTowers sol = new MaximizeTheTotalHeightOfUniqueTowers();
        System.out.println(sol.solve(null));
    }
}
