package org.leetcode.medium;


/**
 * <b>#955 - Delete Columns to Make Sorted II</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, String, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array of n strings strs, all of the same length.
 *
 *
 * We may choose any deletion indices, and we delete all the characters in those indices for each string.
 *
 *
 * For example, if we have strs = ["abcdef","uvwxyz"] and deletion indices {0, 2, 3}, then the final array after deletions is ["bef", "vyz"].
 *
 *
 * Suppose we chose a set of deletion indices answer such that after deletions, the final array has its elements in lexicographic order (i.e., strs[0] &lt;= strs[1] &lt;= strs[2] &lt;= ... &lt;= strs[n - 1]). Return the minimum possible value of answer.length.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: strs = ["ca","bb","ac"]
 * Output: 1
 * Explanation: 
 * After deleting the first column, strs = ["a", "b", "c"].
 * Now strs is in lexicographic order (ie. strs[0] &lt;= strs[1] &lt;= strs[2]).
 * We require at least 1 deletion since initially strs was not in lexicographic order, so the answer is 1.
 *
 * Example 2:
 *
 * Input: strs = ["xc","yb","za"]
 * Output: 0
 * Explanation: 
 * strs is already in lexicographic order, so we do not need to delete anything.
 * Note that the rows of strs are not necessarily in lexicographic order:
 * i.e., it is NOT necessarily true that (strs[0][0] &lt;= strs[0][1] &lt;= ...)
 *
 * Example 3:
 *
 * Input: strs = ["zyx","wvu","tsr"]
 * Output: 3
 * Explanation: We have to delete every column.
 *
 *
 *
 * Constraints:
 *
 *
 * n == strs.length
 *
 * 1 &lt;= n &lt;= 100
 *
 * 1 &lt;= strs[i].length &lt;= 100
 *
 * strs[i] consists of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, String, Greedy).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/delete-columns-to-make-sorted-ii/">LeetCode #955</a>
 */
public class DeleteColumnsToMakeSortedIi {

    /**
     * TODO: Implement "Delete Columns to Make Sorted II".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Delete Columns to Make Sorted II");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac DeleteColumnsToMakeSortedIi.java &amp;&amp; java org.leetcode.medium.DeleteColumnsToMakeSortedIi</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== DeleteColumnsToMakeSortedIi ===");
        DeleteColumnsToMakeSortedIi sol = new DeleteColumnsToMakeSortedIi();
        System.out.println(sol.solve(null));
    }
}
