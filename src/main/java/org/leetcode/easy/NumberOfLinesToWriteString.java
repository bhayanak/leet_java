package org.leetcode.easy;

/**
 * <b>NumberOfLinesToWriteString</b>
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Topics:</b> String, Greedy, Array</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array widths of length 26 where widths[i] is the width of the i-th lowercase letter,
 * and a string s, write s as a sequence of lines where each line has a maximum width of 100 units.
 * Return the number of lines required and the width of the last line as an array [lines, lastWidth].
 * </pre>
 *
 * <h2>Approach</h2>
 * <p>Iterate through the string, greedily appending each character's width to the current line. Start a new line when the running width exceeds 100.</p>
 *
 * <h2>Complexity</h2>
 * <ul>
 *   <li>Time: O(n), where n is the length of s.</li>
 *   <li>Space: O(1)</li>
 * </ul>
 *
 * <p><b>Explanation:</b> Greedily appends each character's width; starts a new line when the running width exceeds 100.</p>
 */
public class NumberOfLinesToWriteString {
    /**
     * Returns the number of lines and width of the last line needed to write the string.
     *
     * @param widths array of 26 widths for each letter
     * @param s      the string to write
     * @return int[2]: [number of lines, width of last line]
     *
     * <p><b>Explanation:</b> Greedily appends each character's width; starts a new line when</p>
     *   the running width exceeds 100. Time O(n), Space O(1).
     */
    public int[] numberOfLines(int[] widths, String s) {
        int lines = 1, cur = 0;
        for (char c : s.toCharArray()) {
            int w = widths[c - 'a'];
            if (cur + w > 100) { lines++; cur = 0; }
            cur += w;
        }
        return new int[]{lines, cur};
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac NumberOfLinesToWriteString.java &amp;&amp; java org.leetcode.easy.NumberOfLinesToWriteString</pre>
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
        System.out.println("=== NumberOfLinesToWriteString ===");
        NumberOfLinesToWriteString sol = new NumberOfLinesToWriteString();
        System.out.println(sol.numberOfLines(new int[]{1,2,3}, "hello"));
    }
}
