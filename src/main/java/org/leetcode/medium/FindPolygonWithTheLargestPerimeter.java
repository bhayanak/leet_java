package org.leetcode.medium;


/**
 * <b>#2971 - Find Polygon With the Largest Perimeter</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Greedy, Sorting, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array of positive integers nums of length n.
 *
 *
 * A polygon is a closed plane figure that has at least 3 sides. The longest side of a polygon is smaller than the sum of its other sides.
 *
 *
 * Conversely, if you have k (k &gt;= 3) positive real numbers a1, a2, a3, ..., ak where a1 &lt;= a2 &lt;= a3 &lt;= ... &lt;= ak and a1 + a2 + a3 + ... + ak-1 &gt; ak, then there always exists a polygon with k sides whose lengths are a1, a2, a3, ..., ak.
 *
 *
 * The perimeter of a polygon is the sum of lengths of its sides.
 *
 *
 * Return the largest possible perimeter of a polygon whose sides can be formed from nums, or -1 if it is not possible to create a polygon.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [5,5,5]
 * Output: 15
 * Explanation: The only possible polygon that can be made from nums has 3 sides: 5, 5, and 5. The perimeter is 5 + 5 + 5 = 15.
 *
 * Example 2:
 *
 * Input: nums = [1,12,1,2,5,50,3]
 * Output: 12
 * Explanation: The polygon with the largest perimeter which can be made from nums has 5 sides: 1, 1, 2, 3, and 5. The perimeter is 1 + 1 + 2 + 3 + 5 = 12.
 * We cannot have a polygon with either 12 or 50 as the longest side because it is not possible to include 2 or more smaller sides that have a greater sum than either of them.
 * It can be shown that the largest possible perimeter is 12.
 *
 * Example 3:
 *
 * Input: nums = [5,5,50]
 * Output: -1
 * Explanation: There is no possible way to form a polygon from nums, as a polygon has at least 3 sides and 50 &gt; 5 + 5.
 *
 *
 *
 * Constraints:
 *
 *
 * 3 &lt;= n &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Sort the array.
 * Hint 2: Use greedy algorithm. If we select an edge as the longest side, it is always better to pick up all the edges with length no longer than this longest edge.
 * Hint 3: Note that the number of edges should not be less than 3.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Greedy, Sorting, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/find-polygon-with-the-largest-perimeter/">LeetCode #2971</a>
 */
public class FindPolygonWithTheLargestPerimeter {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find Polygon With the Largest Perimeter");
    }

    public static void main(String[] args) {
        System.out.println("=== FindPolygonWithTheLargestPerimeter ===");
        FindPolygonWithTheLargestPerimeter sol = new FindPolygonWithTheLargestPerimeter();
        System.out.println(sol.solve(null));
    }
}
