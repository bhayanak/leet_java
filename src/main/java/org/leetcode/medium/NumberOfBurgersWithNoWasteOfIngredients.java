package org.leetcode.medium;


/**
 * <b>#1276 - Number of Burgers with No Waste of Ingredients</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Math</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given two integers tomatoSlices and cheeseSlices. The ingredients of different burgers are as follows:
 *
 *
 * Jumbo Burger: 4 tomato slices and 1 cheese slice.
 *
 * Small Burger: 2 Tomato slices and 1 cheese slice.
 *
 * Return [total_jumbo, total_small] so that the number of remaining tomatoSlices equal to 0 and the number of remaining cheeseSlices equal to 0. If it is not possible to make the remaining tomatoSlices and cheeseSlices equal to 0 return [].
 *
 *
 *
 *
 * Example 1:
 *
 * Input: tomatoSlices = 16, cheeseSlices = 7
 * Output: [1,6]
 * Explantion: To make one jumbo burger and 6 small burgers we need 4*1 + 2*6 = 16 tomato and 1 + 6 = 7 cheese.
 * There will be no remaining ingredients.
 *
 * Example 2:
 *
 * Input: tomatoSlices = 17, cheeseSlices = 4
 * Output: []
 * Explantion: There will be no way to use all ingredients to make small and jumbo burgers.
 *
 * Example 3:
 *
 * Input: tomatoSlices = 4, cheeseSlices = 17
 * Output: []
 * Explantion: Making 1 jumbo burger there will be 16 cheese remaining and making 2 small burgers there will be 15 cheese remaining.
 *
 *
 *
 * Constraints:
 *
 *
 * 0 &lt;= tomatoSlices, cheeseSlices &lt;= 107
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Can we have an answer if the number of tomatoes is odd ?
 * Hint 2: If we have answer will be there multiple answers or just one answer ?
 * Hint 3: Let us define number of jumbo burgers as X and number of small burgers as Y
We have to find an x and y in this equation
 * Hint 4: 1. 4X + 2Y = tomato
 * Hint 5: 2. X + Y = cheese
 *
 * <h2>Approach</h2>
 * Think about the category (Math).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/number-of-burgers-with-no-waste-of-ingredients/">LeetCode #1276</a>
 */
public class NumberOfBurgersWithNoWasteOfIngredients {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Number of Burgers with No Waste of Ingredients");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== NumberOfBurgersWithNoWasteOfIngredients ===");
        NumberOfBurgersWithNoWasteOfIngredients sol = new NumberOfBurgersWithNoWasteOfIngredients();
        System.out.println(sol.solve(null));
    }
}
