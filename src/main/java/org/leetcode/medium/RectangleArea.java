package org.leetcode.medium;

/**
 * <b>#223 - Rectangle Area</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Math, Geometry</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given the coordinates of two rectilinear rectangles in a 2D plane, return the total area covered by the two rectangles.
 * 
 * 
 * The first rectangle is defined by its bottom-left corner (ax1, ay1) and its top-right corner (ax2, ay2).
 * 
 * 
 * The second rectangle is defined by its bottom-left corner (bx1, by1) and its top-right corner (bx2, by2).
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: ax1 = -3, ay1 = 0, ax2 = 3, ay2 = 4, bx1 = 0, by1 = -1, bx2 = 9, by2 = 2
 * Output: 45
 * 
 * Example 2:
 * 
 * Input: ax1 = -2, ay1 = -2, ax2 = 2, ay2 = 2, bx1 = -2, by1 = -2, bx2 = 2, by2 = 2
 * Output: 16
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * -104 &lt;= ax1 &lt;= ax2 &lt;= 104
 * 	
 * -104 &lt;= ay1 &lt;= ay2 &lt;= 104
 * 	
 * -104 &lt;= bx1 &lt;= bx2 &lt;= 104
 * 	
 * -104 &lt;= by1 &lt;= by2 &lt;= 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — study the examples carefully.
 *
 * <h2>Approach</h2>
 * Break the problem into smaller sub-problems:
 * 1. Try brute force first to understand the constraints.
 * 2. Look for repeated sub-problems (DP), sorted structure (binary search),
 *    adjacency (graph/BFS), or monotonic properties (stack/queue).
 * 3. Refine with the right data structure.
 *
 * <h2>Complexity</h2>
 * Time: TBD  |  Space: TBD
 *
 * @see <a href="https://leetcode.com/problems/rectangle-area/">LeetCode #223</a>
 */
public class RectangleArea {

    /** TODO: implement solution for "Rectangle Area". */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Rectangle Area");
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        System.out.println("=== RectangleArea ===");
        RectangleArea sol = new RectangleArea();
        System.out.println(sol.solve(null));
    }
}
