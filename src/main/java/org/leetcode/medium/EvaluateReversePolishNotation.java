package org.leetcode.medium;

/**
 * <b>#150 - Evaluate Reverse Polish Notation</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Math, Stack</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array of strings tokens that represents an arithmetic expression in a Reverse Polish Notation.
 * 
 * 
 * Evaluate the expression. Return an integer that represents the value of the expression.
 * 
 * 
 * Note that:
 * 
 * 	
 * The valid operators are '+', '-', '*', and '/'.
 * 	
 * Each operand may be an integer or another expression.
 * 	
 * The division between two integers always truncates toward zero.
 * 	
 * There will not be any division by zero.
 * 	
 * The input represents a valid arithmetic expression in a reverse polish notation.
 * 	
 * The answer and all the intermediate calculations can be represented in a 32-bit integer.
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: tokens = ["2","1","+","3","*"]
 * Output: 9
 * Explanation: ((2 + 1) * 3) = 9
 * 
 * Example 2:
 * 
 * Input: tokens = ["4","13","5","/","+"]
 * Output: 6
 * Explanation: (4 + (13 / 5)) = 6
 * 
 * Example 3:
 * 
 * Input: tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
 * Output: 22
 * Explanation: ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
 * = ((10 * (6 / (12 * -11))) + 17) + 5
 * = ((10 * (6 / -132)) + 17) + 5
 * = ((10 * 0) + 17) + 5
 * = (0 + 17) + 5
 * = 17 + 5
 * = 22
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= tokens.length &lt;= 104
 * 	
 * tokens[i] is either an operator: "+", "-", "*", or "/", or an integer in the range [-200, 200].
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — work through examples manually first.
 *
 * <h2>Approach</h2>
 * Stack-based: push integers; on operator, pop two operands, compute, push result.
 * Division truncates towards zero (use Java int division).
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(n)
 *
 * @see <a href="https://leetcode.com/problems/evaluate-reverse-polish-notation/">LeetCode #150</a>
 */
public class EvaluateReversePolishNotation {

    /**
     * Evaluates an expression in Reverse Polish Notation.
     * @param tokens RPN token array
     * @return evaluated integer result
     */
    public int evalRPN(String[] tokens) {
        java.util.Deque<Integer> stack = new java.util.ArrayDeque<>();
        for (String t : tokens) {
            switch (t) {
                case "+": stack.push(stack.pop() + stack.pop()); break;
                case "-": { int b=stack.pop(), a=stack.pop(); stack.push(a-b); break; }
                case "*": stack.push(stack.pop() * stack.pop()); break;
                case "/": { int b=stack.pop(), a=stack.pop(); stack.push(a/b); break; }
                default:  stack.push(Integer.parseInt(t));
            }
        }
        return stack.pop();
    }

    // ─── Run & Demo ──────────────────────────────────────────────
    /**
     * Runs sample test cases to demonstrate the solution.
     * Execute: javac EvaluateReversePolishNotation.java &amp;&amp; java org.leetcode.medium.EvaluateReversePolishNotation
     *
     * @param args not used
     */
    public static void main(String[] args) {
        EvaluateReversePolishNotation sol = new EvaluateReversePolishNotation();
        System.out.println(sol.evalRPN(new String[]{"2","1","+","3","*"}));           // 9
        System.out.println(sol.evalRPN(new String[]{"4","13","5","/","+"}));          // 6
        System.out.println(sol.evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"})); // 22
    }
}
