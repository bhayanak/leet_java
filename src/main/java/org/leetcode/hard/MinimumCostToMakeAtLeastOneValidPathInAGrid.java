package org.leetcode.hard;


/**
 * <b>#1368 - Minimum Cost to Make at Least One Valid Path in a Grid</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Breadth-First Search, Graph Theory, Heap (Priority Queue), Matrix, Shortest Path</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an m x n grid. Each cell of the grid has a sign pointing to the next cell you should visit if you are currently in this cell. The sign of grid[i][j] can be:
 *
 *
 * 1 which means go to the cell to the right. (i.e go from grid[i][j] to grid[i][j + 1])
 *
 * 2 which means go to the cell to the left. (i.e go from grid[i][j] to grid[i][j - 1])
 *
 * 3 which means go to the lower cell. (i.e go from grid[i][j] to grid[i + 1][j])
 *
 * 4 which means go to the upper cell. (i.e go from grid[i][j] to grid[i - 1][j])
 *
 * Notice that there could be some signs on the cells of the grid that point outside the grid.
 *
 *
 * You will initially start at the upper left cell (0, 0). A valid path in the grid is a path that starts from the upper left cell (0, 0) and ends at the bottom-right cell (m - 1, n - 1) following the signs on the grid. The valid path does not have to be the shortest.
 *
 *
 * You can modify the sign on a cell with cost = 1. You can modify the sign on a cell one time only.
 *
 *
 * Return the minimum cost to make the grid have at least one valid path.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: grid = [[1,1,1,1],[2,2,2,2],[1,1,1,1],[2,2,2,2]]
 * Output: 3
 * Explanation: You will start at point (0, 0).
 * The path to (3, 3) is as follows. (0, 0) --&gt; (0, 1) --&gt; (0, 2) --&gt; (0, 3) change the arrow to down with cost = 1 --&gt; (1, 3) --&gt; (1, 2) --&gt; (1, 1) --&gt; (1, 0) change the arrow to down with cost = 1 --&gt; (2, 0) --&gt; (2, 1) --&gt; (2, 2) --&gt; (2, 3) change the arrow to down with cost = 1 --&gt; (3, 3)
 * The total cost = 3.
 *
 * Example 2:
 *
 * Input: grid = [[1,1,3],[3,2,2],[1,1,4]]
 * Output: 0
 * Explanation: You can follow the path from (0, 0) to (2, 2).
 *
 * Example 3:
 *
 * Input: grid = [[1,2],[4,3]]
 * Output: 1
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
 * 1 &lt;= m, n &lt;= 100
 *
 * 1 &lt;= grid[i][j] &lt;= 4
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Build a graph where grid[i][j] is connected to all the four side-adjacent cells with weighted edge. the weight is 0 if the sign is pointing to the adjacent cell or 1 otherwise.
 * Hint 2: Do BFS from (0, 0) visit all edges with weight = 0 first. the answer is the distance to (m -1, n - 1).
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Breadth-First Search, Graph Theory, Heap (Priority Queue), Matrix, Shortest Path).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/minimum-cost-to-make-at-least-one-valid-path-in-a-grid/">LeetCode #1368</a>
 */
public class MinimumCostToMakeAtLeastOneValidPathInAGrid {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Cost to Make at Least One Valid Path in a Grid");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MinimumCostToMakeAtLeastOneValidPathInAGrid ===");
        MinimumCostToMakeAtLeastOneValidPathInAGrid sol = new MinimumCostToMakeAtLeastOneValidPathInAGrid();
        System.out.println(sol.solve(null));
    }
}
