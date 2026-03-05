package org.leetcode.easy;


/**
 * <b>#1598 - Crawler Log Folder</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Array, String, Stack</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * The Leetcode file system keeps a log each time some user performs a change folder operation.
 *
 *
 * The operations are described below:
 *
 *
 * "../" : Move to the parent folder of the current folder. (If you are already in the main folder, remain in the same folder).
 *
 * "./" : Remain in the same folder.
 *
 * "x/" : Move to the child folder named x (This folder is guaranteed to always exist).
 *
 * You are given a list of strings logs where logs[i] is the operation performed by the user at the ith step.
 *
 *
 * The file system starts in the main folder, then the operations in logs are performed.
 *
 *
 * Return the minimum number of operations needed to go back to the main folder after the change folder operations.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: logs = ["d1/","d2/","../","d21/","./"]
 * Output: 2
 * Explanation: Use this change folder operation "../" 2 times and go back to the main folder.
 *
 * Example 2:
 *
 * Input: logs = ["d1/","d2/","./","d3/","../","d31/"]
 * Output: 3
 *
 * Example 3:
 *
 * Input: logs = ["d1/","../","../","../"]
 * Output: 0
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= logs.length &lt;= 103
 *
 * 2 &lt;= logs[i].length &lt;= 10
 *
 * logs[i] contains lowercase English letters, digits, '.', and '/'.
 *
 * logs[i] follows the format described in the statement.
 *
 * Folder names consist of lowercase English letters and digits.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Simulate the process but don’t move the pointer beyond the main folder.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, String, Stack).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/crawler-log-folder/">LeetCode #1598</a>
  *
  * <p><b>Explanation:</b> Tracks the running minimum in a single O(n) scan.</p>
  */
public class CrawlerLogFolder {

    /**
     * Computes the minimum Min operations.
     *
     * @param logs the logs (String[])
     * @return the computed int result
      *
      * <p><b>Explanation:</b> Tracks the running minimum in a single O(n) scan.</p>
      */
    public int minOperations(String[] logs) {
        int depth=0;
        for (String log:logs) {
            if (log.equals("../")) depth=Math.max(0,depth-1);
            else if (!log.equals("./")) depth++;
        }
        return depth;
    }

    /**
     * Runs sample test cases.
      *
      * <p><b>Explanation:</b> Processes the string character by character, applying the transformation or predicate.</p>
      */
    public static void main(String[] args) {
        CrawlerLogFolder sol = new CrawlerLogFolder();
                System.out.println(sol.minOperations(new String[]{"d1/","d2/","../","d21/","./"})); // 2
                System.out.println(sol.minOperations(new String[]{"d1/","d2/","./","d3/","../","d31/"})); // 3
                System.out.println(sol.minOperations(new String[]{"d1/","../","../","../"})); // 0
    }
}
