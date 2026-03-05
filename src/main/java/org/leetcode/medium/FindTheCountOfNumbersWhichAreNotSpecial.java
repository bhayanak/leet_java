package org.leetcode.medium;


/**
 * <b>#3233 - Find the Count of Numbers Which Are Not Special</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Math, Number Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given 2 positive integers l and r. For any number x, all positive divisors of x except x are called the proper divisors of x.
 *
 *
 * A number is called special if it has exactly 2 proper divisors. For example:
 *
 *
 * The number 4 is special because it has proper divisors 1 and 2.
 *
 * The number 6 is not special because it has proper divisors 1, 2, and 3.
 *
 * Return the count of numbers in the range [l, r] that are not special.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: l = 5, r = 7
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 * There are no special numbers in the range [5, 7].
 *
 * Example 2:
 *
 * Input: l = 4, r = 16
 *
 *
 * Output: 11
 *
 *
 * Explanation:
 *
 *
 * The special numbers in the range [4, 16] are 4 and 9.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= l &lt;= r &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: A special number must be a square of a prime number.
 * Hint 2: We need to find all primes in the range <code>[sqrt(l), sqrt(r)]</code>.
 * Hint 3: Use sieve to find primes till <code>sqrt(10<sup>9</sup>)</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Number Theory).
 *
 * @see <a href="https://leetcode.com/problems/find-the-count-of-numbers-which-are-not-special/">LeetCode #3233</a>
 */
public class FindTheCountOfNumbersWhichAreNotSpecial {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find the Count of Numbers Which Are Not Special");
    }

    public static void main(String[] args) {
        System.out.println("=== FindTheCountOfNumbersWhichAreNotSpecial ===");
        FindTheCountOfNumbersWhichAreNotSpecial sol = new FindTheCountOfNumbersWhichAreNotSpecial();
        System.out.println(sol.solve(null));
    }
}
