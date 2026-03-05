package org.leetcode.easy;


/**
 * <b>#844 - Backspace String Compare</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Two Pointers, String, Stack, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.
 *
 *
 * Note that after backspacing an empty text, the text will continue empty.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "ab#c", t = "ad#c"
 * Output: true
 * Explanation: Both s and t become "ac".
 *
 * Example 2:
 *
 * Input: s = "ab##", t = "c#d#"
 * Output: true
 * Explanation: Both s and t become "".
 *
 * Example 3:
 *
 * Input: s = "a#c", t = "b"
 * Output: false
 * Explanation: s becomes "c" while t becomes "b".
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length, t.length &lt;= 200
 *
 * s and t only contain lowercase letters and '#' characters.
 *
 *
 *
 * Follow up: Can you solve it in O(n) time and O(1) space?
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Two Pointers, String, Stack, Simulation).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/backspace-string-compare/">LeetCode #844</a>
  *
  * <p><b>Explanation:</b> Uses StringBuilder for O(1) amortized character appends, avoiding O(n^2) String concatenation.</p>
  */
public class BackspaceStringCompare {

    /**
     * Solves the problem: Backspace compare.
     *
     * @param s the s (String)
     * @param t the t (String)
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Uses StringBuilder for O(1) amortized character appends, avoiding O(n^2) String concatenation.</p>
      */
    public boolean backspaceCompare(String s, String t) {
        return process(s).equals(process(t));
    }
    private String process(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '#') { if (sb.length() > 0) sb.deleteCharAt(sb.length()-1); }
            else sb.append(c);
        }
        return sb.toString();
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac BackspaceStringCompare.java &amp;&amp; java org.leetcode.easy.BackspaceStringCompare</pre>
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
        BackspaceStringCompare sol = new BackspaceStringCompare();
                System.out.println(sol.backspaceCompare("ab#c","ad#c")); // true (both "ac")
                System.out.println(sol.backspaceCompare("ab##","c#d#")); // true (both "")
                System.out.println(sol.backspaceCompare("a#c","b"));     // false
    }
}
