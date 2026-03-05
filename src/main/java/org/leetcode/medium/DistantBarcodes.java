package org.leetcode.medium;


/**
 * <b>#1054 - Distant Barcodes</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Greedy, Sorting, Heap (Priority Queue), Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * In a warehouse, there is a row of barcodes, where the ith barcode is barcodes[i].
 *
 *
 * Rearrange the barcodes so that no two adjacent barcodes are equal. You may return any answer, and it is guaranteed an answer exists.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: barcodes = [1,1,1,2,2,2]
 * Output: [2,1,2,1,2,1]
 *
 *
 * Example 2:
 *
 * Input: barcodes = [1,1,1,1,2,2,3,3]
 * Output: [1,3,1,3,1,2,1,2]
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= barcodes.length &lt;= 10000
 *
 * 1 &lt;= barcodes[i] &lt;= 10000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: We want to always choose the most common or second most common element to write next.  What data structure allows us to query this effectively?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Greedy, Sorting, Heap (Priority Queue), Counting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/distant-barcodes/">LeetCode #1054</a>
 */
public class DistantBarcodes {

    /**
     * TODO: Implement "Distant Barcodes".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Distant Barcodes");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac DistantBarcodes.java &amp;&amp; java org.leetcode.medium.DistantBarcodes</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== DistantBarcodes ===");
        DistantBarcodes sol = new DistantBarcodes();
        System.out.println(sol.solve(null));
    }
}
