package org.leetcode.medium;


/**
 * <b>#949 - Largest Time for Given Digits</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, String, Backtracking, Enumeration</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array arr of 4 digits, find the latest 24-hour time that can be made using each digit exactly once.
 *
 *
 * 24-hour times are formatted as "HH:MM", where HH is between 00 and 23, and MM is between 00 and 59. The earliest 24-hour time is 00:00, and the latest is 23:59.
 *
 *
 * Return the latest 24-hour time in "HH:MM" format. If no valid time can be made, return an empty string.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: arr = [1,2,3,4]
 * Output: "23:41"
 * Explanation: The valid 24-hour times are "12:34", "12:43", "13:24", "13:42", "14:23", "14:32", "21:34", "21:43", "23:14", and "23:41". Of these times, "23:41" is the latest.
 *
 * Example 2:
 *
 * Input: arr = [5,5,5,5]
 * Output: ""
 * Explanation: There are no valid 24-hour times as "55:55" is not valid.
 *
 *
 *
 * Constraints:
 *
 *
 * arr.length == 4
 *
 * 0 &lt;= arr[i] &lt;= 9
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * No hints — trace through examples manually.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, String, Backtracking, Enumeration).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/largest-time-for-given-digits/">LeetCode #949</a>
 */
public class LargestTimeForGivenDigits {

    /**
     * TODO: Implement "Largest Time for Given Digits".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Largest Time for Given Digits");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac LargestTimeForGivenDigits.java &amp;&amp; java org.leetcode.medium.LargestTimeForGivenDigits</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== LargestTimeForGivenDigits ===");
        LargestTimeForGivenDigits sol = new LargestTimeForGivenDigits();
        System.out.println(sol.solve(null));
    }
}
