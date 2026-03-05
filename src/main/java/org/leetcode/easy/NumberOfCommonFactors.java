package org.leetcode.easy;


/**
 * <b>#2427 - Number of Common Factors</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Math, Enumeration, Number Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given two positive integers a and b, return the number of common factors of a and b.
 *
 *
 * An integer x is a common factor of a and b if x divides both a and b.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: a = 12, b = 6
 * Output: 4
 * Explanation: The common factors of 12 and 6 are 1, 2, 3, 6.
 *
 * Example 2:
 *
 * Input: a = 25, b = 30
 * Output: 2
 * Explanation: The common factors of 25 and 30 are 1, 5.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= a, b &lt;= 1000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: For each integer in range [1,1000], check if it’s divisible by both A and B.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Enumeration, Number Theory).
 *
 * @see <a href="https://leetcode.com/problems/number-of-common-factors/">LeetCode #2427</a>
  *
  * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
  */
public class NumberOfCommonFactors {

    /**
     * Solves the problem: Common factors.
     *
     * @param a the a (int)
     * @param b the b (int)
     * @return the computed long result
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public long commonFactors(int a, int b) {
        int g=gcd(a,b); long cnt=0;
        for (int i=1;i*i<=g;i++) if (g%i==0) { cnt++; if (i!=g/i) cnt++; }
        return cnt;
    }
    private int gcd(int a,int b){return b==0?a:gcd(b,a%b);}

    public static void main(String[] args) {
        NumberOfCommonFactors sol = new NumberOfCommonFactors();
                System.out.println(sol.commonFactors(12,6)); // 4
                System.out.println(sol.commonFactors(25,30)); // 2
    }
}
