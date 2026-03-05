package org.leetcode.hard;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #780: Reaching Points
 * @see <a href="https://leetcode.com/problems/reaching-points/">Problem</a>
 */
public class ReachingPoints {

    /**
     * LeetCode #780 – Reaching Points
     * Difficulty: HARD
     * Topics: Math
     *
     * Given four integers sx, sy, tx, and ty, return true if it is possible to
     * convert the point (sx, sy) to the point (tx, ty) through some operations,
     * or false otherwise.
     * 
     * 
     * The allowed operation on some point (x, y) is to convert it to either (x, x
     * + y) or (x + y, y).
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: sx = 1, sy = 1, tx = 3, ty = 5
     * Output: true
     * Explanation:
     * One series of moves that transforms the starting point to the target is:
     * (1, 1) -&gt; (1, 2)
     * (1, 2) -&gt; (3, 2)
     * (3, 2) -&gt; (3, 5)
     * 
     * Example 2:
     * 
     * Input: sx = 1, sy = 1, tx = 2, ty = 2
     * Output: false
     * 
     * Example 3:
     * 
     * Input: sx = 1, sy = 1, tx = 1, ty = 1
     * Output: true
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= sx, sy, tx, ty &lt;= 109
     */
    // TODO: Implement solution for Reaching Points
    // Difficulty: HARD | Topics: Math
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
        ReachingPoints sol = new ReachingPoints();
        System.out.println(sol.solve());
    }
}
