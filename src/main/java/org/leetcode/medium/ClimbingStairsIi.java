package org.leetcode.medium;


/**
 * <b>#3693 - Climbing Stairs II</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are climbing a staircase with n + 1 steps, numbered from 0 to n.
 *
 *
 * You are also given a 1-indexed integer array costs of length n, where costs[i] is the cost of step i.
 *
 *
 * From step i, you can jump only to step i + 1, i + 2, or i + 3. The cost of jumping from step i to step j is defined as: costs[j] + (j - i)2
 *
 *
 * You start from step 0 with cost = 0.
 *
 *
 * Return the minimum total cost to reach step n.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 4, costs = [1,2,3,4]
 *
 *
 * Output: 13
 *
 *
 * Explanation:
 *
 *
 * One optimal path is 0 → 1 → 2 → 4
 *
 *
 *
 *
 *
 * 			Jump
 * 			Cost Calculation
 * 			Cost
 *
 *
 *
 *
 *
 *
 * 			0 → 1
 * 			costs[1] + (1 - 0)2 = 1 + 1
 * 			2
 *
 *
 *
 *
 * 			1 → 2
 * 			costs[2] + (2 - 1)2 = 2 + 1
 * 			3
 *
 *
 *
 *
 * 			2 → 4
 * 			costs[4] + (4 - 2)2 = 4 + 4
 * 			8
 *
 *
 *
 *
 * Thus, the minimum total cost is 2 + 3 + 8 = 13
 *
 * Example 2:
 *
 * Input: n = 4, costs = [5,1,6,2]
 *
 *
 * Output: 11
 *
 *
 * Explanation:
 *
 *
 * One optimal path is 0 → 2 → 4
 *
 *
 *
 *
 *
 * 			Jump
 * 			Cost Calculation
 * 			Cost
 *
 *
 *
 *
 *
 *
 * 			0 → 2
 * 			costs[2] + (2 - 0)2 = 1 + 4
 * 			5
 *
 *
 *
 *
 * 			2 → 4
 * 			costs[4] + (4 - 2)2 = 2 + 4
 * 			6
 *
 *
 *
 *
 * Thus, the minimum total cost is 5 + 6 = 11
 *
 * Example 3:
 *
 * Input: n = 3, costs = [9,8,3]
 *
 *
 * Output: 12
 *
 *
 * Explanation:
 *
 *
 * The optimal path is 0 → 3 with total cost = costs[3] + (3 - 0)2 = 3 + 9 = 12
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n == costs.length &lt;= 105​​​​​​​
 *
 * 1 &lt;= costs[i] &lt;= 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use dynamic programming where <code>dp[j]</code> represents the minimum cost to reach step <code>j</code>.
 * Hint 2: From step <code>i</code>, you can jump to <code>i+1</code>, <code>i+2</code>, or <code>i+3</code>. Transition depends only on the previous three states.
 * Hint 3: <code>dp[j] = min(dp[i] + costs[j] + (j - i)<sup>2</sup>)</code> for all <code>i</code> in {<code>j-1</code>, <code>j-2</code>, <code>j-3</code>}.
 * Hint 4: Initialize <code>dp[0] = 0</code> and compute up to <code>dp[n]</code>; the answer is <code>dp[n]</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming).
 *
 * @see <a href="https://leetcode.com/problems/climbing-stairs-ii/">LeetCode #3693</a>
 */
public class ClimbingStairsIi {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Climbing Stairs II");
    }

    public static void main(String[] args) {
        System.out.println("=== ClimbingStairsIi ===");
        ClimbingStairsIi sol = new ClimbingStairsIi();
        System.out.println(sol.solve(null));
    }
}
