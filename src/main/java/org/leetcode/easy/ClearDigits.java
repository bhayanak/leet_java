package org.leetcode.easy;


/**
 * <b>#3174 - Clear Digits</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> String, Stack, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string s.
 *
 *
 * Your task is to remove all digits by doing this operation repeatedly:
 *
 *
 * Delete the first digit and the closest non-digit character to its left.
 *
 * Return the resulting string after removing all digits.
 *
 *
 * Note that the operation cannot be performed on a digit that does not have any non-digit character to its left.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abc"
 *
 *
 * Output: "abc"
 *
 *
 * Explanation:
 *
 *
 * There is no digit in the string.
 *
 * Example 2:
 *
 * Input: s = "cb34"
 *
 *
 * Output: ""
 *
 *
 * Explanation:
 *
 *
 * First, we apply the operation on s[2], and s becomes "c4".
 *
 *
 * Then we apply the operation on s[1], and s becomes "".
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 100
 *
 * s consists only of lowercase English letters and digits.
 *
 * The input is generated such that it is possible to delete all digits.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Process string <code>s</code> from left to right, if <code>s[i]</code> is a digit, mark the nearest unmarked non-digit index to its left.
 * Hint 2: Delete all digits and all marked characters.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Stack, Simulation).
 *
 * @see <a href="https://leetcode.com/problems/clear-digits/">LeetCode #3174</a>
  *
  * <p><b>Explanation:</b> Uses StringBuilder for O(1) amortized character appends, avoiding O(n^2) String concatenation.</p>
  */
public class ClearDigits {

    /**
     * Solves the problem: Clear digits.
     *
     * @param s the s (String)
     * @return the computed String result
      *
      * <p><b>Explanation:</b> Uses StringBuilder for O(1) amortized character appends, avoiding O(n^2) String concatenation.</p>
      */
    public String clearDigits(String s) {
        StringBuilder sb=new StringBuilder();
        for (char c:s.toCharArray()) {
            if (Character.isDigit(c)) { if (sb.length()>0) sb.deleteCharAt(sb.length()-1); }
            else sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        ClearDigits sol = new ClearDigits();
                System.out.println(sol.clearDigits("cb34")); // ""
                System.out.println(sol.clearDigits("abc")); // "abc"
    }
}
