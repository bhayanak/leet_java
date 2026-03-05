package org.leetcode.hard;


/**
 * <b>#3197 - Find the Minimum Area to Cover All Ones II</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Matrix, Enumeration</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 2D binary array grid. You need to find 3 non-overlapping rectangles having non-zero areas with horizontal and vertical sides such that all the 1's in grid lie inside these rectangles.
 *
 *
 * Return the minimum possible sum of the area of these rectangles.
 *
 *
 * Note that the rectangles are allowed to touch.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: grid = [[1,0,1],[1,1,1]]
 *
 *
 * Output: 5
 *
 *
 * Explanation:
 *
 *
 * The 1's at (0, 0) and (1, 0) are covered by a rectangle of area 2.
 *
 * The 1's at (0, 2) and (1, 2) are covered by a rectangle of area 2.
 *
 * The 1 at (1, 1) is covered by a rectangle of area 1.
 *
 * Example 2:
 *
 * Input: grid = [[1,0,1,0],[0,1,0,1]]
 *
 *
 * Output: 5
 *
 *
 * Explanation:
 *
 *
 * The 1's at (0, 0) and (0, 2) are covered by a rectangle of area 3.
 *
 * The 1 at (1, 1) is covered by a rectangle of area 1.
 *
 * The 1 at (1, 3) is covered by a rectangle of area 1.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= grid.length, grid[i].length &lt;= 30
 *
 * grid[i][j] is either 0 or 1.
 *
 * The input is generated such that there are at least three 1's in grid.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Consider covering using 2 rectangles. As the rectangles don’t overlap, one of the rectangles must either be vertically above or horizontally left to the other.
 * Hint 2: To find the minimum area, check all possible vertical and horizontal splits.
 * Hint 3: For 3 rectangles, extend the idea to first covering using one rectangle, and then try splitting leftover ones both horizontally and vertically.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Matrix, Enumeration).
 *
 * @see <a href="https://leetcode.com/problems/find-the-minimum-area-to-cover-all-ones-ii/">LeetCode #3197</a>
 */
public class FindTheMinimumAreaToCoverAllOnesIi {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find the Minimum Area to Cover All Ones II");
    }

    public static void main(String[] args) {
        System.out.println("=== FindTheMinimumAreaToCoverAllOnesIi ===");
        FindTheMinimumAreaToCoverAllOnesIi sol = new FindTheMinimumAreaToCoverAllOnesIi();
        System.out.println(sol.solve(null));
    }
}
