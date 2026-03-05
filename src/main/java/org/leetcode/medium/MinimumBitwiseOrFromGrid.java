package org.leetcode.medium;


/**
 * <b>#3858 - Minimum Bitwise OR From Grid</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> General</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 2D integer array grid of size m x n.
 *
 *
 * You must select exactly one integer from each row of the grid.
 *
 *
 * Return an integer denoting the minimum possible bitwise OR of the selected integers from each row.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: grid = [[1,5],[2,4]]
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 * Choose 1 from the first row and 2 from the second row.
 *
 * The bitwise OR of 1 | 2 = 3​​​​​​​, which is the minimum possible.
 *
 * Example 2:
 *
 * Input: grid = [[3,5],[6,4]]
 *
 *
 * Output: 5
 *
 *
 * Explanation:
 *
 *
 * Choose 5 from the first row and 4 from the second row.
 *
 * The bitwise OR of 5 | 4 = 5​​​​​​​, which is the minimum possible.
 *
 * Example 3:
 *
 * Input: grid = [[7,9,8]]
 *
 *
 * Output: 7
 *
 *
 * Explanation:
 *
 *
 * Choosing 7 gives the minimum bitwise OR.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= m == grid.length &lt;= 105
 *
 * 1 &lt;= n == grid[i].length &lt;= 105
 *
 * m * n &lt;= 105
 *
 * 1 &lt;= grid[i][j] &lt;= 105​​​​​​​
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Solve greedily, bit by bit from the most significant to the least significant
 * Hint 2: For a bit, check whether it is possible to exclude it from the OR by choosing, in every row, at least one number with that bit unset
 * Hint 3: Accumulate all bits that cannot be excluded; the final value is the minimum possible bitwise OR
 *
 * <h2>Approach</h2>
 * Think about the category (General).
 *
 * @see <a href="https://leetcode.com/problems/minimum-bitwise-or-from-grid/">LeetCode #3858</a>
 */
public class MinimumBitwiseOrFromGrid {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Bitwise OR From Grid");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumBitwiseOrFromGrid ===");
        MinimumBitwiseOrFromGrid sol = new MinimumBitwiseOrFromGrid();
        System.out.println(sol.solve(null));
    }
}
