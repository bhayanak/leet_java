package org.leetcode.medium;

/**
 * <b>#63 - Unique Paths II</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an m x n integer array grid. There is a robot initially located at the top-left corner (i.e., grid[0][0]). The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]). The robot can only move either down or right at any point in time.
 * 
 * 
 * An obstacle and space are marked as 1 or 0 respectively in grid. A path that the robot takes cannot include any square that is an obstacle.
 * 
 * 
 * Return the number of possible unique paths that the robot can take to reach the bottom-right corner.
 * 
 * 
 * The testcases are generated so that the answer will be less than or equal to 2 * 109.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: obstacleGrid = [[0,0,0],[0,1,0],[0,0,0]]
 * Output: 2
 * Explanation: There is one obstacle in the middle of the 3x3 grid above.
 * There are two ways to reach the bottom-right corner:
 * 1. Right -&gt; Right -&gt; Down -&gt; Down
 * 2. Down -&gt; Down -&gt; Right -&gt; Right
 * 
 * Example 2:
 * 
 * Input: obstacleGrid = [[0,1],[0,0]]
 * Output: 1
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * m == obstacleGrid.length
 * 	
 * n == obstacleGrid[i].length
 * 	
 * 1 &lt;= m, n &lt;= 100
 * 	
 * obstacleGrid[i][j] is 0 or 1.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * - Use dynamic programming since, from each cell, you can move to the right or down.
 * - assume dp[i][j] is the number of unique paths to reach (i, j). dp[i][j] = dp[i][j -1] + dp[i - 1][j]. Be careful when you encounter an obstacle. set its value in dp to 0.
 *
 * <h2>Approach</h2>
 * Break the problem into smaller sub-problems or work through examples manually.
 * Consider: brute-force first, then optimise with sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, dynamic programming, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: TBD  |  Space: TBD
 *
 * @see <a href="https://leetcode.com/problems/unique-paths-ii/">LeetCode #63</a>
 */
public class UniquePathsIi {

    /**
     * TODO: Implement solution for "Unique Paths II".
     *
     * <p>Start with a brute-force and identify the bottleneck.
     * Hint: think about the data structure or algorithm category above.</p>
     *
     * @param args placeholder — replace with the real method signature
     * @return     placeholder — replace with the real return type
     */
    public Object solve(Object args) {
        // TODO: implement
        throw new UnsupportedOperationException("Not yet implemented: Unique Paths II");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        UniquePathsIi sol = new UniquePathsIi();
        System.out.println(sol.solve(null));
    }
}
