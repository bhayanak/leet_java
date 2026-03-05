package org.leetcode.hard;


/**
 * <b>#952 - Largest Component Size by Common Factor</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Hash Table, Math, Union-Find, Number Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array of unique positive integers nums. Consider the following graph:
 *
 *
 * There are nums.length nodes, labeled nums[0] to nums[nums.length - 1],
 *
 * There is an undirected edge between nums[i] and nums[j] if nums[i] and nums[j] share a common factor greater than 1.
 *
 * Return the size of the largest connected component in the graph.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [4,6,15,35]
 * Output: 4
 *
 * Example 2:
 *
 * Input: nums = [20,50,9,63]
 * Output: 2
 *
 * Example 3:
 *
 * Input: nums = [2,3,6,7,4,12,21,39]
 * Output: 8
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 2 * 104
 *
 * 1 &lt;= nums[i] &lt;= 105
 *
 * All the values of nums are unique.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Math, Union-Find, Number Theory).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/largest-component-size-by-common-factor/">LeetCode #952</a>
 */
public class LargestComponentSizeByCommonFactor {

    /**
     * TODO: Implement "Largest Component Size by Common Factor".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Largest Component Size by Common Factor");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac LargestComponentSizeByCommonFactor.java &amp;&amp; java org.leetcode.hard.LargestComponentSizeByCommonFactor</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== LargestComponentSizeByCommonFactor ===");
        LargestComponentSizeByCommonFactor sol = new LargestComponentSizeByCommonFactor();
        System.out.println(sol.solve(null));
    }
}
