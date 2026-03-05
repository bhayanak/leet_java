package org.leetcode.easy;


/**
 * <b>#1047 - Remove All Adjacent Duplicates In String</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> String, Stack</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string s consisting of lowercase English letters. A duplicate removal consists of choosing two adjacent and equal letters and removing them.
 *
 *
 * We repeatedly make duplicate removals on s until we no longer can.
 *
 *
 * Return the final string after all such duplicate removals have been made. It can be proven that the answer is unique.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abbaca"
 * Output: "ca"
 * Explanation: 
 * For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and this is the only possible move.  The result of this move is that the string is "aaca", of which only "aa" is possible, so the final string is "ca".
 *
 * Example 2:
 *
 * Input: s = "azxxzy"
 * Output: "ay"
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 105
 *
 * s consists of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use a stack to process everything greedily.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Stack).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/">LeetCode #1047</a>
  *
  * <p><b>Explanation:</b> Uses StringBuilder for O(1) amortized character appends, avoiding O(n^2) String concatenation.</p>
  */
public class RemoveAllAdjacentDuplicatesInString {

    /**
     * Removes Remove duplicates.
     *
     * @param s the s (String)
     * @return the computed String result
      *
      * <p><b>Explanation:</b> Uses StringBuilder for O(1) amortized character appends, avoiding O(n^2) String concatenation.</p>
      */
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (sb.length() > 0 && sb.charAt(sb.length()-1) == c) sb.deleteCharAt(sb.length()-1);
            else sb.append(c);
        }
        return sb.toString();
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac RemoveAllAdjacentDuplicatesInString.java &amp;&amp; java org.leetcode.easy.RemoveAllAdjacentDuplicatesInString</pre>
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
        RemoveAllAdjacentDuplicatesInString sol = new RemoveAllAdjacentDuplicatesInString();
                System.out.println(sol.removeDuplicates("abbaca")); // "ca"
                System.out.println(sol.removeDuplicates("azxxzy")); // "ay"
    }
}
