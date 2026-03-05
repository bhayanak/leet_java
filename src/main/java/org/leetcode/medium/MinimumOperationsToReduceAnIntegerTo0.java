package org.leetcode.medium;


/**
 * <b>#2571 - Minimum Operations to Reduce an Integer to 0</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Dynamic Programming, Greedy, Bit Manipulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a positive integer n, you can do the following operation any number of times:
 *
 *
 * Add or subtract a power of 2 from n.
 *
 * Return the minimum number of operations to make n equal to 0.
 *
 *
 * A number x is power of 2 if x == 2i where i &gt;= 0.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 39
 * Output: 3
 * Explanation: We can do the following operations:
 * - Add 20 = 1 to n, so now n = 40.
 * - Subtract 23 = 8 from n, so now n = 32.
 * - Subtract 25 = 32 from n, so now n = 0.
 * It can be shown that 3 is the minimum number of operations we need to make n equal to 0.
 *
 * Example 2:
 *
 * Input: n = 54
 * Output: 3
 * Explanation: We can do the following operations:
 * - Add 21 = 2 to n, so now n = 56.
 * - Add 23 = 8 to n, so now n = 64.
 * - Subtract 26 = 64 from n, so now n = 0.
 * So the minimum number of operations is 3.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Can we set/unset the bits in binary representation?
 * Hint 2: If there are multiple adjacent ones, how can we optimally add and subtract in 2 operations such that all ones get unset?
 * Hint 3: Bonus: Try to solve the problem with higher constraints: n ≤ 10^18.
 *
 * <h2>Approach</h2>
 * Think about the category (Dynamic Programming, Greedy, Bit Manipulation).
 *
 * @see <a href="https://leetcode.com/problems/minimum-operations-to-reduce-an-integer-to-0/">LeetCode #2571</a>
 */
public class MinimumOperationsToReduceAnIntegerTo0 {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Operations to Reduce an Integer to 0");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumOperationsToReduceAnIntegerTo0 ===");
        MinimumOperationsToReduceAnIntegerTo0 sol = new MinimumOperationsToReduceAnIntegerTo0();
        System.out.println(sol.solve(null));
    }
}
