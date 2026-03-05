package org.leetcode.medium;


/**
 * <b>#1690 - Stone Game VII</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Math, Dynamic Programming, Game Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Alice and Bob take turns playing a game, with Alice starting first.
 *
 *
 * There are n stones arranged in a row. On each player's turn, they can remove either the leftmost stone or the rightmost stone from the row and receive points equal to the sum of the remaining stones' values in the row. The winner is the one with the higher score when there are no stones left to remove.
 *
 *
 * Bob found that he will always lose this game (poor Bob, he always loses), so he decided to minimize the score's difference. Alice's goal is to maximize the difference in the score.
 *
 *
 * Given an array of integers stones where stones[i] represents the value of the ith stone from the left, return the difference in Alice and Bob's score if they both play optimally.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: stones = [5,3,1,4,2]
 * Output: 6
 * Explanation: 
 * - Alice removes 2 and gets 5 + 3 + 1 + 4 = 13 points. Alice = 13, Bob = 0, stones = [5,3,1,4].
 * - Bob removes 5 and gets 3 + 1 + 4 = 8 points. Alice = 13, Bob = 8, stones = [3,1,4].
 * - Alice removes 3 and gets 1 + 4 = 5 points. Alice = 18, Bob = 8, stones = [1,4].
 * - Bob removes 1 and gets 4 points. Alice = 18, Bob = 12, stones = [4].
 * - Alice removes 4 and gets 0 points. Alice = 18, Bob = 12, stones = [].
 * The score difference is 18 - 12 = 6.
 *
 * Example 2:
 *
 * Input: stones = [7,90,5,1,100,10,10,2]
 * Output: 122
 *
 *
 *
 * Constraints:
 *
 *
 * n == stones.length
 *
 * 2 &lt;= n &lt;= 1000
 *
 * 1 &lt;= stones[i] &lt;= 1000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The constraints are small enough for an N^2 solution.
 * Hint 2: Try using dynamic programming.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Dynamic Programming, Game Theory).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/stone-game-vii/">LeetCode #1690</a>
 */
public class StoneGameVii {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Stone Game VII");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== StoneGameVii ===");
        StoneGameVii sol = new StoneGameVii();
        System.out.println(sol.solve(null));
    }
}
