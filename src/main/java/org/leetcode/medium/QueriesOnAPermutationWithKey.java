package org.leetcode.medium;


/**
 * <b>#1409 - Queries on a Permutation With Key</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Binary Indexed Tree, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given the array queries of positive integers between 1 and m, you have to process all queries[i] (from i=0 to i=queries.length-1) according to the following rules:
 *
 *
 * In the beginning, you have the permutation P=[1,2,3,...,m].
 *
 * For the current i, find the position of queries[i] in the permutation P (indexing from 0) and then move this at the beginning of the permutation P. Notice that the position of queries[i] in P is the result for queries[i].
 *
 * Return an array containing the result for the given queries.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: queries = [3,1,2,1], m = 5
 * Output: [2,1,2,1] 
 * Explanation: The queries are processed as follow: 
 * For i=0: queries[i]=3, P=[1,2,3,4,5], position of 3 in P is 2, then we move 3 to the beginning of P resulting in P=[3,1,2,4,5]. 
 * For i=1: queries[i]=1, P=[3,1,2,4,5], position of 1 in P is 1, then we move 1 to the beginning of P resulting in P=[1,3,2,4,5]. 
 * For i=2: queries[i]=2, P=[1,3,2,4,5], position of 2 in P is 2, then we move 2 to the beginning of P resulting in P=[2,1,3,4,5]. 
 * For i=3: queries[i]=1, P=[2,1,3,4,5], position of 1 in P is 1, then we move 1 to the beginning of P resulting in P=[1,2,3,4,5]. 
 * Therefore, the array containing the result is [2,1,2,1].  
 *
 * Example 2:
 *
 * Input: queries = [4,1,2,2], m = 4
 * Output: [3,1,2,0]
 *
 * Example 3:
 *
 * Input: queries = [7,5,5,8,3], m = 8
 * Output: [6,5,0,7,5]
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= m &lt;= 10^3
 *
 * 1 &lt;= queries.length &lt;= m
 *
 * 1 &lt;= queries[i] &lt;= m
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Create the permutation P=[1,2,...,m], it could be a list for example.
 * Hint 2: For each i, find the position of queries[i] with a simple scan over P and then move this to the beginning.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Indexed Tree, Simulation).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/queries-on-a-permutation-with-key/">LeetCode #1409</a>
 */
public class QueriesOnAPermutationWithKey {

    public static class TreeNode {
        int val; TreeNode left, right;
        TreeNode(int v) { val = v; }
    }
    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Queries on a Permutation With Key");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== QueriesOnAPermutationWithKey ===");
        QueriesOnAPermutationWithKey sol = new QueriesOnAPermutationWithKey();
        System.out.println(sol.solve(null));
    }
}
