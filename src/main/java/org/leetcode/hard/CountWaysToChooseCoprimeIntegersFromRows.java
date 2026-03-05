package org.leetcode.hard;


/**
 * <b>#3725 - Count Ways to Choose Coprime Integers from Rows</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Math, Dynamic Programming, Matrix, Combinatorics, Number Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a m x n matrix mat of positive integers.
 *
 *
 * Return an integer denoting the number of ways to choose exactly one integer from each row of mat such that the greatest common divisor of all chosen integers is 1.
 *
 *
 * Since the answer may be very large, return it modulo 109 + 7.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: mat = [[1,2],[3,4]]
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 *
 *
 *
 * 			Chosen integer in the first row
 * 			Chosen integer in the second row
 * 			Greatest common divisor of chosen integers
 *
 *
 *
 *
 * 			1
 * 			3
 * 			1
 *
 *
 *
 *
 * 			1
 * 			4
 * 			1
 *
 *
 *
 *
 * 			2
 * 			3
 * 			1
 *
 *
 *
 *
 * 			2
 * 			4
 * 			2
 *
 *
 *
 *
 * 3 of these combinations have a greatest common divisor of 1. Therefore, the answer is 3.
 *
 * Example 2:
 *
 * Input: mat = [[2,2],[2,2]]
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 *
 * Every combination has a greatest common divisor of 2. Therefore, the answer is 0.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= m == mat.length &lt;= 150
 *
 * 1 &lt;= n == mat[i].length &lt;= 150
 *
 * 1 &lt;= mat[i][j] &lt;= 150
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use dynamic programming.
 * Hint 2: Use <code>dp[row][g]</code>, where <code>row</code> is the current row and <code>g</code> is the current gcd value.
 * Hint 3: Initialize the first row: for each value <code>v</code> in row 0 do <code>dp[0][v] += 1</code>.
 * Hint 4: For a row <code>i</code>, use the values from the previous row <code>i - 1</code> to build the values: for each previous gcd <code>g</code> and each value <code>v</code> in row <code>i</code>.
 * Hint 5: The final answer is <code>dp[n-1][1]</code> (number of ways with gcd 1).
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Dynamic Programming, Matrix, Combinatorics, Number Theory).
 *
 * @see <a href="https://leetcode.com/problems/count-ways-to-choose-coprime-integers-from-rows/">LeetCode #3725</a>
 */
public class CountWaysToChooseCoprimeIntegersFromRows {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Ways to Choose Coprime Integers from Rows");
    }

    public static void main(String[] args) {
        System.out.println("=== CountWaysToChooseCoprimeIntegersFromRows ===");
        CountWaysToChooseCoprimeIntegersFromRows sol = new CountWaysToChooseCoprimeIntegersFromRows();
        System.out.println(sol.solve(null));
    }
}
