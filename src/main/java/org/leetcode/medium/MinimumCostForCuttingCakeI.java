package org.leetcode.medium;


/**
 * <b>#3218 - Minimum Cost for Cutting Cake I</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Two Pointers, Dynamic Programming, Greedy, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There is an m x n cake that needs to be cut into 1 x 1 pieces.
 *
 *
 * You are given integers m, n, and two arrays:
 *
 *
 * horizontalCut of size m - 1, where horizontalCut[i] represents the cost to cut along the horizontal line i.
 *
 * verticalCut of size n - 1, where verticalCut[j] represents the cost to cut along the vertical line j.
 *
 * In one operation, you can choose any piece of cake that is not yet a 1 x 1 square and perform one of the following cuts:
 *
 *
 * Cut along a horizontal line i at a cost of horizontalCut[i].
 *
 * Cut along a vertical line j at a cost of verticalCut[j].
 *
 * After the cut, the piece of cake is divided into two distinct pieces.
 *
 *
 * The cost of a cut depends only on the initial cost of the line and does not change.
 *
 *
 * Return the minimum total cost to cut the entire cake into 1 x 1 pieces.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: m = 3, n = 2, horizontalCut = [1,3], verticalCut = [5]
 *
 *
 * Output: 13
 *
 *
 * Explanation:
 *
 *
 * Perform a cut on the vertical line 0 with cost 5, current total cost is 5.
 *
 * Perform a cut on the horizontal line 0 on 3 x 1 subgrid with cost 1.
 *
 * Perform a cut on the horizontal line 0 on 3 x 1 subgrid with cost 1.
 *
 * Perform a cut on the horizontal line 1 on 2 x 1 subgrid with cost 3.
 *
 * Perform a cut on the horizontal line 1 on 2 x 1 subgrid with cost 3.
 *
 * The total cost is 5 + 1 + 1 + 3 + 3 = 13.
 *
 * Example 2:
 *
 * Input: m = 2, n = 2, horizontalCut = [7], verticalCut = [4]
 *
 *
 * Output: 15
 *
 *
 * Explanation:
 *
 *
 * Perform a cut on the horizontal line 0 with cost 7.
 *
 * Perform a cut on the vertical line 0 on 1 x 2 subgrid with cost 4.
 *
 * Perform a cut on the vertical line 0 on 1 x 2 subgrid with cost 4.
 *
 * The total cost is 7 + 4 + 4 = 15.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= m, n &lt;= 20
 *
 * horizontalCut.length == m - 1
 *
 * verticalCut.length == n - 1
 *
 * 1 &lt;= horizontalCut[i], verticalCut[i] &lt;= 103
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The intended solution uses Dynamic Programming.
 * Hint 2: Let <code>dp[sx][sy][tx][ty]</code> denote the minimum cost to cut the rectangle into <code>1 x 1</code> pieces.
 * Hint 3: Iterate on the row or column on which you will perform the next cut, after the cut, the current rectangle will be decomposed into two sub-rectangles.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Two Pointers, Dynamic Programming, Greedy, Sorting).
 *
 * @see <a href="https://leetcode.com/problems/minimum-cost-for-cutting-cake-i/">LeetCode #3218</a>
 */
public class MinimumCostForCuttingCakeI {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Minimum Cost for Cutting Cake I");
    }

    public static void main(String[] args) {
        System.out.println("=== MinimumCostForCuttingCakeI ===");
        MinimumCostForCuttingCakeI sol = new MinimumCostForCuttingCakeI();
        System.out.println(sol.solve(null));
    }
}
