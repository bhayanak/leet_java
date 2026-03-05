package org.leetcode.medium;


/**
 * <b>#1559 - Detect Cycles in 2D Grid</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Depth-First Search, Breadth-First Search, Union-Find, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a 2D array of characters grid of size m x n, you need to find if there exists any cycle consisting of the same value in grid.
 *
 *
 * A cycle is a path of length 4 or more in the grid that starts and ends at the same cell. From a given cell, you can move to one of the cells adjacent to it - in one of the four directions (up, down, left, or right), if it has the same value of the current cell.
 *
 *
 * Also, you cannot move to the cell that you visited in your last move. For example, the cycle (1, 1) -&gt; (1, 2) -&gt; (1, 1) is invalid because from (1, 2) we visited (1, 1) which was the last visited cell.
 *
 *
 * Return true if any cycle of the same value exists in grid, otherwise, return false.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: grid = [["a","a","a","a"],["a","b","b","a"],["a","b","b","a"],["a","a","a","a"]]
 * Output: true
 * Explanation: There are two valid cycles shown in different colors in the image below:
 *
 * Example 2:
 *
 * Input: grid = [["c","c","c","a"],["c","d","c","c"],["c","c","e","c"],["f","c","c","c"]]
 * Output: true
 * Explanation: There is only one valid cycle highlighted in the image below:
 *
 * Example 3:
 *
 * Input: grid = [["a","b","b"],["b","z","b"],["b","b","a"]]
 * Output: false
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
 * 1 &lt;= m, n &lt;= 500
 *
 * grid consists only of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Keep track of the parent (previous position) to avoid considering an invalid path.
 * Hint 2: Use DFS or BFS and keep track of visited cells to see if there is a cycle.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Depth-First Search, Breadth-First Search, Union-Find, Matrix).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/detect-cycles-in-2d-grid/">LeetCode #1559</a>
 */
public class DetectCyclesIn2dGrid {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Detect Cycles in 2D Grid");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== DetectCyclesIn2dGrid ===");
        DetectCyclesIn2dGrid sol = new DetectCyclesIn2dGrid();
        System.out.println(sol.solve(null));
    }
}
