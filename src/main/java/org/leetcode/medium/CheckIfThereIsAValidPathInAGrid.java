package org.leetcode.medium;


/**
 * <b>#1391 - Check if There is a Valid Path in a Grid</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Depth-First Search, Breadth-First Search, Union-Find, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an m x n grid. Each cell of grid represents a street. The street of grid[i][j] can be:
 *
 *
 * 1 which means a street connecting the left cell and the right cell.
 *
 * 2 which means a street connecting the upper cell and the lower cell.
 *
 * 3 which means a street connecting the left cell and the lower cell.
 *
 * 4 which means a street connecting the right cell and the lower cell.
 *
 * 5 which means a street connecting the left cell and the upper cell.
 *
 * 6 which means a street connecting the right cell and the upper cell.
 *
 * You will initially start at the street of the upper-left cell (0, 0). A valid path in the grid is a path that starts from the upper left cell (0, 0) and ends at the bottom-right cell (m - 1, n - 1). The path should only follow the streets.
 *
 *
 * Notice that you are not allowed to change any street.
 *
 *
 * Return true if there is a valid path in the grid or false otherwise.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: grid = [[2,4,3],[6,5,2]]
 * Output: true
 * Explanation: As shown you can start at cell (0, 0) and visit all the cells of the grid to reach (m - 1, n - 1).
 *
 * Example 2:
 *
 * Input: grid = [[1,2,1],[1,2,1]]
 * Output: false
 * Explanation: As shown you the street at cell (0, 0) is not connected with any street of any other cell and you will get stuck at cell (0, 0)
 *
 * Example 3:
 *
 * Input: grid = [[1,1,2]]
 * Output: false
 * Explanation: You will get stuck at cell (0, 1) and you cannot reach cell (0, 2).
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
 * 1 &lt;= m, n &lt;= 300
 *
 * 1 &lt;= grid[i][j] &lt;= 6
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Start DFS from the node (0, 0) and follow the path till you stop.
 * Hint 2: When you reach a cell and cannot move anymore check that this cell is (m - 1, n - 1) or not.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Depth-First Search, Breadth-First Search, Union-Find, Matrix).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/check-if-there-is-a-valid-path-in-a-grid/">LeetCode #1391</a>
 */
public class CheckIfThereIsAValidPathInAGrid {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Check if There is a Valid Path in a Grid");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== CheckIfThereIsAValidPathInAGrid ===");
        CheckIfThereIsAValidPathInAGrid sol = new CheckIfThereIsAValidPathInAGrid();
        System.out.println(sol.solve(null));
    }
}
