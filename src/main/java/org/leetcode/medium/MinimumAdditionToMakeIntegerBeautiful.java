package org.leetcode.medium;


/**
 * <b>#2457 - Minimum Addition to Make Integer Beautiful</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Math, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two positive integers n and target.
 *
 *
 * An integer is considered beautiful if the sum of its digits is less than or equal to target.
 *
 *
 * Return the minimum non-negative integer x such that n + x is beautiful. The input will be generated such that it is always possible to make n beautiful.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 16, target = 6
 * Output: 4
 * Explanation: Initially n is 16 and its digit sum is 1 + 6 = 7. After adding 4, n becomes 20 and digit sum becomes 2 + 0 = 2. It can be shown that we can not make n beautiful with adding non-negative integer less than 4.
 *
 * Example 2:
 *
 * Input: n = 467, target = 6
 * Output: 33
 * Explanation: Initially n is 467 and its digit sum is 4 + 6 + 7 = 17. After adding 33, n becomes 500 and digit sum becomes 5 + 0 + 0 = 5. It can be shown that we can not make n beautiful with adding non-negative integer less than 33.
 *
 * Example 3:
 *
 * Input: n = 1, target = 1
 * Output: 0
 * Explanation: Initially n is 1 and its digit sum is 1, which is already smaller than or equal to target.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 1012
 *
 * 1 &lt;= target &lt;= 150
 *
 * The input will be generated such that it is always possible to make n beautiful.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Think about each digit independently.
 * Hint 2: Turn the rightmost non-zero digit to zero until the digit sum is greater than target.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Greedy).
 *
 * @see <a href="https://leetcode.com/problems/minimum-addition-to-make-integer-beautiful/">LeetCode #2457</a>
 */
public class MinimumAdditionToMakeIntegerBeautiful {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Addition to Make Integer Beautiful");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumAdditionToMakeIntegerBeautiful ===");
        MinimumAdditionToMakeIntegerBeautiful sol = new MinimumAdditionToMakeIntegerBeautiful();
        System.out.println(sol.solve(null));
    }
}
