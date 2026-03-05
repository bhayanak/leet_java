package org.leetcode.easy;


/**
 * <b>#3754 - Concatenate Non-Zero Digits and Multiply by Sum I</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Math</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer n.
 *
 *
 * Form a new integer x by concatenating all the non-zero digits of n in their original order. If there are no non-zero digits, x = 0.
 *
 *
 * Let sum be the sum of digits in x.
 *
 *
 * Return an integer representing the value of x * sum.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 10203004
 *
 *
 * Output: 12340
 *
 *
 * Explanation:
 *
 *
 * The non-zero digits are 1, 2, 3, and 4. Thus, x = 1234.
 *
 * The sum of digits is sum = 1 + 2 + 3 + 4 = 10.
 *
 * Therefore, the answer is x * sum = 1234 * 10 = 12340.
 *
 * Example 2:
 *
 * Input: n = 1000
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * The non-zero digit is 1, so x = 1 and sum = 1.
 *
 * Therefore, the answer is x * sum = 1 * 1 = 1.
 *
 *
 *
 * Constraints:
 *
 *
 * 0 &lt;= n &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Simulate as described
 *
 * <h2>Approach</h2>
 * Think about the category (Math).
 *
 * @see <a href="https://leetcode.com/problems/concatenate-non-zero-digits-and-multiply-by-sum-i/">LeetCode #3754</a>
  *
  * <p><b>Explanation:</b> Tracks the running maximum in a single O(n) scan without extra space.</p>
  */
public class ConcatenateNonZeroDigitsAndMultiplyBySumI {

    /**
     * Solves the problem: Largest combination.
     *
     * @param candidates the candidates (int[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Tracks the running maximum in a single O(n) scan without extra space.</p>
      */
    public int largestCombination(int[] candidates) {
        int max=0;
        for (int bit=0;bit<24;bit++) {
            int cnt=0; for (int c:candidates) if ((c>>bit&1)==1) cnt++;
            max=Math.max(max,cnt);
        }
        return max;
    }

    public static void main(String[] args) {
        ConcatenateNonZeroDigitsAndMultiplyBySumI sol = new ConcatenateNonZeroDigitsAndMultiplyBySumI();
        System.out.println(sol.largestCombination(new int[]{1,2,3}));
    }
}
