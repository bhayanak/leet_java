package org.leetcode.medium;


/**
 * <b>#1033 - Moving Stones Until Consecutive</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Math, Brainteaser</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There are three stones in different positions on the X-axis. You are given three integers a, b, and c, the positions of the stones.
 *
 *
 * In one move, you pick up a stone at an endpoint (i.e., either the lowest or highest position stone), and move it to an unoccupied position between those endpoints. Formally, let's say the stones are currently at positions x, y, and z with x &lt; y &lt; z. You pick up the stone at either position x or position z, and move that stone to an integer position k, with x &lt; k &lt; z and k != y.
 *
 *
 * The game ends when you cannot make any more moves (i.e., the stones are in three consecutive positions).
 *
 *
 * Return an integer array answer of length 2 where:
 *
 *
 * answer[0] is the minimum number of moves you can play, and
 *
 * answer[1] is the maximum number of moves you can play.
 *
 *
 *
 * Example 1:
 *
 * Input: a = 1, b = 2, c = 5
 * Output: [1,2]
 * Explanation: Move the stone from 5 to 3, or move the stone from 5 to 4 to 3.
 *
 * Example 2:
 *
 * Input: a = 4, b = 3, c = 2
 * Output: [0,0]
 * Explanation: We cannot make any moves.
 *
 * Example 3:
 *
 * Input: a = 3, b = 5, c = 1
 * Output: [1,2]
 * Explanation: Move the stone from 1 to 4; or move the stone from 1 to 2 to 4.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= a, b, c &lt;= 100
 *
 * a, b, and c have different values.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: For the minimum:  We can always do it in at most 2 moves, by moving one stone next to another, then the third stone next to the other two.  When can we do it in 1 move?  0 moves?

For the maximum:  Every move, the maximum position minus the minimum position must decrease by at least 1.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Brainteaser).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/moving-stones-until-consecutive/">LeetCode #1033</a>
 */
public class MovingStonesUntilConsecutive {

    /**
     * TODO: Implement "Moving Stones Until Consecutive".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Moving Stones Until Consecutive");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac MovingStonesUntilConsecutive.java &amp;&amp; java org.leetcode.medium.MovingStonesUntilConsecutive</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== MovingStonesUntilConsecutive ===");
        MovingStonesUntilConsecutive sol = new MovingStonesUntilConsecutive();
        System.out.println(sol.solve(null));
    }
}
