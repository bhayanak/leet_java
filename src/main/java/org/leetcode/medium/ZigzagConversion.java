package org.leetcode.medium;

/**
 * <b>#6 - Zigzag Conversion</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
 * 
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * 
 * And then read line by line: "PAHNAPLSIIGYIR"
 * 
 * 
 * Write the code that will take a string and make this conversion given a number of rows:
 * 
 * string convert(string s, int numRows);
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: s = "PAYPALISHIRING", numRows = 3
 * Output: "PAHNAPLSIIGYIR"
 * 
 * Example 2:
 * 
 * Input: s = "PAYPALISHIRING", numRows = 4
 * Output: "PINALSIGYAHRPI"
 * Explanation:
 * P     I    N
 * A   L S  I G
 * Y A   H R
 * P     I
 * 
 * Example 3:
 * 
 * Input: s = "A", numRows = 1
 * Output: "A"
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= s.length &lt;= 1000
 * 	
 * s consists of English letters (lower-case and upper-case), ',' and '.'.
 * 	
 * 1 &lt;= numRows &lt;= 1000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints available — try to figure out the category and approach first!
 *
 * <h2>Approach</h2>
 * Simulate the zigzag by assigning each character to its row number.
 * Row index oscillates 0→numRows-1→0. Concatenate all row buffers.
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(n)
 *
 * @see <a href="https://leetcode.com/problems/zigzag-conversion/">LeetCode #6</a>
 */
public class ZigzagConversion {

    /**
     * Converts string s to a zigzag pattern across numRows and reads row by row.
     *
     * @param s       input string
     * @param numRows number of rows in the zigzag pattern
     * @return        the string read row-by-row after zigzag layout
     */
    public String convert(String s, int numRows) {
        if (numRows == 1 || numRows >= s.length()) return s;

        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) rows[i] = new StringBuilder();

        int row = 0, direction = -1;
        for (char c : s.toCharArray()) {
            rows[row].append(c);
            if (row == 0 || row == numRows - 1) direction = -direction; // flip
            row += direction;
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder rb : rows) result.append(rb);
        return result.toString();
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
                ZigzagConversion sol = new ZigzagConversion();
                System.out.println(sol.convert("PAYPALISHIRING", 3)); // "PAHNAPLSIIGYIR"
                System.out.println(sol.convert("PAYPALISHIRING", 4)); // "PINALSIGYAHRPI" 
    }
}
