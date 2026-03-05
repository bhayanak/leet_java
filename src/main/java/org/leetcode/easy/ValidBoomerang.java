package org.leetcode.easy;

/** ValidBoomerang solution. */
public class ValidBoomerang {
    /**
     * Checks whether three points form a valid boomerang (not collinear).
     *
     * @param points array of three [x,y] points
     * @return true if the points are non-collinear (distinct, non-straight-line)
     *
     * <p><b>Explanation:</b> Uses the cross-product of vectors AB and AC. If the cross product</p>
     *   is non-zero the points are not collinear. Time O(1), Space O(1).
     */
    public boolean isBoomerang(int[][] points) {
        int[] a = points[0], b = points[1], c = points[2];
        // cross product of (b-a) × (c-a)
        return (b[0]-a[0]) * (c[1]-a[1]) - (b[1]-a[1]) * (c[0]-a[0]) != 0;
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac ValidBoomerang.java &amp;&amp; java org.leetcode.easy.ValidBoomerang</pre>
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public static void main(String[] args) {
        System.out.println("=== ValidBoomerang ===");
        ValidBoomerang sol = new ValidBoomerang();
        System.out.println(sol.isBoomerang(new int[][]{{1,2},{3,4}}));
    }
}
