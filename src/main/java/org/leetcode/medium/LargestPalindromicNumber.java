package org.leetcode.medium;


/**
 * <b>#2384 - Largest Palindromic Number</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Hash Table, String, Greedy, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string num consisting of digits only.
 *
 *
 * Return the largest palindromic integer (in the form of a string) that can be formed using digits taken from num. It should not contain leading zeroes.
 *
 *
 * Notes:
 *
 *
 * You do not need to use all the digits of num, but you must use at least one digit.
 *
 * The digits can be reordered.
 *
 *
 *
 * Example 1:
 *
 * Input: num = "444947137"
 * Output: "7449447"
 * Explanation: 
 * Use the digits "4449477" from "444947137" to form the palindromic integer "7449447".
 * It can be shown that "7449447" is the largest palindromic integer that can be formed.
 *
 * Example 2:
 *
 * Input: num = "00009"
 * Output: "9"
 * Explanation: 
 * It can be shown that "9" is the largest palindromic integer that can be formed.
 * Note that the integer returned should not contain leading zeroes.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= num.length &lt;= 105
 *
 * num consists of digits.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: In order to form a valid palindrome, other than the middle digit in an odd-length palindrome, every digit needs to exist on both sides.
 * Hint 2: A longer palindrome implies a larger valued palindrome. For palindromes of the same length, the larger digits should occur first.
 * Hint 3: We can count the occurrences of each digit and build the palindrome starting from the ends. Starting from the larger digits, if there are still at least 2 occurrences of a digit, we can place these digits on each side.
 * Hint 4: Make sure to consider the special case for the center digit (if any) and zeroes. There should not be leading zeroes.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String, Greedy, Counting).
 *
 * @see <a href="https://leetcode.com/problems/largest-palindromic-number/">LeetCode #2384</a>
 */
public class LargestPalindromicNumber {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Largest Palindromic Number");
    }

    public static void main(String[] args) {
        System.out.println("=== LargestPalindromicNumber ===");
        LargestPalindromicNumber sol = new LargestPalindromicNumber();
        System.out.println(sol.solve(null));
    }
}
