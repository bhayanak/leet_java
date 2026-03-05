package org.leetcode.medium;


/**
 * <b>#3122 - Minimum Number of Operations to Satisfy Conditions</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 2D matrix grid of size m x n. In one operation, you can change the value of any cell to any non-negative number. You need to perform some operations such that each cell grid[i][j] is:
 *
 *
 * Equal to the cell below it, i.e. grid[i][j] == grid[i + 1][j] (if it exists).
 *
 * Different from the cell to its right, i.e. grid[i][j] != grid[i][j + 1] (if it exists).
 *
 * Return the minimum number of operations needed.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: grid = [[1,0,2],[1,0,2]]
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 * All the cells in the matrix already satisfy the properties.
 *
 * Example 2:
 *
 * Input: grid = [[1,1,1],[0,0,0]]
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 * The matrix becomes [[1,0,1],[1,0,1]] which satisfies the properties, by doing these 3 operations:
 *
 *
 * Change grid[1][0] to 1.
 *
 * Change grid[0][1] to 0.
 *
 * Change grid[1][2] to 1.
 *
 * Example 3:
 *
 * Input: grid = [[1],[2],[3]]
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 * There is a single column. We can change the value to 1 in each cell using 2 operations.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n, m &lt;= 1000
 *
 * 0 &lt;= grid[i][j] &lt;= 9
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints -- trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Matrix).
 *
 * @see <a href="https://leetcode.com/problems/minimum-number-of-operations-to-satisfy-conditions/">LeetCode #3122</a>
 */
public class MinimumNumberOfOperationsToSatisfyConditions {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Number of Operations to Satisfy Conditions");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumNumberOfOperationsToSatisfyConditions ===");
        MinimumNumberOfOperationsToSatisfyConditions sol = new MinimumNumberOfOperationsToSatisfyConditions();
        System.out.println(sol.solve(null));
    }
}
