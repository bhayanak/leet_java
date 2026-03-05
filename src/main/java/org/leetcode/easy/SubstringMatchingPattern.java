package org.leetcode.easy;


/**
 * <b>#3407 - Substring Matching Pattern</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> String, String Matching</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string s and a pattern string p, where p contains exactly one '*' character.
 *
 *
 * The '*' in p can be replaced with any sequence of zero or more characters.
 *
 *
 * Return true if p can be made a substring of s, and false otherwise.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "leetcode", p = "ee*e"
 *
 *
 * Output: true
 *
 *
 * Explanation:
 *
 *
 * By replacing the '*' with "tcod", the substring "eetcode" matches the pattern.
 *
 * Example 2:
 *
 * Input: s = "car", p = "c*v"
 *
 *
 * Output: false
 *
 *
 * Explanation:
 *
 *
 * There is no substring matching the pattern.
 *
 * Example 3:
 *
 * Input: s = "luck", p = "u*"
 *
 *
 * Output: true
 *
 *
 * Explanation:
 *
 *
 * The substrings "u", "uc", and "uck" match the pattern.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 50
 *
 * 1 &lt;= p.length &lt;= 50 
 *
 * s contains only lowercase English letters.
 *
 * p contains only lowercase English letters and exactly one '*'
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Divide the pattern in two strings and search in the string.
 *
 * <h2>Approach</h2>
 * Think about the category (String, String Matching).
 *
 * @see <a href="https://leetcode.com/problems/substring-matching-pattern/">LeetCode #3407</a>
  *
  * <p><b>Explanation:</b> Accumulates the sum in a single O(n) pass through the input.</p>
  */
public class SubstringMatchingPattern {

    /**
     * Solves the problem: Subtract product and sum.
     *
     * @param n the n (int)
     * @return the computed long result
      *
      * <p><b>Explanation:</b> Accumulates the sum in a single O(n) pass through the input.</p>
      */
    public long subtractProductAndSum(int n) {
        long prod=1, sum=0;
        while (n>0) { int d=n%10; prod*=d; sum+=d; n/=10; }
        return prod-sum;
    }

    public static void main(String[] args) {
        SubstringMatchingPattern sol = new SubstringMatchingPattern();
        System.out.println(sol.subtractProductAndSum(0));
    }
}
