package org.leetcode.medium;

/**
 * <b>#200 - Number of Islands</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Depth-First Search, Breadth-First Search, Union-Find, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.
 * 
 * 
 * An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: grid = [
 *   ["1","1","1","1","0"],
 *   ["1","1","0","1","0"],
 *   ["1","1","0","0","0"],
 *   ["0","0","0","0","0"]
 * ]
 * Output: 1
 * 
 * Example 2:
 * 
 * Input: grid = [
 *   ["1","1","0","0","0"],
 *   ["1","1","0","0","0"],
 *   ["0","0","1","0","0"],
 *   ["0","0","0","1","1"]
 * ]
 * Output: 3
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
 * grid[i][j] is '0' or '1'.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — work through examples manually first.
 *
 * <h2>Approach</h2>
 * DFS flood-fill: for each unvisited '1' cell, increment count and DFS to mark
 * all connected '1' cells as visited (set to '0' or use a visited array).
 *
 * <h2>Complexity</h2>
* Time: O(m·n)  |  Space: O(m·n) stack
 *
 * @see <a href="https://leetcode.com/problems/number-of-islands/">LeetCode #200</a>
 */
public class NumberOfIslands {

    /**
     * Counts the number of islands in a 2D grid ('1'=land, '0'=water).
     * @param grid 2D char grid
     * @return number of islands
     */
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        int count = 0;
        for (int r = 0; r < grid.length; r++)
            for (int c = 0; c < grid[0].length; c++)
                if (grid[r][c] == '1') { dfs(grid, r, c); count++; }
        return count;
    }

    private void dfs(char[][] grid, int r, int c) {
        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] != '1') return;
        grid[r][c] = '0'; // mark visited
        dfs(grid, r+1, c); dfs(grid, r-1, c);
        dfs(grid, r, c+1); dfs(grid, r, c-1);
    }

    // ─── Run & Demo ──────────────────────────────────────────────
    /**
     * Runs sample test cases to demonstrate the solution.
     * Execute: javac NumberOfIslands.java &amp;&amp; java org.leetcode.medium.NumberOfIslands
     *
     * @param args not used
     */
    public static void main(String[] args) {
        NumberOfIslands sol = new NumberOfIslands();
        char[][] g1 = {{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};
        System.out.println(sol.numIslands(g1)); // 1
        char[][] g2 = {{'1','1','0','0','0'},{'1','1','0','0','0'},{'0','0','1','0','0'},{'0','0','0','1','1'}};
        System.out.println(sol.numIslands(g2)); // 3
    }
}
