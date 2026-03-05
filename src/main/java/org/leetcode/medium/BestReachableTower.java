package org.leetcode.medium;


/**
 * <b>#3809 - Best Reachable Tower</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 2D integer array towers, where towers[i] = [xi, yi, qi] represents the coordinates (xi, yi) and quality factor qi of the ith tower.
 *
 *
 * You are also given an integer array center = [cx, cy​​​​​​​] representing your location, and an integer radius.
 *
 *
 * A tower is reachable if its Manhattan distance from center is less than or equal to radius.
 *
 *
 * Among all reachable towers:
 *
 *
 * Return the coordinates of the tower with the maximum quality factor.
 *
 * If there is a tie, return the tower with the lexicographically smallest coordinate. If no tower is reachable, return [-1, -1].
 *
 * The Manhattan Distance between two cells (xi, yi) and (xj, yj) is |xi - xj| + |yi - yj|.
 *
 *
 * A coordinate [xi, yi] is lexicographically smaller than [xj, yj] if xi &lt; xj, or xi == xj and yi &lt; yj.
 *
 *
 * |x| denotes the absolute value of x.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: towers = [[1,2,5], [2,1,7], [3,1,9]], center = [1,1], radius = 2
 *
 *
 * Output: [3,1]
 *
 *
 * Explanation:
 *
 *
 * Tower [1, 2, 5]: Manhattan distance = |1 - 1| + |2 - 1| = 1, reachable.
 *
 * Tower [2, 1, 7]: Manhattan distance = |2 - 1| + |1 - 1| = 1, reachable.
 *
 * Tower [3, 1, 9]: Manhattan distance = |3 - 1| + |1 - 1| = 2, reachable.
 *
 * All towers are reachable. The maximum quality factor is 9, which corresponds to tower [3, 1].
 *
 * Example 2:
 *
 * Input: towers = [[1,3,4], [2,2,4], [4,4,7]], center = [0,0], radius = 5
 *
 *
 * Output: [1,3]
 *
 *
 * Explanation:
 *
 *
 * Tower [1, 3, 4]: Manhattan distance = |1 - 0| + |3 - 0| = 4, reachable.
 *
 * Tower [2, 2, 4]: Manhattan distance = |2 - 0| + |2 - 0| = 4, reachable.
 *
 * Tower [4, 4, 7]: Manhattan distance = |4 - 0| + |4 - 0| = 8, not reachable.
 *
 * Among the reachable towers, the maximum quality factor is 4. Both [1, 3] and [2, 2] have the same quality, so the lexicographically smaller coordinate is [1, 3].
 *
 * Example 3:
 *
 * Input: towers = [[5,6,8], [0,3,5]], center = [1,2], radius = 1
 *
 *
 * Output: [-1,-1]
 *
 *
 * Explanation:
 *
 *
 * Tower [5, 6, 8]: Manhattan distance = |5 - 1| + |6 - 2| = 8, not reachable.
 *
 * Tower [0, 3, 5]: Manhattan distance = |0 - 1| + |3 - 2| = 2, not reachable.
 *
 * No tower is reachable within the given radius, so [-1, -1] is returned.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= towers.length &lt;= 105
 *
 * towers[i] = [xi, yi, qi]
 *
 * center = [cx, cy]
 *
 * 0 &lt;= xi, yi, qi, cx, cy &lt;= 105​​​​​​​
 *
 * 0 &lt;= radius &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Iterate through all towers and compute the Manhattan distance <code>abs(xi - cx) + abs(yi - cy)</code>.
 * Hint 2: Consider only towers with distance less than or equal to <code>radius</code>.
 * Hint 3: Track the reachable tower with the highest <code>qi</code>; break ties using lexicographical order on <code>[xi, yi]</code>.
 * Hint 4: If no tower is reachable, return <code>[-1, -1]</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Array).
 *
 * @see <a href="https://leetcode.com/problems/best-reachable-tower/">LeetCode #3809</a>
 */
public class BestReachableTower {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Best Reachable Tower");
    }

    public static void main(String[] args) {
        System.out.println("=== BestReachableTower ===");
        BestReachableTower sol = new BestReachableTower();
        System.out.println(sol.solve(null));
    }
}
