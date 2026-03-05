package org.leetcode.easy;


/**
 * <b>#3280 - Convert Date to Binary</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Math, String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string date representing a Gregorian calendar date in the yyyy-mm-dd format.
 *
 *
 * date can be written in its binary representation obtained by converting year, month, and day to their binary representations without any leading zeroes and writing them down in year-month-day format.
 *
 *
 * Return the binary representation of date.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: date = "2080-02-29"
 *
 *
 * Output: "100000100000-10-11101"
 *
 *
 * Explanation:
 *
 *
 * 100000100000, 10, and 11101 are the binary representations of 2080, 02, and 29 respectively.
 *
 * Example 2:
 *
 * Input: date = "1900-01-01"
 *
 *
 * Output: "11101101100-1-1"
 *
 *
 * Explanation:
 *
 *
 * 11101101100, 1, and 1 are the binary representations of 1900, 1, and 1 respectively.
 *
 *
 *
 * Constraints:
 *
 *
 * date.length == 10
 *
 * date[4] == date[7] == '-', and all other date[i]'s are digits.
 *
 * The input is generated such that date represents a valid Gregorian calendar date between Jan 1st, 1900 and Dec 31st, 2100 (both inclusive).
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints -- trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, String).
 *
 * @see <a href="https://leetcode.com/problems/convert-date-to-binary/">LeetCode #3280</a>
  *
  * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
  */
public class ConvertDateToBinary {

    /**
     * Solves the problem: Convert date to binary.
     *
     * @param date the date (String)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public int convertDateToBinary(String date) {
        String[] parts=date.split("-");
        return Integer.parseInt(parts[0])*10000+Integer.parseInt(parts[1])*100+Integer.parseInt(parts[2]);
    }

    public static void main(String[] args) {
        ConvertDateToBinary sol = new ConvertDateToBinary();
                System.out.println(sol.convertDateToBinary("2080-02-29")); // 20800229
                System.out.println(sol.convertDateToBinary("1900-01-01")); // 19000101
    }
}
