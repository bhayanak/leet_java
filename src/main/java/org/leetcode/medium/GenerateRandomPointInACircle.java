package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #478: Generate Random Point in a Circle
 * @see <a href="https://leetcode.com/problems/generate-random-point-in-a-circle/">Problem</a>
 */
public class GenerateRandomPointInACircle {

    /**
     * LeetCode #478 – Generate Random Point in a Circle
     * Difficulty: MEDIUM
     * Topics: Math, Geometry, Rejection Sampling, Randomized
     *
     * Given the radius and the position of the center of a circle, implement the
     * function randPoint which generates a uniform random point inside the
     * circle.
     * 
     * 
     * Implement the Solution class:
     * 
     * 
     * Solution(double radius, double x_center, double y_center) initializes the
     * object with the radius of the circle radius and the position of the center
     * (x_center, y_center).
     * 
     * randPoint() returns a random point inside the circle. A point on the
     * circumference of the circle is considered to be in the circle. The answer
     * is returned as an array [x, y].
     * 
     * 
     * 
     * Example 1:
     * 
     * Input
     * ["Solution", "randPoint", "randPoint", "randPoint"]
     * [[1.0, 0.0, 0.0], [], [], []]
     * Output
     * [null, [-0.02493, -0.38077], [0.82314, 0.38945], [0.36572, 0.17248]]
     * 
     * Explanation
     * Solution solution = new Solution(1.0, 0.0, 0.0);
     * solution.randPoint(); // return [-0.02493, -0.38077]
     * solution.randPoint(); // return [0.82314, 0.38945]
     * solution.randPoint(); // return [0.36572, 0.17248]
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 0 &lt; radius &lt;= 108
     * 
     * -107 &lt;= x_center, y_center &lt;= 107
     * 
     * At most 3 * 104 calls will be made to randPoint.
     */
    // TODO: Implement solution for Generate Random Point in a Circle
    // Difficulty: MEDIUM | Topics: Math, Geometry, Rejection Sampling, Randomized
    /**
     * Solves the problem and Solve.
     *
     * @return the computed Object result
     */
    public Object solve() {
        // Your solution here
        return null;
    }

    public static void main(String[] args) {
        GenerateRandomPointInACircle sol = new GenerateRandomPointInACircle();
        System.out.println(sol.solve());
    }
}
