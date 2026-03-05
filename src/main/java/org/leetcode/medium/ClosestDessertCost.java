package org.leetcode.medium;


/**
 * <b>#1774 - Closest Dessert Cost</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Dynamic Programming, Backtracking</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You would like to make dessert and are preparing to buy the ingredients. You have n ice cream base flavors and m types of toppings to choose from. You must follow these rules when making your dessert:
 *
 *
 * There must be exactly one ice cream base.
 *
 * You can add one or more types of topping or have no toppings at all.
 *
 * There are at most two of each type of topping.
 *
 * You are given three inputs:
 *
 *
 * baseCosts, an integer array of length n, where each baseCosts[i] represents the price of the ith ice cream base flavor.
 *
 * toppingCosts, an integer array of length m, where each toppingCosts[i] is the price of one of the ith topping.
 *
 * target, an integer representing your target price for dessert.
 *
 * You want to make a dessert with a total cost as close to target as possible.
 *
 *
 * Return the closest possible cost of the dessert to target. If there are multiple, return the lower one.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: baseCosts = [1,7], toppingCosts = [3,4], target = 10
 * Output: 10
 * Explanation: Consider the following combination (all 0-indexed):
 * - Choose base 1: cost 7
 * - Take 1 of topping 0: cost 1 x 3 = 3
 * - Take 0 of topping 1: cost 0 x 4 = 0
 * Total: 7 + 3 + 0 = 10.
 *
 * Example 2:
 *
 * Input: baseCosts = [2,3], toppingCosts = [4,5,100], target = 18
 * Output: 17
 * Explanation: Consider the following combination (all 0-indexed):
 * - Choose base 1: cost 3
 * - Take 1 of topping 0: cost 1 x 4 = 4
 * - Take 2 of topping 1: cost 2 x 5 = 10
 * - Take 0 of topping 2: cost 0 x 100 = 0
 * Total: 3 + 4 + 10 + 0 = 17. You cannot make a dessert with a total cost of 18.
 *
 * Example 3:
 *
 * Input: baseCosts = [3,10], toppingCosts = [2,5], target = 9
 * Output: 8
 * Explanation: It is possible to make desserts with cost 8 and 10. Return 8 as it is the lower cost.
 *
 *
 *
 * Constraints:
 *
 *
 * n == baseCosts.length
 *
 * m == toppingCosts.length
 *
 * 1 &lt;= n, m &lt;= 10
 *
 * 1 &lt;= baseCosts[i], toppingCosts[i] &lt;= 104
 *
 * 1 &lt;= target &lt;= 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: As the constraints are not large, you can brute force and enumerate all the possibilities.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming, Backtracking).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/closest-dessert-cost/">LeetCode #1774</a>
 */
public class ClosestDessertCost {

    /**
     * Returns the closest possible cost of the dessert to the target.
     *
     * @param baseCosts array of base costs
     * @param toppingCosts array of topping costs
     * @param target target price for dessert
     * @return closest possible cost to target (lower if tie)
     *
     * <p><b>Explanation:</b> Brute-forces all topping combinations for each base, tracking the closest sum to target. Optimizations may include pruning or DP for larger constraints.</p>
     */
    public int closestDessertCost(int[] baseCosts, int[] toppingCosts, int target) {
        // Implementation goes here
        throw new UnsupportedOperationException("Not yet implemented: Closest Dessert Cost");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== ClosestDessertCost ===");
        ClosestDessertCost sol = new ClosestDessertCost();
        System.out.println(sol.closestDessertCost(new int[]{1,7}, new int[]{3,4}, 10)); // 10
        System.out.println(sol.closestDessertCost(new int[]{2,3}, new int[]{4,5,100}, 18)); // 17
        System.out.println(sol.closestDessertCost(new int[]{3,10}, new int[]{2,5}, 9)); // 8
    }
}
