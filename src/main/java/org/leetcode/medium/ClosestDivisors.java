package org.leetcode.medium;


/**
 * <b>#1362 - Closest Divisors</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Math</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer num, find the closest two integers in absolute difference whose product equals num + 1 or num + 2.
 *
 *
 * Return the two integers in any order.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: num = 8
 * Output: [3,3]
 * Explanation: For num + 1 = 9, the closest divisors are 3 &amp; 3, for num + 2 = 10, the closest divisors are 2 &amp; 5, hence 3 &amp; 3 is chosen.
 *
 * Example 2:
 *
 * Input: num = 123
 * Output: [5,25]
 *
 * Example 3:
 *
 * Input: num = 999
 * Output: [40,25]
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= num &lt;= 10^9
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Find the divisors of n+1 and n+2.
 * Hint 2: To find the divisors of a number, you only need to iterate to the square root of that number.
 *
 * <h2>Approach</h2>
 * Think about the category (Math).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/closest-divisors/">LeetCode #1362</a>
 */
public class ClosestDivisors {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Closest Divisors");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== ClosestDivisors ===");
        ClosestDivisors sol = new ClosestDivisors();
        System.out.println(sol.solve(null));
    }
}
