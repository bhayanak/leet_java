package org.leetcode.hard;


/**
 * <b>#902 - Numbers At Most N Given Digit Set</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Math, String, Binary Search, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array of digits which is sorted in non-decreasing order. You can write numbers using each digits[i] as many times as we want. For example, if digits = ['1','3','5'], we may write numbers such as '13', '551', and '1351315'.
 *
 *
 * Return the number of positive integers that can be generated that are less than or equal to a given integer n.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: digits = ["1","3","5","7"], n = 100
 * Output: 20
 * Explanation: 
 * The 20 numbers that can be written are:
 * 1, 3, 5, 7, 11, 13, 15, 17, 31, 33, 35, 37, 51, 53, 55, 57, 71, 73, 75, 77.
 *
 * Example 2:
 *
 * Input: digits = ["1","4","9"], n = 1000000000
 * Output: 29523
 * Explanation: 
 * We can write 3 one digit numbers, 9 two digit numbers, 27 three digit numbers,
 * 81 four digit numbers, 243 five digit numbers, 729 six digit numbers,
 * 2187 seven digit numbers, 6561 eight digit numbers, and 19683 nine digit numbers.
 * In total, this is 29523 integers that can be written using the digits array.
 *
 * Example 3:
 *
 * Input: digits = ["7"], n = 8
 * Output: 1
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= digits.length &lt;= 9
 *
 * digits[i].length == 1
 *
 * digits[i] is a digit from '1' to '9'.
 *
 * All the values in digits are unique.
 *
 * digits is sorted in non-decreasing order.
 *
 * 1 &lt;= n &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, String, Binary Search, Dynamic Programming).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/numbers-at-most-n-given-digit-set/">LeetCode #902</a>
 */
public class NumbersAtMostNGivenDigitSet {

    /**
     * TODO: Implement "Numbers At Most N Given Digit Set".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Numbers At Most N Given Digit Set");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac NumbersAtMostNGivenDigitSet.java &amp;&amp; java org.leetcode.hard.NumbersAtMostNGivenDigitSet</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== NumbersAtMostNGivenDigitSet ===");
        NumbersAtMostNGivenDigitSet sol = new NumbersAtMostNGivenDigitSet();
        System.out.println(sol.solve(null));
    }
}
