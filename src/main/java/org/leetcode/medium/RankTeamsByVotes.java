package org.leetcode.medium;


/**
 * <b>#1366 - Rank Teams by Votes</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, String, Sorting, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * In a special ranking system, each voter gives a rank from highest to lowest to all teams participating in the competition.
 *
 *
 * The ordering of teams is decided by who received the most position-one votes. If two or more teams tie in the first position, we consider the second position to resolve the conflict, if they tie again, we continue this process until the ties are resolved. If two or more teams are still tied after considering all positions, we rank them alphabetically based on their team letter.
 *
 *
 * You are given an array of strings votes which is the votes of all voters in the ranking systems. Sort all teams according to the ranking system described above.
 *
 *
 * Return a string of all teams sorted by the ranking system.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: votes = ["ABC","ACB","ABC","ACB","ACB"]
 * Output: "ACB"
 * Explanation: 
 * Team A was ranked first place by 5 voters. No other team was voted as first place, so team A is the first team.
 * Team B was ranked second by 2 voters and ranked third by 3 voters.
 * Team C was ranked second by 3 voters and ranked third by 2 voters.
 * As most of the voters ranked C second, team C is the second team, and team B is the third.
 *
 * Example 2:
 *
 * Input: votes = ["WXYZ","XYZW"]
 * Output: "XWYZ"
 * Explanation:
 * X is the winner due to the tie-breaking rule. X has the same votes as W for the first position, but X has one vote in the second position, while W does not have any votes in the second position. 
 *
 * Example 3:
 *
 * Input: votes = ["ZMNAGUEDSJYLBOPHRQICWFXTVK"]
 * Output: "ZMNAGUEDSJYLBOPHRQICWFXTVK"
 * Explanation: Only one voter, so their votes are used for the ranking.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= votes.length &lt;= 1000
 *
 * 1 &lt;= votes[i].length &lt;= 26
 *
 * votes[i].length == votes[j].length for 0 &lt;= i, j &lt; votes.length.
 *
 * votes[i][j] is an English uppercase letter.
 *
 * All characters of votes[i] are unique.
 *
 * All the characters that occur in votes[0] also occur in votes[j] where 1 &lt;= j &lt; votes.length.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Build array rank where rank[i][j] is the number of votes for team i to be the j-th rank.
 * Hint 2: Sort the teams by rank array. if rank array is the same for two or more teams, sort them by the ID in ascending order.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, String, Sorting, Counting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/rank-teams-by-votes/">LeetCode #1366</a>
 */
public class RankTeamsByVotes {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Rank Teams by Votes");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== RankTeamsByVotes ===");
        RankTeamsByVotes sol = new RankTeamsByVotes();
        System.out.println(sol.solve(null));
    }
}
