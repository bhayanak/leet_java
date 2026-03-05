package org.leetcode.medium;


/**
 * <b>#1654 - Minimum Jumps to Reach Home</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Breadth-First Search</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * A certain bug's home is on the x-axis at position x. Help them get there from position 0.
 *
 *
 * The bug jumps according to the following rules:
 *
 *
 * It can jump exactly a positions forward (to the right).
 *
 * It can jump exactly b positions backward (to the left).
 *
 * It cannot jump backward twice in a row.
 *
 * It cannot jump to any forbidden positions.
 *
 * The bug may jump forward beyond its home, but it cannot jump to positions numbered with negative integers.
 *
 *
 * Given an array of integers forbidden, where forbidden[i] means that the bug cannot jump to the position forbidden[i], and integers a, b, and x, return the minimum number of jumps needed for the bug to reach its home. If there is no possible sequence of jumps that lands the bug on position x, return -1.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: forbidden = [14,4,18,1,15], a = 3, b = 15, x = 9
 * Output: 3
 * Explanation: 3 jumps forward (0 -&gt; 3 -&gt; 6 -&gt; 9) will get the bug home.
 *
 * Example 2:
 *
 * Input: forbidden = [8,3,16,6,12,20], a = 15, b = 13, x = 11
 * Output: -1
 *
 * Example 3:
 *
 * Input: forbidden = [1,6,2,14,5,17,4], a = 16, b = 9, x = 7
 * Output: 2
 * Explanation: One jump forward (0 -&gt; 16) then one jump backward (16 -&gt; 7) will get the bug home.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= forbidden.length &lt;= 1000
 *
 * 1 &lt;= a, b, forbidden[i] &lt;= 2000
 *
 * 0 &lt;= x &lt;= 2000
 *
 * All the elements in forbidden are distinct.
 *
 * Position x is not forbidden.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Think of the line as a graph
 * Hint 2: to handle the no double back jumps condition you can handle it by holding the state of your previous jump
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Breadth-First Search).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/minimum-jumps-to-reach-home/">LeetCode #1654</a>
 */
public class MinimumJumpsToReachHome {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Jumps to Reach Home");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MinimumJumpsToReachHome ===");
        MinimumJumpsToReachHome sol = new MinimumJumpsToReachHome();
        System.out.println(sol.solve(null));
    }
}
