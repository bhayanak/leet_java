package org.leetcode.easy;


/**
 * <b>#2160 - Minimum Sum of Four Digit Number After Splitting Digits</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Math, Greedy, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a positive integer num consisting of exactly four digits. Split num into two new integers new1 and new2 by using the digits found in num. Leading zeros are allowed in new1 and new2, and all the digits found in num must be used.
 *
 *
 * For example, given num = 2932, you have the following digits: two 2's, one 9 and one 3. Some of the possible pairs [new1, new2] are [22, 93], [23, 92], [223, 9] and [2, 329].
 *
 * Return the minimum possible sum of new1 and new2.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: num = 2932
 * Output: 52
 * Explanation: Some possible pairs [new1, new2] are [29, 23], [223, 9], etc.
 * The minimum sum can be obtained by the pair [29, 23]: 29 + 23 = 52.
 *
 * Example 2:
 *
 * Input: num = 4009
 * Output: 13
 * Explanation: Some possible pairs [new1, new2] are [0, 49], [490, 0], etc. 
 * The minimum sum can be obtained by the pair [4, 9]: 4 + 9 = 13.
 *
 *
 *
 * Constraints:
 *
 *
 * 1000 &lt;= num &lt;= 9999
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Notice that the most optimal way to obtain the minimum possible sum using 4 digits is by summing up two 2-digit numbers.
 * Hint 2: We can use the two smallest digits out of the four as the digits found in the tens place respectively.
 * Hint 3: Similarly, we use the final 2 larger digits as the digits found in the ones place.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Greedy, Sorting).
 *
 * @see <a href="https://leetcode.com/problems/minimum-sum-of-four-digit-number-after-splitting-digits/">LeetCode #2160</a>
  *
  * <p><b>Explanation:</b> Sorts the input first to simplify subsequent search or comparison steps.</p>
  */
public class MinimumSumOfFourDigitNumberAfterSplittingDigits {

    /**
     * Solves the problem: Minimum sum.
     * Sorts the input first to enable efficient processing.
     *
     * @param num the num (int)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Sorts the input first to simplify subsequent search or comparison steps.</p>
      */
    public int minimumSum(int num) {
        int[] d = {num/1000, num/100%10, num/10%10, num%10};
        java.util.Arrays.sort(d);
        return (d[0]*10+d[3]) + (d[1]*10+d[2]);
    }

    public static void main(String[] args) {
        MinimumSumOfFourDigitNumberAfterSplittingDigits sol = new MinimumSumOfFourDigitNumberAfterSplittingDigits();
                System.out.println(sol.minimumSum(2932)); // 52
                System.out.println(sol.minimumSum(4009)); // 13
    }
}
