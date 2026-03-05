package org.leetcode.medium;


/**
 * <b>#1561 - Maximum Number of Coins You Can Get</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Math, Greedy, Sorting, Game Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * There are 3n piles of coins of varying size, you and your friends will take piles of coins as follows:
 *
 *
 * In each step, you will choose any 3 piles of coins (not necessarily consecutive).
 *
 * Of your choice, Alice will pick the pile with the maximum number of coins.
 *
 * You will pick the next pile with the maximum number of coins.
 *
 * Your friend Bob will pick the last pile.
 *
 * Repeat until there are no more piles of coins.
 *
 * Given an array of integers piles where piles[i] is the number of coins in the ith pile.
 *
 *
 * Return the maximum number of coins that you can have.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: piles = [2,4,1,2,7,8]
 * Output: 9
 * Explanation: Choose the triplet (2, 7, 8), Alice Pick the pile with 8 coins, you the pile with 7 coins and Bob the last one.
 * Choose the triplet (1, 2, 4), Alice Pick the pile with 4 coins, you the pile with 2 coins and Bob the last one.
 * The maximum number of coins which you can have are: 7 + 2 = 9.
 * On the other hand if we choose this arrangement (1, 2, 8), (2, 4, 7) you only get 2 + 4 = 6 coins which is not optimal.
 *
 * Example 2:
 *
 * Input: piles = [2,4,5]
 * Output: 4
 *
 * Example 3:
 *
 * Input: piles = [9,8,7,6,5,1,2,3,4]
 * Output: 18
 *
 *
 *
 * Constraints:
 *
 *
 * 3 &lt;= piles.length &lt;= 105
 *
 * piles.length % 3 == 0
 *
 * 1 &lt;= piles[i] &lt;= 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Which pile of coins will you never be able to pick up?
 * Hint 2: Bob is forced to take the last pile of coins, no matter what it is. Which pile should you give to him?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Greedy, Sorting, Game Theory).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/maximum-number-of-coins-you-can-get/">LeetCode #1561</a>
 */
public class MaximumNumberOfCoinsYouCanGet {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Number of Coins You Can Get");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== MaximumNumberOfCoinsYouCanGet ===");
        MaximumNumberOfCoinsYouCanGet sol = new MaximumNumberOfCoinsYouCanGet();
        System.out.println(sol.solve(null));
    }
}
