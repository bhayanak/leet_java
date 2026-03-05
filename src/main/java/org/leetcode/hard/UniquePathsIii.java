package org.leetcode.hard;


/**
 * <b>#980 - Unique Paths III</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Backtracking, Bit Manipulation, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an m x n integer array grid where grid[i][j] could be:
 *
 *
 * 1 representing the starting square. There is exactly one starting square.
 *
 * 2 representing the ending square. There is exactly one ending square.
 *
 * 0 representing empty squares we can walk over.
 *
 * -1 representing obstacles that we cannot walk over.
 *
 * Return the number of 4-directional walks from the starting square to the ending square, that walk over every non-obstacle square exactly once.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: grid = [[1,0,0,0],[0,0,0,0],[0,0,2,-1]]
 * Output: 2
 * Explanation: We have the following two paths: 
 * 1. (0,0),(0,1),(0,2),(0,3),(1,3),(1,2),(1,1),(1,0),(2,0),(2,1),(2,2)
 * 2. (0,0),(1,0),(2,0),(2,1),(1,1),(0,1),(0,2),(0,3),(1,3),(1,2),(2,2)
 *
 * Example 2:
 *
 * Input: grid = [[1,0,0,0],[0,0,0,0],[0,0,0,2]]
 * Output: 4
 * Explanation: We have the following four paths: 
 * 1. (0,0),(0,1),(0,2),(0,3),(1,3),(1,2),(1,1),(1,0),(2,0),(2,1),(2,2),(2,3)
 * 2. (0,0),(0,1),(1,1),(1,0),(2,0),(2,1),(2,2),(1,2),(0,2),(0,3),(1,3),(2,3)
 * 3. (0,0),(1,0),(2,0),(2,1),(2,2),(1,2),(1,1),(0,1),(0,2),(0,3),(1,3),(2,3)
 * 4. (0,0),(1,0),(2,0),(2,1),(1,1),(0,1),(0,2),(0,3),(1,3),(1,2),(2,2),(2,3)
 *
 * Example 3:
 *
 * Input: grid = [[0,1],[2,0]]
 * Output: 0
 * Explanation: There is no path that walks over every empty square exactly once.
 * Note that the starting and ending square can be anywhere in the grid.
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
 * 1 &lt;= m, n &lt;= 20
 *
 * 1 &lt;= m * n &lt;= 20
 *
 * -1 &lt;= grid[i][j] &lt;= 2
 *
 * There is exactly one starting cell and one ending cell.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Backtracking, Bit Manipulation, Matrix).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/unique-paths-iii/">LeetCode #980</a>
 */
public class UniquePathsIii {

    /**
     * TODO: Implement "Unique Paths III".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Unique Paths III");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac UniquePathsIii.java &amp;&amp; java org.leetcode.hard.UniquePathsIii</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== UniquePathsIii ===");
        UniquePathsIii sol = new UniquePathsIii();
        System.out.println(sol.solve(null));
    }
}
