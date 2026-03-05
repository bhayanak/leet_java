package org.leetcode.medium;


/**
 * <b>#3394 - Check if Grid can be Cut into Sections</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer n representing the dimensions of an n x n grid, with the origin at the bottom-left corner of the grid. You are also given a 2D array of coordinates rectangles, where rectangles[i] is in the form [startx, starty, endx, endy], representing a rectangle on the grid. Each rectangle is defined as follows:
 *
 *
 * (startx, starty): The bottom-left corner of the rectangle.
 *
 * (endx, endy): The top-right corner of the rectangle.
 *
 * Note that the rectangles do not overlap. Your task is to determine if it is possible to make either two horizontal or two vertical cuts on the grid such that:
 *
 *
 * Each of the three resulting sections formed by the cuts contains at least one rectangle.
 *
 * Every rectangle belongs to exactly one section.
 *
 * Return true if such cuts can be made; otherwise, return false.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 5, rectangles = [[1,0,5,2],[0,2,2,4],[3,2,5,3],[0,4,4,5]]
 *
 *
 * Output: true
 *
 *
 * Explanation:
 *
 * The grid is shown in the diagram. We can make horizontal cuts at y = 2 and y = 4. Hence, output is true.
 *
 * Example 2:
 *
 * Input: n = 4, rectangles = [[0,0,1,1],[2,0,3,4],[0,2,2,3],[3,0,4,3]]
 *
 *
 * Output: true
 *
 *
 * Explanation:
 *
 * We can make vertical cuts at x = 2 and x = 3. Hence, output is true.
 *
 * Example 3:
 *
 * Input: n = 4, rectangles = [[0,2,2,4],[1,0,3,2],[2,2,3,4],[3,0,4,2],[3,2,4,4]]
 *
 *
 * Output: false
 *
 *
 * Explanation:
 *
 *
 * We cannot make two horizontal or two vertical cuts that satisfy the conditions. Hence, output is false.
 *
 *
 *
 * Constraints:
 *
 *
 * 3 &lt;= n &lt;= 109
 *
 * 3 &lt;= rectangles.length &lt;= 105
 *
 * 0 &lt;= rectangles[i][0] &lt; rectangles[i][2] &lt;= n
 *
 * 0 &lt;= rectangles[i][1] &lt; rectangles[i][3] &lt;= n
 *
 * No two rectangles overlap.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: For each rectangle, consider ranges <code>[start_x, end_x]</code> and <code>[start_y, end_y]</code> separately.
 * Hint 2: For x and y directions, check whether we can split it into 3 parts.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Sorting).
 *
 * @see <a href="https://leetcode.com/problems/check-if-grid-can-be-cut-into-sections/">LeetCode #3394</a>
 */
public class CheckIfGridCanBeCutIntoSections {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Check if Grid can be Cut into Sections");
    }

    public static void main(String[] args) {
        System.out.println("=== CheckIfGridCanBeCutIntoSections ===");
        CheckIfGridCanBeCutIntoSections sol = new CheckIfGridCanBeCutIntoSections();
        System.out.println(sol.solve(null));
    }
}
