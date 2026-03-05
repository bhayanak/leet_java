package org.leetcode.easy;


/**
 * <b>#836 - Rectangle Overlap</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Math, Geometry</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * An axis-aligned rectangle is represented as a list [x1, y1, x2, y2], where (x1, y1) is the coordinate of its bottom-left corner, and (x2, y2) is the coordinate of its top-right corner. Its top and bottom edges are parallel to the X-axis, and its left and right edges are parallel to the Y-axis.
 *
 *
 * Two rectangles overlap if the area of their intersection is positive. To be clear, two rectangles that only touch at the corner or edges do not overlap.
 *
 *
 * Given two axis-aligned rectangles rec1 and rec2, return true if they overlap, otherwise return false.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: rec1 = [0,0,2,2], rec2 = [1,1,3,3]
 * Output: true
 *
 *
 * Example 2:
 *
 * Input: rec1 = [0,0,1,1], rec2 = [1,0,2,1]
 * Output: false
 *
 *
 * Example 3:
 *
 * Input: rec1 = [0,0,1,1], rec2 = [2,2,3,3]
 * Output: false
 *
 *
 *
 * Constraints:
 *
 *
 * rec1.length == 4
 *
 * rec2.length == 4
 *
 * -109 &lt;= rec1[i], rec2[i] &lt;= 109
 *
 * rec1 and rec2 represent a valid rectangle with a non-zero area.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Geometry).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/rectangle-overlap/">LeetCode #836</a>
  *
  * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
  */
public class RectangleOverlap {

    /**
     * Returns true if Is rectangle overlap.
     *
     * @param rec1 the rec1 (int[])
     * @param rec2 the rec2 (int[])
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
      */
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        return rec1[0] < rec2[2] && rec2[0] < rec1[2]
            && rec1[1] < rec2[3] && rec2[1] < rec1[3];
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac RectangleOverlap.java &amp;&amp; java org.leetcode.easy.RectangleOverlap</pre>
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public static void main(String[] args) {
        RectangleOverlap sol = new RectangleOverlap();
                System.out.println(sol.isRectangleOverlap(new int[]{0,0,2,2}, new int[]{1,1,3,3})); // true
                System.out.println(sol.isRectangleOverlap(new int[]{0,0,1,1}, new int[]{1,0,2,1})); // false
    }
}
