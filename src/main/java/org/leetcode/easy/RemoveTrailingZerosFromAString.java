package org.leetcode.easy;


/**
 * <b>#2710 - Remove Trailing Zeros From a String</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a positive integer num represented as a string, return the integer num without trailing zeros as a string.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: num = "51230100"
 * Output: "512301"
 * Explanation: Integer "51230100" has 2 trailing zeros, we remove them and return integer "512301".
 *
 * Example 2:
 *
 * Input: num = "123"
 * Output: "123"
 * Explanation: Integer "123" has no trailing zeros, we return integer "123".
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= num.length &lt;= 1000
 *
 * num consists of only digits.
 *
 * num doesn't have any leading zeros.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Find the last non-zero digit in num.
 *
 * <h2>Approach</h2>
 * Think about the category (String).
 *
 * @see <a href="https://leetcode.com/problems/remove-trailing-zeros-from-a-string/">LeetCode #2710</a>
  *
  * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
  */
public class RemoveTrailingZerosFromAString {

    /**
     * Removes Remove trailing zeros.
     *
     * @param num the num (String)
     * @return the computed String result
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public String removeTrailingZeros(String num) {
        int i=num.length()-1;
        while (i>=0&&num.charAt(i)=='0') i--;
        return num.substring(0,i+1);
    }

    public static void main(String[] args) {
        RemoveTrailingZerosFromAString sol = new RemoveTrailingZerosFromAString();
        System.out.println(sol.removeTrailingZeros("hello"));
    }
}
