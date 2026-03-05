package org.leetcode.hard;


/**
 * <b>#1896 - Minimum Cost to Change the Final Value of Expression</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Math, String, Dynamic Programming, Stack</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a valid boolean expression as a string expression consisting of the characters '1','0','&amp;' (bitwise AND operator),'|' (bitwise OR operator),'(', and ')'.
 *
 *
 * For example, "()1|1" and "(1)&amp;()" are not valid while "1", "(((1))|(0))", and "1|(0&amp;(1))" are valid expressions.
 *
 * Return the minimum cost to change the final value of the expression.
 *
 *
 * For example, if expression = "1|1|(0&amp;0)&amp;1", its value is 1|1|(0&amp;0)&amp;1 = 1|1|0&amp;1 = 1|0&amp;1 = 1&amp;1 = 1. We want to apply operations so that the new expression evaluates to 0.
 *
 * The cost of changing the final value of an expression is the number of operations performed on the expression. The types of operations are described as follows:
 *
 *
 * Turn a '1' into a '0'.
 *
 * Turn a '0' into a '1'.
 *
 * Turn a '&amp;' into a '|'.
 *
 * Turn a '|' into a '&amp;'.
 *
 * Note: '&amp;' does not take precedence over '|' in the order of calculation. Evaluate parentheses first, then in left-to-right order.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: expression = "1&amp;(0|1)"
 * Output: 1
 * Explanation: We can turn "1&amp;(0|1)" into "1&amp;(0&amp;1)" by changing the '|' to a '&amp;' using 1 operation.
 * The new expression evaluates to 0. 
 *
 * Example 2:
 *
 * Input: expression = "(0&amp;0)&amp;(0&amp;0&amp;0)"
 * Output: 3
 * Explanation: We can turn "(0&amp;0)&amp;(0&amp;0&amp;0)" into "(0|1)|(0&amp;0&amp;0)" using 3 operations.
 * The new expression evaluates to 1.
 *
 * Example 3:
 *
 * Input: expression = "(0|(1|0&amp;1))"
 * Output: 1
 * Explanation: We can turn "(0|(1|0&amp;1))" into "(0|(0|0&amp;1))" using 1 operation.
 * The new expression evaluates to 0.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= expression.length &lt;= 105
 *
 * expression only contains '1','0','&amp;','|','(', and ')'
 *
 * All parentheses are properly matched.
 *
 * There will be no empty parentheses (i.e: "()" is not a substring of expression).
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: How many possible states are there for a given expression?
 * Hint 2: Is there a data structure that we can use to solve the problem optimally?
 *
 * <h2>Approach</h2>
 * Think about the category (Math, String, Dynamic Programming, Stack).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/minimum-cost-to-change-the-final-value-of-expression/">LeetCode #1896</a>
 */
public class MinimumCostToChangeTheFinalValueOfExpression {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Cost to Change the Final Value of Expression");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MinimumCostToChangeTheFinalValueOfExpression ===");
        MinimumCostToChangeTheFinalValueOfExpression sol = new MinimumCostToChangeTheFinalValueOfExpression();
        System.out.println(sol.solve(null));
    }
}
