package org.leetcode.medium;


/**
 * <b>#2554 - Maximum Number of Integers to Choose From a Range I</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Binary Search, Greedy, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array banned and two integers n and maxSum. You are choosing some number of integers following the below rules:
 *
 *
 * The chosen integers have to be in the range [1, n].
 *
 * Each integer can be chosen at most once.
 *
 * The chosen integers should not be in the array banned.
 *
 * The sum of the chosen integers should not exceed maxSum.
 *
 * Return the maximum number of integers you can choose following the mentioned rules.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: banned = [1,6,5], n = 5, maxSum = 6
 * Output: 2
 * Explanation: You can choose the integers 2 and 4.
 * 2 and 4 are from the range [1, 5], both did not appear in banned, and their sum is 6, which did not exceed maxSum.
 *
 * Example 2:
 *
 * Input: banned = [1,2,3,4,5,6,7], n = 8, maxSum = 1
 * Output: 0
 * Explanation: You cannot choose any integer while following the mentioned conditions.
 *
 * Example 3:
 *
 * Input: banned = [11], n = 7, maxSum = 50
 * Output: 7
 * Explanation: You can choose the integers 1, 2, 3, 4, 5, 6, and 7.
 * They are from the range [1, 7], all did not appear in banned, and their sum is 28, which did not exceed maxSum.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= banned.length &lt;= 104
 *
 * 1 &lt;= banned[i], n &lt;= 104
 *
 * 1 &lt;= maxSum &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Keep the banned numbers that are less than or equal to n in a set.
 * Hint 2: Loop over the numbers from 1 to n and if the number is not banned, use it.
 * Hint 3: Keep adding numbers while they are not banned, and their sum is less than or equal to k.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Binary Search, Greedy, Sorting).
 *
 * @see <a href="https://leetcode.com/problems/maximum-number-of-integers-to-choose-from-a-range-i/">LeetCode #2554</a>
 */
public class MaximumNumberOfIntegersToChooseFromARangeI {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Maximum Number of Integers to Choose From a Range I");
    }

    public static void main(String[] args) {
        System.out.println("=== MaximumNumberOfIntegersToChooseFromARangeI ===");
        MaximumNumberOfIntegersToChooseFromARangeI sol = new MaximumNumberOfIntegersToChooseFromARangeI();
        System.out.println(sol.solve(null));
    }
}
