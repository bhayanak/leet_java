package org.leetcode.hard;


/**
 * <b>#2836 - Maximize Value of Function in a Ball Passing Game</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Bit Manipulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array receiver of length n and an integer k. n players are playing a ball-passing game.
 *
 *
 * You choose the starting player, i. The game proceeds as follows: player i passes the ball to player receiver[i], who then passes it to receiver[receiver[i]], and so on, for k passes in total. The game's score is the sum of the indices of the players who touched the ball, including repetitions, i.e. i + receiver[i] + receiver[receiver[i]] + ... + receiver(k)[i].
 *
 *
 * Return the maximum possible score.
 *
 *
 * Notes:
 *
 *
 * receiver may contain duplicates.
 *
 * receiver[i] may be equal to i.
 *
 *
 *
 * Example 1:
 *
 * Input: receiver = [2,0,1], k = 4
 *
 *
 * Output: 6
 *
 *
 * Explanation:
 *
 *
 * Starting with player i = 2 the initial score is 2:
 *
 *
 *
 *
 *
 * 			Pass
 * 			Sender Index
 * 			Receiver Index
 * 			Score
 *
 *
 *
 *
 * 			1
 * 			2
 * 			1
 * 			3
 *
 *
 *
 *
 * 			2
 * 			1
 * 			0
 * 			3
 *
 *
 *
 *
 * 			3
 * 			0
 * 			2
 * 			5
 *
 *
 *
 *
 * 			4
 * 			2
 * 			1
 * 			6
 *
 *
 *
 *
 * Example 2:
 *
 * Input: receiver = [1,1,1,2,3], k = 3
 *
 *
 * Output: 10
 *
 *
 * Explanation:
 *
 *
 * Starting with player i = 4 the initial score is 4:
 *
 *
 *
 *
 *
 * 			Pass
 * 			Sender Index
 * 			Receiver Index
 * 			Score
 *
 *
 *
 *
 * 			1
 * 			4
 * 			3
 * 			7
 *
 *
 *
 *
 * 			2
 * 			3
 * 			2
 * 			9
 *
 *
 *
 *
 * 			3
 * 			2
 * 			1
 * 			10
 *
 *
 *
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= receiver.length == n &lt;= 105
 *
 * 0 &lt;= receiver[i] &lt;= n - 1
 *
 * 1 &lt;= k &lt;= 1010
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: <div class="_1l1MA">We can solve the problem using binary lifting.</div>
 * Hint 2: <div class="_1l1MA">For each player with id <code>x</code> and for every <code>i</code> in the range <code>[0, ceil(log<sub>2</sub>k)]</code>, we can determine the last receiver's id and compute the sum of player ids who receive the ball after <code>2<sup>i</sup></code> passes, starting from <code>x</code>.</div>
 * Hint 3: <div class="_1l1MA">Let <code>last_receiver[x][i] =</code> the last receiver's id after <code>2<sup>i</sup></code> passes, and <code>sum[x][i] =</code> the sum of player ids who receive the ball after <code>2<sup>i</sup></code> passes. For all <code>x</code> in the range <code>[0, n - 1]</code>, <code>last_receiver[x][0] = receiver[x]</code>, and <code>sum[x][0] = receiver[x]</code>.</div>
 * Hint 4: <div class="_1l1MA">Then for <code>i</code> in range <code>[1, ceil(log<sub>2</sub>k)]</code>, <code>last_receiver[x][i] = last_receiver[last_receiver[x][i - 1]][i - 1]</code> and <code>sum[x][i] = sum[x][i - 1] + sum[last_receiver[x][i - 1]][i - 1]</code>, for all <code>x</code> in the range <code>[0, n - 1]</code>.</div>
 * Hint 5: <div class="_1l1MA">Starting from each player id <code>x</code>, we can now go through the powers of <code>2</code> in the binary representation of <code>k</code> and make jumps corresponding to each power, using the pre-computed values, to compute <code>f(x)</code>.</div>
 * Hint 6: <div class="_1l1MA">The answer is the maximum <code>f(x)</code> from each player id.</div>
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Bit Manipulation).
 *
 * @see <a href="https://leetcode.com/problems/maximize-value-of-function-in-a-ball-passing-game/">LeetCode #2836</a>
 */
public class MaximizeValueOfFunctionInABallPassingGame {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximize Value of Function in a Ball Passing Game");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximizeValueOfFunctionInABallPassingGame ===");
        MaximizeValueOfFunctionInABallPassingGame sol = new MaximizeValueOfFunctionInABallPassingGame();
        System.out.println(sol.solve(null));
    }
}
