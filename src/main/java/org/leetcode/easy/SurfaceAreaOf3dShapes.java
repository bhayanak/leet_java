package org.leetcode.easy;

/** SurfaceAreaOf3dShapes solution. */
public class SurfaceAreaOf3dShapes {
    /**
     * Computes total surface area of 3D shapes formed by stacking cubes on an n×n grid.
     *
     * @param grid n×n grid, grid[i][j] is number of cubes stacked at position (i,j)
     * @return total surface area
     *
     * <p><b>Explanation:</b> Each stack of h cubes contributes 2 (top+bottom) + 4*h (sides), minus</p>
     *   2 * min(h, neighbor) for each shared face with adjacent stacks. Time O(n^2).
     */
    public int surfaceArea(int[][] grid) {
        int n = grid.length, area = 0;
        int[][] dirs = {{0,1},{1,0},{0,-1},{-1,0}};
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int h = grid[i][j];
                if (h > 0) area += 2 + 4 * h;
                for (int[] d : dirs) {
                    int ni = i + d[0], nj = j + d[1];
                    int nh = (ni >= 0 && ni < n && nj >= 0 && nj < n) ? grid[ni][nj] : 0;
                    area -= Math.min(h, nh);
                }
            }
        }
        return area;
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac SurfaceAreaOf3dShapes.java &amp;&amp; java org.leetcode.easy.SurfaceAreaOf3dShapes</pre>
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public static void main(String[] args) {
        System.out.println("=== SurfaceAreaOf3dShapes ===");
        SurfaceAreaOf3dShapes sol = new SurfaceAreaOf3dShapes();
        System.out.println(sol.surfaceArea(new int[][]{{1,2},{3,4}}));
    }
}
