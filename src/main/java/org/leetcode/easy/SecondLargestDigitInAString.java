package org.leetcode.easy;


/**
 * <b>#1796 - Second Largest Digit in a String</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Hash Table, String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an alphanumeric string s, return the second largest numerical digit that appears in s, or -1 if it does not exist.
 *
 *
 * An alphanumeric string is a string consisting of lowercase English letters and digits.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "dfa12321afd"
 * Output: 2
 * Explanation: The digits that appear in s are [1, 2, 3]. The second largest digit is 2.
 *
 * Example 2:
 *
 * Input: s = "abc1111"
 * Output: -1
 * Explanation: The digits that appear in s are [1]. There is no second largest digit. 
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 500
 *
 * s consists of only lowercase English letters and digits.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: First of all, get the distinct characters since we are only interested in those
 * Hint 2: Let's note that there might not be any digits.
 *
 * <h2>Approach</h2>
 * Think about the category (Hash Table, String).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/second-largest-digit-in-a-string/">LeetCode #1796</a>
  *
  * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
  */
public class SecondLargestDigitInAString {

    /**
     * Solves the problem: Second highest.
     *
     * @param s the s (String)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public int secondHighest(String s) {
        int first=-1, second=-1;
        for (char c:s.toCharArray()) if (Character.isDigit(c)) {
            int d=c-'0';
            if (d>first) { second=first; first=d; }
            else if (d<first && d>second) second=d;
        }
        return second;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
        SecondLargestDigitInAString sol = new SecondLargestDigitInAString();
                System.out.println(sol.secondHighest("dfa12321afd")); // 2
                System.out.println(sol.secondHighest("abc1111"));     // -1
    }
}
