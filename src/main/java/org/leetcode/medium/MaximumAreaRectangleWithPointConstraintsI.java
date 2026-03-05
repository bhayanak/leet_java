package org.leetcode.medium;


/**
 * <b>#3380 - Maximum Area Rectangle With Point Constraints I</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Math, Binary Indexed Tree, Segment Tree, Geometry, Sorting, Enumeration</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array points where points[i] = [xi, yi] represents the coordinates of a point on an infinite plane.
 *
 *
 * Your task is to find the maximum area of a rectangle that:
 *
 *
 * Can be formed using four of these points as its corners.
 *
 * Does not contain any other point inside or on its border.
 *
 * Has its edges parallel to the axes.
 *
 * Return the maximum area that you can obtain or -1 if no such rectangle is possible.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: points = [[1,1],[1,3],[3,1],[3,3]]
 *
 *
 * Output: 4
 *
 *
 * Explanation:
 *
 * We can make a rectangle with these 4 points as corners and there is no other point that lies inside or on the border. Hence, the maximum possible area would be 4.
 *
 * Example 2:
 *
 * Input: points = [[1,1],[1,3],[3,1],[3,3],[2,2]]
 *
 *
 * Output: -1
 *
 *
 * Explanation:
 *
 * There is only one rectangle possible is with points [1,1], [1,3], [3,1] and [3,3] but [2,2] will always lie inside it. Hence, returning -1.
 *
 * Example 3:
 *
 * Input: points = [[1,1],[1,3],[3,1],[3,3],[1,2],[3,2]]
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 * The maximum area rectangle is formed by the points [1,3], [1,2], [3,2], [3,3], which has an area of 2. Additionally, the points [1,1], [1,2], [3,1], [3,2] also form a valid rectangle with the same area.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= points.length &lt;= 10
 *
 * points[i].length == 2
 *
 * 0 &lt;= xi, yi &lt;= 100
 *
 * All the given points are unique.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: If <code>(x1, y1)</code> and <code>(x2, y2)</code> are two opposite corners of a rectangle, then the other two would be <code>(x1, y2)</code> and <code>(x2, y1)</code>.
 * Hint 2: Fix two points and find the other two using a set data structure.
 * Hint 3: After determining the rectangle, iterate through the array of points to ensure no point lies on the rectangle’s border or within its interior.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Binary Indexed Tree, Segment Tree, Geometry, Sorting, Enumeration).
 *
 * @see <a href="https://leetcode.com/problems/maximum-area-rectangle-with-point-constraints-i/">LeetCode #3380</a>
 */
public class MaximumAreaRectangleWithPointConstraintsI {

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
        throw new UnsupportedOperationException("Not yet implemented: Maximum Area Rectangle With Point Constraints I");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximumAreaRectangleWithPointConstraintsI ===");
        MaximumAreaRectangleWithPointConstraintsI sol = new MaximumAreaRectangleWithPointConstraintsI();
        System.out.println(sol.solve(null));
    }
}
