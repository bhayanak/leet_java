package org.leetcode.medium;


/**
 * <b>#1040 - Moving Stones Until Consecutive II</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Math, Sliding Window, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There are some stones in different positions on the X-axis. You are given an integer array stones, the positions of the stones.
 *
 *
 * Call a stone an endpoint stone if it has the smallest or largest position. In one move, you pick up an endpoint stone and move it to an unoccupied position so that it is no longer an endpoint stone.
 *
 *
 * In particular, if the stones are at say, stones = [1,2,5], you cannot move the endpoint stone at position 5, since moving it to any position (such as 0, or 3) will still keep that stone as an endpoint stone.
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
 * Input: stones = [7,4,9]
 * Output: [1,2]
 * Explanation: We can move 4 -&gt; 8 for one move to finish the game.
 * Or, we can move 9 -&gt; 5, 4 -&gt; 6 for two moves to finish the game.
 *
 * Example 2:
 *
 * Input: stones = [6,5,4,3,10]
 * Output: [2,3]
 * Explanation: We can move 3 -&gt; 8 then 10 -&gt; 7 to finish the game.
 * Or, we can move 3 -&gt; 7, 4 -&gt; 8, 5 -&gt; 9 to finish the game.
 * Notice we cannot move 10 -&gt; 2 to finish the game, because that would be an illegal move.
 *
 *
 *
 * Constraints:
 *
 *
 * 3 &lt;= stones.length &lt;= 104
 *
 * 1 &lt;= stones[i] &lt;= 109
 *
 * All the values of stones are unique.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: For the minimum, how many stones are already in place?
For the maximum, we have to lose either the gap A[1] - A[0] or A[N-1] - A[N-2]  (where N = A.length), but every other space can be occupied.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Sliding Window, Sorting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/moving-stones-until-consecutive-ii/">LeetCode #1040</a>
 */
public class MovingStonesUntilConsecutiveIi {

    /**
     * TODO: Implement "Moving Stones Until Consecutive II".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Moving Stones Until Consecutive II");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac MovingStonesUntilConsecutiveIi.java &amp;&amp; java org.leetcode.medium.MovingStonesUntilConsecutiveIi</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== MovingStonesUntilConsecutiveIi ===");
        MovingStonesUntilConsecutiveIi sol = new MovingStonesUntilConsecutiveIi();
        System.out.println(sol.solve(null));
    }
}
