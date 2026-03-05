package org.leetcode.easy;


/**
 * <b>#2928 - Distribute Candies Among Children I</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Math, Combinatorics, Enumeration</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two positive integers n and limit.
 *
 *
 * Return the total number of ways to distribute n candies among 3 children such that no child gets more than limit candies.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 5, limit = 2
 * Output: 3
 * Explanation: There are 3 ways to distribute 5 candies such that no child gets more than 2 candies: (1, 2, 2), (2, 1, 2) and (2, 2, 1).
 *
 * Example 2:
 *
 * Input: n = 3, limit = 3
 * Output: 10
 * Explanation: There are 10 ways to distribute 3 candies such that no child gets more than 3 candies: (0, 0, 3), (0, 1, 2), (0, 2, 1), (0, 3, 0), (1, 0, 2), (1, 1, 1), (1, 2, 0), (2, 0, 1), (2, 1, 0) and (3, 0, 0).
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 50
 *
 * 1 &lt;= limit &lt;= 50
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use three nested for loops to check all the triplets.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Combinatorics, Enumeration).
 *
 * @see <a href="https://leetcode.com/problems/distribute-candies-among-children-i/">LeetCode #2928</a>
  *
  * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
  */
public class DistributeCandiesAmongChildrenI {

    /**
     * Solves the problem: Distribute candy.
     *
     * @param n the n (int)
     * @param limit the limit (int)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Validates the condition by scanning the input and returning false on the first violation.</p>
      */
    public int distributeCandy(int n, int limit) {
        int cnt=0;
        for (int a=0;a<=Math.min(n,limit);a++) for (int b=0;b<=Math.min(n-a,limit);b++) {
            int c=n-a-b;
            if (c>=0&&c<=limit) cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        DistributeCandiesAmongChildrenI sol = new DistributeCandiesAmongChildrenI();
                System.out.println(sol.distributeCandy(5,2)); // 3
                System.out.println(sol.distributeCandy(3,3)); // 10
    }
}
