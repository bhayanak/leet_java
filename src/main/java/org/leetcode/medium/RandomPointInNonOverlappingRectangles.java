package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #497: Random Point in Non-overlapping Rectangles
 * @see <a href="https://leetcode.com/problems/random-point-in-non-overlapping-rectangles/">Problem</a>
 */
public class RandomPointInNonOverlappingRectangles {

    /**
     * LeetCode #497 – Random Point in Non-overlapping Rectangles
     * Difficulty: MEDIUM
     * Topics: Array, Math, Binary Search, Reservoir Sampling, Prefix Sum, Ordered Set, Randomized
     *
     * You are given an array of non-overlapping axis-aligned rectangles rects
     * where rects[i] = [ai, bi, xi, yi] indicates that (ai, bi) is the
     * bottom-left corner point of the ith rectangle and (xi, yi) is the top-right
     * corner point of the ith rectangle. Design an algorithm to pick a random
     * integer point inside the space covered by one of the given rectangles. A
     * point on the perimeter of a rectangle is included in the space covered by
     * the rectangle.
     * 
     * 
     * Any integer point inside the space covered by one of the given rectangles
     * should be equally likely to be returned.
     * 
     * 
     * Note that an integer point is a point that has integer coordinates.
     * 
     * 
     * Implement the Solution class:
     * 
     * 
     * Solution(int[][] rects) Initializes the object with the given rectangles
     * rects.
     * 
     * int[] pick() Returns a random integer point [u, v] inside the space covered
     * by one of the given rectangles.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input
     * ["Solution", "pick", "pick", "pick", "pick", "pick"]
     * [[[[-2, -2, 1, 1], [2, 2, 4, 6]]], [], [], [], [], []]
     * Output
     * [null, [1, -2], [1, -1], [-1, -2], [-2, -2], [0, 0]]
     * 
     * Explanation
     * Solution solution = new Solution([[-2, -2, 1, 1], [2, 2, 4, 6]]);
     * solution.pick(); // return [1, -2]
     * solution.pick(); // return [1, -1]
     * solution.pick(); // return [-1, -2]
     * solution.pick(); // return [-2, -2]
     * solution.pick(); // return [0, 0]
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= rects.length &lt;= 100
     * 
     * rects[i].length == 4
     * 
     * -109 &lt;= ai &lt; xi &lt;= 109
     * 
     * -109 &lt;= bi &lt; yi &lt;= 109
     * 
     * xi - ai &lt;= 2000
     * 
     * yi - bi &lt;= 2000
     * 
     * All the rectangles do not overlap.
     * 
     * At
     */
    // TODO: Implement solution for Random Point in Non-overlapping Rectangles
    // Difficulty: MEDIUM | Topics: Array, Math, Binary Search, Reservoir Sampling, Prefix Sum, Ordered Set, Randomized
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
        RandomPointInNonOverlappingRectangles sol = new RandomPointInNonOverlappingRectangles();
        System.out.println(sol.solve());
    }
}
