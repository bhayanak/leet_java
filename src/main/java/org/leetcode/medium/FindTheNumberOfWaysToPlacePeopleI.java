package org.leetcode.medium;


/**
 * <b>#3025 - Find the Number of Ways to Place People I</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Math, Geometry, Sorting, Enumeration</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 2D array points of size n x 2 representing integer coordinates of some points on a 2D plane, where points[i] = [xi, yi].
 *
 *
 * Count the number of pairs of points (A, B), where
 *
 *
 * A is on the upper left side of B, and
 *
 * there are no other points in the rectangle (or line) they make (including the border), except for the points A and B.
 *
 * Return the count.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: points = [[1,1],[2,2],[3,3]]
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 * There is no way to choose A and B such that A is on the upper left side of B.
 *
 * Example 2:
 *
 * Input: points = [[6,2],[4,4],[2,6]]
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * The left one is the pair (points[1], points[0]), where points[1] is on the upper left side of points[0] and the rectangle is empty.
 *
 * The middle one is the pair (points[2], points[1]), same as the left one it is a valid pair.
 *
 * The right one is the pair (points[2], points[0]), where points[2] is on the upper left side of points[0], but points[1] is inside the rectangle so it's not a valid pair.
 *
 * Example 3:
 *
 * Input: points = [[3,1],[1,3],[1,1]]
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * The left one is the pair (points[2], points[0]), where points[2] is on the upper left side of points[0] and there are no other points on the line they form. Note that it is a valid state when the two points form a line.
 *
 * The middle one is the pair (points[1], points[2]), it is a valid pair same as the left one.
 *
 * The right one is the pair (points[1], points[0]), it is not a valid pair as points[2] is on the border of the rectangle.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= n &lt;= 50
 *
 * points[i].length == 2
 *
 * 0 &lt;= points[i][0], points[i][1] &lt;= 50
 *
 * All points[i] are distinct.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: We can enumerate all the upper-left and lower-right corners.
 * Hint 2: If the upper-left corner is <code>(x1, y1)</code> and lower-right corner is <code>(x2, y2)</code>, check that there is no point <code>(x, y)</code> such that <code>x1 &lt;= x &lt;= x2</code> and <code>y2 &lt;= y &lt;= y1</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Geometry, Sorting, Enumeration).
 *
 * @see <a href="https://leetcode.com/problems/find-the-number-of-ways-to-place-people-i/">LeetCode #3025</a>
 */
public class FindTheNumberOfWaysToPlacePeopleI {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find the Number of Ways to Place People I");
    }

    public static void main(String[] args) {
        System.out.println("=== FindTheNumberOfWaysToPlacePeopleI ===");
        FindTheNumberOfWaysToPlacePeopleI sol = new FindTheNumberOfWaysToPlacePeopleI();
        System.out.println(sol.solve(null));
    }
}
