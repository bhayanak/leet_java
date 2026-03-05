package org.leetcode.medium;


/**
 * <b>#2396 - Strictly Palindromic Number</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Math, Two Pointers, Brainteaser</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * An integer n is strictly palindromic if, for every base b between 2 and n - 2 (inclusive), the string representation of the integer n in base b is palindromic.
 *
 *
 * Given an integer n, return true if n is strictly palindromic and false otherwise.
 *
 *
 * A string is palindromic if it reads the same forward and backward.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 9
 * Output: false
 * Explanation: In base 2: 9 = 1001 (base 2), which is palindromic.
 * In base 3: 9 = 100 (base 3), which is not palindromic.
 * Therefore, 9 is not strictly palindromic so we return false.
 * Note that in bases 4, 5, 6, and 7, n = 9 is also not palindromic.
 *
 * Example 2:
 *
 * Input: n = 4
 * Output: false
 * Explanation: We only consider base 2: 4 = 100 (base 2), which is not palindromic.
 * Therefore, we return false.
 *
 *
 *
 * Constraints:
 *
 *
 * 4 &lt;= n &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Consider the representation of the given number in the base n - 2.
 * Hint 2: The number n in base (n - 2) is always 12, which is not palindromic.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Two Pointers, Brainteaser).
 *
 * @see <a href="https://leetcode.com/problems/strictly-palindromic-number/">LeetCode #2396</a>
 */
public class StrictlyPalindromicNumber {

    /**
     * Returns true if Is strictly palindromic.
     *
     * @param n the n (int)
     * @return the computed boolean result
     */
    public boolean isStrictlyPalindromic(int n) {
        return false; // provably always false for n>=4
    }

    public static void main(String[] args) {
        StrictlyPalindromicNumber sol = new StrictlyPalindromicNumber();
                System.out.println(sol.isStrictlyPalindromic(9));  // false
                System.out.println(sol.isStrictlyPalindromic(4));  // false
    }
}
