package org.leetcode.easy;

/**
 * <b>#171 - Excel Sheet Column Number</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Math, String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.
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
 * Input: columnTitle = "A"
 * Output: 1
 * 
 * Example 2:
 * 
 * Input: columnTitle = "AB"
 * Output: 28
 * 
 * Example 3:
 * 
 * Input: columnTitle = "ZY"
 * Output: 701
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= columnTitle.length &lt;= 7
 * 	
 * columnTitle consists only of uppercase English letters.
 * 	
 * columnTitle is in the range ["A", "FXSHRXW"].
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — work through examples manually first.
 *
 * <h2>Approach</h2>
 * Base-26 conversion: 'A'=1, 'B'=2, ..., 'Z'=26.
 * result = result * 26 + (char - 'A' + 1).
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(1)
 *
 * @see <a href="https://leetcode.com/problems/excel-sheet-column-number/">LeetCode #171</a>
  *
  * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
  */
public class ExcelSheetColumnNumber {

    /**
     * Converts an Excel column title to its corresponding column number.
     * @param columnTitle column title (e.g. "A"→1, "Z"→26, "AA"→27)
     * @return column number
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public int titleToNumber(String columnTitle) {
        int result = 0;
        for (char c : columnTitle.toCharArray())
            result = result * 26 + (c - 'A' + 1);
        return result;
    }

    // ─── Run & Demo ──────────────────────────────────────────────
    /**
     * Runs sample test cases to demonstrate the solution.
     * Execute: javac ExcelSheetColumnNumber.java &amp;&amp; java org.leetcode.easy.ExcelSheetColumnNumber
     *
     * @param args not used
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public static void main(String[] args) {
        ExcelSheetColumnNumber sol = new ExcelSheetColumnNumber();
        System.out.println(sol.titleToNumber("A"));   // 1
        System.out.println(sol.titleToNumber("AB"));  // 28
        System.out.println(sol.titleToNumber("ZY"));  // 701
    }
}
