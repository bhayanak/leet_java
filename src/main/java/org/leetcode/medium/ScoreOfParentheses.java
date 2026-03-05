package org.leetcode.medium;


/**
 * <b>#856 - Score of Parentheses</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String, Stack</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a balanced parentheses string s, return the score of the string.
 *
 *
 * The score of a balanced parentheses string is based on the following rule:
 *
 *
 * "()" has score 1.
 *
 * AB has score A + B, where A and B are balanced parentheses strings.
 *
 * (A) has score 2 * A, where A is a balanced parentheses string.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "()"
 * Output: 1
 *
 * Example 2:
 *
 * Input: s = "(())"
 * Output: 2
 *
 * Example 3:
 *
 * Input: s = "()()"
 * Output: 2
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= s.length &lt;= 50
 *
 * s consists of only '(' and ')'.
 *
 * s is a balanced parentheses string.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Stack).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/score-of-parentheses/">LeetCode #856</a>
 */
public class ScoreOfParentheses {

    /**
     * Solves the problem: Score of parentheses.
     *
     * @param s the s (String)
     * @return the computed int result
     */
    public int scoreOfParentheses(String s) {
        java.util.Deque<Integer> stack = new java.util.ArrayDeque<>();
        stack.push(0);
        for (char c : s.toCharArray()) {
            if (c == '(') stack.push(0);
            else {
                int v = stack.pop();
                int w = stack.pop();
                stack.push(w + Math.max(2*v, 1)); // () scores 1, (A) scores 2*A
            }
        }
        return stack.pop();
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac ScoreOfParentheses.java &amp;&amp; java org.leetcode.medium.ScoreOfParentheses</pre>
     */
    public static void main(String[] args) {
        ScoreOfParentheses sol = new ScoreOfParentheses();
                System.out.println(sol.scoreOfParentheses("()"));     // 1
                System.out.println(sol.scoreOfParentheses("(())"));  // 2
                System.out.println(sol.scoreOfParentheses("()()"));  // 2
                System.out.println(sol.scoreOfParentheses("(()(()))")); // 6
    }
}
