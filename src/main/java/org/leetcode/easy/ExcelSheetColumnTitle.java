package org.leetcode.easy;

/**
 * <b>#168 - Excel Sheet Column Title</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Math, String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
 * 
 * 
 * For example:
 * 
 * A -&gt; 1
 * B -&gt; 2
 * C -&gt; 3
 * ...
 * Z -&gt; 26
 * AA -&gt; 27
 * AB -&gt; 28 
 * ...
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: columnNumber = 1
 * Output: "A"
 * 
 * Example 2:
 * 
 * Input: columnNumber = 28
 * Output: "AB"
 * 
 * Example 3:
 * 
 * Input: columnNumber = 701
 * Output: "ZY"
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= columnNumber &lt;= 231 - 1
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — work through examples manually first.
 *
 * <h2>Approach</h2>
 * Reverse of base-26: repeatedly take (n-1) % 26 to get 0-indexed letter,
 * prepend 'A'+(rem), divide by 26. Must shift by -1 before each modulo
 * because 'Z' represents 26, not 0.
 *
 * <h2>Complexity</h2>
* Time: O(log₂₆ n)  |  Space: O(1)
 *
 * @see <a href="https://leetcode.com/problems/excel-sheet-column-title/">LeetCode #168</a>
  *
  * <p><b>Explanation:</b> Uses StringBuilder for O(1) amortized character appends, avoiding O(n^2) String concatenation.</p>
  */
public class ExcelSheetColumnTitle {

    /**
     * Converts a column number to its Excel column title.
     * @param columnNumber 1-indexed column number
     * @return Excel column title (e.g. 1→"A", 28→"AB")
      *
      * <p><b>Explanation:</b> Uses StringBuilder for O(1) amortized character appends, avoiding O(n^2) String concatenation.</p>
      */
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--; // shift to 0-indexed
            sb.insert(0, (char)('A' + columnNumber % 26));
            columnNumber /= 26;
        }
        return sb.toString();
    }

    // ─── Run & Demo ──────────────────────────────────────────────
    /**
     * Runs sample test cases to demonstrate the solution.
     * Execute: javac ExcelSheetColumnTitle.java &amp;&amp; java org.leetcode.easy.ExcelSheetColumnTitle
     *
     * @param args not used
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public static void main(String[] args) {
        ExcelSheetColumnTitle sol = new ExcelSheetColumnTitle();
        System.out.println(sol.convertToTitle(1));   // A
        System.out.println(sol.convertToTitle(28));  // AB
        System.out.println(sol.convertToTitle(701)); // ZY
    }
}
