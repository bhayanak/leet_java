package org.leetcode.easy;


/**
 * <b>#2413 - Smallest Even Multiple</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Math, Number Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a positive integer n, return the smallest positive integer that is a multiple of both 2 and n.
 *
 *
 *
 * Example 1:
 *
 * Input: n = 5
 * Output: 10
 * Explanation: The smallest multiple of both 5 and 2 is 10.
 *
 * Example 2:
 *
 * Input: n = 6
 * Output: 6
 * Explanation: The smallest multiple of both 6 and 2 is 6. Note that a number is a multiple of itself.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 150
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: A guaranteed way to find a multiple of 2 and n is to multiply them together. When is this the answer, and when is there a smaller answer?
 * Hint 2: There is a smaller answer when n is even.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Number Theory).
 *
 * @see <a href="https://leetcode.com/problems/smallest-even-multiple/">LeetCode #2413</a>
  *
  * <p><b>Explanation:</b> Tracks the running minimum in a single O(n) scan.</p>
  */
public class SmallestEvenMultiple {

    /**
     * Solves the problem: Smallest even multiple.
     *
     * @param n the n (int)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Tracks the running minimum in a single O(n) scan.</p>
      */
    public int smallestEvenMultiple(int n) {
        return (n%2==0) ? n : 2*n;
    }

    public static void main(String[] args) {
        SmallestEvenMultiple sol = new SmallestEvenMultiple();
                System.out.println(sol.smallestEvenMultiple(5));  // 10
                System.out.println(sol.smallestEvenMultiple(6));  // 6
    }
}
