package org.leetcode.easy;


/**
 * <b>#1732 - Find the Highest Altitude</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes. The biker starts his trip on point 0 with altitude equal 0.
 *
 *
 * You are given an integer array gain of length n where gain[i] is the net gain in altitude between points i​​​​​​ and i + 1 for all (0 &lt;= i &lt; n). Return the highest altitude of a point.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: gain = [-5,1,5,0,-7]
 * Output: 1
 * Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.
 *
 * Example 2:
 *
 * Input: gain = [-4,-3,-2,-1,4,3,2]
 * Output: 0
 * Explanation: The altitudes are [0,-4,-7,-9,-10,-6,-3,-1]. The highest is 0.
 *
 *
 *
 * Constraints:
 *
 *
 * n == gain.length
 *
 * 1 &lt;= n &lt;= 100
 *
 * -100 &lt;= gain[i] &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Let's note that the altitude of an element is the sum of gains of all the elements behind it
 * Hint 2: Getting the altitudes can be done by getting the prefix sum array of the given array
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Prefix Sum).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/find-the-highest-altitude/">LeetCode #1732</a>
  *
  * <p><b>Explanation:</b> Tracks the running maximum in a single O(n) scan without extra space.</p>
  */
public class FindTheHighestAltitude {

    /**
     * Solves the problem: Largest altitude.
     *
     * @param gain the gain (int[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Tracks the running maximum in a single O(n) scan without extra space.</p>
      */
    public int largestAltitude(int[] gain) {
        int cur=0, max=0;
        for (int g:gain) { cur+=g; max=Math.max(max,cur); }
        return max;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the input in a single pass, applying the core logic to produce the result.</p>
      */
    public static void main(String[] args) {
        FindTheHighestAltitude sol = new FindTheHighestAltitude();
                System.out.println(sol.largestAltitude(new int[]{-5,1,5,0,-7})); // 1
                System.out.println(sol.largestAltitude(new int[]{-4,-3,-2,-1,4,3,2})); // 0
    }
}
