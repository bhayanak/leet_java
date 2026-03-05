package org.leetcode.hard;


/**
 * <b>#2585 - Number of Ways to Earn Points</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There is a test that has n types of questions. You are given an integer target and a 0-indexed 2D integer array types where types[i] = [counti, marksi] indicates that there are counti questions of the ith type, and each one of them is worth marksi points.
 *
 * Return the number of ways you can earn exactly target points in the exam. Since the answer may be too large, return it modulo 109 + 7.
 *
 *
 * Note that questions of the same type are indistinguishable.
 *
 *
 * For example, if there are 3 questions of the same type, then solving the 1st and 2nd questions is the same as solving the 1st and 3rd questions, or the 2nd and 3rd questions.
 *
 *
 *
 * Example 1:
 *
 * Input: target = 6, types = [[6,1],[3,2],[2,3]]
 * Output: 7
 * Explanation: You can earn 6 points in one of the seven ways:
 * - Solve 6 questions of the 0th type: 1 + 1 + 1 + 1 + 1 + 1 = 6
 * - Solve 4 questions of the 0th type and 1 question of the 1st type: 1 + 1 + 1 + 1 + 2 = 6
 * - Solve 2 questions of the 0th type and 2 questions of the 1st type: 1 + 1 + 2 + 2 = 6
 * - Solve 3 questions of the 0th type and 1 question of the 2nd type: 1 + 1 + 1 + 3 = 6
 * - Solve 1 question of the 0th type, 1 question of the 1st type and 1 question of the 2nd type: 1 + 2 + 3 = 6
 * - Solve 3 questions of the 1st type: 2 + 2 + 2 = 6
 * - Solve 2 questions of the 2nd type: 3 + 3 = 6
 *
 * Example 2:
 *
 * Input: target = 5, types = [[50,1],[50,2],[50,5]]
 * Output: 4
 * Explanation: You can earn 5 points in one of the four ways:
 * - Solve 5 questions of the 0th type: 1 + 1 + 1 + 1 + 1 = 5
 * - Solve 3 questions of the 0th type and 1 question of the 1st type: 1 + 1 + 1 + 2 = 5
 * - Solve 1 questions of the 0th type and 2 questions of the 1st type: 1 + 2 + 2 = 5
 * - Solve 1 question of the 2nd type: 5
 *
 * Example 3:
 *
 * Input: target = 18, types = [[6,1],[3,2],[2,3]]
 * Output: 1
 * Explanation: You can only earn 18 points by answering all questions.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= target &lt;= 1000
 *
 * n == types.length
 *
 * 1 &lt;= n &lt;= 50
 *
 * types[i].length == 2
 *
 * 1 &lt;= counti, marksi &lt;= 50
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use Dynamic Programming
 * Hint 2: Let ways[i][points] be the number of ways to score a given number of points after solving some questions of the first i types.
 * Hint 3: ways[i][points] is equal to the sum of ways[i-1][points - solved * marks[i] over 0 &lt;= solved &lt;= count_i
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming).
 *
 * @see <a href="https://leetcode.com/problems/number-of-ways-to-earn-points/">LeetCode #2585</a>
 */
public class NumberOfWaysToEarnPoints {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Number of Ways to Earn Points");
    }

    public static void main(String[] args) {
        System.out.println("=== NumberOfWaysToEarnPoints ===");
        NumberOfWaysToEarnPoints sol = new NumberOfWaysToEarnPoints();
        System.out.println(sol.solve(null));
    }
}
