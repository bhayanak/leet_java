package org.leetcode.medium;


/**
 * <b>#3552 - Grid Teleportation Traversal</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Breadth-First Search, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 2D character grid matrix of size m x n, represented as an array of strings, where matrix[i][j] represents the cell at the intersection of the ith row and jth column. Each cell is one of the following:
 *
 *
 * '.' representing an empty cell.
 *
 * '#' representing an obstacle.
 *
 * An uppercase letter ('A'-'Z') representing a teleportation portal.
 *
 * You start at the top-left cell (0, 0), and your goal is to reach the bottom-right cell (m - 1, n - 1). You can move from the current cell to any adjacent cell (up, down, left, right) as long as the destination cell is within the grid bounds and is not an obstacle.
 *
 *
 * If you step on a cell containing a portal letter and you haven't used that portal letter before, you may instantly teleport to any other cell in the grid with the same letter. This teleportation does not count as a move, but each portal letter can be used at most once during your journey.
 *
 *
 * Return the minimum number of moves required to reach the bottom-right cell. If it is not possible to reach the destination, return -1.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: matrix = ["A..",".A.","..."]
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * Before the first move, teleport from (0, 0) to (1, 1).
 *
 * In the first move, move from (1, 1) to (1, 2).
 *
 * In the second move, move from (1, 2) to (2, 2).
 *
 * Example 2:
 *
 * Input: matrix = [".#...",".#.#.",".#.#.","...#."]
 *
 *
 * Output: 13
 *
 *
 * Explanation:
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= m == matrix.length &lt;= 103
 *
 * 1 &lt;= n == matrix[i].length &lt;= 103
 *
 * matrix[i][j] is either '#', '.', or an uppercase English letter.
 *
 * matrix[0][0] is not an obstacle.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Treat all portals with the same letter as connected-like one big super-node.
 * Hint 2: Each portal letter is used at most once, but that doesn't affect correctness since we visit each cell only once in the shortest path.
 * Hint 3: Use Breadth-First Search to find the minimum number of moves.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Breadth-First Search, Matrix).
 *
 * @see <a href="https://leetcode.com/problems/grid-teleportation-traversal/">LeetCode #3552</a>
 */
public class GridTeleportationTraversal {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Grid Teleportation Traversal");
    }

    public static void main(String[] args) {
        System.out.println("=== GridTeleportationTraversal ===");
        GridTeleportationTraversal sol = new GridTeleportationTraversal();
        System.out.println(sol.solve(null));
    }
}
