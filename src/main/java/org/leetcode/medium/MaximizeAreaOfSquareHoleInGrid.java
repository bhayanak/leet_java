package org.leetcode.medium;


/**
 * <b>#2943 - Maximize Area of Square Hole in Grid</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given the two integers, n and m and two integer arrays, hBars and vBars. The grid has n + 2 horizontal and m + 2 vertical bars, creating 1 x 1 unit cells. The bars are indexed starting from 1.
 *
 *
 * You can remove some of the bars in hBars from horizontal bars and some of the bars in vBars from vertical bars. Note that other bars are fixed and cannot be removed.
 *
 *
 * Return an integer denoting the maximum area of a square-shaped hole in the grid, after removing some bars (possibly none).
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 2, m = 1, hBars = [2,3], vBars = [2]
 *
 *
 * Output: 4
 *
 *
 * Explanation:
 *
 *
 * The left image shows the initial grid formed by the bars. The horizontal bars are [1,2,3,4], and the vertical bars are [1,2,3].
 *
 *
 * One way to get the maximum square-shaped hole is by removing horizontal bar 2 and vertical bar 2.
 *
 * Example 2:
 *
 * Input: n = 1, m = 1, hBars = [2], vBars = [2]
 *
 *
 * Output: 4
 *
 *
 * Explanation:
 *
 *
 * To get the maximum square-shaped hole, we remove horizontal bar 2 and vertical bar 2.
 *
 * Example 3:
 *
 * Input: n = 2, m = 3, hBars = [2,3], vBars = [2,4]
 *
 *
 * Output: 4
 *
 *
 * Explanation:
 *
 *
 * One way to get the maximum square-shaped hole is by removing horizontal bar 3, and vertical bar 4.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 109
 *
 * 1 &lt;= m &lt;= 109
 *
 * 1 &lt;= hBars.length &lt;= 100
 *
 * 2 &lt;= hBars[i] &lt;= n + 1
 *
 * 1 &lt;= vBars.length &lt;= 100
 *
 * 2 &lt;= vBars[i] &lt;= m + 1
 *
 * All values in hBars are distinct.
 *
 * All values in vBars are distinct.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Sort <code>hBars</code> and <code>vBars</code> and consider them separately.
 * Hint 2: Compute the longest sequence of consecutive integer values in each array, denoted as <code>[hx, hy]</code> and <code>[vx, vy]</code>, respectively.
 * Hint 3: The maximum square length we can get is <code>min(hy - hx + 2, vy - vx + 2)</code>.
 * Hint 4: Square the maximum square length to get the area.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Sorting).
 *
 * @see <a href="https://leetcode.com/problems/maximize-area-of-square-hole-in-grid/">LeetCode #2943</a>
 */
public class MaximizeAreaOfSquareHoleInGrid {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximize Area of Square Hole in Grid");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximizeAreaOfSquareHoleInGrid ===");
        MaximizeAreaOfSquareHoleInGrid sol = new MaximizeAreaOfSquareHoleInGrid();
        System.out.println(sol.solve(null));
    }
}
