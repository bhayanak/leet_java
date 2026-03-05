package org.leetcode.easy;


/**
 * <b>#925 - Long Pressed Name</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Two Pointers, String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Your friend is typing his name into a keyboard. Sometimes, when typing a character c, the key might get long pressed, and the character will be typed 1 or more times.
 *
 *
 * You examine the typed characters of the keyboard. Return True if it is possible that it was your friends name, with some characters (possibly none) being long pressed.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: name = "alex", typed = "aaleex"
 * Output: true
 * Explanation: 'a' and 'e' in 'alex' were long pressed.
 *
 * Example 2:
 *
 * Input: name = "saeed", typed = "ssaaedd"
 * Output: false
 * Explanation: 'e' must have been pressed twice, but it was not in the typed output.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= name.length, typed.length &lt;= 1000
 *
 * name and typed consist of only lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Two Pointers, String).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/long-pressed-name/">LeetCode #925</a>
  *
  * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
  */
public class LongPressedName {

    /**
     * Returns true if Is long pressed name.
     *
     * @param name the name (String)
     * @param typed the typed (String)
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
      */
    public boolean isLongPressedName(String name, String typed) {
        int i = 0;
        for (int j = 0; j < typed.length(); j++) {
            if (i < name.length() && name.charAt(i) == typed.charAt(j)) { i++; }
            else if (j == 0 || typed.charAt(j) != typed.charAt(j-1)) return false;
        }
        return i == name.length();
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac LongPressedName.java &amp;&amp; java org.leetcode.easy.LongPressedName</pre>
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
        LongPressedName sol = new LongPressedName();
                System.out.println(sol.isLongPressedName("alex","aaleex")); // true
                System.out.println(sol.isLongPressedName("saeed","ssaaedd")); // false
                System.out.println(sol.isLongPressedName("leelee","lleeelee")); // true
    }
}
