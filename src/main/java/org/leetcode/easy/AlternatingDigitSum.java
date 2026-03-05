package org.leetcode.easy;


/**
 * <b>#2544 - Alternating Digit Sum</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Math</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a positive integer n. Each digit of n has a sign according to the following rules:
 *
 *
 * The most significant digit is assigned a positive sign.
 *
 * Each other digit has an opposite sign to its adjacent digits.
 *
 * Return the sum of all digits with their corresponding sign.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 521
 * Output: 4
 * Explanation: (+5) + (-2) + (+1) = 4.
 *
 * Example 2:
 *
 * Input: n = 111
 * Output: 1
 * Explanation: (+1) + (-1) + (+1) = 1.
 *
 * Example 3:
 *
 * Input: n = 886996
 * Output: 0
 * Explanation: (+8) + (-8) + (+6) + (-9) + (+9) + (-6) = 0.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The first step is to loop over the digits. We can convert the integer into a string, an array of digits, or just loop over its digits.
 * Hint 2: Keep a variable sign that initially equals 1 and a variable answer that initially equals 0.
 * Hint 3: Each time you loop over a digit i, add sign * i to answer, then multiply sign by -1.
 *
 * <h2>Approach</h2>
 * Think about the category (Math).
 *
 * @see <a href="https://leetcode.com/problems/alternating-digit-sum/">LeetCode #2544</a>
  *
  * <p><b>Explanation:</b> Accumulates the sum in a single O(n) pass through the input.</p>
  */
public class AlternatingDigitSum {

    /**
     * Solves the problem: Alternate digit sum.
     *
     * @param n the n (int)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Accumulates the sum in a single O(n) pass through the input.</p>
      */
    public int alternateDigitSum(int n) {
        String s=String.valueOf(n); int sum=0, sign=1;
        for (char c:s.toCharArray()) { sum+=sign*(c-'0'); sign=-sign; }
        return sum;
    }

    public static void main(String[] args) {
        AlternatingDigitSum sol = new AlternatingDigitSum();
                System.out.println(sol.alternateDigitSum(521)); // 4
                System.out.println(sol.alternateDigitSum(111)); // 1
                System.out.println(sol.alternateDigitSum(886996)); // 0
    }
}
