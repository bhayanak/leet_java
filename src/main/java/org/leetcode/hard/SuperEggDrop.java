package org.leetcode.hard;


/**
 * <b>#887 - Super Egg Drop</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Math, Binary Search, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given k identical eggs and you have access to a building with n floors labeled from 1 to n.
 *
 *
 * You know that there exists a floor f where 0 &lt;= f &lt;= n such that any egg dropped at a floor higher than f will break, and any egg dropped at or below floor f will not break.
 *
 *
 * Each move, you may take an unbroken egg and drop it from any floor x (where 1 &lt;= x &lt;= n). If the egg breaks, you can no longer use it. However, if the egg does not break, you may reuse it in future moves.
 *
 *
 * Return the minimum number of moves that you need to determine with certainty what the value of f is.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: k = 1, n = 2
 * Output: 2
 * Explanation: 
 * Drop the egg from floor 1. If it breaks, we know that f = 0.
 * Otherwise, drop the egg from floor 2. If it breaks, we know that f = 1.
 * If it does not break, then we know f = 2.
 * Hence, we need at minimum 2 moves to determine with certainty what the value of f is.
 *
 * Example 2:
 *
 * Input: k = 2, n = 6
 * Output: 3
 *
 * Example 3:
 *
 * Input: k = 3, n = 14
 * Output: 4
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= k &lt;= 100
 *
 * 1 &lt;= n &lt;= 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Binary Search, Dynamic Programming).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/super-egg-drop/">LeetCode #887</a>
 */
public class SuperEggDrop {

    /**
     * TODO: Implement "Super Egg Drop".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Super Egg Drop");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac SuperEggDrop.java &amp;&amp; java org.leetcode.hard.SuperEggDrop</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== SuperEggDrop ===");
        SuperEggDrop sol = new SuperEggDrop();
        System.out.println(sol.solve(null));
    }
}
