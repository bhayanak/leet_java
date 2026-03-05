package org.leetcode.hard;


/**
 * <b>#3348 - Smallest Divisible Digit Product II</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Math, String, Backtracking, Greedy, Number Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string num which represents a positive integer, and an integer t.
 *
 *
 * A number is called zero-free if none of its digits are 0.
 *
 *
 * Return a string representing the smallest zero-free number greater than or equal to num such that the product of its digits is divisible by t. If no such number exists, return "-1".
 *
 *
 *
 *
 * Example 1:
 *
 * Input: num = "1234", t = 256
 *
 *
 * Output: "1488"
 *
 *
 * Explanation:
 *
 *
 * The smallest zero-free number that is greater than 1234 and has the product of its digits divisible by 256 is 1488, with the product of its digits equal to 256.
 *
 * Example 2:
 *
 * Input: num = "12355", t = 50
 *
 *
 * Output: "12355"
 *
 *
 * Explanation:
 *
 *
 * 12355 is already zero-free and has the product of its digits divisible by 50, with the product of its digits equal to 150.
 *
 * Example 3:
 *
 * Input: num = "11111", t = 26
 *
 *
 * Output: "-1"
 *
 *
 * Explanation:
 *
 *
 * No number greater than 11111 has the product of its digits divisible by 26.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= num.length &lt;= 2 * 105
 *
 * num consists only of digits in the range ['0', '9'].
 *
 * num does not contain leading zeros.
 *
 * 1 &lt;= t &lt;= 1014
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: <code>t</code> should only have 2, 3, 5 and 7 as prime factors.
 * Hint 2: Find the shortest suffix that must be changed.
 * Hint 3: Try to form the string greedily.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, String, Backtracking, Greedy, Number Theory).
 *
 * @see <a href="https://leetcode.com/problems/smallest-divisible-digit-product-ii/">LeetCode #3348</a>
 */
public class SmallestDivisibleDigitProductIi {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Smallest Divisible Digit Product II");
    }

    public static void main(String[] args) {
        System.out.println("=== SmallestDivisibleDigitProductIi ===");
        SmallestDivisibleDigitProductIi sol = new SmallestDivisibleDigitProductIi();
        System.out.println(sol.solve(null));
    }
}
