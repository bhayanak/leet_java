package org.leetcode.hard;


/**
 * <b>#1735 - Count Ways to Make Array With Product</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Math, Dynamic Programming, Combinatorics, Number Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a 2D integer array, queries. For each queries[i], where queries[i] = [ni, ki], find the number of different ways you can place positive integers into an array of size ni such that the product of the integers is ki. As the number of ways may be too large, the answer to the ith query is the number of ways modulo 109 + 7.
 *
 *
 * Return an integer array answer where answer.length == queries.length, and answer[i] is the answer to the ith query.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: queries = [[2,6],[5,1],[73,660]]
 * Output: [4,1,50734910]
 * Explanation: Each query is independent.
 * [2,6]: There are 4 ways to fill an array of size 2 that multiply to 6: [1,6], [2,3], [3,2], [6,1].
 * [5,1]: There is 1 way to fill an array of size 5 that multiply to 1: [1,1,1,1,1].
 * [73,660]: There are 1050734917 ways to fill an array of size 73 that multiply to 660. 1050734917 modulo 109 + 7 = 50734910.
 *
 * Example 2:
 *
 * Input: queries = [[1,1],[2,2],[3,3],[4,4],[5,5]]
 * Output: [1,2,3,10,5]
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= queries.length &lt;= 104 
 *
 * 1 &lt;= ni, ki &lt;= 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Prime-factorize ki and count how many ways you can distribute the primes among the ni positions.
 * Hint 2: After prime factorizing ki, suppose there are x amount of prime factor. There are (x + n - 1) choose (n - 1) ways to distribute the x prime factors into n positions, allowing repetitions.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Dynamic Programming, Combinatorics, Number Theory).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/count-ways-to-make-array-with-product/">LeetCode #1735</a>
 */
public class CountWaysToMakeArrayWithProduct {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Ways to Make Array With Product");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== CountWaysToMakeArrayWithProduct ===");
        CountWaysToMakeArrayWithProduct sol = new CountWaysToMakeArrayWithProduct();
        System.out.println(sol.solve(null));
    }
}
