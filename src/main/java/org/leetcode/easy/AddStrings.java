package org.leetcode.easy;

/**
 * <b>LeetCode #415 – Add Strings</b>
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Topics:</b> Math, String, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given two non-negative integers, num1 and num2 represented as string,
 * return the sum of num1 and num2 as a string.
 *
 * You must solve the problem without using any built-in library for handling
 * large integers (such as BigInteger). You must also not convert the inputs
 * to integers directly.
 *
 * Example 1:
 *   Input: num1 = "11", num2 = "123"
 *   Output: "134"
 *
 * Example 2:
 *   Input: num1 = "456", num2 = "77"
 *   Output: "533"
 *
 * Example 3:
 *   Input: num1 = "0", num2 = "0"
 *   Output: "0"
 *
 * Constraints:
 *   1 &lt;= num1.length, num2.length &lt;= 10^4
 *   num1 and num2 consist of only digits.
 *   num1 and num2 don't have any leading zeros except for the zero itself.
 * </pre>
 *
 * <h2>Approach</h2>
 * <p>Simulate digit-by-digit addition from right to left, keeping track of carry, and build the result string in reverse order.</p>
 *
 * <h2>Complexity</h2>
 * <ul>
 *   <li>Time: O(max(N, M)), where N and M are the lengths of num1 and num2.</li>
 *   <li>Space: O(max(N, M)) for the result string.</li>
 * </ul>
 *
 * <p><b>Explanation:</b> This solution avoids integer overflow and built-in big integer libraries by simulating manual addition, appending each digit to a StringBuilder for efficiency.</p>
 * @see <a href="https://leetcode.com/problems/add-strings/">Problem</a>
 */
public class AddStrings {

    /**
     * Adds two non-negative integers represented as strings.
     *
     * @param num1 first non-negative integer as a string
     * @param num2 second non-negative integer as a string
     * @return the sum of num1 and num2 as a string
     * <p><b>Explanation:</b> Uses StringBuilder for O(1) amortized character appends, avoiding O(n^2) String concatenation.</p>
     */
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int i = num1.length() - 1, j = num2.length() - 1, carry = 0;
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if (i >= 0) sum += num1.charAt(i--) - '0';
            if (j >= 0) sum += num2.charAt(j--) - '0';
            sb.append(sum % 10);
            carry = sum / 10;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        AddStrings sol = new AddStrings();
        System.out.println(sol.addStrings("11", "123"));
        System.out.println(sol.addStrings("456", "77"));
        System.out.println(sol.addStrings("0", "0"));
    }
}
