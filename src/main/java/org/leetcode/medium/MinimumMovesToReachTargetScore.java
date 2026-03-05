package org.leetcode.medium;


/**
 * <b>#2139 - Minimum Moves to Reach Target Score</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Math, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are playing a game with integers. You start with the integer 1 and you want to reach the integer target.
 *
 *
 * In one move, you can either:
 *
 *
 * Increment the current integer by one (i.e., x = x + 1).
 *
 * Double the current integer (i.e., x = 2 * x).
 *
 * You can use the increment operation any number of times, however, you can only use the double operation at most maxDoubles times.
 *
 *
 * Given the two integers target and maxDoubles, return the minimum number of moves needed to reach target starting with 1.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: target = 5, maxDoubles = 0
 * Output: 4
 * Explanation: Keep incrementing by 1 until you reach target.
 *
 * Example 2:
 *
 * Input: target = 19, maxDoubles = 2
 * Output: 7
 * Explanation: Initially, x = 1
 * Increment 3 times so x = 4
 * Double once so x = 8
 * Increment once so x = 9
 * Double again so x = 18
 * Increment once so x = 19
 *
 * Example 3:
 *
 * Input: target = 10, maxDoubles = 4
 * Output: 4
 * Explanation: Initially, x = 1
 * Increment once so x = 2
 * Double once so x = 4
 * Increment once so x = 5
 * Double again so x = 10
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= target &lt;= 109
 *
 * 0 &lt;= maxDoubles &lt;= 100
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Solve the opposite problem: start at the given score and move to 1.
 * Hint 2: It is better to use the move of the second type once we can to lose more scores fast.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Greedy).
 *
 * @see <a href="https://leetcode.com/problems/minimum-moves-to-reach-target-score/">LeetCode #2139</a>
 */
public class MinimumMovesToReachTargetScore {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Moves to Reach Target Score");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumMovesToReachTargetScore ===");
        MinimumMovesToReachTargetScore sol = new MinimumMovesToReachTargetScore();
        System.out.println(sol.solve(null));
    }
}
