package org.leetcode.medium;


/**
 * <b>#1090 - Largest Values From Labels</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Greedy, Sorting, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given n item's value and label as two integer arrays values and labels. You are also given two integers numWanted and useLimit.
 *
 *
 * Your task is to find a subset of items with the maximum sum of their values such that:
 *
 *
 * The number of items is at most numWanted.
 *
 * The number of items with the same label is at most useLimit.
 *
 * Return the maximum sum.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: values = [5,4,3,2,1], labels = [1,1,2,2,3], numWanted = 3, useLimit = 1
 *
 *
 * Output: 9
 *
 *
 * Explanation:
 *
 *
 * The subset chosen is the first, third, and fifth items with the sum of values 5 + 3 + 1.
 *
 * Example 2:
 *
 * Input: values = [5,4,3,2,1], labels = [1,3,3,3,2], numWanted = 3, useLimit = 2
 *
 *
 * Output: 12
 *
 *
 * Explanation:
 *
 *
 * The subset chosen is the first, second, and third items with the sum of values 5 + 4 + 3.
 *
 * Example 3:
 *
 * Input: values = [9,8,8,7,6], labels = [0,0,0,1,1], numWanted = 3, useLimit = 1
 *
 *
 * Output: 16
 *
 *
 * Explanation:
 *
 *
 * The subset chosen is the first and fourth items with the sum of values 9 + 7.
 *
 *
 *
 * Constraints:
 *
 *
 * n == values.length == labels.length
 *
 * 1 &lt;= n &lt;= 2 * 104
 *
 * 0 &lt;= values[i], labels[i] &lt;= 2 * 104
 *
 * 1 &lt;= numWanted, useLimit &lt;= n
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Consider the items in order from largest to smallest value, and greedily take the items if they fall under the use_limit.  We can keep track of how many items of each label are used by using a hash table.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Greedy, Sorting, Counting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/largest-values-from-labels/">LeetCode #1090</a>
 */
public class LargestValuesFromLabels {

    /**
     * TODO: Implement "Largest Values From Labels".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Largest Values From Labels");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac LargestValuesFromLabels.java &amp;&amp; java org.leetcode.medium.LargestValuesFromLabels</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== LargestValuesFromLabels ===");
        LargestValuesFromLabels sol = new LargestValuesFromLabels();
        System.out.println(sol.solve(null));
    }
}
