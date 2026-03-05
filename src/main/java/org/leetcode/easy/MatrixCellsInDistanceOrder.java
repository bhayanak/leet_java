package org.leetcode.easy;

/** MatrixCellsInDistanceOrder solution. */
public class MatrixCellsInDistanceOrder {
    /**
     * Returns all grid cells sorted by their Chebyshev distance from (rCenter, cCenter).
     *
     * @param rows    number of rows
     * @param cols    number of columns
     * @param rCenter row of center
     * @param cCenter column of center
     * @return all cells sorted by distance then row then column
     *
     * <p><b>Explanation:</b> Generates all cells with their Chebyshev distance, then sorts by</p>
     *   (distance, row, col). Time O(n^2 log n), Space O(n^2).
     */
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int[][] cells = new int[rows * cols][2];
        int idx = 0;
        for (int r = 0; r < rows; r++)
            for (int c = 0; c < cols; c++)
                cells[idx++] = new int[]{r, c};
        java.util.Arrays.sort(cells, (a, b) ->
            (Math.abs(a[0]-rCenter) + Math.abs(a[1]-cCenter)) -
            (Math.abs(b[0]-rCenter) + Math.abs(b[1]-cCenter)));
        return cells;
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac MatrixCellsInDistanceOrder.java &amp;&amp; java org.leetcode.easy.MatrixCellsInDistanceOrder</pre>
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public static void main(String[] args) {
        System.out.println("=== MatrixCellsInDistanceOrder ===");
        MatrixCellsInDistanceOrder sol = new MatrixCellsInDistanceOrder();
        System.out.println(sol.allCellsDistOrder(3, 3, 3, 3));
    }
}
