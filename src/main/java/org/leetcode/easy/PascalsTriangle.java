package org.leetcode.easy;

/**
 * <b>#118 - Pascal's Triangle</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 * 
 * 
 * In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: numRows = 5
 * Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 * 
 * 
 * Example 2:
 * 
 * Input: numRows = 1
 * Output: [[1]]
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= numRows &lt;= 30
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — work through examples manually first.
 *
 * <h2>Approach</h2>
 * Each row starts and ends with 1. Interior element = sum of two elements above.
 * Build row by row using the previous row.
 *
 * <h2>Complexity</h2>
* Time: O(n²)  |  Space: O(n²)
 *
 * @see <a href="https://leetcode.com/problems/pascals-triangle/">LeetCode #118</a>
 */
public class PascalsTriangle {

    /**
     * Generates the first numRows rows of Pascal's triangle.
     * @param numRows number of rows
     * @return Pascal's triangle as a list of lists
     */
    public java.util.List<java.util.List<Integer>> generate(int numRows) {
        java.util.List<java.util.List<Integer>> triangle = new java.util.ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            java.util.List<Integer> row = new java.util.ArrayList<>();
            row.add(1); // first element always 1
            java.util.List<Integer> prev = i > 0 ? triangle.get(i-1) : null;
            for (int j = 1; j < i; j++) row.add(prev.get(j-1) + prev.get(j));
            if (i > 0) row.add(1); // last element always 1
            triangle.add(row);
        }
        return triangle;
    }

    // ─── Run & Demo ──────────────────────────────────────────────
    /**
     * Runs sample test cases to demonstrate the solution.
     * Execute: javac PascalsTriangle.java &amp;&amp; java org.leetcode.easy.PascalsTriangle
     *
     * @param args not used
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        PascalsTriangle sol = new PascalsTriangle();
        System.out.println("No method available");
    }
}
