package org.leetcode.easy;


/**
 * <b>#944 - Delete Columns to Make Sorted</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, String</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array of n strings strs, all of the same length.
 *
 *
 * The strings can be arranged such that there is one on each line, making a grid.
 *
 *
 * For example, strs = ["abc", "bce", "cae"] can be arranged as follows:
 *
 * abc
 * bce
 * cae
 *
 * You want to delete the columns that are not sorted lexicographically. In the above example (0-indexed), columns 0 ('a', 'b', 'c') and 2 ('c', 'e', 'e') are sorted, while column 1 ('b', 'c', 'a') is not, so you would delete column 1.
 *
 *
 * Return the number of columns that you will delete.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: strs = ["cba","daf","ghi"]
 * Output: 1
 * Explanation: The grid looks as follows:
 *   cba
 *   daf
 *   ghi
 * Columns 0 and 2 are sorted, but column 1 is not, so you only need to delete 1 column.
 *
 * Example 2:
 *
 * Input: strs = ["a","b"]
 * Output: 0
 * Explanation: The grid looks as follows:
 *   a
 *   b
 * Column 0 is the only column and is sorted, so you will not delete any columns.
 *
 * Example 3:
 *
 * Input: strs = ["zyx","wvu","tsr"]
 * Output: 3
 * Explanation: The grid looks as follows:
 *   zyx
 *   wvu
 *   tsr
 * All 3 columns are not sorted, so you will delete all 3.
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
 * 1 &lt;= strs[i].length &lt;= 1000
 *
 * strs[i] consists of lowercase English letters.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, String).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/delete-columns-to-make-sorted/">LeetCode #944</a>
  *
  * <p><b>Explanation:</b> Tracks the running minimum in a single O(n) scan.</p>
  */
public class DeleteColumnsToMakeSorted {

    /**
     * Computes the minimum Min deletion size.
     * Sorts the input first to enable efficient processing.
     *
     * @param strs the strs (String[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Tracks the running minimum in a single O(n) scan.</p>
      */
    public int minDeletionSize(String[] strs) {
        int count = 0;
        for (int j = 0; j < strs[0].length(); j++)
            for (int i = 1; i < strs.length; i++)
                if (strs[i].charAt(j) < strs[i-1].charAt(j)) { count++; break; }
        return count;
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac DeleteColumnsToMakeSorted.java &amp;&amp; java org.leetcode.easy.DeleteColumnsToMakeSorted</pre>
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
        DeleteColumnsToMakeSorted sol = new DeleteColumnsToMakeSorted();
                System.out.println(sol.minDeletionSize(new String[]{"cba","daf","ghi"})); // 1
                System.out.println(sol.minDeletionSize(new String[]{"a","b"}));           // 0
                System.out.println(sol.minDeletionSize(new String[]{"zyx","wvu","tsr"})); // 3
    }
}
