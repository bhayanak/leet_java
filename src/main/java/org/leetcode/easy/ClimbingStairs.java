package org.leetcode.easy;

/**
 * <b>#70 - Climbing Stairs</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Math, Dynamic Programming, Memoization</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are climbing a staircase. It takes n steps to reach the top.
 * 
 * 
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * 
 * 
 *  
 * 
 * Example 1:
 * 
 * Input: n = 2
 * Output: 2
 * Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 * 
 * Example 2:
 * 
 * Input: n = 3
 * Output: 3
 * Explanation: There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step
 * 2. 1 step + 2 steps
 * 3. 2 steps + 1 step
 * 
 *  
 * 
 * Constraints:
 * 
 * 	
 * 1 &lt;= n &lt;= 45
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * - To reach nth step, what could have been your previous steps? (Think about the step sizes)
 *
 * <h2>Approach</h2>
 * At each step you can take 1 or 2 stairs → Fibonacci-like recurrence:
 * ways(n) = ways(n-1) + ways(n-2). Only the last two values are needed.
 *
 * <h2>Complexity</h2>
* Time: O(n)  |  Space: O(1)
 *
 * @see <a href="https://leetcode.com/problems/climbing-stairs/">LeetCode #70</a>
  *
  * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
  */
public class ClimbingStairs {

    /**
     * Returns the number of distinct ways to climb n stairs (1 or 2 steps at a time).
     *
     * @param n number of stairs
     * @return  number of distinct climbing sequences
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public int climbStairs(int n) {
        if (n <= 2) return n;
        int prev2 = 1, prev1 = 2;
        for (int i = 3; i <= n; i++) {
            int cur = prev1 + prev2;
            prev2 = prev1;
            prev1 = cur;
        }
        return prev1;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public static void main(String[] args) {
                ClimbingStairs sol = new ClimbingStairs();
                System.out.println(sol.climbStairs(2)); // 2
                System.out.println(sol.climbStairs(3)); // 3
                System.out.println(sol.climbStairs(10)); // 89
    }
}
