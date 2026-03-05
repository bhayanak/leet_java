package org.leetcode.easy;


/**
 * <b>#2864 - Maximum Odd Binary Number</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Math, String, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a binary string s that contains at least one '1'.
 *
 *
 * You have to rearrange the bits in such a way that the resulting binary number is the maximum odd binary number that can be created from this combination.
 *
 *
 * Return a string representing the maximum odd binary number that can be created from the given combination.
 *
 *
 * Note that the resulting string can have leading zeros.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "010"
 * Output: "001"
 * Explanation: Because there is just one '1', it must be in the last position. So the answer is "001".
 *
 * Example 2:
 *
 * Input: s = "0101"
 * Output: "1001"
 * Explanation: One of the '1's must be in the last position. The maximum number that can be made with the remaining digits is "100". So the answer is "1001".
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 100
 *
 * s consists only of '0' and '1'.
 *
 * s contains at least one '1'.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The binary representation of an odd number contains <code>'1'</code> in the least significant place.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, String, Greedy).
 *
 * @see <a href="https://leetcode.com/problems/maximum-odd-binary-number/">LeetCode #2864</a>
  *
  * <p><b>Explanation:</b> Uses StringBuilder for O(1) amortized character appends, avoiding O(n^2) String concatenation.</p>
  */
public class MaximumOddBinaryNumber {

    /**
     * Solves the problem: Maximum odd binary number.
     *
     * @param s the s (String)
     * @return the computed String result
      *
      * <p><b>Explanation:</b> Uses StringBuilder for O(1) amortized character appends, avoiding O(n^2) String concatenation.</p>
      */
    public String maximumOddBinaryNumber(String s) {
        long ones=s.chars().filter(c->c=='1').count();
        if (ones==0) return s.replace('1','0');
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<ones-1;i++) sb.append('1');
        for (int i=0;i<s.length()-ones;i++) sb.append('0');
        sb.append('1');
        return sb.toString();
    }

    public static void main(String[] args) {
        MaximumOddBinaryNumber sol = new MaximumOddBinaryNumber();
                System.out.println(sol.maximumOddBinaryNumber("010")); // "001"
                System.out.println(sol.maximumOddBinaryNumber("0101")); // "1001"
    }
}
