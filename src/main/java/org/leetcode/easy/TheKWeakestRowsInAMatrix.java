package org.leetcode.easy;


/**
 * <b>#1337 - The K Weakest Rows in a Matrix</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Binary Search, Sorting, Heap (Priority Queue), Matrix</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an m x n binary matrix mat of 1's (representing soldiers) and 0's (representing civilians). The soldiers are positioned in front of the civilians. That is, all the 1's will appear to the left of all the 0's in each row.
 *
 *
 * A row i is weaker than a row j if one of the following is true:
 *
 *
 * The number of soldiers in row i is less than the number of soldiers in row j.
 *
 * Both rows have the same number of soldiers and i &lt; j.
 *
 * Return the indices of the k weakest rows in the matrix ordered from weakest to strongest.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: mat = 
 * [[1,1,0,0,0],
 *  [1,1,1,1,0],
 *  [1,0,0,0,0],
 *  [1,1,0,0,0],
 *  [1,1,1,1,1]], 
 * k = 3
 * Output: [2,0,3]
 * Explanation: 
 * The number of soldiers in each row is: 
 * - Row 0: 2 
 * - Row 1: 4 
 * - Row 2: 1 
 * - Row 3: 2 
 * - Row 4: 5 
 * The rows ordered from weakest to strongest are [2,0,3,1,4].
 *
 * Example 2:
 *
 * Input: mat = 
 * [[1,0,0,0],
 *  [1,1,1,1],
 *  [1,0,0,0],
 *  [1,0,0,0]], 
 * k = 2
 * Output: [0,2]
 * Explanation: 
 * The number of soldiers in each row is: 
 * - Row 0: 1 
 * - Row 1: 4 
 * - Row 2: 1 
 * - Row 3: 1 
 * The rows ordered from weakest to strongest are [0,2,3,1].
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
 * 2 &lt;= n, m &lt;= 100
 *
 * 1 &lt;= k &lt;= m
 *
 * matrix[i][j] is either 0 or 1.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Sort the matrix row indexes by the number of soldiers and then row indexes.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search, Sorting, Heap (Priority Queue), Matrix).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/">LeetCode #1337</a>
  *
  * <p><b>Explanation:</b> Sorts the input first to simplify subsequent search or comparison steps.</p>
  */
public class TheKWeakestRowsInAMatrix {

    /**
     * Solves the problem: K weakest rows.
     * Sorts the input first to enable efficient processing.
     *
     * @param mat the mat (int[][])
     * @param k the k (int)
     * @return the computed int[] result
      *
      * <p><b>Explanation:</b> Sorts the input first to simplify subsequent search or comparison steps.</p>
      */
    public int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length;
        int[][] strength = new int[m][2];
        for (int i=0;i<m;i++) {
            int cnt=0; for (int v : mat[i]) cnt+=v;
            strength[i] = new int[]{cnt, i};
        }
        java.util.Arrays.sort(strength,(a,b)->a[0]!=b[0]?a[0]-b[0]:a[1]-b[1]);
        int[] res = new int[k];
        for (int i=0;i<k;i++) res[i]=strength[i][1];
        return res;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        TheKWeakestRowsInAMatrix sol = new TheKWeakestRowsInAMatrix();
                int[][] mat = {{1,1,0,0,0},{1,1,1,1,0},{1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1}};
                System.out.println(java.util.Arrays.toString(sol.kWeakestRows(mat, 3))); // [2,0,3]
    }
}
