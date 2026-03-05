package org.leetcode.easy;


/**
 * <b>#1556 - Thousand Separator</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer n, add a dot (".") as the thousands separator and return it in string format.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 987
 * Output: "987"
 *
 * Example 2:
 *
 * Input: n = 1234
 * Output: "1.234"
 *
 *
 *
 * Constraints:
 *
 *
 * 0 &lt;= n &lt;= 231 - 1
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Scan from the back of the integer and use dots to connect blocks with length 3 except the last block.
 *
 * <h2>Approach</h2>
 * Think about the category (String).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/thousand-separator/">LeetCode #1556</a>
  *
  * <p><b>Explanation:</b> Uses StringBuilder for O(1) amortized character appends, avoiding O(n^2) String concatenation.</p>
  */
public class ThousandSeparator {

    /**
     * Solves the problem: Thousand separator.
     *
     * @param n the n (int)
     * @return the computed String result
      *
      * <p><b>Explanation:</b> Uses StringBuilder for O(1) amortized character appends, avoiding O(n^2) String concatenation.</p>
      */
    public String thousandSeparator(int n) {
        String s = String.valueOf(n); StringBuilder sb = new StringBuilder();
        for (int i=0;i<s.length();i++) {
            if (i>0 && (s.length()-i)%3==0) sb.append('.');
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
        ThousandSeparator sol = new ThousandSeparator();
                System.out.println(sol.thousandSeparator(987));      // "987"
                System.out.println(sol.thousandSeparator(1234));     // "1.234"
                System.out.println(sol.thousandSeparator(123456789)); // "123.456.789"
    }
}
