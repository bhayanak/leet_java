package org.leetcode.easy;


/**
 * <b>#1837 - Sum of Digits in Base K</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Math</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer n (in base 10) and a base k, return the sum of the digits of n after converting n from base 10 to base k.
 *
 *
 * After converting, each digit should be interpreted as a base 10 number, and the sum should be returned in base 10.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 34, k = 6
 * Output: 9
 * Explanation: 34 (base 10) expressed in base 6 is 54. 5 + 4 = 9.
 *
 * Example 2:
 *
 * Input: n = 10, k = 10
 * Output: 1
 * Explanation: n is already in base 10. 1 + 0 = 1.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 100
 *
 * 2 &lt;= k &lt;= 10
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Convert the given number into base k.
 *
 * <h2>Approach</h2>
 * Think about the category (Math).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/sum-of-digits-in-base-k/">LeetCode #1837</a>
  *
  * <p><b>Explanation:</b> Accumulates the sum in a single O(n) pass through the input.</p>
  */
public class SumOfDigitsInBaseK {

    /**
     * Computes the sum of Sum base.
     *
     * @param n the n (int)
     * @param k the k (int)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Accumulates the sum in a single O(n) pass through the input.</p>
      */
    public int sumBase(int n, int k) {
        int sum=0;
        while (n>0) { sum+=n%k; n/=k; }
        return sum;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public static void main(String[] args) {
        SumOfDigitsInBaseK sol = new SumOfDigitsInBaseK();
                System.out.println(sol.sumBase(34, 6)); // 9
                System.out.println(sol.sumBase(10, 10)); // 1
    }
}
