package org.leetcode.medium;


/**
 * <b>#1310 - XOR Queries of a Subarray</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Bit Manipulation, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array arr of positive integers. You are also given the array queries where queries[i] = [lefti, righti].
 *
 *
 * For each query i compute the XOR of elements from lefti to righti (that is, arr[lefti] XOR arr[lefti + 1] XOR ... XOR arr[righti] ).
 *
 *
 * Return an array answer where answer[i] is the answer to the ith query.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: arr = [1,3,4,8], queries = [[0,1],[1,2],[0,3],[3,3]]
 * Output: [2,7,14,8] 
 * Explanation: 
 * The binary representation of the elements in the array are:
 * 1 = 0001 
 * 3 = 0011 
 * 4 = 0100 
 * 8 = 1000 
 * The XOR values for queries are:
 * [0,1] = 1 xor 3 = 2 
 * [1,2] = 3 xor 4 = 7 
 * [0,3] = 1 xor 3 xor 4 xor 8 = 14 
 * [3,3] = 8
 *
 * Example 2:
 *
 * Input: arr = [4,8,2,10], queries = [[2,3],[1,3],[0,0],[0,3]]
 * Output: [8,0,4,4]
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= arr.length, queries.length &lt;= 3 * 104
 *
 * 1 &lt;= arr[i] &lt;= 109
 *
 * queries[i].length == 2
 *
 * 0 &lt;= lefti &lt;= righti &lt; arr.length
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: What is the result of x ^ y ^ x ?
 * Hint 2: Compute the prefix sum for XOR.
 * Hint 3: Process the queries with the prefix sum values.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Bit Manipulation, Prefix Sum).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/xor-queries-of-a-subarray/">LeetCode #1310</a>
 */
public class XorQueriesOfASubarray {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: XOR Queries of a Subarray");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== XorQueriesOfASubarray ===");
        XorQueriesOfASubarray sol = new XorQueriesOfASubarray();
        System.out.println(sol.solve(null));
    }
}
