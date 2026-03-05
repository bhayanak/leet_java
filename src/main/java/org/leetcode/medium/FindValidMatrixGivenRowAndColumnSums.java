package org.leetcode.medium;


/**
 * <b>#1605 - Find Valid Matrix Given Row and Column Sums</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Greedy, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two arrays rowSum and colSum of non-negative integers where rowSum[i] is the sum of the elements in the ith row and colSum[j] is the sum of the elements of the jth column of a 2D matrix. In other words, you do not know the elements of the matrix, but you do know the sums of each row and column.
 *
 *
 * Find any matrix of non-negative integers of size rowSum.length x colSum.length that satisfies the rowSum and colSum requirements.
 *
 *
 * Return a 2D array representing any matrix that fulfills the requirements. It's guaranteed that at least one matrix that fulfills the requirements exists.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: rowSum = [3,8], colSum = [4,7]
 * Output: [[3,0],
 *          [1,7]]
 * Explanation: 
 * 0th row: 3 + 0 = 3 == rowSum[0]
 * 1st row: 1 + 7 = 8 == rowSum[1]
 * 0th column: 3 + 1 = 4 == colSum[0]
 * 1st column: 0 + 7 = 7 == colSum[1]
 * The row and column sums match, and all matrix elements are non-negative.
 * Another possible matrix is: [[1,2],
 *                              [3,5]]
 *
 * Example 2:
 *
 * Input: rowSum = [5,7,10], colSum = [8,6,8]
 * Output: [[0,5,0],
 *          [6,1,0],
 *          [2,0,8]]
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= rowSum.length, colSum.length &lt;= 500
 *
 * 0 &lt;= rowSum[i], colSum[i] &lt;= 108
 *
 * sum(rowSum) == sum(colSum)
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Find the smallest rowSum or colSum, and let it be x. Place that number in the grid, and subtract x from rowSum and colSum. Continue until all the sums are satisfied.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Greedy, Matrix).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/find-valid-matrix-given-row-and-column-sums/">LeetCode #1605</a>
 */
public class FindValidMatrixGivenRowAndColumnSums {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find Valid Matrix Given Row and Column Sums");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== FindValidMatrixGivenRowAndColumnSums ===");
        FindValidMatrixGivenRowAndColumnSums sol = new FindValidMatrixGivenRowAndColumnSums();
        System.out.println(sol.solve(null));
    }
}
