package org.leetcode.medium;


/**
 * <b>#3075 - Maximize Happiness of Selected Children</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Greedy, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array happiness of length n, and a positive integer k.
 *
 *
 * There are n children standing in a queue, where the ith child has happiness value happiness[i]. You want to select k children from these n children in k turns.
 *
 *
 * In each turn, when you select a child, the happiness value of all the children that have not been selected till now decreases by 1. Note that the happiness value cannot become negative and gets decremented only if it is positive.
 *
 *
 * Return the maximum sum of the happiness values of the selected children you can achieve by selecting k children.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: happiness = [1,2,3], k = 2
 * Output: 4
 * Explanation: We can pick 2 children in the following way:
 * - Pick the child with the happiness value == 3. The happiness value of the remaining children becomes [0,1].
 * - Pick the child with the happiness value == 1. The happiness value of the remaining child becomes [0]. Note that the happiness value cannot become less than 0.
 * The sum of the happiness values of the selected children is 3 + 1 = 4.
 *
 * Example 2:
 *
 * Input: happiness = [1,1,1,1], k = 2
 * Output: 1
 * Explanation: We can pick 2 children in the following way:
 * - Pick any child with the happiness value == 1. The happiness value of the remaining children becomes [0,0,0].
 * - Pick the child with the happiness value == 0. The happiness value of the remaining child becomes [0,0].
 * The sum of the happiness values of the selected children is 1 + 0 = 1.
 *
 * Example 3:
 *
 * Input: happiness = [2,3,4,5], k = 1
 * Output: 5
 * Explanation: We can pick 1 child in the following way:
 * - Pick the child with the happiness value == 5. The happiness value of the remaining children becomes [1,2,3].
 * The sum of the happiness values of the selected children is 5.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n == happiness.length &lt;= 2 * 105
 *
 * 1 &lt;= happiness[i] &lt;= 108
 *
 * 1 &lt;= k &lt;= n
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Since all the unselected numbers are decreasing at the same rate, we should greedily select <code>k</code> largest values.
 * Hint 2: The <code>i<sup>th</sup></code> largest number (<code>i = 1, 2, 3,…k</code>) should decrease by <code>(i - 1)</code> when it is picked.
 * Hint 3: Add <code>0</code> if the decreased value is negative.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Greedy, Sorting).
 *
 * @see <a href="https://leetcode.com/problems/maximize-happiness-of-selected-children/">LeetCode #3075</a>
 */
public class MaximizeHappinessOfSelectedChildren {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximize Happiness of Selected Children");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximizeHappinessOfSelectedChildren ===");
        MaximizeHappinessOfSelectedChildren sol = new MaximizeHappinessOfSelectedChildren();
        System.out.println(sol.solve(null));
    }
}
