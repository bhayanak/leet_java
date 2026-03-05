package org.leetcode.medium;


/**
 * <b>#2438 - Range Product Queries of Powers</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Bit Manipulation, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given a positive integer n, there exists a 0-indexed array called powers, composed of the minimum number of powers of 2 that sum to n. The array is sorted in non-decreasing order, and there is only one way to form the array.
 *
 *
 * You are also given a 0-indexed 2D integer array queries, where queries[i] = [lefti, righti]. Each queries[i] represents a query where you have to find the product of all powers[j] with lefti &lt;= j &lt;= righti.
 *
 *
 * Return an array answers, equal in length to queries, where answers[i] is the answer to the ith query. Since the answer to the ith query may be too large, each answers[i] should be returned modulo 109 + 7.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 15, queries = [[0,1],[2,2],[0,3]]
 * Output: [2,4,64]
 * Explanation:
 * For n = 15, powers = [1,2,4,8]. It can be shown that powers cannot be a smaller size.
 * Answer to 1st query: powers[0] * powers[1] = 1 * 2 = 2.
 * Answer to 2nd query: powers[2] = 4.
 * Answer to 3rd query: powers[0] * powers[1] * powers[2] * powers[3] = 1 * 2 * 4 * 8 = 64.
 * Each answer modulo 109 + 7 yields the same answer, so [2,4,64] is returned.
 *
 * Example 2:
 *
 * Input: n = 2, queries = [[0,0]]
 * Output: [2]
 * Explanation:
 * For n = 2, powers = [2].
 * The answer to the only query is powers[0] = 2. The answer modulo 109 + 7 is the same, so [2] is returned.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 109
 *
 * 1 &lt;= queries.length &lt;= 105
 *
 * 0 &lt;= starti &lt;= endi &lt; powers.length
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: The <code>powers</code> array can be created using the binary representation of <code>n</code>.
 * Hint 2: Once <code>powers</code> is formed, the products can be taken using brute force.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Bit Manipulation, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/range-product-queries-of-powers/">LeetCode #2438</a>
 */
public class RangeProductQueriesOfPowers {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Range Product Queries of Powers");
    }

    public static void main(String[] args) {
        System.out.println("=== RangeProductQueriesOfPowers ===");
        RangeProductQueriesOfPowers sol = new RangeProductQueriesOfPowers();
        System.out.println(sol.solve(null));
    }
}
