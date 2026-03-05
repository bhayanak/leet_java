package org.leetcode.medium;


/**
 * <b>#2250 - Count Number of Rectangles Containing Each Point</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Binary Search, Binary Indexed Tree, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 2D integer array rectangles where rectangles[i] = [li, hi] indicates that ith rectangle has a length of li and a height of hi. You are also given a 2D integer array points where points[j] = [xj, yj] is a point with coordinates (xj, yj).
 *
 *
 * The ith rectangle has its bottom-left corner point at the coordinates (0, 0) and its top-right corner point at (li, hi).
 *
 *
 * Return an integer array count of length points.length where count[j] is the number of rectangles that contain the jth point.
 *
 *
 * The ith rectangle contains the jth point if 0 &lt;= xj &lt;= li and 0 &lt;= yj &lt;= hi. Note that points that lie on the edges of a rectangle are also considered to be contained by that rectangle.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: rectangles = [[1,2],[2,3],[2,5]], points = [[2,1],[1,4]]
 * Output: [2,1]
 * Explanation: 
 * The first rectangle contains no points.
 * The second rectangle contains only the point (2, 1).
 * The third rectangle contains the points (2, 1) and (1, 4).
 * The number of rectangles that contain the point (2, 1) is 2.
 * The number of rectangles that contain the point (1, 4) is 1.
 * Therefore, we return [2, 1].
 *
 * Example 2:
 *
 * Input: rectangles = [[1,1],[2,2],[3,3]], points = [[1,3],[1,1]]
 * Output: [1,3]
 * Explanation:
 * The first rectangle contains only the point (1, 1).
 * The second rectangle contains only the point (1, 1).
 * The third rectangle contains the points (1, 3) and (1, 1).
 * The number of rectangles that contain the point (1, 3) is 1.
 * The number of rectangles that contain the point (1, 1) is 3.
 * Therefore, we return [1, 3].
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= rectangles.length, points.length &lt;= 5 * 104
 *
 * rectangles[i].length == points[j].length == 2
 *
 * 1 &lt;= li, xj &lt;= 109
 *
 * 1 &lt;= hi, yj &lt;= 100
 *
 * All the rectangles are unique.
 *
 * All the points are unique.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The heights of the rectangles and the y-coordinates of the points are only at most 100, so for each point, we can iterate over the possible heights of the rectangles that contain a given point.
 * Hint 2: For a given point and height, can we efficiently count how many rectangles with that height contain our point?
 * Hint 3: Sort the rectangles at each height and use binary search.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Binary Search, Binary Indexed Tree, Sorting).
 *
 * @see <a href="https://leetcode.com/problems/count-number-of-rectangles-containing-each-point/">LeetCode #2250</a>
 */
public class CountNumberOfRectanglesContainingEachPoint {

    public static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Number of Rectangles Containing Each Point");
    }

    public static void main(String[] args) {
        System.out.println("=== CountNumberOfRectanglesContainingEachPoint ===");
        CountNumberOfRectanglesContainingEachPoint sol = new CountNumberOfRectanglesContainingEachPoint();
        System.out.println(sol.solve(null));
    }
}
