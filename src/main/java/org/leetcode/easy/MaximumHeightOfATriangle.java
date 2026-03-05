package org.leetcode.easy;

/** MaximumHeightOfATriangle solution. */
public class MaximumHeightOfATriangle {
    /**
     * Returns the maximum height of a triangle where alternating rows use the given colors.
     *
     * @param red   count of red balls
     * @param blue  count of blue balls
     * @return maximum triangle height
     *
     * <p><b>Explanation:</b> Tries both color orderings (red-first and blue-first). For each row i (1-indexed),</p>
     *   the color needing floor((i+1)/2) balls must be available. Time O(sqrt(red+blue)).
     */
    public int maxHeightOfTriangle(int red, int blue) {
        return Math.max(maxH(red, blue), maxH(blue, red));
    }
    private int maxH(int c1, int c2) {
        int h = 0;
        while (true) {
            h++;
            if (h % 2 == 1) { if (c1 < h) break; c1 -= h; }
            else             { if (c2 < h) break; c2 -= h; }
        }
        return h - 1;
    }

    public static void main(String[] args) {
        System.out.println("=== MaximumHeightOfATriangle ===");
        MaximumHeightOfATriangle sol = new MaximumHeightOfATriangle();
        System.out.println(sol.maxHeightOfTriangle(3, 3));
    }
}
