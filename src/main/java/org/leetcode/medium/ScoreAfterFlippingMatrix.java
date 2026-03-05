package org.leetcode.medium;


/**
 * <b>#861 - Score After Flipping Matrix</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Greedy, Bit Manipulation, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an m x n binary matrix grid.
 *
 *
 * A move consists of choosing any row or column and toggling each value in that row or column (i.e., changing all 0's to 1's, and all 1's to 0's).
 *
 *
 * Every row of the matrix is interpreted as a binary number, and the score of the matrix is the sum of these numbers.
 *
 *
 * Return the highest possible score after making any number of moves (including zero moves).
 *
 *
 *
 *
 * Example 1:
 *
 * Input: grid = [[0,0,1,1],[1,0,1,0],[1,1,0,0]]
 * Output: 39
 * Explanation: 0b1111 + 0b1001 + 0b1111 = 15 + 9 + 15 = 39
 *
 * Example 2:
 *
 * Input: grid = [[0]]
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
 * 1 &lt;= m, n &lt;= 20
 *
 * grid[i][j] is either 0 or 1.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Greedy, Bit Manipulation, Matrix).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/score-after-flipping-matrix/">LeetCode #861</a>
 */
public class ScoreAfterFlippingMatrix {

    /**
     * TODO: Implement "Score After Flipping Matrix".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Score After Flipping Matrix");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac ScoreAfterFlippingMatrix.java &amp;&amp; java org.leetcode.medium.ScoreAfterFlippingMatrix</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== ScoreAfterFlippingMatrix ===");
        ScoreAfterFlippingMatrix sol = new ScoreAfterFlippingMatrix();
        System.out.println(sol.solve(null));
    }
}
