package org.leetcode.medium;


/**
 * <b>#3848 - Check Digitorial Permutation</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Math, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer n.
 *
 *
 * A number is called digitorial if the sum of the factorials of its digits is equal to the number itself.
 *
 *
 * Determine whether any permutation of n (including the original order) forms a digitorial number.
 *
 *
 * Return true if such a permutation exists, otherwise return false.
 *
 *
 * Note:
 *
 *
 * The factorial of a non-negative integer x, denoted as x!, is the product of all positive integers less than or equal to x, and 0! = 1.
 *
 * A permutation is a rearrangement of all the digits of a number that does not start with zero. Any arrangement starting with zero is invalid.
 *
 *
 *
 * Example 1:
 *
 * Input: n = 145
 *
 *
 * Output: true
 *
 *
 * Explanation:
 *
 *
 * The number 145 itself is digitorial since 1! + 4! + 5! = 1 + 24 + 120 = 145. Thus, the answer is true.
 *
 * Example 2:
 *
 * Input: n = 10
 *
 *
 * Output: false
 *
 *
 * Explanation:​​​​​​​
 *
 *
 * 10 is not digitorial since 1! + 0! = 2 is not equal to 10, and the permutation "01" is invalid because it starts with zero.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Precompute the factorial of digits <code>0</code> to <code>9</code> and compute the sum of factorials of the digits.
 * Hint 2: Check whether the digits of this sum can be formed using exactly the digits of <code>n</code> (no leading zero allowed).
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Counting).
 *
 * @see <a href="https://leetcode.com/problems/check-digitorial-permutation/">LeetCode #3848</a>
 */
public class CheckDigitorialPermutation {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Check Digitorial Permutation");
    }

    public static void main(String[] args) {
        System.out.println("=== CheckDigitorialPermutation ===");
        CheckDigitorialPermutation sol = new CheckDigitorialPermutation();
        System.out.println(sol.solve(null));
    }
}
