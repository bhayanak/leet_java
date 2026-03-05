package org.leetcode.medium;


/**
 * <b>#3070 - Count Submatrices with Top-Left Element and Sum Less Than k</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Matrix, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed integer matrix grid and an integer k.
 *
 *
 * Return the number of submatrices that contain the top-left element of the grid, and have a sum less than or equal to k.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: grid = [[7,6,3],[6,6,1]], k = 18
 * Output: 4
 * Explanation: There are only 4 submatrices, shown in the image above, that contain the top-left element of grid, and have a sum less than or equal to 18.
 *
 * Example 2:
 *
 * Input: grid = [[7,2,9],[1,5,0],[2,6,6]], k = 20
 * Output: 6
 * Explanation: There are only 6 submatrices, shown in the image above, that contain the top-left element of grid, and have a sum less than or equal to 20.
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
 * 1 &lt;= n, m &lt;= 1000 
 *
 * 0 &lt;= grid[i][j] &lt;= 1000
 *
 * 1 &lt;= k &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints -- trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Matrix, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/count-submatrices-with-top-left-element-and-sum-less-than-k/">LeetCode #3070</a>
 */
public class CountSubmatricesWithTopLeftElementAndSumLessThanK {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Submatrices with Top-Left Element and Sum Less Than k");
    }

    public static void main(String[] args) {
        System.out.println("=== CountSubmatricesWithTopLeftElementAndSumLessThanK ===");
        CountSubmatricesWithTopLeftElementAndSumLessThanK sol = new CountSubmatricesWithTopLeftElementAndSumLessThanK();
        System.out.println(sol.solve(null));
    }
}
