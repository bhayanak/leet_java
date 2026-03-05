package org.leetcode.easy;

/**
 * <b>#119 - Pascal's Triangle II</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.
 * 
 * 
 * In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: rowIndex = 3
 * Output: [1,3,3,1]
 * 
 * 
 * Example 2:
 * 
 * Input: rowIndex = 0
 * Output: [1]
 * 
 * 
 * Example 3:
 * 
 * Input: rowIndex = 1
 * Output: [1,1]
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 0 &lt;= rowIndex &lt;= 33
 * 
 *  
 * 
 * Follow up: Could you optimize your algorithm to use only O(rowIndex) extra space?
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — work through examples manually first.
 *
 * <h2>Approach</h2>
 * Compute the k-th row in-place: update from right to left so each update
 * uses the previous row's values (similar to 0/1 knapsack trick).
 *
 * <h2>Complexity</h2>
* Time: O(k²)  |  Space: O(k)
 *
 * @see <a href="https://leetcode.com/problems/pascals-triangle-ii/">LeetCode #119</a>
 */
public class PascalsTriangleIi {

    /**
     * Returns the k-th row (0-indexed) of Pascal's triangle using O(k) space.
     * @param rowIndex 0-indexed row to return
     * @return k-th row of Pascal's triangle
     */
    public java.util.List<Integer> getRow(int rowIndex) {
        java.util.List<Integer> row = new java.util.ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            row.add(1);
            // Update from right to left so we don't overwrite values we still need
            for (int j = i - 1; j > 0; j--) row.set(j, row.get(j) + row.get(j-1));
        }
        return row;
    }

    // ─── Run & Demo ──────────────────────────────────────────────
    /**
     * Runs sample test cases to demonstrate the solution.
     * Execute: javac PascalsTriangleIi.java &amp;&amp; java org.leetcode.easy.PascalsTriangleIi
     *
     * @param args not used
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        PascalsTriangleIi sol = new PascalsTriangleIi();
        System.out.println("No method available");
    }
}
