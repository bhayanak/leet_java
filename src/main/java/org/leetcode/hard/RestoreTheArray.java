package org.leetcode.hard;


/**
 * <b>#1416 - Restore The Array</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> String, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * A program was supposed to print an array of integers. The program forgot to print whitespaces and the array is printed as a string of digits s and all we know is that all integers in the array were in the range [1, k] and there are no leading zeros in the array.
 *
 *
 * Given the string s and the integer k, return the number of the possible arrays that can be printed as s using the mentioned program. Since the answer may be very large, return it modulo 109 + 7.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: s = "1000", k = 10000
 * Output: 1
 * Explanation: The only possible array is [1000]
 *
 * Example 2:
 *
 * Input: s = "1000", k = 10
 * Output: 0
 * Explanation: There cannot be an array that was printed this way and has all integer &gt;= 1 and &lt;= 10.
 *
 * Example 3:
 *
 * Input: s = "1317", k = 2000
 * Output: 8
 * Explanation: Possible arrays are [1317],[131,7],[13,17],[1,317],[13,1,7],[1,31,7],[1,3,17],[1,3,1,7]
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= s.length &lt;= 105
 *
 * s consists of only digits and does not contain leading zeros.
 *
 * 1 &lt;= k &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use dynamic programming. Build an array dp where dp[i] is the number of ways you can divide the string starting from index i to the end.
 * Hint 2: Keep in mind that the answer is modulo 10^9 + 7 and take the mod for each operation.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Dynamic Programming).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/restore-the-array/">LeetCode #1416</a>
 */
public class RestoreTheArray {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Restore The Array");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== RestoreTheArray ===");
        RestoreTheArray sol = new RestoreTheArray();
        System.out.println(sol.solve(null));
    }
}
