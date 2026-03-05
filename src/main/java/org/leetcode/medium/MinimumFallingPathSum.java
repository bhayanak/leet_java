package org.leetcode.medium;


/**
 * <b>#931 - Minimum Falling Path Sum</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an n x n array of integers matrix, return the minimum sum of any falling path through matrix.
 *
 *
 * A falling path starts at any element in the first row and chooses the element in the next row that is either directly below or diagonally left/right. Specifically, the next element from position (row, col) will be (row + 1, col - 1), (row + 1, col), or (row + 1, col + 1).
 *
 *
 *
 *
 * Example 1:
 *
 * Input: matrix = [[2,1,3],[6,5,4],[7,8,9]]
 * Output: 13
 * Explanation: There are two falling paths with a minimum sum as shown.
 *
 * Example 2:
 *
 * Input: matrix = [[-19,57],[-40,-5]]
 * Output: -59
 * Explanation: The falling path with a minimum sum is shown.
 *
 *
 *
 * Constraints:
 *
 *
 * n == matrix.length == matrix[i].length
 *
 * 1 &lt;= n &lt;= 100
 *
 * -100 &lt;= matrix[i][j] &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Matrix).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/minimum-falling-path-sum/">LeetCode #931</a>
 */
public class MinimumFallingPathSum {

    /**
     * TODO: Implement "Minimum Falling Path Sum".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Falling Path Sum");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac MinimumFallingPathSum.java &amp;&amp; java org.leetcode.medium.MinimumFallingPathSum</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== MinimumFallingPathSum ===");
        MinimumFallingPathSum sol = new MinimumFallingPathSum();
        System.out.println(sol.solve(null));
    }
}
