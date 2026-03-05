package org.leetcode.hard;

/**
 * <b>#282 - Expression Add Operators</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Math, String, Backtracking</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a string num that contains only digits and an integer target, return all possibilities to insert the binary operators '+', '-', and/or '*' between the digits of num so that the resultant expression evaluates to the target value.
 * 
 * 
 * Note that operands in the returned expressions should not contain leading zeros.
 * 
 * 
 * Note that a number can contain multiple digits.
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: num = "123", target = 6
 * Output: ["1*2*3","1+2+3"]
 * Explanation: Both "1*2*3" and "1+2+3" evaluate to 6.
 * 
 * Example 2:
 * 
 * Input: num = "232", target = 8
 * Output: ["2*3+2","2+3*2"]
 * Explanation: Both "2*3+2" and "2+3*2" evaluate to 8.
 * 
 * Example 3:
 * 
 * Input: num = "3456237490", target = 9191
 * Output: []
 * Explanation: There are no expressions that can be created from "3456237490" to evaluate to 9191.
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= num.length &lt;= 10
 * 	
 * num consists of only digits.
 * 	
 * -231 &lt;= target &lt;= 231 - 1
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Note that a number can contain multiple digits.
 * Hint 2: Since the question asks us to find <b>all</b> of the valid expressions, we need a way to iterate over all of them. (<b>Hint:</b> Recursion!)
 * Hint 3: We can keep track of the expression string and evaluate it at the very end. But that would take a lot of time. Can we keep track of the expression's value as well so as to avoid the evaluation at the very end of recursion?
 * Hint 4: Think carefully about the multiply operator. It has a higher precedence than the addition and subtraction operators. 

<br> 1 + 2 = 3  <br>
1 + 2 - 4 --> 3 - 4 --> -1 <br>
1 + 2 - 4 * 12 --> -1 * 12 --> -12 (WRONG!) <br>
1 + 2 - 4 * 12 --> -1 - (-4) + (-4 * 12) --> 3 + (-48) --> -45 (CORRECT!)
 * Hint 5: We simply need to keep track of the last operand in our expression and reverse it's effect on the expression's value while considering the multiply operator.
 *
 * <h2>Approach</h2>
 * Break the problem into smaller sub-problems:
 * 1. Try brute force first to understand the constraints.
 * 2. Look for repeated sub-problems (DP), sorted structure (binary search),
 *    adjacency (graph/BFS), or monotonic properties (stack/queue).
 * 3. Refine with the right data structure.
 *
 * <h2>Complexity</h2>
 * Time: TBD  |  Space: TBD
 *
 * @see <a href="https://leetcode.com/problems/expression-add-operators/">LeetCode #282</a>
 */
public class ExpressionAddOperators {

    /** TODO: implement solution for "Expression Add Operators". */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Expression Add Operators");
    }

    // ─── Demo ────────────────────────────────────────────────────
    public static void main(String[] args) {
        System.out.println("=== ExpressionAddOperators ===");
        ExpressionAddOperators sol = new ExpressionAddOperators();
        System.out.println(sol.solve(null));
    }
}
