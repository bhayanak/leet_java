package org.leetcode.easy;


/**
 * <b>#2194 - Cells in a Range on an Excel Sheet</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * A cell (r, c) of an excel sheet is represented as a string "&lt;col&gt;&lt;row&gt;" where:
 *
 *
 * &lt;col&gt; denotes the column number c of the cell. It is represented by alphabetical letters.
 *
 *
 *
 *
 * For example, the 1st column is denoted by 'A', the 2nd by 'B', the 3rd by 'C', and so on.
 *
 *
 *
 * &lt;row&gt; is the row number r of the cell. The rth row is represented by the integer r.
 *
 * You are given a string s in the format "&lt;col1&gt;&lt;row1&gt;:&lt;col2&gt;&lt;row2&gt;", where &lt;col1&gt; represents the column c1, &lt;row1&gt; represents the row r1, &lt;col2&gt; represents the column c2, and &lt;row2&gt; represents the row r2, such that r1 &lt;= r2 and c1 &lt;= c2.
 *
 *
 * Return the list of cells (x, y) such that r1 &lt;= x &lt;= r2 and c1 &lt;= y &lt;= c2. The cells should be represented as strings in the format mentioned above and be sorted in non-decreasing order first by columns and then by rows.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "K1:L2"
 * Output: ["K1","K2","L1","L2"]
 * Explanation:
 * The above diagram shows the cells which should be present in the list.
 * The red arrows denote the order in which the cells should be presented.
 *
 * Example 2:
 *
 * Input: s = "A1:F1"
 * Output: ["A1","B1","C1","D1","E1","F1"]
 * Explanation:
 * The above diagram shows the cells which should be present in the list.
 * The red arrow denotes the order in which the cells should be presented.
 *
 *
 *
 * Constraints:
 *
 *
 * s.length == 5
 *
 * 'A' &lt;= s[0] &lt;= s[3] &lt;= 'Z'
 *
 * '1' &lt;= s[1] &lt;= s[4] &lt;= '9'
 *
 * s consists of uppercase English letters, digits and ':'.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: From the given string, find the corresponding rows and columns.
 * Hint 2: Iterate through the columns in ascending order and for each column, iterate through the rows in ascending order to obtain the required cells in sorted order.
 *
 * <h2>Approach</h2>
 * Think about the category (String).
 *
 * @see <a href="https://leetcode.com/problems/cells-in-a-range-on-an-excel-sheet/">LeetCode #2194</a>
 */
public class CellsInARangeOnAnExcelSheet {


    /**
     * Returns all cells in the rectangle [col1row1, col2row2] in spreadsheet order.
     *
     * @param s string like "K1:L2" specifying the top-left and bottom-right cells
     * @return list of cell names in column-first order
     *
     * <p><b>Explanation:</b> Parses the column letters and row numbers, then double-iterates</p>
     *   columns (outer) and rows (inner) to generate cells in column-major order.
     *   Time O((col2-col1+1)*(row2-row1+1)), Space O(1) per cell.
     */
    public java.util.List<String> cellsInRange(String s) {
        java.util.List<String> res = new java.util.ArrayList<>();
        char c1=s.charAt(0), c2=s.charAt(3);
        char r1=s.charAt(1), r2=s.charAt(4);
        for (char c=c1;c<=c2;c++) for (char r=r1;r<=r2;r++) res.add(""+c+r);
        return res;
    }

    public static void main(String[] args) {
        CellsInARangeOnAnExcelSheet sol = new CellsInARangeOnAnExcelSheet();
        System.out.println(sol.cellsInRange("K1:L2"));
    }
}
