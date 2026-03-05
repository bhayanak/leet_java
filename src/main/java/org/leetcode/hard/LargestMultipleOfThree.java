package org.leetcode.hard;


/**
 * <b>#1363 - Largest Multiple of Three</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Math, Dynamic Programming, Greedy, Sorting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array of digits digits, return the largest multiple of three that can be formed by concatenating some of the given digits in any order. If there is no answer return an empty string.
 *
 *
 * Since the answer may not fit in an integer data type, return the answer as a string. Note that the returning answer must not contain unnecessary leading zeros.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: digits = [8,1,9]
 * Output: "981"
 *
 * Example 2:
 *
 * Input: digits = [8,6,7,1,0]
 * Output: "8760"
 *
 * Example 3:
 *
 * Input: digits = [1]
 * Output: ""
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= digits.length &lt;= 104
 *
 * 0 &lt;= digits[i] &lt;= 9
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: A number is a multiple of three if and only if its sum of digits is a multiple of three.
 * Hint 2: Use dynamic programming.
 * Hint 3: To find the maximum number, try to maximize the number of digits of the number.
 * Hint 4: Sort the digits in descending order to find the maximum number.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math, Dynamic Programming, Greedy, Sorting).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/largest-multiple-of-three/">LeetCode #1363</a>
 */
public class LargestMultipleOfThree {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Largest Multiple of Three");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== LargestMultipleOfThree ===");
        LargestMultipleOfThree sol = new LargestMultipleOfThree();
        System.out.println(sol.solve(null));
    }
}
