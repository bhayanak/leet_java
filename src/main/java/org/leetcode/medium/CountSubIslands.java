package org.leetcode.medium;


/**
 * <b>#1905 - Count Sub Islands</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Depth-First Search, Breadth-First Search, Union-Find, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two m x n binary matrices grid1 and grid2 containing only 0's (representing water) and 1's (representing land). An island is a group of 1's connected 4-directionally (horizontal or vertical). Any cells outside of the grid are considered water cells.
 *
 *
 * An island in grid2 is considered a sub-island if there is an island in grid1 that contains all the cells that make up this island in grid2.
 *
 *
 * Return the number of islands in grid2 that are considered sub-islands.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: grid1 = [[1,1,1,0,0],[0,1,1,1,1],[0,0,0,0,0],[1,0,0,0,0],[1,1,0,1,1]], grid2 = [[1,1,1,0,0],[0,0,1,1,1],[0,1,0,0,0],[1,0,1,1,0],[0,1,0,1,0]]
 * Output: 3
 * Explanation: In the picture above, the grid on the left is grid1 and the grid on the right is grid2.
 * The 1s colored red in grid2 are those considered to be part of a sub-island. There are three sub-islands.
 *
 * Example 2:
 *
 * Input: grid1 = [[1,0,1,0,1],[1,1,1,1,1],[0,0,0,0,0],[1,1,1,1,1],[1,0,1,0,1]], grid2 = [[0,0,0,0,0],[1,1,1,1,1],[0,1,0,1,0],[0,1,0,1,0],[1,0,0,0,1]]
 * Output: 2 
 * Explanation: In the picture above, the grid on the left is grid1 and the grid on the right is grid2.
 * The 1s colored red in grid2 are those considered to be part of a sub-island. There are two sub-islands.
 *
 *
 *
 * Constraints:
 *
 *
 * m == grid1.length == grid2.length
 *
 * n == grid1[i].length == grid2[i].length
 *
 * 1 &lt;= m, n &lt;= 500
 *
 * grid1[i][j] and grid2[i][j] are either 0 or 1.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Let's use floodfill to iterate over the islands of the second grid
 * Hint 2: Let's note that if all the cells in an island in the second grid if they are represented by land in the first grid then they are connected hence making that island a sub-island
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Depth-First Search, Breadth-First Search, Union-Find, Matrix).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/count-sub-islands/">LeetCode #1905</a>
 */
public class CountSubIslands {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Sub Islands");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== CountSubIslands ===");
        CountSubIslands sol = new CountSubIslands();
        System.out.println(sol.solve(null));
    }
}
