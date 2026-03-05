package org.leetcode.hard;


/**
 * <b>#850 - Rectangle Area II</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Segment Tree, Sweep Line, Ordered Set</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 2D array of axis-aligned rectangles. Each rectangle[i] = [xi1, yi1, xi2, yi2] denotes the ith rectangle where (xi1, yi1) are the coordinates of the bottom-left corner, and (xi2, yi2) are the coordinates of the top-right corner.
 *
 *
 * Calculate the total area covered by all rectangles in the plane. Any area covered by two or more rectangles should only be counted once.
 *
 *
 * Return the total area. Since the answer may be too large, return it modulo 109 + 7.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: rectangles = [[0,0,2,2],[1,0,2,3],[1,0,3,1]]
 * Output: 6
 * Explanation: A total area of 6 is covered by all three rectangles, as illustrated in the picture.
 * From (1,1) to (2,2), the green and red rectangles overlap.
 * From (1,0) to (2,3), all three rectangles overlap.
 *
 * Example 2:
 *
 * Input: rectangles = [[0,0,1000000000,1000000000]]
 * Output: 49
 * Explanation: The answer is 1018 modulo (109 + 7), which is 49.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= rectangles.length &lt;= 200
 *
 * rectanges[i].length == 4
 *
 * 0 &lt;= xi1, yi1, xi2, yi2 &lt;= 109
 *
 * xi1 &lt;= xi2
 *
 * yi1 &lt;= yi2
 *
 * All rectangles have non zero area.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Segment Tree, Sweep Line, Ordered Set).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/rectangle-area-ii/">LeetCode #850</a>
 */
public class RectangleAreaIi {

    /** Minimal binary tree node (self-contained). */
    public static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /**
     * TODO: Implement "Rectangle Area II".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Rectangle Area II");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac RectangleAreaIi.java &amp;&amp; java org.leetcode.hard.RectangleAreaIi</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== RectangleAreaIi ===");
        RectangleAreaIi sol = new RectangleAreaIi();
        System.out.println(sol.solve(null));
    }
}
