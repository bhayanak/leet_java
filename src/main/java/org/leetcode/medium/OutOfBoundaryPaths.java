package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #576: Out of Boundary Paths
 * @see <a href="https://leetcode.com/problems/out-of-boundary-paths/">Problem</a>
 */
public class OutOfBoundaryPaths {

    /**
     * LeetCode #576 – Out of Boundary Paths
     * Difficulty: MEDIUM
     * Topics: Dynamic Programming
     *
     * There is an m x n grid with a ball. The ball is initially at the position
     * [startRow, startColumn]. You are allowed to move the ball to one of the
     * four adjacent cells in the grid (possibly out of the grid crossing the grid
     * boundary). You can apply at most maxMove moves to the ball.
     * 
     * 
     * Given the five integers m, n, maxMove, startRow, startColumn, return the
     * number of paths to move the ball out of the grid boundary. Since the answer
     * can be very large, return it modulo 109 + 7.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: m = 2, n = 2, maxMove = 2, startRow = 0, startColumn = 0
     * Output: 6
     * 
     * Example 2:
     * 
     * Input: m = 1, n = 3, maxMove = 3, startRow = 0, startColumn = 1
     * Output: 12
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= m, n &lt;= 50
     * 
     * 0 &lt;= maxMove &lt;= 50
     * 
     * 0 &lt;= startRow &lt; m
     * 
     * 0 &lt;= startColumn &lt; n

     *
     * Hints:
     *   1. Is traversing every path feasible? There are many possible paths for a small matrix. Try to optimize it.
     *   2. Can we use some space to store the number of paths and update them after every move?
     *   3. One obvious thing: the ball will go out of the boundary only by crossing it. Also, there is only one possible way the ball can go out of the boundary from the boundary cell except for corner cells. Fr
     */
    // DP: dp[i][j] = paths from (i,j) in k moves that go out of bounds
    /**
     * Finds Find paths.
     * Uses dynamic programming to build solutions bottom-up.
     *
     * @param m the m (int)
     * @param n the n (int)
     * @param maxMove the maxMove (int)
     * @param startRow the startRow (int)
     * @param startColumn the startColumn (int)
     * @return the computed int result
     */
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        final int MOD = 1_000_000_007;
        int[][] dp = new int[m][n];
        dp[startRow][startColumn] = 1;
        int count = 0;
        int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};
        for (int k = 0; k < maxMove; k++) {
            int[][] next = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (dp[i][j] == 0) continue;
                    for (int[] d : dirs) {
                        int ni = i+d[0], nj = j+d[1];
                        if (ni < 0 || ni >= m || nj < 0 || nj >= n) count = (int)((count + dp[i][j]) % MOD);
                        else next[ni][nj] = (int)((next[ni][nj] + dp[i][j]) % MOD);
                    }
                }
            }
            dp = next;
        }
        return count;
    }

    public static void main(String[] args) {
        OutOfBoundaryPaths sol = new OutOfBoundaryPaths();
        System.out.println(sol.findPaths(0, 0, 0, 0, 0));
    }
}
