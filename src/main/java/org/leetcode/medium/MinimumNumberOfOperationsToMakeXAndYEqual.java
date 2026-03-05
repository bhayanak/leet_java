package org.leetcode.medium;


/**
 * <b>#2998 - Minimum Number of Operations to Make X and Y Equal</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Dynamic Programming, Breadth-First Search, Memoization</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two positive integers x and y.
 *
 *
 * In one operation, you can do one of the four following operations:
 *
 *
 * Divide x by 11 if x is a multiple of 11.
 *
 * Divide x by 5 if x is a multiple of 5.
 *
 * Decrement x by 1.
 *
 * Increment x by 1.
 *
 * Return the minimum number of operations required to make  x and y equal.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: x = 26, y = 1
 * Output: 3
 * Explanation: We can make 26 equal to 1 by applying the following operations: 
 * 1. Decrement x by 1
 * 2. Divide x by 5
 * 3. Divide x by 5
 * It can be shown that 3 is the minimum number of operations required to make 26 equal to 1.
 *
 * Example 2:
 *
 * Input: x = 54, y = 2
 * Output: 4
 * Explanation: We can make 54 equal to 2 by applying the following operations: 
 * 1. Increment x by 1
 * 2. Divide x by 11 
 * 3. Divide x by 5
 * 4. Increment x by 1
 * It can be shown that 4 is the minimum number of operations required to make 54 equal to 2.
 *
 * Example 3:
 *
 * Input: x = 25, y = 30
 * Output: 5
 * Explanation: We can make 25 equal to 30 by applying the following operations: 
 * 1. Increment x by 1
 * 2. Increment x by 1
 * 3. Increment x by 1
 * 4. Increment x by 1
 * 5. Increment x by 1
 * It can be shown that 5 is the minimum number of operations required to make 25 equal to 30.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= x, y &lt;= 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The only way to make <code>x</code> larger is to increase it by <code>1</code> so if <code>y &gt;= x</code> the answer is <code>y - x</code>.
 * Hint 2: For <code>y &lt; x</code>, <code>x - y</code> is always a candidate answer since we can repeatedly decrease <code>x</code> by one to reach <code>y</code>.
 * Hint 3: We can also increase <code>x</code> and then use the division operations. For example, if <code>x = 10</code> and <code>y = 1</code>, we can increment <code>x</code> by <code>1</code> then divide it by <code>11</code>.
 * Hint 4: Find an upper bound <code>U</code> on the maximum value of <code>x</code> we will reach an optimal solution. Since all values of <code>x</code> will be in the range <code>[1, U]</code>, we can use BFS to find the answer.
 * Hint 5: One possible upper bound on <code>x</code> is <code>U = x + (x - y) </code>. To reach any number strictly greater than <code>U</code> from <code>x</code>, we will need more than <code>x - y</code> operations which is not optimal since we can always reach <code>y</code> in <code>x - y</code> operations.
 *
 * <h2>Approach</h2>
 * Think about the category (Dynamic Programming, Breadth-First Search, Memoization).
 *
 * @see <a href="https://leetcode.com/problems/minimum-number-of-operations-to-make-x-and-y-equal/">LeetCode #2998</a>
 */
public class MinimumNumberOfOperationsToMakeXAndYEqual {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Number of Operations to Make X and Y Equal");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumNumberOfOperationsToMakeXAndYEqual ===");
        MinimumNumberOfOperationsToMakeXAndYEqual sol = new MinimumNumberOfOperationsToMakeXAndYEqual();
        System.out.println(sol.solve(null));
    }
}
