package org.leetcode.easy;


/**
 * <b>#2652 - Sum Multiples</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Math</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a positive integer n, find the sum of all integers in the range [1, n] inclusive that are divisible by 3, 5, or 7.
 *
 *
 * Return an integer denoting the sum of all numbers in the given range satisfying the constraint.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 7
 * Output: 21
 * Explanation: Numbers in the range [1, 7] that are divisible by 3, 5, or 7 are 3, 5, 6, 7. The sum of these numbers is 21.
 *
 * Example 2:
 *
 * Input: n = 10
 * Output: 40
 * Explanation: Numbers in the range [1, 10] that are divisible by 3, 5, or 7 are 3, 5, 6, 7, 9, 10. The sum of these numbers is 40.
 *
 * Example 3:
 *
 * Input: n = 9
 * Output: 30
 * Explanation: Numbers in the range [1, 9] that are divisible by 3, 5, or 7 are 3, 5, 6, 7, 9. The sum of these numbers is 30.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 103
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Iterate through the range 1 to n and count numbers divisible by either 3, 5, or 7.
 *
 * <h2>Approach</h2>
 * Think about the category (Math).
 *
 * @see <a href="https://leetcode.com/problems/sum-multiples/">LeetCode #2652</a>
  *
  * <p><b>Explanation:</b> Accumulates the sum in a single O(n) pass through the input.</p>
  */
public class SumMultiples {

    /**
     * Computes the sum of Sum of multiples.
     *
     * @param n the n (int)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Accumulates the sum in a single O(n) pass through the input.</p>
      */
    public int sumOfMultiples(int n) {
        int sum=0;
        for (int i=1;i<=n;i++) if (i%3==0||i%5==0||i%7==0) sum+=i;
        return sum;
    }

    public static void main(String[] args) {
        SumMultiples sol = new SumMultiples();
                System.out.println(sol.sumOfMultiples(7));  // 21
                System.out.println(sol.sumOfMultiples(10)); // 40
    }
}
