package org.leetcode.medium;


/**
 * <b>#2849 - Determine if a Cell Is Reachable at a Given Time</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Math</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given four integers sx, sy, fx, fy, and a non-negative integer t.
 *
 *
 * In an infinite 2D grid, you start at the cell (sx, sy). Each second, you must move to any of its adjacent cells.
 *
 *
 * Return true if you can reach cell (fx, fy) after exactly t seconds, or false otherwise.
 *
 *
 * A cell's adjacent cells are the 8 cells around it that share at least one corner with it. You can visit the same cell several times.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: sx = 2, sy = 4, fx = 7, fy = 7, t = 6
 * Output: true
 * Explanation: Starting at cell (2, 4), we can reach cell (7, 7) in exactly 6 seconds by going through the cells depicted in the picture above. 
 *
 * Example 2:
 *
 * Input: sx = 3, sy = 1, fx = 7, fy = 3, t = 3
 * Output: false
 * Explanation: Starting at cell (3, 1), it takes at least 4 seconds to reach cell (7, 3) by going through the cells depicted in the picture above. Hence, we cannot reach cell (7, 3) at the third second.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= sx, sy, fx, fy &lt;= 109
 *
 * 0 &lt;= t &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Minimum time to reach the cell should be less than or equal to given time.
 * Hint 2: The answer is true if <code>t</code> is greater or equal than the Chebyshev distance from <code>(sx, sy)</code> to <code>(fx, fy)</code>. However, there is one more edge case to be considered.
 * Hint 3: The answer is false If <code>sx == fx</code> and <code>sy == fy</code>
 *
 * <h2>Approach</h2>
 * Think about the category (Math).
 *
 * @see <a href="https://leetcode.com/problems/determine-if-a-cell-is-reachable-at-a-given-time/">LeetCode #2849</a>
 */
public class DetermineIfACellIsReachableAtAGivenTime {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Determine if a Cell Is Reachable at a Given Time");
    }

    public static void main(String[] args) {
        System.out.println("=== DetermineIfACellIsReachableAtAGivenTime ===");
        DetermineIfACellIsReachableAtAGivenTime sol = new DetermineIfACellIsReachableAtAGivenTime();
        System.out.println(sol.solve(null));
    }
}
