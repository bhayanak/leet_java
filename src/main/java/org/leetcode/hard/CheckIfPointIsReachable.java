package org.leetcode.hard;


/**
 * <b>#2543 - Check if Point Is Reachable</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Math, Number Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There exists an infinitely large grid. You are currently at point (1, 1), and you need to reach the point (targetX, targetY) using a finite number of steps.
 *
 *
 * In one step, you can move from point (x, y) to any one of the following points:
 *
 *
 * (x, y - x)
 *
 * (x - y, y)
 *
 * (2 * x, y)
 *
 * (x, 2 * y)
 *
 * Given two integers targetX and targetY representing the X-coordinate and Y-coordinate of your final position, return true if you can reach the point from (1, 1) using some number of steps, and false otherwise.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: targetX = 6, targetY = 9
 * Output: false
 * Explanation: It is impossible to reach (6,9) from (1,1) using any sequence of moves, so false is returned.
 *
 * Example 2:
 *
 * Input: targetX = 4, targetY = 7
 * Output: true
 * Explanation: You can follow the path (1,1) -&gt; (1,2) -&gt; (1,4) -&gt; (1,8) -&gt; (1,7) -&gt; (2,7) -&gt; (4,7).
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= targetX, targetY &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Let’s go in reverse order, from (targetX, targetY) to (1, 1). So, now we can move from (x, y) to (x+y, y), (x, y+x), (x/2, y) if x is even, and (x, y/2) if y is even.
 * Hint 2: When is it optimal to use the third and fourth operations?
 * Hint 3: Think how GCD of (x, y) is affected if we apply the first two operations.
 * Hint 4: How can we check if we can reach (1, 1) using the GCD value calculate above?
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Number Theory).
 *
 * @see <a href="https://leetcode.com/problems/check-if-point-is-reachable/">LeetCode #2543</a>
 */
public class CheckIfPointIsReachable {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Check if Point Is Reachable");
    }

    public static void main(String[] args) {
        System.out.println("=== CheckIfPointIsReachable ===");
        CheckIfPointIsReachable sol = new CheckIfPointIsReachable();
        System.out.println(sol.solve(null));
    }
}
