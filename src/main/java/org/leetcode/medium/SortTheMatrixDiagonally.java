package org.leetcode.medium;


/**
 * <b>#1329 - Sort the Matrix Diagonally</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Sorting, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * A matrix diagonal is a diagonal line of cells starting from some cell in either the topmost row or leftmost column and going in the bottom-right direction until reaching the matrix's end. For example, the matrix diagonal starting from mat[2][0], where mat is a 6 x 3 matrix, includes cells mat[2][0], mat[3][1], and mat[4][2].
 *
 *
 * Given an m x n matrix mat of integers, sort each matrix diagonal in ascending order and return the resulting matrix.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: mat = [[3,3,1,1],[2,2,1,2],[1,1,1,2]]
 * Output: [[1,1,1,1],[1,2,2,2],[1,2,3,3]]
 *
 * Example 2:
 *
 * Input: mat = [[11,25,66,1,69,7],[23,55,17,45,15,52],[75,31,36,44,58,8],[22,27,33,25,68,4],[84,28,14,11,5,50]]
 * Output: [[5,17,4,1,52,7],[11,11,25,45,8,69],[14,23,25,44,58,15],[22,27,31,36,50,66],[84,28,75,33,55,68]]
 *
 *
 *
 * Constraints:
 *
 *
 * m == mat.length
 *
 * n == mat[i].length
 *
 * 1 &lt;= m, n &lt;= 100
 *
 * 1 &lt;= mat[i][j] &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use a data structure to store all values of each diagonal.
 * Hint 2: How to index the data structure with the id of the diagonal?
 * Hint 3: All cells in the same diagonal (i,j) have the same difference so we can get the diagonal of a cell using the difference i-j.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Sorting, Matrix).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/sort-the-matrix-diagonally/">LeetCode #1329</a>
 */
public class SortTheMatrixDiagonally {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Sort the Matrix Diagonally");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== SortTheMatrixDiagonally ===");
        SortTheMatrixDiagonally sol = new SortTheMatrixDiagonally();
        System.out.println(sol.solve(null));
    }
}
