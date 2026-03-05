package org.leetcode.easy;


/**
 * <b>#1351 - Count Negative Numbers in a Sorted Matrix</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Binary Search, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
 * Output: 8
 * Explanation: There are 8 negatives number in the matrix.
 *
 * Example 2:
 *
 * Input: grid = [[3,2],[1,0]]
 * Output: 0
 *
 *
 *
 * Constraints:
 *
 *
 * m == grid.length
 *
 * n == grid[i].length
 *
 * 1 &lt;= m, n &lt;= 100
 *
 * -100 &lt;= grid[i][j] &lt;= 100
 *
 *
 * Follow up: Could you find an O(n + m) solution?
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use binary search for optimization or simply brute force.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search, Matrix).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/">LeetCode #1351</a>
  *
  * <p><b>Explanation:</b> Iterates once, incrementing a counter each time the target condition is satisfied.</p>
  */
public class CountNegativeNumbersInASortedMatrix {

    /**
     * Counts Count negatives.
     * Sorts the input first to enable efficient processing.
     *
     * @param grid the grid (int[][])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Iterates once, incrementing a counter each time the target condition is satisfied.</p>
      */
    public int countNegatives(int[][] grid) {
        int count=0, m=grid.length, n=grid[0].length, r=0, c=n-1;
        while (r<m && c>=0) {
            if (grid[r][c]<0) { count+=m-r; c--; } else r++;
        }
        return count;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        CountNegativeNumbersInASortedMatrix sol = new CountNegativeNumbersInASortedMatrix();
                System.out.println(sol.countNegatives(new int[][]{{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}})); // 8
                System.out.println(sol.countNegatives(new int[][]{{3,2},{1,0}})); // 0
    }
}
