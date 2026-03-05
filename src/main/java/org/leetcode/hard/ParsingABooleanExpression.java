package org.leetcode.hard;


/**
 * <b>#1106 - Parsing A Boolean Expression</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> String, Stack, Recursion</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * A boolean expression is an expression that evaluates to either true or false. It can be in one of the following shapes:
 *
 *
 * 't' that evaluates to true.
 *
 * 'f' that evaluates to false.
 *
 * '!(subExpr)' that evaluates to the logical NOT of the inner expression subExpr.
 *
 * '&amp;(subExpr1, subExpr2, ..., subExprn)' that evaluates to the logical AND of the inner expressions subExpr1, subExpr2, ..., subExprn where n &gt;= 1.
 *
 * '|(subExpr1, subExpr2, ..., subExprn)' that evaluates to the logical OR of the inner expressions subExpr1, subExpr2, ..., subExprn where n &gt;= 1.
 *
 * Given a string expression that represents a boolean expression, return the evaluation of that expression.
 *
 *
 * It is guaranteed that the given expression is valid and follows the given rules.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: expression = "&amp;(|(f))"
 * Output: false
 * Explanation: 
 * First, evaluate |(f) --&gt; f. The expression is now "&amp;(f)".
 * Then, evaluate &amp;(f) --&gt; f. The expression is now "f".
 * Finally, return false.
 *
 * Example 2:
 *
 * Input: expression = "|(f,f,f,t)"
 * Output: true
 * Explanation: The evaluation of (false OR false OR false OR true) is true.
 *
 * Example 3:
 *
 * Input: expression = "!(&amp;(f,t))"
 * Output: true
 * Explanation: 
 * First, evaluate &amp;(f,t) --&gt; (false AND true) --&gt; false --&gt; f. The expression is now "!(f)".
 * Then, evaluate !(f) --&gt; NOT false --&gt; true. We return true.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= expression.length &lt;= 2 * 104
 *
 * expression[i] is one following characters: '(', ')', '&amp;', '|', '!', 't', 'f', and ','.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Write a function "parse" which calls helper functions "parse_or", "parse_and", "parse_not".
 *
 * <h2>Approach</h2>
 * Think about the category (String, Stack, Recursion).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/parsing-a-boolean-expression/">LeetCode #1106</a>
 */
public class ParsingABooleanExpression {

    /**
     * TODO: Implement "Parsing A Boolean Expression".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Parsing A Boolean Expression");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac ParsingABooleanExpression.java &amp;&amp; java org.leetcode.hard.ParsingABooleanExpression</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== ParsingABooleanExpression ===");
        ParsingABooleanExpression sol = new ParsingABooleanExpression();
        System.out.println(sol.solve(null));
    }
}
