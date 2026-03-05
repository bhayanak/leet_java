package org.leetcode.medium;


/**
 * <b>#3143 - Maximum Points Inside the Square</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, String, Binary Search, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 2D array points and a string s where, points[i] represents the coordinates of point i, and s[i] represents the tag of point i.
 *
 *
 * A valid square is a square centered at the origin (0, 0), has edges parallel to the axes, and does not contain two points with the same tag.
 *
 *
 * Return the maximum number of points contained in a valid square.
 *
 *
 * Note:
 *
 *
 * A point is considered to be inside the square if it lies on or within the square's boundaries.
 *
 * The side length of the square can be zero.
 *
 *
 *
 * Example 1:
 *
 * Input: points = [[2,2],[-1,-2],[-4,4],[-3,1],[3,-3]], s = "abdca"
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * The square of side length 4 covers two points points[0] and points[1].
 *
 * Example 2:
 *
 * Input: points = [[1,1],[-2,-2],[-2,2]], s = "abb"
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * The square of side length 2 covers one point, which is points[0].
 *
 * Example 3:
 *
 * Input: points = [[1,1],[-1,-1],[2,-2]], s = "ccd"
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 *
 * It's impossible to make any valid squares centered at the origin such that it covers only one point among points[0] and points[1].
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length, points.length &lt;= 105
 *
 * points[i].length == 2
 *
 * -109 &lt;= points[i][0], points[i][1] &lt;= 109
 *
 * s.length == points.length
 *
 * points consists of distinct coordinates.
 *
 * s consists only of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The smallest edge length of a square to include point <code>(x, y)</code> is <code>max(abs(x), abs(y)) * 2</code>.
 * Hint 2: Sort the points by <code>max(abs(x), abs(y))</code> and try each edge length, check the included point tags.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, String, Binary Search, Sorting).
 *
 * @see <a href="https://leetcode.com/problems/maximum-points-inside-the-square/">LeetCode #3143</a>
 */
public class MaximumPointsInsideTheSquare {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Points Inside the Square");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximumPointsInsideTheSquare ===");
        MaximumPointsInsideTheSquare sol = new MaximumPointsInsideTheSquare();
        System.out.println(sol.solve(null));
    }
}
