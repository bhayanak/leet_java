package org.leetcode.hard;


/**
 * <b>#3272 - Find the Count of Good Integers</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Hash Table, Math, Combinatorics, Enumeration</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two positive integers n and k.
 *
 *
 * An integer x is called k-palindromic if:
 *
 *
 * x is a palindrome.
 *
 * x is divisible by k.
 *
 * An integer is called good if its digits can be rearranged to form a k-palindromic integer. For example, for k = 2, 2020 can be rearranged to form the k-palindromic integer 2002, whereas 1010 cannot be rearranged to form a k-palindromic integer.
 *
 *
 * Return the count of good integers containing n digits.
 *
 *
 * Note that any integer must not have leading zeros, neither before nor after rearrangement. For example, 1010 cannot be rearranged to form 101.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 3, k = 5
 *
 *
 * Output: 27
 *
 *
 * Explanation:
 *
 *
 * Some of the good integers are:
 *
 *
 * 551 because it can be rearranged to form 515.
 *
 * 525 because it is already k-palindromic.
 *
 * Example 2:
 *
 * Input: n = 1, k = 4
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * The two good integers are 4 and 8.
 *
 * Example 3:
 *
 * Input: n = 5, k = 6
 *
 *
 * Output: 2468
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 10
 *
 * 1 &lt;= k &lt;= 9
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: How to generate all K-palindromic strings of length <code>n</code>? Do we need to go through all <code>n</code> digits?
 * Hint 2: Use permutations to calculate the number of possible rearrangements.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, Math, Combinatorics, Enumeration).
 *
 * @see <a href="https://leetcode.com/problems/find-the-count-of-good-integers/">LeetCode #3272</a>
 */
public class FindTheCountOfGoodIntegers {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find the Count of Good Integers");
    }

    public static void main(String[] args) {
        System.out.println("=== FindTheCountOfGoodIntegers ===");
        FindTheCountOfGoodIntegers sol = new FindTheCountOfGoodIntegers();
        System.out.println(sol.solve(null));
    }
}
