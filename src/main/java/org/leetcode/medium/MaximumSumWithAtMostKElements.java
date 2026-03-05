package org.leetcode.medium;


/**
 * <b>#3462 - Maximum Sum With at Most K Elements</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Greedy, Sorting, Heap (Priority Queue), Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 2D integer matrix grid of size n x m, an integer array limits of length n, and an integer k. The task is to find the maximum sum of at most k elements from the matrix grid such that:
 *
 *
 *
 *
 * The number of elements taken from the ith row of grid does not exceed limits[i].
 *
 *
 * Return the maximum sum.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: grid = [[1,2],[3,4]], limits = [1,2], k = 2
 *
 *
 * Output: 7
 *
 *
 * Explanation:
 *
 *
 * From the second row, we can take at most 2 elements. The elements taken are 4 and 3.
 *
 * The maximum possible sum of at most 2 selected elements is 4 + 3 = 7.
 *
 * Example 2:
 *
 * Input: grid = [[5,3,7],[8,2,6]], limits = [2,2], k = 3
 *
 *
 * Output: 21
 *
 *
 * Explanation:
 *
 *
 * From the first row, we can take at most 2 elements. The element taken is 7.
 *
 * From the second row, we can take at most 2 elements. The elements taken are 8 and 6.
 *
 * The maximum possible sum of at most 3 selected elements is 7 + 8 + 6 = 21.
 *
 *
 *
 * Constraints:
 *
 *
 * n == grid.length == limits.length
 *
 * m == grid[i].length
 *
 * 1 &lt;= n, m &lt;= 500
 *
 * 0 &lt;= grid[i][j] &lt;= 105
 *
 * 0 &lt;= limits[i] &lt;= m
 *
 * 0 &lt;= k &lt;= min(n * m, sum(limits))
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Sort each row in descending order and extract the top <code>limits[i]</code> elements.
 * Hint 2: Use a max-heap to efficiently pick the largest <code>k</code> elements across all rows.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Greedy, Sorting, Heap (Priority Queue), Matrix).
 *
 * @see <a href="https://leetcode.com/problems/maximum-sum-with-at-most-k-elements/">LeetCode #3462</a>
 */
public class MaximumSumWithAtMostKElements {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Sum With at Most K Elements");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximumSumWithAtMostKElements ===");
        MaximumSumWithAtMostKElements sol = new MaximumSumWithAtMostKElements();
        System.out.println(sol.solve(null));
    }
}
