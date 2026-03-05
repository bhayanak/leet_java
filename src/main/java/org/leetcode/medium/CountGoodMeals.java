package org.leetcode.medium;


/**
 * <b>#1711 - Count Good Meals</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * A good meal is a meal that contains exactly two different food items with a sum of deliciousness equal to a power of two.
 *
 *
 * You can pick any two different foods to make a good meal.
 *
 *
 * Given an array of integers deliciousness where deliciousness[i] is the deliciousness of the i​​​​​​th​​​​​​​​ item of food, return the number of different good meals you can make from this list modulo 109 + 7.
 *
 *
 * Note that items with different indices are considered different even if they have the same deliciousness value.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: deliciousness = [1,3,5,7,9]
 * Output: 4
 * Explanation: The good meals are (1,3), (1,7), (3,5) and, (7,9).
 * Their respective sums are 4, 8, 8, and 16, all of which are powers of 2.
 *
 * Example 2:
 *
 * Input: deliciousness = [1,1,1,3,3,3,7]
 * Output: 15
 * Explanation: The good meals are (1,1) with 3 ways, (1,3) with 9 ways, and (1,7) with 3 ways.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= deliciousness.length &lt;= 105
 *
 * 0 &lt;= deliciousness[i] &lt;= 220
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Note that the number of powers of 2 is at most 21 so this turns the problem to a classic find the number of pairs that sum to a certain value but for 21 values
 * Hint 2: You need to use something fasters than the NlogN approach since there is already the log of iterating over the powers so one idea is two pointers
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/count-good-meals/">LeetCode #1711</a>
 */
public class CountGoodMeals {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Good Meals");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== CountGoodMeals ===");
        CountGoodMeals sol = new CountGoodMeals();
        System.out.println(sol.solve(null));
    }
}
