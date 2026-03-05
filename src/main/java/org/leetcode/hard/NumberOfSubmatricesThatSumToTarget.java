package org.leetcode.hard;


/**
 * <b>#1074 - Number of Submatrices That Sum to Target</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Hash Table, Matrix, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a matrix and a target, return the number of non-empty submatrices that sum to target.
 *
 *
 * A submatrix x1, y1, x2, y2 is the set of all cells matrix[x][y] with x1 &lt;= x &lt;= x2 and y1 &lt;= y &lt;= y2.
 *
 *
 * Two submatrices (x1, y1, x2, y2) and (x1', y1', x2', y2') are different if they have some coordinate that is different: for example, if x1 != x1'.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: matrix = [[0,1,0],[1,1,1],[0,1,0]], target = 0
 * Output: 4
 * Explanation: The four 1x1 submatrices that only contain 0.
 *
 * Example 2:
 *
 * Input: matrix = [[1,-1],[-1,1]], target = 0
 * Output: 5
 * Explanation: The two 1x2 submatrices, plus the two 2x1 submatrices, plus the 2x2 submatrix.
 *
 * Example 3:
 *
 * Input: matrix = [[904]], target = 0
 * Output: 0
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= matrix.length &lt;= 100
 *
 * 1 &lt;= matrix[0].length &lt;= 100
 *
 * -1000 &lt;= matrix[i][j] &lt;= 1000
 *
 * -10^8 &lt;= target &lt;= 10^8
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Using a 2D prefix sum, we can query the sum of any submatrix in O(1) time.
Now for each (r1, r2), we can find the largest sum of a submatrix that uses every row in [r1, r2] in linear time using a sliding window.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Matrix, Prefix Sum).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/number-of-submatrices-that-sum-to-target/">LeetCode #1074</a>
 */
public class NumberOfSubmatricesThatSumToTarget {

    /**
     * TODO: Implement "Number of Submatrices That Sum to Target".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Number of Submatrices That Sum to Target");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac NumberOfSubmatricesThatSumToTarget.java &amp;&amp; java org.leetcode.hard.NumberOfSubmatricesThatSumToTarget</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== NumberOfSubmatricesThatSumToTarget ===");
        NumberOfSubmatricesThatSumToTarget sol = new NumberOfSubmatricesThatSumToTarget();
        System.out.println(sol.solve(null));
    }
}
