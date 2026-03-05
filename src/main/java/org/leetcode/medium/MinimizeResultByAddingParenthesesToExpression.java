package org.leetcode.medium;


/**
 * <b>#2232 - Minimize Result by Adding Parentheses to Expression</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String, Enumeration</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed string expression of the form "&lt;num1&gt;+&lt;num2&gt;" where &lt;num1&gt; and &lt;num2&gt; represent positive integers.
 *
 *
 * Add a pair of parentheses to expression such that after the addition of parentheses, expression is a valid mathematical expression and evaluates to the smallest possible value. The left parenthesis must be added to the left of '+' and the right parenthesis must be added to the right of '+'.
 *
 *
 * Return expression after adding a pair of parentheses such that expression evaluates to the smallest possible value. If there are multiple answers that yield the same result, return any of them.
 *
 *
 * The input has been generated such that the original value of expression, and the value of expression after adding any pair of parentheses that meets the requirements fits within a signed 32-bit integer.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: expression = "247+38"
 * Output: "2(47+38)"
 * Explanation: The expression evaluates to 2 * (47 + 38) = 2 * 85 = 170.
 * Note that "2(4)7+38" is invalid because the right parenthesis must be to the right of the '+'.
 * It can be shown that 170 is the smallest possible value.
 *
 * Example 2:
 *
 * Input: expression = "12+34"
 * Output: "1(2+3)4"
 * Explanation: The expression evaluates to 1 * (2 + 3) * 4 = 1 * 5 * 4 = 20.
 *
 * Example 3:
 *
 * Input: expression = "999+999"
 * Output: "(999+999)"
 * Explanation: The expression evaluates to 999 + 999 = 1998.
 *
 *
 *
 * Constraints:
 *
 *
 * 3 &lt;= expression.length &lt;= 10
 *
 * expression consists of digits from '1' to '9' and '+'.
 *
 * expression starts and ends with digits.
 *
 * expression contains exactly one '+'.
 *
 * The original value of expression, and the value of expression after adding any pair of parentheses that meets the requirements fits within a signed 32-bit integer.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The maximum length of expression is very low. We can try every possible spot to place the parentheses.
 * Hint 2: Every possibility of expression is of the form a * (b + c) * d where a, b, c, d represent integers. Note the edge cases where a and/or d do not exist, in which case use 1 instead of them.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Enumeration).
 *
 * @see <a href="https://leetcode.com/problems/minimize-result-by-adding-parentheses-to-expression/">LeetCode #2232</a>
 */
public class MinimizeResultByAddingParenthesesToExpression {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimize Result by Adding Parentheses to Expression");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimizeResultByAddingParenthesesToExpression ===");
        MinimizeResultByAddingParenthesesToExpression sol = new MinimizeResultByAddingParenthesesToExpression();
        System.out.println(sol.solve(null));
    }
}
