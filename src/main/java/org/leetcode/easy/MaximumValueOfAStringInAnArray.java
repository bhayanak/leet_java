package org.leetcode.easy;


/**
 * <b>#2496 - Maximum Value of a String in an Array</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * The value of an alphanumeric string can be defined as:
 *
 *
 * The numeric representation of the string in base 10, if it comprises of digits only.
 *
 * The length of the string, otherwise.
 *
 * Given an array strs of alphanumeric strings, return the maximum value of any string in strs.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: strs = ["alic3","bob","3","4","00000"]
 * Output: 5
 * Explanation: 
 * - "alic3" consists of both letters and digits, so its value is its length, i.e. 5.
 * - "bob" consists only of letters, so its value is also its length, i.e. 3.
 * - "3" consists only of digits, so its value is its numeric equivalent, i.e. 3.
 * - "4" also consists only of digits, so its value is 4.
 * - "00000" consists only of digits, so its value is 0.
 * Hence, the maximum value is 5, of "alic3".
 *
 * Example 2:
 *
 * Input: strs = ["1","01","001","0001"]
 * Output: 1
 * Explanation: 
 * Each string in the array has value 1. Hence, we return 1.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= strs.length &lt;= 100
 *
 * 1 &lt;= strs[i].length &lt;= 9
 *
 * strs[i] consists of only lowercase English letters and digits.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: For strings comprising only of digits, convert them into integers.
 * Hint 2: For all other strings, calculate their length.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, String).
 *
 * @see <a href="https://leetcode.com/problems/maximum-value-of-a-string-in-an-array/">LeetCode #2496</a>
  *
  * <p><b>Explanation:</b> Tracks the running maximum in a single O(n) scan without extra space.</p>
  */
public class MaximumValueOfAStringInAnArray {

    /**
     * Solves the problem: Maximum value.
     *
     * @param strs the strs (String[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Tracks the running maximum in a single O(n) scan without extra space.</p>
      */
    public int maximumValue(String[] strs) {
        int max=0;
        for (String s:strs) {
            boolean allDigit=s.chars().allMatch(Character::isDigit);
            max=Math.max(max, allDigit?Integer.parseInt(s):s.length());
        }
        return max;
    }

    public static void main(String[] args) {
        MaximumValueOfAStringInAnArray sol = new MaximumValueOfAStringInAnArray();
                System.out.println(sol.maximumValue(new String[]{"alic3","bob","3","4","00000"})); // 5
                System.out.println(sol.maximumValue(new String[]{"1","01","001","0001"})); // 1
    }
}
