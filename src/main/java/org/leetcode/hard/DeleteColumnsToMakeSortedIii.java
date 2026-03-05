package org.leetcode.hard;


/**
 * <b>#960 - Delete Columns to Make Sorted III</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, String, Dynamic Programming</p>
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
 * Suppose we chose a set of deletion indices answer such that after deletions, the final array has every string (row) in lexicographic order. (i.e., (strs[0][0] &lt;= strs[0][1] &lt;= ... &lt;= strs[0][strs[0].length - 1]), and (strs[1][0] &lt;= strs[1][1] &lt;= ... &lt;= strs[1][strs[1].length - 1]), and so on). Return the minimum possible value of answer.length.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: strs = ["babca","bbazb"]
 * Output: 3
 * Explanation: After deleting columns 0, 1, and 4, the final array is strs = ["bc", "az"].
 * Both these rows are individually in lexicographic order (ie. strs[0][0] &lt;= strs[0][1] and strs[1][0] &lt;= strs[1][1]).
 * Note that strs[0] &gt; strs[1] - the array strs is not necessarily in lexicographic order.
 *
 * Example 2:
 *
 * Input: strs = ["edcba"]
 * Output: 4
 * Explanation: If we delete less than 4 columns, the only row will not be lexicographically sorted.
 *
 * Example 3:
 *
 * Input: strs = ["ghi","def","abc"]
 * Output: 0
 * Explanation: All rows are already lexicographically sorted.
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
 * Think about the category (Array, String, Dynamic Programming).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/delete-columns-to-make-sorted-iii/">LeetCode #960</a>
 */
public class DeleteColumnsToMakeSortedIii {

    /**
     * TODO: Implement "Delete Columns to Make Sorted III".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Delete Columns to Make Sorted III");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac DeleteColumnsToMakeSortedIii.java &amp;&amp; java org.leetcode.hard.DeleteColumnsToMakeSortedIii</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== DeleteColumnsToMakeSortedIii ===");
        DeleteColumnsToMakeSortedIii sol = new DeleteColumnsToMakeSortedIii();
        System.out.println(sol.solve(null));
    }
}
