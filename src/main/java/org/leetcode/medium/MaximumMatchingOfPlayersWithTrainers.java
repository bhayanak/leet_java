package org.leetcode.medium;


/**
 * <b>#2410 - Maximum Matching of Players With Trainers</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Two Pointers, Greedy, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 0-indexed integer array players, where players[i] represents the ability of the ith player. You are also given a 0-indexed integer array trainers, where trainers[j] represents the training capacity of the jth trainer.
 *
 *
 * The ith player can match with the jth trainer if the player's ability is less than or equal to the trainer's training capacity. Additionally, the ith player can be matched with at most one trainer, and the jth trainer can be matched with at most one player.
 *
 *
 * Return the maximum number of matchings between players and trainers that satisfy these conditions.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: players = [4,7,9], trainers = [8,2,5,8]
 * Output: 2
 * Explanation:
 * One of the ways we can form two matchings is as follows:
 * - players[0] can be matched with trainers[0] since 4 &lt;= 8.
 * - players[1] can be matched with trainers[3] since 7 &lt;= 8.
 * It can be proven that 2 is the maximum number of matchings that can be formed.
 *
 * Example 2:
 *
 * Input: players = [1,1,1], trainers = [10]
 * Output: 1
 * Explanation:
 * The trainer can be matched with any of the 3 players.
 * Each player can only be matched with one trainer, so the maximum answer is 1.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= players.length, trainers.length &lt;= 105
 *
 * 1 &lt;= players[i], trainers[j] &lt;= 109
 *
 *
 *
 * Note: This question is the same as  445: Assign Cookies.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Sort both the arrays.
 * Hint 2: Construct the matching greedily.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Two Pointers, Greedy, Sorting).
 *
 * @see <a href="https://leetcode.com/problems/maximum-matching-of-players-with-trainers/">LeetCode #2410</a>
 */
public class MaximumMatchingOfPlayersWithTrainers {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Matching of Players With Trainers");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximumMatchingOfPlayersWithTrainers ===");
        MaximumMatchingOfPlayersWithTrainers sol = new MaximumMatchingOfPlayersWithTrainers();
        System.out.println(sol.solve(null));
    }
}
