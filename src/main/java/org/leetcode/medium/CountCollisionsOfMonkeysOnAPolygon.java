package org.leetcode.medium;


/**
 * <b>#2550 - Count Collisions of Monkeys on a Polygon</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Math, Recursion</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There is a regular convex polygon with n vertices. The vertices are labeled from 0 to n - 1 in a clockwise direction, and each vertex has exactly one monkey. The following figure shows a convex polygon of 6 vertices.
 *
 *
 * Simultaneously, each monkey moves to a neighboring vertex. A collision happens if at least two monkeys reside on the same vertex after the movement or intersect on an edge.
 *
 *
 * Return the number of ways the monkeys can move so that at least one collision happens. Since the answer may be very large, return it modulo 109 + 7.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 3
 *
 *
 * Output: 6
 *
 *
 * Explanation:
 *
 *
 * There are 8 total possible movements.
 *
 * Two ways such that they collide at some point are:
 *
 *
 * Monkey 1 moves in a clockwise direction; monkey 2 moves in an anticlockwise direction; monkey 3 moves in a clockwise direction. Monkeys 1 and 2 collide.
 *
 * Monkey 1 moves in an anticlockwise direction; monkey 2 moves in an anticlockwise direction; monkey 3 moves in a clockwise direction. Monkeys 1 and 3 collide.
 *
 * Example 2:
 *
 * Input: n = 4
 *
 *
 * Output: 14
 *
 *
 *
 * Constraints:
 *
 *
 * 3 &lt;= n &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Try counting the number of ways in which the monkeys will not collide.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Recursion).
 *
 * @see <a href="https://leetcode.com/problems/count-collisions-of-monkeys-on-a-polygon/">LeetCode #2550</a>
 */
public class CountCollisionsOfMonkeysOnAPolygon {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Collisions of Monkeys on a Polygon");
    }

    public static void main(String[] args) {
        System.out.println("=== CountCollisionsOfMonkeysOnAPolygon ===");
        CountCollisionsOfMonkeysOnAPolygon sol = new CountCollisionsOfMonkeysOnAPolygon();
        System.out.println(sol.solve(null));
    }
}
