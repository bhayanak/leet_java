package org.leetcode.easy;


/**
 * <b>#1688 - Count of Matches in Tournament</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Math, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer n, the number of teams in a tournament that has strange rules:
 *
 *
 * If the current number of teams is even, each team gets paired with another team. A total of n / 2 matches are played, and n / 2 teams advance to the next round.
 *
 * If the current number of teams is odd, one team randomly advances in the tournament, and the rest gets paired. A total of (n - 1) / 2 matches are played, and (n - 1) / 2 + 1 teams advance to the next round.
 *
 * Return the number of matches played in the tournament until a winner is decided.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 7
 * Output: 6
 * Explanation: Details of the tournament: 
 * - 1st Round: Teams = 7, Matches = 3, and 4 teams advance.
 * - 2nd Round: Teams = 4, Matches = 2, and 2 teams advance.
 * - 3rd Round: Teams = 2, Matches = 1, and 1 team is declared the winner.
 * Total number of matches = 3 + 2 + 1 = 6.
 *
 * Example 2:
 *
 * Input: n = 14
 * Output: 13
 * Explanation: Details of the tournament:
 * - 1st Round: Teams = 14, Matches = 7, and 7 teams advance.
 * - 2nd Round: Teams = 7, Matches = 3, and 4 teams advance.
 * - 3rd Round: Teams = 4, Matches = 2, and 2 teams advance.
 * - 4th Round: Teams = 2, Matches = 1, and 1 team is declared the winner.
 * Total number of matches = 7 + 3 + 2 + 1 = 13.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 200
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Simulate the tournament as given in the statement.
 * Hint 2: Be careful when handling odd integers.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Simulation).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/count-of-matches-in-tournament/">LeetCode #1688</a>
  *
  * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
  */
public class CountOfMatchesInTournament {

    /**
     * Solves the problem: Number of matches.
     *
     * @param n the n (int)
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public int numberOfMatches(int n) {
        return n-1; // every match eliminates one team
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public static void main(String[] args) {
        CountOfMatchesInTournament sol = new CountOfMatchesInTournament();
                System.out.println(sol.numberOfMatches(7));  // 6
                System.out.println(sol.numberOfMatches(14)); // 13
    }
}
