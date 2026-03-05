package org.leetcode.medium;


/**
 * <b>#3669 - Balanced K-Factor Decomposition</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Math, Backtracking, Number Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given two integers n and k, split the number n into exactly k positive integers such that the product of these integers is equal to n.
 *
 *
 * Return any one split in which the maximum difference between any two numbers is minimized. You may return the result in any order.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 100, k = 2
 *
 *
 * Output: [10,10]
 *
 *
 * Explanation:
 *
 *
 * The split [10, 10] yields 10 * 10 = 100 and a max-min difference of 0, which is minimal.
 *
 * Example 2:
 *
 * Input: n = 44, k = 3
 *
 *
 * Output: [2,2,11]
 *
 *
 * Explanation:
 *
 *
 * Split [1, 1, 44] yields a difference of 43
 *
 * Split [1, 2, 22] yields a difference of 21
 *
 * Split [1, 4, 11] yields a difference of 10
 *
 * Split [2, 2, 11] yields a difference of 9
 *
 * Therefore, [2, 2, 11] is the optimal split with the smallest difference 9.
 *
 *
 *
 * Constraints:
 *
 *
 * 4 &lt;= n &lt;= 105
 *
 * 2 &lt;= k &lt;= 5
 *
 * k is strictly less than the total number of positive divisors of n.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: First, compute all positive divisors of <code>n</code> and sort them into a list <code>divs</code>.
 * Hint 2: Use a recursive search <code>dfs(start, picked, prod, path)</code> that picks the next divisor from <code>divs[start...]</code>, multiplies it into <code>prod</code>, and appends to <code>path</code> until you have <code>k</code> factors whose product is <code>n</code>.
 * Hint 3: During the search, keep track of the best <code>path</code> that minimizes max(path) – min(path) and return it.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Backtracking, Number Theory).
 *
 * @see <a href="https://leetcode.com/problems/balanced-k-factor-decomposition/">LeetCode #3669</a>
 */
public class BalancedKFactorDecomposition {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Balanced K-Factor Decomposition");
    }

    public static void main(String[] args) {
        System.out.println("=== BalancedKFactorDecomposition ===");
        BalancedKFactorDecomposition sol = new BalancedKFactorDecomposition();
        System.out.println(sol.solve(null));
    }
}
