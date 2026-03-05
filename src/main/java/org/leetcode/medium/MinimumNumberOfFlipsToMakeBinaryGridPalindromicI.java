package org.leetcode.medium;


/**
 * <b>#3239 - Minimum Number of Flips to Make Binary Grid Palindromic I</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Two Pointers, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an m x n binary matrix grid.
 *
 *
 * A row or column is considered palindromic if its values read the same forward and backward.
 *
 *
 * You can flip any number of cells in grid from 0 to 1, or from 1 to 0.
 *
 *
 * Return the minimum number of cells that need to be flipped to make either all rows palindromic or all columns palindromic.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: grid = [[1,0,0],[0,0,0],[0,0,1]]
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 * Flipping the highlighted cells makes all the rows palindromic.
 *
 * Example 2:
 *
 * Input: grid = [[0,1],[0,1],[0,0]]
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 * Flipping the highlighted cell makes all the columns palindromic.
 *
 * Example 3:
 *
 * Input: grid = [[1],[0]]
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 *
 * All rows are already palindromic.
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
 * 1 &lt;= m * n &lt;= 2 * 105
 *
 * 0 &lt;= grid[i][j] &lt;= 1
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: We need to perform the operation only when the equivalent element of <code>i</code> from the back is not equal.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Two Pointers, Matrix).
 *
 * @see <a href="https://leetcode.com/problems/minimum-number-of-flips-to-make-binary-grid-palindromic-i/">LeetCode #3239</a>
 */
public class MinimumNumberOfFlipsToMakeBinaryGridPalindromicI {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Number of Flips to Make Binary Grid Palindromic I");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumNumberOfFlipsToMakeBinaryGridPalindromicI ===");
        MinimumNumberOfFlipsToMakeBinaryGridPalindromicI sol = new MinimumNumberOfFlipsToMakeBinaryGridPalindromicI();
        System.out.println(sol.solve(null));
    }
}
