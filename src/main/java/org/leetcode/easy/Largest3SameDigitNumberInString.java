package org.leetcode.easy;


/**
 * <b>#2264 - Largest 3-Same-Digit Number in String</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string num representing a large integer. An integer is good if it meets the following conditions:
 *
 *
 * It is a substring of num with length 3.
 *
 * It consists of only one unique digit.
 *
 * Return the maximum good integer as a string or an empty string "" if no such integer exists.
 *
 *
 * Note:
 *
 *
 * A substring is a contiguous sequence of characters within a string.
 *
 * There may be leading zeroes in num or a good integer.
 *
 *
 *
 * Example 1:
 *
 * Input: num = "6777133339"
 * Output: "777"
 * Explanation: There are two distinct good integers: "777" and "333".
 * "777" is the largest, so we return "777".
 *
 * Example 2:
 *
 * Input: num = "2300019"
 * Output: "000"
 * Explanation: "000" is the only good integer.
 *
 * Example 3:
 *
 * Input: num = "42352338"
 * Output: ""
 * Explanation: No substring of length 3 consists of only one unique digit. Therefore, there are no good integers.
 *
 *
 *
 * Constraints:
 *
 *
 * 3 &lt;= num.length &lt;= 1000
 *
 * num only consists of digits.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: We can sequentially check if “999”, “888”, “777”, … , “000” exists in num in that order. The first to be found is the maximum good integer.
 * Hint 2: If we cannot find any of the above integers, we return an empty string “”.
 *
 * <h2>Approach</h2>
 * Think about the category (String).
 *
 * @see <a href="https://leetcode.com/problems/largest-3-same-digit-number-in-string/">LeetCode #2264</a>
  *
  * <p><b>Explanation:</b> Tracks the running maximum in a single O(n) scan without extra space.</p>
  */
public class Largest3SameDigitNumberInString {

    /**
     * Solves the problem: Largest good integer.
     *
     * @param num the num (String)
     * @return the computed String result
      *
      * <p><b>Explanation:</b> Tracks the running maximum in a single O(n) scan without extra space.</p>
      */
    public String largestGoodInteger(String num) {
        String res="";
        for (int i=0;i+2<num.length();i++) {
            if (num.charAt(i)==num.charAt(i+1)&&num.charAt(i+1)==num.charAt(i+2)) {
                String cand=num.substring(i,i+3);
                if (cand.compareTo(res)>0) res=cand;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Largest3SameDigitNumberInString sol = new Largest3SameDigitNumberInString();
        System.out.println(sol.largestGoodInteger("hello"));
    }
}
