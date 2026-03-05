package org.leetcode.easy;


/**
 * <b>#1323 - Maximum 69 Number</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Math, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a positive integer num consisting only of digits 6 and 9.
 *
 *
 * Return the maximum number you can get by changing at most one digit (6 becomes 9, and 9 becomes 6).
 *
 *
 *
 *
 * Example 1:
 *
 * Input: num = 9669
 * Output: 9969
 * Explanation: 
 * Changing the first digit results in 6669.
 * Changing the second digit results in 9969.
 * Changing the third digit results in 9699.
 * Changing the fourth digit results in 9666.
 * The maximum number is 9969.
 *
 * Example 2:
 *
 * Input: num = 9996
 * Output: 9999
 * Explanation: Changing the last digit 6 to 9 results in the maximum number.
 *
 * Example 3:
 *
 * Input: num = 9999
 * Output: 9999
 * Explanation: It is better not to apply any change.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= num &lt;= 104
 *
 * num consists of only 6 and 9 digits.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Convert the number in an array of its digits.
 * Hint 2: Brute force on every digit to get the maximum number.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Greedy).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/maximum-69-number/">LeetCode #1323</a>
  *
  * <p><b>Explanation:</b> Tracks the running maximum in a single O(n) scan without extra space.</p>
  */
public class Maximum69Number {

    /**
     * Solves the problem: Maximum69 number.
     *
     * @param num the num (int)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Tracks the running maximum in a single O(n) scan without extra space.</p>
      */
    public int maximum69Number(int num) {
        return Integer.parseInt(String.valueOf(num).replaceFirst("6","9"));
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public static void main(String[] args) {
        Maximum69Number sol = new Maximum69Number();
                System.out.println(sol.maximum69Number(9669)); // 9969
                System.out.println(sol.maximum69Number(9996)); // 9999
                System.out.println(sol.maximum69Number(9999)); // 9999
    }
}
