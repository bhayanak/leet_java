package org.leetcode.easy;


/**
 * <b>#1071 - Greatest Common Divisor of Strings</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Math, String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).
 *
 *
 * Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: str1 = "ABCABC", str2 = "ABC"
 *
 *
 * Output: "ABC"
 *
 * Example 2:
 *
 * Input: str1 = "ABABAB", str2 = "ABAB"
 *
 *
 * Output: "AB"
 *
 * Example 3:
 *
 * Input: str1 = "LEET", str2 = "CODE"
 *
 *
 * Output: ""
 *
 * Example 4:
 *
 * Input: str1 = "AAAAAB", str2 = "AAA"
 *
 *
 * Output: ""​​​​​​​
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= str1.length, str2.length &lt;= 1000
 *
 * str1 and str2 consist of English uppercase letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The greatest common divisor must be a prefix of each string, so we can try all prefixes.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, String).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/greatest-common-divisor-of-strings/">LeetCode #1071</a>
  *
  * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
  */
public class GreatestCommonDivisorOfStrings {

    /**
     * Solves the problem: Gcd of strings.
     *
     * @param str1 the str1 (String)
     * @param str2 the str2 (String)
     * @return the computed String result
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) return "";
        return str1.substring(0, gcd(str1.length(), str2.length()));
    }
    private int gcd(int a, int b) { return b == 0 ? a : gcd(b, a%b); }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac GreatestCommonDivisorOfStrings.java &amp;&amp; java org.leetcode.easy.GreatestCommonDivisorOfStrings</pre>
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public static void main(String[] args) {
        GreatestCommonDivisorOfStrings sol = new GreatestCommonDivisorOfStrings();
                System.out.println(sol.gcdOfStrings("ABCABC","ABC")); // "ABC"
                System.out.println(sol.gcdOfStrings("ABABAB","ABAB")); // "AB"
                System.out.println(sol.gcdOfStrings("LEET","CODE"));   // ""
    }
}
