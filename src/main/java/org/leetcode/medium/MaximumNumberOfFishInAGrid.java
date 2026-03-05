package org.leetcode.medium;


/**
 * <b>#2658 - Maximum Number of Fish in a Grid</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Depth-First Search, Breadth-First Search, Union-Find, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed 2D matrix grid of size m x n, where (r, c) represents:
 *
 *
 * A land cell if grid[r][c] = 0, or
 *
 * A water cell containing grid[r][c] fish, if grid[r][c] &gt; 0.
 *
 * A fisher can start at any water cell (r, c) and can do the following operations any number of times:
 *
 *
 * Catch all the fish at cell (r, c), or
 *
 * Move to any adjacent water cell.
 *
 * Return the maximum number of fish the fisher can catch if he chooses his starting cell optimally, or 0 if no water cell exists.
 *
 *
 * An adjacent cell of the cell (r, c), is one of the cells (r, c + 1), (r, c - 1), (r + 1, c) or (r - 1, c) if it exists.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: grid = [[0,2,1,0],[4,0,0,3],[1,0,0,4],[0,3,2,0]]
 * Output: 7
 * Explanation: The fisher can start at cell (1,3) and collect 3 fish, then move to cell (2,3) and collect 4 fish.
 *
 * Example 2:
 *
 * Input: grid = [[1,0,0,0],[0,0,0,0],[0,0,0,0],[0,0,0,1]]
 * Output: 1
 * Explanation: The fisher can start at cells (0,0) or (3,3) and collect a single fish. 
 *
 *
 *
 * Constraints:
 *
 *
 * m == grid.length
 *
 * n == grid[i].length
 *
 * 1 &lt;= m, n &lt;= 10
 *
 * 0 &lt;= grid[i][j] &lt;= 10
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Run DFS from each non-zero cell.
 * Hint 2: Each time you pick a cell to start from, add up the number of fish contained in the cells you visit.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Depth-First Search, Breadth-First Search, Union-Find, Matrix).
 *
 * @see <a href="https://leetcode.com/problems/maximum-number-of-fish-in-a-grid/">LeetCode #2658</a>
 */
public class MaximumNumberOfFishInAGrid {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Number of Fish in a Grid");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximumNumberOfFishInAGrid ===");
        MaximumNumberOfFishInAGrid sol = new MaximumNumberOfFishInAGrid();
        System.out.println(sol.solve(null));
    }
}
