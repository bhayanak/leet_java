package org.leetcode.hard;


/**
 * <b>#972 - Equal Rational Numbers</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Math, String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given two strings s and t, each of which represents a non-negative rational number, return true if and only if they represent the same number. The strings may use parentheses to denote the repeating part of the rational number.
 *
 *
 * A rational number can be represented using up to three parts: &lt;IntegerPart&gt;, &lt;NonRepeatingPart&gt;, and a &lt;RepeatingPart&gt;. The number will be represented in one of the following three ways:
 *
 *
 * &lt;IntegerPart&gt;
 *
 *
 *
 *
 * For example, 12, 0, and 123.
 *
 *
 *
 * &lt;IntegerPart&gt;&lt;.&gt;&lt;NonRepeatingPart&gt;
 *
 *
 *
 * For example, 0.5, 1., 2.12, and 123.0001.
 *
 *
 *
 * &lt;IntegerPart&gt;&lt;.&gt;&lt;NonRepeatingPart&gt;&lt;(&gt;&lt;RepeatingPart&gt;&lt;)&gt;
 *
 *
 *
 * For example, 0.1(6), 1.(9), 123.00(1212).
 *
 *
 *
 * The repeating portion of a decimal expansion is conventionally denoted within a pair of round brackets. For example:
 *
 *
 * 1/6 = 0.16666666... = 0.1(6) = 0.1666(6) = 0.166(66).
 *
 *
 *
 * Example 1:
 *
 * Input: s = "0.(52)", t = "0.5(25)"
 * Output: true
 * Explanation: Because "0.(52)" represents 0.52525252..., and "0.5(25)" represents 0.52525252525..... , the strings represent the same number.
 *
 * Example 2:
 *
 * Input: s = "0.1666(6)", t = "0.166(66)"
 * Output: true
 *
 * Example 3:
 *
 * Input: s = "0.9(9)", t = "1."
 * Output: true
 * Explanation: "0.9(9)" represents 0.999999999... repeated forever, which equals 1.  [See this link for an explanation.]
 * "1." represents the number 1, which is formed correctly: (IntegerPart) = "1" and (NonRepeatingPart) = "".
 *
 *
 *
 * Constraints:
 *
 *
 * Each part consists only of digits.
 *
 * The &lt;IntegerPart&gt; does not have leading zeros (except for the zero itself).
 *
 * 1 &lt;= &lt;IntegerPart&gt;.length &lt;= 4
 *
 * 0 &lt;= &lt;NonRepeatingPart&gt;.length &lt;= 4
 *
 * 1 &lt;= &lt;RepeatingPart&gt;.length &lt;= 4
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, String).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/equal-rational-numbers/">LeetCode #972</a>
 */
public class EqualRationalNumbers {

    /**
     * TODO: Implement "Equal Rational Numbers".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Equal Rational Numbers");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac EqualRationalNumbers.java &amp;&amp; java org.leetcode.hard.EqualRationalNumbers</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== EqualRationalNumbers ===");
        EqualRationalNumbers sol = new EqualRationalNumbers();
        System.out.println(sol.solve(null));
    }
}
