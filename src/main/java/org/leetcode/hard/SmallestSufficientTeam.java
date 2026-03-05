package org.leetcode.hard;


/**
 * <b>#1125 - Smallest Sufficient Team</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Bit Manipulation, Bitmask</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * In a project, you have a list of required skills req_skills, and a list of people. The ith person people[i] contains a list of skills that the person has.
 *
 *
 * Consider a sufficient team: a set of people such that for every required skill in req_skills, there is at least one person in the team who has that skill. We can represent these teams by the index of each person.
 *
 *
 * For example, team = [0, 1, 3] represents the people with skills people[0], people[1], and people[3].
 *
 * Return any sufficient team of the smallest possible size, represented by the index of each person. You may return the answer in any order.
 *
 *
 * It is guaranteed an answer exists.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: req_skills = ["java","nodejs","reactjs"], people = [["java"],["nodejs"],["nodejs","reactjs"]]
 * Output: [0,2]
 *
 *
 * Example 2:
 *
 * Input: req_skills = ["algorithms","math","java","reactjs","csharp","aws"], people = [["algorithms","math","java"],["algorithms","math","reactjs"],["java","csharp","aws"],["reactjs","csharp"],["csharp","math"],["aws","java"]]
 * Output: [1,2]
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= req_skills.length &lt;= 16
 *
 * 1 &lt;= req_skills[i].length &lt;= 16
 *
 * req_skills[i] consists of lowercase English letters.
 *
 * All the strings of req_skills are unique.
 *
 * 1 &lt;= people.length &lt;= 60
 *
 * 0 &lt;= people[i].length &lt;= 16
 *
 * 1 &lt;= people[i][j].length &lt;= 16
 *
 * people[i][j] consists of lowercase English letters.
 *
 * All the strings of people[i] are unique.
 *
 * Every skill in people[i] is a skill in req_skills.
 *
 * It is guaranteed a sufficient team exists.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Do a bitmask DP.
 * Hint 2: For each person, for each set of skills, we can update our understanding of a minimum set of people needed to perform this set of skills.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Bit Manipulation, Bitmask).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/smallest-sufficient-team/">LeetCode #1125</a>
 */
public class SmallestSufficientTeam {

    /**
     * TODO: Implement "Smallest Sufficient Team".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Smallest Sufficient Team");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac SmallestSufficientTeam.java &amp;&amp; java org.leetcode.hard.SmallestSufficientTeam</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== SmallestSufficientTeam ===");
        SmallestSufficientTeam sol = new SmallestSufficientTeam();
        System.out.println(sol.solve(null));
    }
}
