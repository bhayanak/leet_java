package org.leetcode.easy;

import java.util.*;
import java.util.stream.*;

/**
 * LeetCode #598: Range Addition II
 * @see <a href="https://leetcode.com/problems/range-addition-ii/">Problem</a>
 */
public class RangeAdditionIi {

    /**
     * LeetCode #598 – Range Addition II
     * Difficulty: EASY
     * Topics: Array, Math
     *
     * You are given an m x n matrix M initialized with all 0's and an array of
     * operations ops, where ops[i] = [ai, bi] means M[x][y] should be incremented
     * by one for all 0 &lt;= x &lt; ai and 0 &lt;= y &lt; bi.
     * 
     * 
     * Count and return the number of maximum integers in the matrix after
     * performing all the operations.
     * 
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: m = 3, n = 3, ops = [[2,2],[3,3]]
     * Output: 4
     * Explanation: The maximum integer in M is 2, and there are four of it in M.
     * So return 4.
     * 
     * Example 2:
     * 
     * Input: m = 3, n = 3, ops =
     * [[2,2],[3,3],[3,3],[3,3],[2,2],[3,3],[3,3],[3,3],[2,2],[3,3],[3,3],[3,3]]
     * Output: 4
     * 
     * Example 3:
     * 
     * Input: m = 3, n = 3, ops = []
     * Output: 9
     * 
     * 
     * 
     * Constraints:
     * 
     * 
     * 1 &lt;= m, n &lt;= 4 * 104
     * 
     * 0 &lt;= ops.length &lt;= 104
     * 
     * ops[i].length == 2
     * 
     * 1 &lt;= ai &lt;= m
     * 
     * 1 &lt;= bi &lt;= n
      *
      * <p><b>Explanation:</b> Iterates once, incrementing a counter each time the target condition is satisfied.</p>
      */
    public int maxCount(int m, int n, int[][] ops) {
        int minRow = m, minCol = n;
        for (int[] op : ops) {
            minRow = Math.min(minRow, op[0]);
            minCol = Math.min(minCol, op[1]);
        }
        return minRow * minCol;
    }

    public static void main(String[] args) {
        RangeAdditionIi sol = new RangeAdditionIi();
        System.out.println(sol.maxCount(0, 0, new int[][]{{1,2},{3,4}}));
    }
}
