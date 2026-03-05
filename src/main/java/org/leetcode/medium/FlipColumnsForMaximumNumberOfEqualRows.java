package org.leetcode.medium;


/**
 * <b>#1072 - Flip Columns For Maximum Number of Equal Rows</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an m x n binary matrix matrix.
 *
 *
 * You can choose any number of columns in the matrix and flip every cell in that column (i.e., Change the value of the cell from 0 to 1 or vice versa).
 *
 *
 * Return the maximum number of rows that have all values equal after some number of flips.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: matrix = [[0,1],[1,1]]
 * Output: 1
 * Explanation: After flipping no values, 1 row has all values equal.
 *
 * Example 2:
 *
 * Input: matrix = [[0,1],[1,0]]
 * Output: 2
 * Explanation: After flipping values in the first column, both rows have equal values.
 *
 * Example 3:
 *
 * Input: matrix = [[0,0,0],[0,0,1],[1,1,0]]
 * Output: 2
 * Explanation: After flipping values in the first two columns, the last two rows have equal values.
 *
 *
 *
 * Constraints:
 *
 *
 * m == matrix.length
 *
 * n == matrix[i].length
 *
 * 1 &lt;= m, n &lt;= 300
 *
 * matrix[i][j] is either 0 or 1.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Flipping a subset of columns is like doing a bitwise XOR of some number K onto each row.  We want rows X with X ^ K = all 0s or all 1s.  This is the same as X = X^K ^K = (all 0s or all 1s) ^ K, so we want to count rows that have opposite bits set.  For example, if K = 1, then we count rows X = (00000...001, or 1111....110).
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Matrix).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/flip-columns-for-maximum-number-of-equal-rows/">LeetCode #1072</a>
 */
public class FlipColumnsForMaximumNumberOfEqualRows {

    /**
     * TODO: Implement "Flip Columns For Maximum Number of Equal Rows".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Flip Columns For Maximum Number of Equal Rows");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac FlipColumnsForMaximumNumberOfEqualRows.java &amp;&amp; java org.leetcode.medium.FlipColumnsForMaximumNumberOfEqualRows</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== FlipColumnsForMaximumNumberOfEqualRows ===");
        FlipColumnsForMaximumNumberOfEqualRows sol = new FlipColumnsForMaximumNumberOfEqualRows();
        System.out.println(sol.solve(null));
    }
}
