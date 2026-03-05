package org.leetcode.easy;

/** WidestVerticalAreaBetweenTwoPointsContainingNoPoints solution. */
public class WidestVerticalAreaBetweenTwoPointsContainingNoPoints {
    /**
     * Returns the width of the widest vertical area between two points that contains no points.
     *
     * @param points array of [x, y] coordinates
     * @return width of the widest gap between consecutive distinct x-coordinates
     *
     * <p><b>Explanation:</b> Only x-coordinates matter (y is irrelevant for vertical areas between points).</p>
     *   Sorts unique x values and finds the maximum consecutive gap. Time O(n log n), Space O(n).
     */
    public int maxWidthOfVerticalArea(int[][] points) {
        int[] xs = new int[points.length];
        for (int i = 0; i < points.length; i++) xs[i] = points[i][0];
        java.util.Arrays.sort(xs);
        int max = 0;
        for (int i = 1; i < xs.length; i++) max = Math.max(max, xs[i] - xs[i-1]);
        return max;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        System.out.println("=== WidestVerticalAreaBetweenTwoPointsContainingNoPoints ===");
        WidestVerticalAreaBetweenTwoPointsContainingNoPoints sol = new WidestVerticalAreaBetweenTwoPointsContainingNoPoints();
        System.out.println(sol.maxWidthOfVerticalArea(new int[][]{{1,2},{3,4}}));
    }
}
