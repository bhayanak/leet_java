package org.leetcode.easy;


/**
 * <b>#2485 - Find the Pivot Integer</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Math, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a positive integer n, find the pivot integer x such that:
 *
 *
 * The sum of all elements between 1 and x inclusively equals the sum of all elements between x and n inclusively.
 *
 * Return the pivot integer x. If no such integer exists, return -1. It is guaranteed that there will be at most one pivot index for the given input.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 8
 * Output: 6
 * Explanation: 6 is the pivot integer since: 1 + 2 + 3 + 4 + 5 + 6 = 6 + 7 + 8 = 21.
 *
 * Example 2:
 *
 * Input: n = 1
 * Output: 1
 * Explanation: 1 is the pivot integer since: 1 = 1.
 *
 * Example 3:
 *
 * Input: n = 4
 * Output: -1
 * Explanation: It can be proved that no such integer exist.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 1000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Can you use brute force to check every number from 1 to n if any of them is the pivot integer?
 * Hint 2: If you know the sum of [1: pivot], how can you efficiently calculate the sum of the other parts?
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/find-the-pivot-integer/">LeetCode #2485</a>
  *
  * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
  */
public class FindThePivotInteger {

    /**
     * Solves the problem: Pivot integer.
     *
     * @param n the n (int)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public int pivotInteger(int n) {
        for (int x=1;x<=n;x++) {
            int sumLeft=x*(x+1)/2, sumRight=n*(n+1)/2 - x*(x-1)/2;
            if (sumLeft==sumRight) return x;
        }
        return -1;
    }

    public static void main(String[] args) {
        FindThePivotInteger sol = new FindThePivotInteger();
                System.out.println(sol.pivotInteger(8)); // 6
                System.out.println(sol.pivotInteger(1)); // 1
                System.out.println(sol.pivotInteger(4)); // -1
    }
}
