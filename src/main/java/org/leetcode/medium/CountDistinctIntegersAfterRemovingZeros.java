package org.leetcode.medium;


/**
 * <b>#3747 - Count Distinct Integers After Removing Zeros</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Math, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a positive integer n.
 *
 *
 * For every integer x from 1 to n, we write down the integer obtained by removing all zeros from the decimal representation of x.
 *
 *
 * Return an integer denoting the number of distinct integers written down.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 10
 *
 *
 * Output: 9
 *
 *
 * Explanation:
 *
 *
 * The integers we wrote down are 1, 2, 3, 4, 5, 6, 7, 8, 9, 1. There are 9 distinct integers (1, 2, 3, 4, 5, 6, 7, 8, 9).
 *
 * Example 2:
 *
 * Input: n = 3
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 * The integers we wrote down are 1, 2, 3. There are 3 distinct integers (1, 2, 3).
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 1015
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Build integers less than or equal to <code>n</code> using only digits from 1 to 9
 * Hint 2: Count such integers using math or digit DP
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Dynamic Programming).
 *
 * @see <a href="https://leetcode.com/problems/count-distinct-integers-after-removing-zeros/">LeetCode #3747</a>
 */
public class CountDistinctIntegersAfterRemovingZeros {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Distinct Integers After Removing Zeros");
    }

    public static void main(String[] args) {
        System.out.println("=== CountDistinctIntegersAfterRemovingZeros ===");
        CountDistinctIntegersAfterRemovingZeros sol = new CountDistinctIntegersAfterRemovingZeros();
        System.out.println(sol.solve(null));
    }
}
