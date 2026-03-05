package org.leetcode.medium;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #542: 01 Matrix
 * @see <a href="https://leetcode.com/problems/01-matrix/">Problem</a>
 */
public class P01Matrix {

    /**
     * LeetCode #542 – 01 Matrix
     * Difficulty: MEDIUM
     * Topics: Array, Dynamic Programming, Breadth-First Search, Matrix
     *
     * Given an m x n binary matrix mat, return the distance of the nearest 0 for
     * each cell.
     * 
     * 
     * The distance between two cells sharing a common edge is 1.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: mat = [[0,0,0],[0,1,0],[0,0,0]]
     * Output: [[0,0,0],[0,1,0],[0,0,0]]
     * 
     * Example 2:
     * 
     * Input: mat = [[0,0,0],[0,1,0],[1,1,1]]
     * Output: [[0,0,0],[0,1,0],[1,2,1]]
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * m == mat.length
     * 
     * n == mat[i].length
     * 
     * 1 &lt;= m, n &lt;= 104
     * 
     * 1 &lt;= m * n &lt;= 104
     * 
     * mat[i][j] is either 0 or 1.
     * 
     * There is at least one 0 in mat.
     * 
     * 
     * 
     * Note: This question is the same as 1765:
     * https://leetcode.com/problems/map-of-highest-peak/
     */
    // TODO: Implement solution for 01 Matrix
    // Difficulty: MEDIUM | Topics: Array, Dynamic Programming, Breadth-First Search, Matrix
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
        P01Matrix sol = new P01Matrix();
        System.out.println(sol.solve());
    }
}
