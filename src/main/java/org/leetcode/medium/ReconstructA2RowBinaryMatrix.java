package org.leetcode.medium;


/**
 * <b>#1253 - Reconstruct a 2-Row Binary Matrix</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Greedy, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given the following details of a matrix with n columns and 2 rows :
 *
 *
 * The matrix is a binary matrix, which means each element in the matrix can be 0 or 1.
 *
 * The sum of elements of the 0-th(upper) row is given as upper.
 *
 * The sum of elements of the 1-st(lower) row is given as lower.
 *
 * The sum of elements in the i-th column(0-indexed) is colsum[i], where colsum is given as an integer array with length n.
 *
 * Your task is to reconstruct the matrix with upper, lower and colsum.
 *
 *
 * Return it as a 2-D integer array.
 *
 *
 * If there are more than one valid solution, any of them will be accepted.
 *
 *
 * If no valid solution exists, return an empty 2-D array.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: upper = 2, lower = 1, colsum = [1,1,1]
 * Output: [[1,1,0],[0,0,1]]
 * Explanation: [[1,0,1],[0,1,0]], and [[0,1,1],[1,0,0]] are also correct answers.
 *
 * Example 2:
 *
 * Input: upper = 2, lower = 3, colsum = [2,2,1,1]
 * Output: []
 *
 * Example 3:
 *
 * Input: upper = 5, lower = 5, colsum = [2,1,2,0,1,0,1,2,0,1]
 * Output: [[1,1,1,0,1,0,0,1,0,0],[1,0,1,0,0,0,1,1,0,1]]
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= colsum.length &lt;= 10^5
 *
 * 0 &lt;= upper, lower &lt;= colsum.length
 *
 * 0 &lt;= colsum[i] &lt;= 2
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: You cannot do anything about colsum[i] = 2 case or colsum[i] = 0 case. Then you put colsum[i] = 1 case to the upper row until upper has reached. Then put the rest into lower row.
 * Hint 2: Fill 0 and 2 first, then fill 1 in the upper row or lower row in turn but be careful about exhausting permitted 1s in each row.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Greedy, Matrix).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/reconstruct-a-2-row-binary-matrix/">LeetCode #1253</a>
 */
public class ReconstructA2RowBinaryMatrix {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Reconstruct a 2-Row Binary Matrix");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== ReconstructA2RowBinaryMatrix ===");
        ReconstructA2RowBinaryMatrix sol = new ReconstructA2RowBinaryMatrix();
        System.out.println(sol.solve(null));
    }
}
