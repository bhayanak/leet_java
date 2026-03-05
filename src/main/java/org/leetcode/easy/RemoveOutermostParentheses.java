package org.leetcode.easy;


/**
 * <b>#1021 - Remove Outermost Parentheses</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> String, Stack</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * A valid parentheses string is either empty "", "(" + A + ")", or A + B, where A and B are valid parentheses strings, and + represents string concatenation.
 *
 *
 * For example, "", "()", "(())()", and "(()(()))" are all valid parentheses strings.
 *
 * A valid parentheses string s is primitive if it is nonempty, and there does not exist a way to split it into s = A + B, with A and B nonempty valid parentheses strings.
 *
 *
 * Given a valid parentheses string s, consider its primitive decomposition: s = P1 + P2 + ... + Pk, where Pi are primitive valid parentheses strings.
 *
 *
 * Return s after removing the outermost parentheses of every primitive string in the primitive decomposition of s.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "(()())(())"
 * Output: "()()()"
 * Explanation: 
 * The input string is "(()())(())", with primitive decomposition "(()())" + "(())".
 * After removing outer parentheses of each part, this is "()()" + "()" = "()()()".
 *
 * Example 2:
 *
 * Input: s = "(()())(())(()(()))"
 * Output: "()()()()(())"
 * Explanation: 
 * The input string is "(()())(())(()(()))", with primitive decomposition "(()())" + "(())" + "(()(()))".
 * After removing outer parentheses of each part, this is "()()" + "()" + "()(())" = "()()()()(())".
 *
 * Example 3:
 *
 * Input: s = "()()"
 * Output: ""
 * Explanation: 
 * The input string is "()()", with primitive decomposition "()" + "()".
 * After removing outer parentheses of each part, this is "" + "" = "".
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 105
 *
 * s[i] is either '(' or ')'.
 *
 * s is a valid parentheses string.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Can you find the primitive decomposition?  The number of ( and ) characters must be equal.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Stack).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/remove-outermost-parentheses/">LeetCode #1021</a>
  *
  * <p><b>Explanation:</b> Uses StringBuilder for O(1) amortized character appends, avoiding O(n^2) String concatenation.</p>
  */
public class RemoveOutermostParentheses {

    /**
     * Removes Remove outer parentheses.
     *
     * @param s the s (String)
     * @return the computed String result
      *
      * <p><b>Explanation:</b> Uses StringBuilder for O(1) amortized character appends, avoiding O(n^2) String concatenation.</p>
      */
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int depth = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') { if (depth++ > 0) sb.append(c); }
            else          { if (--depth > 0) sb.append(c); }
        }
        return sb.toString();
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac RemoveOutermostParentheses.java &amp;&amp; java org.leetcode.easy.RemoveOutermostParentheses</pre>
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
        RemoveOutermostParentheses sol = new RemoveOutermostParentheses();
                System.out.println(sol.removeOuterParentheses("(()())(())"));       // "()()()"
                System.out.println(sol.removeOuterParentheses("(()())(())(()())"));  // "()()()()()"
                System.out.println(sol.removeOuterParentheses("()()()"));             // ""
    }
}
