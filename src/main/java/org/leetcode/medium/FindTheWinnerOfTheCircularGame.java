package org.leetcode.medium;


/**
 * <b>#1823 - Find the Winner of the Circular Game</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Math, Recursion, Queue, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There are n friends that are playing a game. The friends are sitting in a circle and are numbered from 1 to n in clockwise order. More formally, moving clockwise from the ith friend brings you to the (i+1)th friend for 1 &lt;= i &lt; n, and moving clockwise from the nth friend brings you to the 1st friend.
 *
 *
 * The rules of the game are as follows:
 *
 *
 * Start at the 1st friend.
 *
 * Count the next k friends in the clockwise direction including the friend you started at. The counting wraps around the circle and may count some friends more than once.
 *
 * The last friend you counted leaves the circle and loses the game.
 *
 * If there is still more than one friend in the circle, go back to step 2 starting from the friend immediately clockwise of the friend who just lost and repeat.
 *
 * Else, the last friend in the circle wins the game.
 *
 * Given the number of friends, n, and an integer k, return the winner of the game.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 5, k = 2
 * Output: 3
 * Explanation: Here are the steps of the game:
 * 1) Start at friend 1.
 * 2) Count 2 friends clockwise, which are friends 1 and 2.
 * 3) Friend 2 leaves the circle. Next start is friend 3.
 * 4) Count 2 friends clockwise, which are friends 3 and 4.
 * 5) Friend 4 leaves the circle. Next start is friend 5.
 * 6) Count 2 friends clockwise, which are friends 5 and 1.
 * 7) Friend 1 leaves the circle. Next start is friend 3.
 * 8) Count 2 friends clockwise, which are friends 3 and 5.
 * 9) Friend 5 leaves the circle. Only friend 3 is left, so they are the winner.
 *
 * Example 2:
 *
 * Input: n = 6, k = 5
 * Output: 1
 * Explanation: The friends leave in this order: 5, 4, 6, 2, 3. The winner is friend 1.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= k &lt;= n &lt;= 500
 *
 *
 *
 * Follow up:
 *
 *
 * Could you solve this problem in linear time with constant space?
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Simulate the process.
 * Hint 2: Maintain in a circular list the people who are still in the circle and the current person you are standing at.
 * Hint 3: In each turn, count k people and remove the last person from the list.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Recursion, Queue, Simulation).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/find-the-winner-of-the-circular-game/">LeetCode #1823</a>
 */
public class FindTheWinnerOfTheCircularGame {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find the Winner of the Circular Game");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== FindTheWinnerOfTheCircularGame ===");
        FindTheWinnerOfTheCircularGame sol = new FindTheWinnerOfTheCircularGame();
        System.out.println(sol.solve(null));
    }
}
