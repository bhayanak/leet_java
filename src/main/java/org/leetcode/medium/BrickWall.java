package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #554: Brick Wall
 * @see <a href="https://leetcode.com/problems/brick-wall/">Problem</a>
 */
public class BrickWall {

    /**
     * LeetCode #554 – Brick Wall
     * Difficulty: MEDIUM
     * Topics: Array, Hash Table
     *
     * There is a rectangular brick wall in front of you with n rows of bricks.
     * The ith row has some number of bricks each of the same height (i.e., one
     * unit) but they can be of different widths. The total width of each row is
     * the same.
     * 
     * 
     * Draw a vertical line from the top to the bottom and cross the least bricks.
     * If your line goes through the edge of a brick, then the brick is not
     * considered as crossed. You cannot draw a line just along one of the two
     * vertical edges of the wall, in which case the line will obviously cross no
     * bricks.
     * 
     * 
     * Given the 2D array wall that contains the information about the wall,
     * return the minimum number of crossed bricks after drawing such a vertical
     * line.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: wall = [[1,2,2,1],[3,1,2],[1,3,2],[2,4],[3,1,2],[1,3,1,1]]
     * Output: 2
     * 
     * Example 2:
     * 
     * Input: wall = [[1],[1],[1]]
     * Output: 3
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * n == wall.length
     * 
     * 1 &lt;= n &lt;= 104
     * 
     * 1 &lt;= wall[i].length &lt;= 104
     * 
     * 1 &lt;= sum(wall[i].length) &lt;= 2 * 104
     * 
     * sum(wall[i]) is the same for each row i.
     * 
     * 1 &lt;= wall[i][j] &lt;= 231 - 1
     */
    // TODO: Implement solution for Brick Wall
    // Difficulty: MEDIUM | Topics: Array, Hash Table
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
        BrickWall sol = new BrickWall();
        System.out.println(sol.solve());
    }
}
