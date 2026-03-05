package org.leetcode.easy;

/** ProjectionAreaOf3dShapes solution. */
public class ProjectionAreaOf3dShapes {
    /**
     * Computes total projection area of a 3D grid of stacked cubes on three planes.
     *
     * @param grid n×n grid where grid[i][j] is the height of the stack at (i,j)
     * @return total area of the three projections
     *
     * <p><b>Explanation:</b> Top projection: each non-zero cell contributes 1.</p>
     *   Front projection: maximum of each row contributes its value.
     *   Side projection: maximum of each column contributes its value. Time O(n^2).
     */
    public int projectionArea(int[][] grid) {
        int n = grid.length, top = 0, front = 0, side = 0;
        for (int i = 0; i < n; i++) {
            int rowMax = 0, colMax = 0;
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0) top++;
                rowMax = Math.max(rowMax, grid[i][j]);
                colMax = Math.max(colMax, grid[j][i]);
            }
            front += rowMax;
            side  += colMax;
        }
        return top + front + side;
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac ProjectionAreaOf3dShapes.java &amp;&amp; java org.leetcode.easy.ProjectionAreaOf3dShapes</pre>
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public static void main(String[] args) {
        System.out.println("=== ProjectionAreaOf3dShapes ===");
        ProjectionAreaOf3dShapes sol = new ProjectionAreaOf3dShapes();
        System.out.println(sol.projectionArea(new int[][]{{1,2},{3,4}}));
    }
}
