package org.leetcode.easy;


/**
 * <b>#1550 - Three Consecutive Odds</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer array arr, return true if there are three consecutive odd numbers in the array. Otherwise, return false.
 *
 *
 *
 * Example 1:
 *
 * Input: arr = [2,6,4,1]
 * Output: false
 * Explanation: There are no three consecutive odds.
 *
 * Example 2:
 *
 * Input: arr = [1,2,34,3,4,5,7,23,12]
 * Output: true
 * Explanation: [5,7,23] are three consecutive odds.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= arr.length &lt;= 1000
 *
 * 1 &lt;= arr[i] &lt;= 1000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Check every three consecutive numbers in the array for parity.
 *
 * <h2>Approach</h2>
 * Think about the category (Array).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/three-consecutive-odds/">LeetCode #1550</a>
  *
  * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
  */
public class ThreeConsecutiveOdds {

    /**
     * Solves the problem: Three consecutive odds.
     *
     * @param arr the arr (int[])
     * @return the computed boolean result
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public boolean threeConsecutiveOdds(int[] arr) {
        int cnt=0;
        for (int n:arr) {
            if (n%2!=0) { if (++cnt==3) return true; } else cnt=0;
        }
        return false;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        ThreeConsecutiveOdds sol = new ThreeConsecutiveOdds();
                System.out.println(sol.threeConsecutiveOdds(new int[]{2,6,4,1}));     // false
                System.out.println(sol.threeConsecutiveOdds(new int[]{1,2,34,3,4,5,7,23,12})); // true
    }
}
