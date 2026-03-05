package org.leetcode.medium;


/**
 * <b>#3723 - Maximize Sum of Squares of Digits</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Math, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two positive integers num and sum.
 *
 *
 * A positive integer n is good if it satisfies both of the following:
 *
 *
 * The number of digits in n is exactly num.
 *
 * The sum of digits in n is exactly sum.
 *
 * The score of a good integer n is the sum of the squares of digits in n.
 *
 *
 * Return a string denoting the good integer n that achieves the maximum score. If there are multiple possible integers, return the maximum ​​​​​​​one. If no such integer exists, return an empty string.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: num = 2, sum = 3
 *
 *
 * Output: "30"
 *
 *
 * Explanation:
 *
 *
 * There are 3 good integers: 12, 21, and 30.
 *
 *
 * The score of 12 is 12 + 22 = 5.
 *
 * The score of 21 is 22 + 12 = 5.
 *
 * The score of 30 is 32 + 02 = 9.
 *
 * The maximum score is 9, which is achieved by the good integer 30. Therefore, the answer is "30".
 *
 * Example 2:
 *
 * Input: num = 2, sum = 17
 *
 *
 * Output: "98"
 *
 *
 * Explanation:
 *
 *
 * There are 2 good integers: 89 and 98.
 *
 *
 * The score of 89 is 82 + 92 = 145.
 *
 * The score of 98 is 92 + 82 = 145.
 *
 * The maximum score is 145. The maximum good integer that achieves this score is 98. Therefore, the answer is "98".
 *
 * Example 3:
 *
 * Input: num = 1, sum = 10
 *
 *
 * Output: ""
 *
 *
 * Explanation:
 *
 *
 * There are no integers that have exactly 1 digit and whose digits sum to 10. Therefore, the answer is "".
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= num &lt;= 2 * 105
 *
 * 1 &lt;= sum &lt;= 2 * 106
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use a greedy approach.
 * Hint 2: Fill the leftmost digits with 9s first (as much as possible).
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Greedy).
 *
 * @see <a href="https://leetcode.com/problems/maximize-sum-of-squares-of-digits/">LeetCode #3723</a>
 */
public class MaximizeSumOfSquaresOfDigits {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximize Sum of Squares of Digits");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximizeSumOfSquaresOfDigits ===");
        MaximizeSumOfSquaresOfDigits sol = new MaximizeSumOfSquaresOfDigits();
        System.out.println(sol.solve(null));
    }
}
