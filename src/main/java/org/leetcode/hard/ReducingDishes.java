package org.leetcode.hard;


/**
 * <b>#1402 - Reducing Dishes</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Greedy, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * A chef has collected data on the satisfaction level of his n dishes. Chef can cook any dish in 1 unit of time.
 *
 *
 * Like-time coefficient of a dish is defined as the time taken to cook that dish including previous dishes multiplied by its satisfaction level i.e. time[i] * satisfaction[i].
 *
 *
 * Return the maximum sum of like-time coefficient that the chef can obtain after preparing some amount of dishes.
 *
 *
 * Dishes can be prepared in any order and the chef can discard some dishes to get this maximum value.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: satisfaction = [-1,-8,0,5,-9]
 * Output: 14
 * Explanation: After Removing the second and last dish, the maximum total like-time coefficient will be equal to (-1*1 + 0*2 + 5*3 = 14).
 * Each dish is prepared in one unit of time.
 *
 * Example 2:
 *
 * Input: satisfaction = [4,3,2]
 * Output: 20
 * Explanation: Dishes can be prepared in any order, (2*1 + 3*2 + 4*3 = 20)
 *
 * Example 3:
 *
 * Input: satisfaction = [-1,-4,-5]
 * Output: 0
 * Explanation: People do not like the dishes. No dish is prepared.
 *
 *
 *
 * Constraints:
 *
 *
 * n == satisfaction.length
 *
 * 1 &lt;= n &lt;= 500
 *
 * -1000 &lt;= satisfaction[i] &lt;= 1000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use dynamic programming to find the optimal solution by saving the previous best like-time coefficient and its corresponding element sum.
 * Hint 2: If adding the current element to the previous best like-time coefficient and its corresponding element sum would increase the best like-time coefficient, then go ahead and add it. Otherwise, keep the previous best like-time coefficient.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Greedy, Sorting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/reducing-dishes/">LeetCode #1402</a>
 */
public class ReducingDishes {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Reducing Dishes");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== ReducingDishes ===");
        ReducingDishes sol = new ReducingDishes();
        System.out.println(sol.solve(null));
    }
}
