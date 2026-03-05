package org.leetcode.medium;


/**
 * <b>#2749 - Minimum Operations to Make the Integer Zero</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Bit Manipulation, Brainteaser, Enumeration</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two integers num1 and num2.
 *
 *
 * In one operation, you can choose integer i in the range [0, 60] and subtract 2i + num2 from num1.
 *
 *
 * Return the integer denoting the minimum number of operations needed to make num1 equal to 0.
 *
 *
 * If it is impossible to make num1 equal to 0, return -1.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: num1 = 3, num2 = -2
 * Output: 3
 * Explanation: We can make 3 equal to 0 with the following operations:
 * - We choose i = 2 and subtract 22 + (-2) from 3, 3 - (4 + (-2)) = 1.
 * - We choose i = 2 and subtract 22 + (-2) from 1, 1 - (4 + (-2)) = -1.
 * - We choose i = 0 and subtract 20 + (-2) from -1, (-1) - (1 + (-2)) = 0.
 * It can be proven, that 3 is the minimum number of operations that we need to perform.
 *
 * Example 2:
 *
 * Input: num1 = 5, num2 = 7
 * Output: -1
 * Explanation: It can be proven, that it is impossible to make 5 equal to 0 with the given operation.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= num1 &lt;= 109
 *
 * -109 &lt;= num2 &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: If we want to make integer n equal to 0 by only subtracting powers of 2 from n, in how many operations can we achieve it?
 * Hint 2: We need at least - the number of bits in the binary representation of n, and at most - n.
 * Hint 3: Notice that, if it is possible to make num1 equal to 0, then we need at most 60 operations.
 * Hint 4: Iterate on the number of operations.
 *
 * <h2>Approach</h2>
 * Think about the category (Bit Manipulation, Brainteaser, Enumeration).
 *
 * @see <a href="https://leetcode.com/problems/minimum-operations-to-make-the-integer-zero/">LeetCode #2749</a>
 */
public class MinimumOperationsToMakeTheIntegerZero {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Operations to Make the Integer Zero");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumOperationsToMakeTheIntegerZero ===");
        MinimumOperationsToMakeTheIntegerZero sol = new MinimumOperationsToMakeTheIntegerZero();
        System.out.println(sol.solve(null));
    }
}
