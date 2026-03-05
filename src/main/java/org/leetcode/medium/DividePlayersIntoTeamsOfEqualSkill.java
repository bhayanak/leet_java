package org.leetcode.medium;


/**
 * <b>#2491 - Divide Players Into Teams of Equal Skill</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Two Pointers, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a positive integer array skill of even length n where skill[i] denotes the skill of the ith player. Divide the players into n / 2 teams of size 2 such that the total skill of each team is equal.
 *
 *
 * The chemistry of a team is equal to the product of the skills of the players on that team.
 *
 *
 * Return the sum of the chemistry of all the teams, or return -1 if there is no way to divide the players into teams such that the total skill of each team is equal.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: skill = [3,2,5,1,3,4]
 * Output: 22
 * Explanation: 
 * Divide the players into the following teams: (1, 5), (2, 4), (3, 3), where each team has a total skill of 6.
 * The sum of the chemistry of all the teams is: 1 * 5 + 2 * 4 + 3 * 3 = 5 + 8 + 9 = 22.
 *
 * Example 2:
 *
 * Input: skill = [3,4]
 * Output: 12
 * Explanation: 
 * The two players form a team with a total skill of 7.
 * The chemistry of the team is 3 * 4 = 12.
 *
 * Example 3:
 *
 * Input: skill = [1,1,2,3]
 * Output: -1
 * Explanation: 
 * There is no way to divide the players into teams such that the total skill of each team is equal.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= skill.length &lt;= 105
 *
 * skill.length is even.
 *
 * 1 &lt;= skill[i] &lt;= 1000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Try sorting the skill array.
 * Hint 2: It is always optimal to pair the weakest available player with the strongest available player.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Two Pointers, Sorting).
 *
 * @see <a href="https://leetcode.com/problems/divide-players-into-teams-of-equal-skill/">LeetCode #2491</a>
 */
public class DividePlayersIntoTeamsOfEqualSkill {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Divide Players Into Teams of Equal Skill");
    }

    public static void main(String[] args) {
        System.out.println("=== DividePlayersIntoTeamsOfEqualSkill ===");
        DividePlayersIntoTeamsOfEqualSkill sol = new DividePlayersIntoTeamsOfEqualSkill();
        System.out.println(sol.solve(null));
    }
}
