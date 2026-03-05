package org.leetcode.easy;

/** LargestTriangleArea solution. */
public class LargestTriangleArea {
    /**
     * Returns the largest triangle area that can be formed from the given points.
     *
     * @param points 2D array of point coordinates
     * @return the largest triangle area
     *
     * <p><b>Explanation:</b> Tries all O(n^3) triples and computes area via the shoelace formula.</p>
     *   For Easy constraints (n &lt;= 50) this is fast enough. Time O(n^3), Space O(1).
     */
    public double largestTriangleArea(int[][] points) {
        double max = 0;
        int n = points.length;
        for (int i = 0; i < n; i++)
            for (int j = i+1; j < n; j++)
                for (int k = j+1; k < n; k++) {
                    double area = Math.abs(
                        points[i][0] * (points[j][1] - points[k][1]) +
                        points[j][0] * (points[k][1] - points[i][1]) +
                        points[k][0] * (points[i][1] - points[j][1])
                    ) / 2.0;
                    max = Math.max(max, area);
                }
        return max;
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac LargestTriangleArea.java &amp;&amp; java org.leetcode.easy.LargestTriangleArea</pre>
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public static void main(String[] args) {
        System.out.println("=== LargestTriangleArea ===");
        LargestTriangleArea sol = new LargestTriangleArea();
        System.out.println(sol.largestTriangleArea(new int[][]{{1,2},{3,4}}));
    }
}
