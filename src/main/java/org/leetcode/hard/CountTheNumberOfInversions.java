package org.leetcode.hard;


/**
 * <b>#3193 - Count the Number of Inversions</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer n and a 2D array requirements, where requirements[i] = [endi, cnti] represents the end index and the inversion count of each requirement.
 *
 *
 * A pair of indices (i, j) from an integer array nums is called an inversion if:
 *
 *
 * i &lt; j and nums[i] &gt; nums[j]
 *
 * Return the number of permutations perm of [0, 1, 2, ..., n - 1] such that for all requirements[i], perm[0..endi] has exactly cnti inversions.
 *
 *
 * Since the answer may be very large, return it modulo 109 + 7.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 3, requirements = [[2,2],[0,0]]
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * The two permutations are:
 *
 *
 * [2, 0, 1]
 *
 *
 *
 *
 * Prefix [2, 0, 1] has inversions (0, 1) and (0, 2).
 *
 * Prefix [2] has 0 inversions.
 *
 *
 *
 * [1, 2, 0]
 *
 *
 *
 * Prefix [1, 2, 0] has inversions (0, 2) and (1, 2).
 *
 * Prefix [1] has 0 inversions.
 *
 *
 *
 * Example 2:
 *
 * Input: n = 3, requirements = [[2,2],[1,1],[0,0]]
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * The only satisfying permutation is [2, 0, 1]:
 *
 *
 * Prefix [2, 0, 1] has inversions (0, 1) and (0, 2).
 *
 * Prefix [2, 0] has an inversion (0, 1).
 *
 * Prefix [2] has 0 inversions.
 *
 * Example 3:
 *
 * Input: n = 2, requirements = [[0,0],[1,0]]
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * The only satisfying permutation is [0, 1]:
 *
 *
 * Prefix [0] has 0 inversions.
 *
 * Prefix [0, 1] has no inversions.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= n &lt;= 300
 *
 * 1 &lt;= requirements.length &lt;= n
 *
 * requirements[i] = [endi, cnti]
 *
 * 0 &lt;= endi &lt;= n - 1
 *
 * 0 &lt;= cnti &lt;= 400
 *
 * The input is generated such that there is at least one i such that endi == n - 1.
 *
 * The input is generated such that all endi are unique.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Let <code>dp[i][j]</code> denote the number of arrays of length <code>i</code> with <code>j</code> inversions.
 * Hint 2: <code>dp[i][j] = dp[i - 1][j] + dp[i - 1][j - 1] + … + dp[i - 1][0]</code>.
 * Hint 3: <code>dp[i][j] = 0</code> if for some <code>x</code>, <code>requirements[x][0] == i</code> and <code>requirements[x][1] != j</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming).
 *
 * @see <a href="https://leetcode.com/problems/count-the-number-of-inversions/">LeetCode #3193</a>
 */
public class CountTheNumberOfInversions {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count the Number of Inversions");
    }

    public static void main(String[] args) {
        System.out.println("=== CountTheNumberOfInversions ===");
        CountTheNumberOfInversions sol = new CountTheNumberOfInversions();
        System.out.println(sol.solve(null));
    }
}
