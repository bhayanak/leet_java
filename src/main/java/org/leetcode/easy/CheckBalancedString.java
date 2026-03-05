package org.leetcode.easy;


/**
 * <b>#3340 - Check Balanced String</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string num consisting of only digits. A string of digits is called balanced if the sum of the digits at even indices is equal to the sum of digits at odd indices.
 *
 *
 * Return true if num is balanced, otherwise return false.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: num = "1234"
 *
 *
 * Output: false
 *
 *
 * Explanation:
 *
 *
 * The sum of digits at even indices is 1 + 3 == 4, and the sum of digits at odd indices is 2 + 4 == 6.
 *
 * Since 4 is not equal to 6, num is not balanced.
 *
 * Example 2:
 *
 * Input: num = "24123"
 *
 *
 * Output: true
 *
 *
 * Explanation:
 *
 *
 * The sum of digits at even indices is 2 + 1 + 3 == 6, and the sum of digits at odd indices is 4 + 2 == 6.
 *
 * Since both are equal the num is balanced.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= num.length &lt;= 100
 *
 * num consists of digits only
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints -- trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (String).
 *
 * @see <a href="https://leetcode.com/problems/check-balanced-string/">LeetCode #3340</a>
  *
  * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
  */
public class CheckBalancedString {

    /**
     * Returns true if Is balanced.
     *
     * @param num the num (String)
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
      */
    public boolean isBalanced(String num) {
        int even=0, odd=0;
        for (int i=0;i<num.length();i++) {
            int d=num.charAt(i)-'0';
            if (i%2==0) even+=d; else odd+=d;
        }
        return even==odd;
    }

    public static void main(String[] args) {
        CheckBalancedString sol = new CheckBalancedString();
                System.out.println(sol.isBalanced("1234")); // false
                System.out.println(sol.isBalanced("24123")); // true
    }
}
