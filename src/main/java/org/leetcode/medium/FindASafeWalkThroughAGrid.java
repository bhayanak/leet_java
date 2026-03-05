package org.leetcode.medium;


/**
 * <b>#3286 - Find a Safe Walk Through a Grid</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Breadth-First Search, Graph Theory, Heap (Priority Queue), Matrix, Shortest Path</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an m x n binary matrix grid and an integer health.
 *
 *
 * You start on the upper-left corner (0, 0) and would like to get to the lower-right corner (m - 1, n - 1).
 *
 *
 * You can move up, down, left, or right from one cell to another adjacent cell as long as your health remains positive.
 *
 *
 * Cells (i, j) with grid[i][j] = 1 are considered unsafe and reduce your health by 1.
 *
 *
 * Return true if you can reach the final cell with a health value of 1 or more, and false otherwise.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: grid = [[0,1,0,0,0],[0,1,0,1,0],[0,0,0,1,0]], health = 1
 *
 *
 * Output: true
 *
 *
 * Explanation:
 *
 *
 * The final cell can be reached safely by walking along the gray cells below.
 *
 * Example 2:
 *
 * Input: grid = [[0,1,1,0,0,0],[1,0,1,0,0,0],[0,1,1,1,0,1],[0,0,1,0,1,0]], health = 3
 *
 *
 * Output: false
 *
 *
 * Explanation:
 *
 *
 * A minimum of 4 health points is needed to reach the final cell safely.
 *
 * Example 3:
 *
 * Input: grid = [[1,1,1],[1,0,1],[1,1,1]], health = 5
 *
 *
 * Output: true
 *
 *
 * Explanation:
 *
 *
 * The final cell can be reached safely by walking along the gray cells below.
 *
 * Any path that does not go through the cell (1, 1) is unsafe since your health will drop to 0 when reaching the final cell.
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
 * 1 &lt;= m, n &lt;= 50
 *
 * 2 &lt;= m * n
 *
 * 1 &lt;= health &lt;= m + n
 *
 * grid[i][j] is either 0 or 1.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use 01 BFS.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Breadth-First Search, Graph Theory, Heap (Priority Queue), Matrix, Shortest Path).
 *
 * @see <a href="https://leetcode.com/problems/find-a-safe-walk-through-a-grid/">LeetCode #3286</a>
 */
public class FindASafeWalkThroughAGrid {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find a Safe Walk Through a Grid");
    }

    public static void main(String[] args) {
        System.out.println("=== FindASafeWalkThroughAGrid ===");
        FindASafeWalkThroughAGrid sol = new FindASafeWalkThroughAGrid();
        System.out.println(sol.solve(null));
    }
}
