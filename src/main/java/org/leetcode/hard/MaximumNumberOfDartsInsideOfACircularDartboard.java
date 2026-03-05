package org.leetcode.hard;


/**
 * <b>#1453 - Maximum Number of Darts Inside of a Circular Dartboard</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Math, Geometry</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Alice is throwing n darts on a very large wall. You are given an array darts where darts[i] = [xi, yi] is the position of the ith dart that Alice threw on the wall.
 *
 *
 * Bob knows the positions of the n darts on the wall. He wants to place a dartboard of radius r on the wall so that the maximum number of darts that Alice throws lie on the dartboard.
 *
 *
 * Given the integer r, return the maximum number of darts that can lie on the dartboard.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: darts = [[-2,0],[2,0],[0,2],[0,-2]], r = 2
 * Output: 4
 * Explanation: Circle dartboard with center in (0,0) and radius = 2 contain all points.
 *
 * Example 2:
 *
 * Input: darts = [[-3,0],[3,0],[2,6],[5,4],[0,9],[7,8]], r = 5
 * Output: 5
 * Explanation: Circle dartboard with center in (0,4) and radius = 5 contain all points except the point (7,8).
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= darts.length &lt;= 100
 *
 * darts[i].length == 2
 *
 * -104 &lt;= xi, yi &lt;= 104
 *
 * All the darts are unique
 *
 * 1 &lt;= r &lt;= 5000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: If there is an optimal solution, you can always move the circle so that two points lie on the boundary of the circle.
 * Hint 2: When the radius is fixed, you can find either 0 or 1 or 2 circles that pass two given points at the same time.
 * Hint 3: Loop for each pair of points and find the center of the circle, after that count the number of points inside the circle.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Geometry).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/maximum-number-of-darts-inside-of-a-circular-dartboard/">LeetCode #1453</a>
 */
public class MaximumNumberOfDartsInsideOfACircularDartboard {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Number of Darts Inside of a Circular Dartboard");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MaximumNumberOfDartsInsideOfACircularDartboard ===");
        MaximumNumberOfDartsInsideOfACircularDartboard sol = new MaximumNumberOfDartsInsideOfACircularDartboard();
        System.out.println(sol.solve(null));
    }
}
