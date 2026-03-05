package org.leetcode.medium;

/**
 * <b>#120 - Triangle</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a triangle array, return the minimum path sum from top to bottom.
 * 
 * 
 * For each step, you may move to an adjacent number of the row below. More formally, if you are on index i on the current row, you may move to either index i or index i + 1 on the next row.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: triangle = [[2],[3,4],[6,5,7],[4,1,8,3]]
 * Output: 11
 * Explanation: The triangle looks like:
 *    2
 *   3 4
 *  6 5 7
 * 4 1 8 3
 * The minimum path sum from top to bottom is 2 + 3 + 5 + 1 = 11 (underlined above).
 * 
 * Example 2:
 * 
 * Input: triangle = [[-10]]
 * Output: -10
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= triangle.length &lt;= 200
 * 	
 * triangle[0].length == 1
 * 	
 * triangle[i].length == triangle[i - 1].length + 1
 * 	
 * -104 &lt;= triangle[i][j] &lt;= 104
 * 
 *  
 * Follow up: Could you do this using only O(n) extra space, where n is the total number of rows in the triangle?
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — work through examples manually first.
 *
 * <h2>Approach</h2>
 * DP bottom-up: start from the bottom row, work upward.
 * dp[j] = min(dp[j], dp[j+1]) + triangle[i][j].
 * This avoids extra space for a full DP table.
 *
 * <h2>Complexity</h2>
* Time: O(n²)  |  Space: O(n)
 *
 * @see <a href="https://leetcode.com/problems/triangle/">LeetCode #120</a>
 */
public class Triangle {

    /**
     * Finds the minimum path sum from top to bottom of triangle.
     * Adjacent numbers are in the same or adjacent column of the next row.
     * @param triangle list-of-rows triangle
     * @return minimum path sum
     */
    public int minimumTotal(java.util.List<java.util.List<Integer>> triangle) {
        int n = triangle.size();
        int[] dp = new int[n + 1];
        // Start from bottom row
        for (int i = n - 1; i >= 0; i--)
            for (int j = 0; j <= i; j++)
                dp[j] = triangle.get(i).get(j) + Math.min(dp[j], dp[j+1]);
        return dp[0];
    }

    // ─── Run & Demo ──────────────────────────────────────────────
    /**
     * Runs sample test cases to demonstrate the solution.
     * Execute: javac Triangle.java &amp;&amp; java org.leetcode.medium.Triangle
     *
     * @param args not used
     */
    public static void main(String[] args) {
        Triangle sol = new Triangle();
        java.util.List<java.util.List<Integer>> tri = java.util.Arrays.asList(
            java.util.Arrays.asList(2),
            java.util.Arrays.asList(3,4),
            java.util.Arrays.asList(6,5,7),
            java.util.Arrays.asList(4,1,8,3));
        System.out.println("Min path sum: " + sol.minimumTotal(tri)); // 11 (2->3->5->1)
    }
}
