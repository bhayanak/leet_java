package org.leetcode.easy;


/**
 * <b>#1952 - Three Divisors</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Math, Enumeration, Number Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer n, return true if n has exactly three positive divisors. Otherwise, return false.
 *
 *
 * An integer m is a divisor of n if there exists an integer k such that n = k * m.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 2
 * Output: false
 * Explantion: 2 has only two divisors: 1 and 2.
 *
 * Example 2:
 *
 * Input: n = 4
 * Output: true
 * Explantion: 4 has three divisors: 1, 2, and 4.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: You can count the number of divisors and just check that they are 3
 * Hint 2: Beware of the case of n equal 1 as some solutions might fail in it
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Enumeration, Number Theory).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/three-divisors/">LeetCode #1952</a>
  *
  * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
  */
public class ThreeDivisors {

    /**
     * Returns true if Is three.
     *
     * @param n the n (int)
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
      */
    public boolean isThree(int n) {
        int cnt=0;
        for (int i=1;i<=n;i++) if (n%i==0) cnt++;
        return cnt==3;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public static void main(String[] args) {
        ThreeDivisors sol = new ThreeDivisors();
                System.out.println(sol.isThree(2));  // false (divisors: 1,2)
                System.out.println(sol.isThree(4));  // true (divisors: 1,2,4)
    }
}
