package org.leetcode.easy;


/**
 * <b>#2011 - Final Value of Variable After Performing Operations</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, String, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There is a programming language with only four operations and one variable X:
 *
 *
 * ++X and X++ increments the value of the variable X by 1.
 *
 * --X and X-- decrements the value of the variable X by 1.
 *
 * Initially, the value of X is 0.
 *
 *
 * Given an array of strings operations containing a list of operations, return the final value of X after performing all the operations.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: operations = ["--X","X++","X++"]
 * Output: 1
 * Explanation: The operations are performed as follows:
 * Initially, X = 0.
 * --X: X is decremented by 1, X =  0 - 1 = -1.
 * X++: X is incremented by 1, X = -1 + 1 =  0.
 * X++: X is incremented by 1, X =  0 + 1 =  1.
 *
 * Example 2:
 *
 * Input: operations = ["++X","++X","X++"]
 * Output: 3
 * Explanation: The operations are performed as follows:
 * Initially, X = 0.
 * ++X: X is incremented by 1, X = 0 + 1 = 1.
 * ++X: X is incremented by 1, X = 1 + 1 = 2.
 * X++: X is incremented by 1, X = 2 + 1 = 3.
 *
 * Example 3:
 *
 * Input: operations = ["X++","++X","--X","X--"]
 * Output: 0
 * Explanation: The operations are performed as follows:
 * Initially, X = 0.
 * X++: X is incremented by 1, X = 0 + 1 = 1.
 * ++X: X is incremented by 1, X = 1 + 1 = 2.
 * --X: X is decremented by 1, X = 2 - 1 = 1.
 * X--: X is decremented by 1, X = 1 - 1 = 0.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= operations.length &lt;= 100
 *
 * operations[i] will be either "++X", "X++", "--X", or "X--".
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: There are only two operations to keep track of.
 * Hint 2: Use a variable to store the value after each operation.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, String, Simulation).
 *
 * @see <a href="https://leetcode.com/problems/final-value-of-variable-after-performing-operations/">LeetCode #2011</a>
  *
  * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
  */
public class FinalValueOfVariableAfterPerformingOperations {

    /**
     * Solves the problem: Final value after operations.
     *
     * @param operations the operations (String[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for (String op:operations) x+=(op.contains("+")) ? 1 : -1;
        return x;
    }

    public static void main(String[] args) {
        FinalValueOfVariableAfterPerformingOperations sol = new FinalValueOfVariableAfterPerformingOperations();
                System.out.println(sol.finalValueAfterOperations(new String[]{"--X","X++","X++"})); // 1
                System.out.println(sol.finalValueAfterOperations(new String[]{"++X","++X","X++"})); // 3
                System.out.println(sol.finalValueAfterOperations(new String[]{"X++","++X","--X","X--"})); // 0
    }
}
