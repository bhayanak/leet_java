package org.leetcode.medium;


/**
 * <b>#1727 - Largest Submatrix With Rearrangements</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Greedy, Sorting, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a binary matrix matrix of size m x n, and you are allowed to rearrange the columns of the matrix in any order.
 *
 *
 * Return the area of the largest submatrix within matrix where every element of the submatrix is 1 after reordering the columns optimally.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: matrix = [[0,0,1],[1,1,1],[1,0,1]]
 * Output: 4
 * Explanation: You can rearrange the columns as shown above.
 * The largest submatrix of 1s, in bold, has an area of 4.
 *
 * Example 2:
 *
 * Input: matrix = [[1,0,1,0,1]]
 * Output: 3
 * Explanation: You can rearrange the columns as shown above.
 * The largest submatrix of 1s, in bold, has an area of 3.
 *
 * Example 3:
 *
 * Input: matrix = [[1,1,0],[1,0,1]]
 * Output: 2
 * Explanation: Notice that you must rearrange entire columns, and there is no way to make a submatrix of 1s larger than an area of 2.
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
 * 1 &lt;= m * n &lt;= 105
 *
 * matrix[i][j] is either 0 or 1.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: For each column, find the number of consecutive ones ending at each position.
 * Hint 2: For each row, sort the cumulative ones in non-increasing order and "fit" the largest submatrix.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Greedy, Sorting, Matrix).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/largest-submatrix-with-rearrangements/">LeetCode #1727</a>
 */
public class LargestSubmatrixWithRearrangements {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Largest Submatrix With Rearrangements");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== LargestSubmatrixWithRearrangements ===");
        LargestSubmatrixWithRearrangements sol = new LargestSubmatrixWithRearrangements();
        System.out.println(sol.solve(null));
    }
}
