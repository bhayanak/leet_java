package org.leetcode.easy;


/**
 * <b>#1582 - Special Positions in a Binary Matrix</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an m x n binary matrix mat, return the number of special positions in mat.
 *
 *
 * A position (i, j) is called special if mat[i][j] == 1 and all other elements in row i and column j are 0 (rows and columns are 0-indexed).
 *
 *
 *
 *
 * Example 1:
 *
 * Input: mat = [[1,0,0],[0,0,1],[1,0,0]]
 * Output: 1
 * Explanation: (1, 2) is a special position because mat[1][2] == 1 and all other elements in row 1 and column 2 are 0.
 *
 * Example 2:
 *
 * Input: mat = [[1,0,0],[0,1,0],[0,0,1]]
 * Output: 3
 * Explanation: (0, 0), (1, 1) and (2, 2) are special positions.
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
 * 1 &lt;= m, n &lt;= 100
 *
 * mat[i][j] is either 0 or 1.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Keep track of 1s in each row and in each column. Then while iterating over matrix, if the current position is 1 and current row as well as current column contains exactly one occurrence of 1.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Matrix).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/special-positions-in-a-binary-matrix/">LeetCode #1582</a>
  *
  * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
  */
public class SpecialPositionsInABinaryMatrix {

    /**
     * Solves the problem: Num special.
     *
     * @param mat the mat (int[][])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public int numSpecial(int[][] mat) {
        int m=mat.length, n=mat[0].length, count=0;
        for (int i=0;i<m;i++)
            for (int j=0;j<n;j++) if (mat[i][j]==1) {
                boolean ok=true;
                for (int r=0;r<m;r++) if (r!=i && mat[r][j]==1) { ok=false; break; }
                if (ok) for (int c=0;c<n;c++) if (c!=j && mat[i][c]==1) { ok=false; break; }
                if (ok) count++;
            }
        return count;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        SpecialPositionsInABinaryMatrix sol = new SpecialPositionsInABinaryMatrix();
                System.out.println(sol.numSpecial(new int[][]{{1,0,0},{0,0,1},{1,0,0}})); // 1
                System.out.println(sol.numSpecial(new int[][]{{1,0,0},{0,1,0},{0,0,1}})); // 3
    }
}
