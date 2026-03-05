package org.leetcode.easy;


/**
 * <b>#2259 - Remove Digit From Number to Maximize Result</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> String, Greedy, Enumeration</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string number representing a positive integer and a character digit.
 *
 *
 * Return the resulting string after removing exactly one occurrence of digit from number such that the value of the resulting string in decimal form is maximized. The test cases are generated such that digit occurs at least once in number.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: number = "123", digit = "3"
 * Output: "12"
 * Explanation: There is only one '3' in "123". After removing '3', the result is "12".
 *
 * Example 2:
 *
 * Input: number = "1231", digit = "1"
 * Output: "231"
 * Explanation: We can remove the first '1' to get "231" or remove the second '1' to get "123".
 * Since 231 &gt; 123, we return "231".
 *
 * Example 3:
 *
 * Input: number = "551", digit = "5"
 * Output: "51"
 * Explanation: We can remove either the first or second '5' from "551".
 * Both result in the string "51".
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= number.length &lt;= 100
 *
 * number consists of digits from '1' to '9'.
 *
 * digit is a digit from '1' to '9'.
 *
 * digit occurs at least once in number.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The maximum length of number is really small.
 * Hint 2: Iterate through the digits of number and every time we see digit, try removing it.
 * Hint 3: To remove a character at index i, concatenate the substring from index 0 to i - 1 and the substring from index i + 1 to number.length - 1.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Greedy, Enumeration).
 *
 * @see <a href="https://leetcode.com/problems/remove-digit-from-number-to-maximize-result/">LeetCode #2259</a>
  *
  * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
  */
public class RemoveDigitFromNumberToMaximizeResult {

    /**
     * Removes Remove digit.
     *
     * @param number the number (String)
     * @param digit the digit (char)
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public boolean removeDigit(String number, char digit) {
        // We just need to check if it's possible (always true if digit present)
        return number.indexOf(digit)>=0;
    }
    /**
     * Removes Remove digit str.
     *
     * @param number the number (String)
     * @param digit the digit (char)
     * @return the computed String result
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public String removeDigitStr(String number, char digit) {
        String best="";
        for (int i=0;i<number.length();i++) {
            if (number.charAt(i)==digit) {
                String cand=number.substring(0,i)+number.substring(i+1);
                if (cand.compareTo(best)>0) best=cand;
            }
        }
        return best;
    }

    public static void main(String[] args) {
        RemoveDigitFromNumberToMaximizeResult sol = new RemoveDigitFromNumberToMaximizeResult();
                System.out.println(sol.removeDigitStr("123", '3')); // "12"
                System.out.println(sol.removeDigitStr("1231", '1')); // "231"
                System.out.println(sol.removeDigitStr("551", '5')); // "51"
    }
}
