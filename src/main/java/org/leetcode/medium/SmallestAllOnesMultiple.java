package org.leetcode.medium;


/**
 * <b>#3790 - Smallest All-Ones Multiple</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Hash Table, Math</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a positive integer k.
 *
 *
 * Find the smallest integer n divisible by k that consists of only the digit 1 in its decimal representation (e.g., 1, 11, 111, ...).
 *
 *
 * Return an integer denoting the number of digits in the decimal representation of n. If no such n exists, return -1.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: k = 3
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 * n = 111 because 111 is divisible by 3, but 1 and 11 are not. The length of n = 111 is 3.
 *
 * Example 2:
 *
 * Input: k = 7
 *
 *
 * Output: 6
 *
 *
 * Explanation:
 *
 *
 * n = 111111. The length of n = 111111 is 6.
 *
 * Example 3:
 *
 * Input: k = 2
 *
 *
 * Output: -1
 *
 *
 * Explanation:
 *
 *
 * There does not exist a valid n that is a multiple of 2.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= k &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Notice that <code>n % k</code> should be <code>0</code>.
 * Hint 2: Build the number digit-by-digit using only modulo <code>k</code>. Start with remainder <code>rem = 1 % k</code>. Repeatedly update <code>rem = (rem * 10 + 1) % k</code> while counting how many <code>1</code>s have been appended.
 * Hint 3: Continue until <code>rem == 0</code> or a remainder repeats (which indicates a cycle and that no such <code>n</code> exists).
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, Math).
 *
 * @see <a href="https://leetcode.com/problems/smallest-all-ones-multiple/">LeetCode #3790</a>
 */
public class SmallestAllOnesMultiple {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Smallest All-Ones Multiple");
    }

    public static void main(String[] args) {
        System.out.println("=== SmallestAllOnesMultiple ===");
        SmallestAllOnesMultiple sol = new SmallestAllOnesMultiple();
        System.out.println(sol.solve(null));
    }
}
