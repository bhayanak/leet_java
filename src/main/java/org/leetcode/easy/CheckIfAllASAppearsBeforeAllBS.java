package org.leetcode.easy;


/**
 * <b>#2124 - Check if All A's Appears Before All B's</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a string s consisting of only the characters 'a' and 'b', return true if every 'a' appears before every 'b' in the string. Otherwise, return false.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "aaabbb"
 * Output: true
 * Explanation:
 * The 'a's are at indices 0, 1, and 2, while the 'b's are at indices 3, 4, and 5.
 * Hence, every 'a' appears before every 'b' and we return true.
 *
 * Example 2:
 *
 * Input: s = "abab"
 * Output: false
 * Explanation:
 * There is an 'a' at index 2 and a 'b' at index 1.
 * Hence, not every 'a' appears before every 'b' and we return false.
 *
 * Example 3:
 *
 * Input: s = "bbb"
 * Output: true
 * Explanation:
 * There are no 'a's, hence, every 'a' appears before every 'b' and we return true.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 100
 *
 * s[i] is either 'a' or 'b'.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: You can check the opposite: check if there is a ‘b’ before an ‘a’. Then, negate and return that answer.
 * Hint 2: s should not have any occurrences of “ba” as a substring.
 *
 * <h2>Approach</h2>
 * Think about the category (String).
 *
 * @see <a href="https://leetcode.com/problems/check-if-all-as-appears-before-all-bs/">LeetCode #2124</a>
  *
  * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
  */
public class CheckIfAllASAppearsBeforeAllBS {

    /**
     * Checks Check two chessboards.
     *
     * @param c1 the c1 (String)
     * @param c2 the c2 (String)
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
      */
    public boolean checkTwoChessboards(String c1, String c2) {
        return ((c1.charAt(0)-c2.charAt(0))+(c1.charAt(1)-c2.charAt(1)))%2==0;
    }

    public static void main(String[] args) {
        CheckIfAllASAppearsBeforeAllBS sol = new CheckIfAllASAppearsBeforeAllBS();
        System.out.println(sol.checkTwoChessboards("test", "test"));
    }
}
