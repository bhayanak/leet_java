package org.leetcode.easy;

/**
 * <b>#67 - Add Binary</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Math, String, Bit Manipulation, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given two binary strings a and b, return their sum as a binary string.
 * 
 * Example 1:
 * 
 * Input: a = "11", b = "1"
 * Output: "100"
 * 
 * Example 2:
 * 
 * Input: a = "1010", b = "1011"
 * Output: "10101"
 * 
 * Constraints:
 * 	
 * 1 &lt;= a.length, b.length &lt;= 104
 * 	
 * a and b consist only of '0' or '1' characters.
 * 	
 * Each string does not contain leading zeros except for the zero itself.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints available — try to figure out the category and approach first!
 *
 * <h2>Approach</h2>
 * Simulate binary addition from right to left with a carry variable.
 * Append each bit sum's remainder; prepend the final carry if present.
 *
 * <h2>Complexity</h2>
* Time: O(max(m,n))  |  Space: O(max(m,n))
 *
 * @see <a href="https://leetcode.com/problems/add-binary/">LeetCode #67</a>
 */
public class AddBinary {

    /**
     * Adds two binary strings and returns their sum as a binary string.
     *
     * @param a first binary string
     * @param b second binary string
     * @return  binary sum as a string
     * 
     * <p><b>Explanation:</b> The sum of bits is calculated to determine the value of the current bit in the result and whether there will be a carry for the next iteration.</p>
     * The remainder when divided by 2 (sum % 2) gives the value of the current bit in the result, while the quotient (sum / 2) determines if there is a carry to the next bit.
     **/
    public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length()-1, j = b.length()-1, carry = 0;
        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;
            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';
            sb.append(sum % 2);
            carry = sum / 2;
        }
        return sb.reverse().toString();
    }

    public static void main(String args[]){
        System.out.println("=== AddBinary ===");
        System.out.println(addBinary("11", "1")); // "100"
        System.out.println(addBinary("1010", "1011")); // "10101"
    }
}
