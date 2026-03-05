package org.leetcode.medium;


/**
 * <b>#3195 - Find the Minimum Area to Cover All Ones I</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 2D binary array grid. Find a rectangle with horizontal and vertical sides with the smallest area, such that all the 1's in grid lie inside this rectangle.
 *
 *
 * Return the minimum possible area of the rectangle.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: grid = [[0,1,0],[1,0,1]]
 *
 *
 * Output: 6
 *
 *
 * Explanation:
 *
 * The smallest rectangle has a height of 2 and a width of 3, so it has an area of 2 * 3 = 6.
 *
 * Example 2:
 *
 * Input: grid = [[1,0],[0,0]]
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 * The smallest rectangle has both height and width 1, so its area is 1 * 1 = 1.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= grid.length, grid[i].length &lt;= 1000
 *
 * grid[i][j] is either 0 or 1.
 *
 * The input is generated such that there is at least one 1 in grid.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Find the minimum and maximum coordinates of a cell with a value of 1 in both directions.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Matrix).
 *
 * @see <a href="https://leetcode.com/problems/find-the-minimum-area-to-cover-all-ones-i/">LeetCode #3195</a>
 */
public class FindTheMinimumAreaToCoverAllOnesI {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find the Minimum Area to Cover All Ones I");
    }

    public static void main(String[] args) {
        System.out.println("=== FindTheMinimumAreaToCoverAllOnesI ===");
        FindTheMinimumAreaToCoverAllOnesI sol = new FindTheMinimumAreaToCoverAllOnesI();
        System.out.println(sol.solve(null));
    }
}
