package org.leetcode.medium;


/**
 * <b>#3212 - Count Submatrices With Equal Frequency of X and Y</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Matrix, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a 2D character matrix grid, where grid[i][j] is either 'X', 'Y', or '.', return the number of submatrices that contain:
 *
 *
 * grid[0][0]
 *
 * an equal frequency of 'X' and 'Y'.
 *
 * at least one 'X'.
 *
 *
 *
 * Example 1:
 *
 * Input: grid = [["X","Y","."],["Y",".","."]]
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 * Example 2:
 *
 * Input: grid = [["X","X"],["X","Y"]]
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 *
 * No submatrix has an equal frequency of 'X' and 'Y'.
 *
 * Example 3:
 *
 * Input: grid = [[".","."],[".","."]]
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 *
 * No submatrix has at least one 'X'.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= grid.length, grid[i].length &lt;= 1000
 *
 * grid[i][j] is either 'X', 'Y', or '.'.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Replace <code>’X’</code> with 1, <code>’Y’</code> with -1 and <code>’.’</code> with 0.
 * Hint 2: You need to find how many submatrices <code>grid[0..x][0..y]</code> have a sum of 0 and at least one <code>’X’</code>.
 * Hint 3: Use prefix sum to calculate submatrices sum.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Matrix, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/count-submatrices-with-equal-frequency-of-x-and-y/">LeetCode #3212</a>
 */
public class CountSubmatricesWithEqualFrequencyOfXAndY {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Submatrices With Equal Frequency of X and Y");
    }

    public static void main(String[] args) {
        System.out.println("=== CountSubmatricesWithEqualFrequencyOfXAndY ===");
        CountSubmatricesWithEqualFrequencyOfXAndY sol = new CountSubmatricesWithEqualFrequencyOfXAndY();
        System.out.println(sol.solve(null));
    }
}
