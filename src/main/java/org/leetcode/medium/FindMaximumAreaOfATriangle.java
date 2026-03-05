package org.leetcode.medium;


/**
 * <b>#3588 - Find Maximum Area of a Triangle</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Math, Greedy, Geometry, Enumeration</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 2D array coords of size n x 2, representing the coordinates of n points in an infinite Cartesian plane.
 *
 *
 * Find twice the maximum area of a triangle with its corners at any three elements from coords, such that at least one side of this triangle is parallel to the x-axis or y-axis. Formally, if the maximum area of such a triangle is A, return 2 * A.
 *
 *
 * If no such triangle exists, return -1.
 *
 *
 * Note that a triangle cannot have zero area.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: coords = [[1,1],[1,2],[3,2],[3,3]]
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 * The triangle shown in the image has a base 1 and height 2. Hence its area is 1/2 * base * height = 1.
 *
 * Example 2:
 *
 * Input: coords = [[1,1],[2,2],[3,3]]
 *
 *
 * Output: -1
 *
 *
 * Explanation:
 *
 *
 * The only possible triangle has corners (1, 1), (2, 2), and (3, 3). None of its sides are parallel to the x-axis or the y-axis.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n == coords.length &lt;= 105
 *
 * 1 &lt;= coords[i][0], coords[i][1] &lt;= 106
 *
 * All coords[i] are unique.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: <code>area * 2 = base * height</code>
 * Hint 2: Let the base be parallel to the x‑axis or y‑axis
 * Hint 3: Sort to find the maximum base for each fixed <code>x</code> (or <code>y</code>), then the maximum height comes from the extreme values of the other coordinate.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Math, Greedy, Geometry, Enumeration).
 *
 * @see <a href="https://leetcode.com/problems/find-maximum-area-of-a-triangle/">LeetCode #3588</a>
 */
public class FindMaximumAreaOfATriangle {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find Maximum Area of a Triangle");
    }

    public static void main(String[] args) {
        System.out.println("=== FindMaximumAreaOfATriangle ===");
        FindMaximumAreaOfATriangle sol = new FindMaximumAreaOfATriangle();
        System.out.println(sol.solve(null));
    }
}
