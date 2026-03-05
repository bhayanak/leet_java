package org.leetcode.medium;


/**
 * <b>#1202 - Smallest String With Swaps</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, String, Depth-First Search, Breadth-First Search, Union-Find, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a string s, and an array of pairs of indices in the string pairs where pairs[i] = [a, b] indicates 2 indices(0-indexed) of the string.
 *
 *
 * You can swap the characters at any pair of indices in the given pairs any number of times.
 *
 *
 * Return the lexicographically smallest string that s can be changed to after using the swaps.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "dcab", pairs = [[0,3],[1,2]]
 * Output: "bacd"
 * Explaination: 
 * Swap s[0] and s[3], s = "bcad"
 * Swap s[1] and s[2], s = "bacd"
 *
 * Example 2:
 *
 * Input: s = "dcab", pairs = [[0,3],[1,2],[0,2]]
 * Output: "abcd"
 * Explaination: 
 * Swap s[0] and s[3], s = "bcad"
 * Swap s[0] and s[2], s = "acbd"
 * Swap s[1] and s[2], s = "abcd"
 *
 * Example 3:
 *
 * Input: s = "cba", pairs = [[0,1],[1,2]]
 * Output: "abc"
 * Explaination: 
 * Swap s[0] and s[1], s = "bca"
 * Swap s[1] and s[2], s = "bac"
 * Swap s[0] and s[1], s = "abc"
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 10^5
 *
 * 0 &lt;= pairs.length &lt;= 10^5
 *
 * 0 &lt;= pairs[i][0], pairs[i][1] &lt; s.length
 *
 * s only contains lower case English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Think of it as a graph problem.
 * Hint 2: Consider the pairs as connected nodes in the graph, what can you do with a connected component of indices ?
 * Hint 3: We can sort each connected component alone to get the lexicographically minimum string.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, String, Depth-First Search, Breadth-First Search, Union-Find, Sorting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/smallest-string-with-swaps/">LeetCode #1202</a>
 */
public class SmallestStringWithSwaps {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Smallest String With Swaps");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== SmallestStringWithSwaps ===");
        SmallestStringWithSwaps sol = new SmallestStringWithSwaps();
        System.out.println(sol.solve(null));
    }
}
