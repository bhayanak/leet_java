package org.leetcode.hard;


/**
 * <b>#1872 - Stone Game VIII</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Math, Dynamic Programming, Prefix Sum, Game Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Alice and Bob take turns playing a game, with Alice starting first.
 *
 *
 * There are n stones arranged in a row. On each player's turn, while the number of stones is more than one, they will do the following:
 *
 *
 *
 *
 * Choose an integer x &gt; 1, and remove the leftmost x stones from the row.
 *
 * Add the sum of the removed stones' values to the player's score.
 *
 * Place a new stone, whose value is equal to that sum, on the left side of the row.
 *
 *
 *
 * The game stops when only one stone is left in the row.
 *
 *
 * The score difference between Alice and Bob is (Alice's score - Bob's score). Alice's goal is to maximize the score difference, and Bob's goal is the minimize the score difference.
 *
 *
 * Given an integer array stones of length n where stones[i] represents the value of the ith stone from the left, return the score difference between Alice and Bob if they both play optimally.
 *
 *
 *
 *
 * Example 1:
 *
 *
 *
 * Input: stones = [-1,2,-3,4,-5]
 * Output: 5
 * Explanation:
 * - Alice removes the first 4 stones, adds (-1) + 2 + (-3) + 4 = 2 to her score, and places a stone of
 *   value 2 on the left. stones = [2,-5].
 * - Bob removes the first 2 stones, adds 2 + (-5) = -3 to his score, and places a stone of value -3 on
 *   the left. stones = [-3].
 * The difference between their scores is 2 - (-3) = 5.
 *
 *
 *
 *
 * Example 2:
 *
 *
 *
 * Input: stones = [7,-6,5,10,5,-2,-6]
 * Output: 13
 * Explanation:
 * - Alice removes all stones, adds 7 + (-6) + 5 + 10 + 5 + (-2) + (-6) = 13 to her score, and places a
 *   stone of value 13 on the left. stones = [13].
 * The difference between their scores is 13 - 0 = 13.
 *
 *
 *
 *
 * Example 3:
 *
 *
 *
 * Input: stones = [-10,-12]
 * Output: -22
 * Explanation:
 * - Alice can only make one move, which is to remove both stones. She adds (-10) + (-12) = -22 to her
 *   score and places a stone of value -22 on the left. stones = [-22].
 * The difference between their scores is (-22) - 0 = -22.
 *
 *
 *
 *
 *
 *
 * Constraints:
 *
 *
 *
 *
 * n == stones.length
 *
 * 2 &lt;= n &lt;= 105
 *
 * -104 &lt;= stones[i] &lt;= 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Let's note that the only thing that matters is how many stones were removed so we can maintain dp[numberOfRemovedStones]
 * Hint 2: dp[x] = max(sum of all elements up to y - dp[y]) for all y &gt; x
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Dynamic Programming, Prefix Sum, Game Theory).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/stone-game-viii/">LeetCode #1872</a>
 */
public class StoneGameViii {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Stone Game VIII");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== StoneGameViii ===");
        StoneGameViii sol = new StoneGameViii();
        System.out.println(sol.solve(null));
    }
}
