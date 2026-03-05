package org.leetcode.hard;


/**
 * <b>#3677 - Count Binary Palindromic Numbers</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Math, Bit Manipulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a non-negative integer n.
 *
 *
 * A non-negative integer is called binary-palindromic if its binary representation (written without leading zeros) reads the same forward and backward.
 *
 *
 * Return the number of integers k such that 0 &lt;= k &lt;= n and the binary representation of k is a palindrome.
 *
 *
 * Note: The number 0 is considered binary-palindromic, and its representation is "0".
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 9
 *
 *
 * Output: 6
 *
 *
 * Explanation:
 *
 *
 * The integers k in the range [0, 9] whose binary representations are palindromes are:
 *
 *
 * 0 → "0"
 *
 * 1 → "1"
 *
 * 3 → "11"
 *
 * 5 → "101"
 *
 * 7 → "111"
 *
 * 9 → "1001"
 *
 * All other values in [0, 9] have non-palindromic binary forms. Therefore, the count is 6.
 *
 * Example 2:
 *
 * Input: n = 0
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * Since "0" is a palindrome, the count is 1.
 *
 *
 *
 * Constraints:
 *
 *
 * 0 &lt;= n &lt;= 1015
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Try to think in terms of binary string length rather than brute forcing all numbers <code>&lt;= n</code>.
 * Hint 2: How many binary palindromes exist for a given length <code>L</code>? (only the first half determines the whole number.)
 * Hint 3: You can pre-count all palindromes of <code>length &lt; len(n)</code> directly using powers of 2.
 * Hint 4: For palindromes of <code>length = len(n)</code>, extract the prefix of <code>n</code>, mirror it, and check if it exceeds <code>n</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Bit Manipulation).
 *
 * @see <a href="https://leetcode.com/problems/count-binary-palindromic-numbers/">LeetCode #3677</a>
 */
public class CountBinaryPalindromicNumbers {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Binary Palindromic Numbers");
    }

    public static void main(String[] args) {
        System.out.println("=== CountBinaryPalindromicNumbers ===");
        CountBinaryPalindromicNumbers sol = new CountBinaryPalindromicNumbers();
        System.out.println(sol.solve(null));
    }
}
