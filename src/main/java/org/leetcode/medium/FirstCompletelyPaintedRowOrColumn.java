package org.leetcode.medium;


/**
 * <b>#2661 - First Completely Painted Row or Column</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed integer array arr, and an m x n integer matrix mat. arr and mat both contain all the integers in the range [1, m * n].
 *
 *
 * Go through each index i in arr starting from index 0 and paint the cell in mat containing the integer arr[i].
 *
 *
 * Return the smallest index i at which either a row or a column will be completely painted in mat.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: arr = [1,3,4,2], mat = [[1,4],[2,3]]
 * Output: 2
 * Explanation: The moves are shown in order, and both the first row and second column of the matrix become fully painted at arr[2].
 *
 * Example 2:
 *
 * Input: arr = [2,8,7,4,1,3,5,6,9], mat = [[3,2,5],[1,4,6],[8,7,9]]
 * Output: 3
 * Explanation: The second column becomes fully painted at arr[3].
 *
 *
 *
 * Constraints:
 *
 *
 * m == mat.length
 *
 * n = mat[i].length
 *
 * arr.length == m * n
 *
 * 1 &lt;= m, n &lt;= 105
 *
 * 1 &lt;= m * n &lt;= 105
 *
 * 1 &lt;= arr[i], mat[r][c] &lt;= m * n
 *
 * All the integers of arr are unique.
 *
 * All the integers of mat are unique.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Can we use a frequency array?
 * Hint 2: Pre-process the positions of the values in the matrix.
 * Hint 3: Traverse the array and increment the corresponding row and column frequency using the pre-processed positions.
 * Hint 4: If the row frequency becomes equal to the number of columns, or vice-versa return the current index.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Matrix).
 *
 * @see <a href="https://leetcode.com/problems/first-completely-painted-row-or-column/">LeetCode #2661</a>
 */
public class FirstCompletelyPaintedRowOrColumn {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: First Completely Painted Row or Column");
    }

    public static void main(String[] args) {
        System.out.println("=== FirstCompletelyPaintedRowOrColumn ===");
        FirstCompletelyPaintedRowOrColumn sol = new FirstCompletelyPaintedRowOrColumn();
        System.out.println(sol.solve(null));
    }
}
