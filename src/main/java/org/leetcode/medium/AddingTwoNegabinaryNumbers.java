package org.leetcode.medium;


/**
 * <b>#1073 - Adding Two Negabinary Numbers</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Math</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given two numbers arr1 and arr2 in base -2, return the result of adding them together.
 *
 *
 * Each number is given in array format:  as an array of 0s and 1s, from most significant bit to least significant bit.  For example, arr = [1,1,0,1] represents the number (-2)^3 + (-2)^2 + (-2)^0 = -3.  A number arr in array, format is also guaranteed to have no leading zeros: either arr == [0] or arr[0] == 1.
 *
 *
 * Return the result of adding arr1 and arr2 in the same format: as an array of 0s and 1s with no leading zeros.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: arr1 = [1,1,1,1,1], arr2 = [1,0,1]
 * Output: [1,0,0,0,0]
 * Explanation: arr1 represents 11, arr2 represents 5, the output represents 16.
 *
 * Example 2:
 *
 * Input: arr1 = [0], arr2 = [0]
 * Output: [0]
 *
 * Example 3:
 *
 * Input: arr1 = [0], arr2 = [1]
 * Output: [1]
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= arr1.length, arr2.length &lt;= 1000
 *
 * arr1[i] and arr2[i] are 0 or 1
 *
 * arr1 and arr2 have no leading zeros
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: We can try to determine the last digit of the answer, then divide everything by 2 and repeat.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Math).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/adding-two-negabinary-numbers/">LeetCode #1073</a>
 */
public class AddingTwoNegabinaryNumbers {

    /**
     * TODO: Implement "Adding Two Negabinary Numbers".
     * Replace parameter and return types with the actual signature.
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Adding Two Negabinary Numbers");
    }

    /**
     * Runs sample test cases. Execute:
     * <pre>javac AddingTwoNegabinaryNumbers.java &amp;&amp; java org.leetcode.medium.AddingTwoNegabinaryNumbers</pre>
     */
    public static void main(String[] args) {
        System.out.println("=== AddingTwoNegabinaryNumbers ===");
        AddingTwoNegabinaryNumbers sol = new AddingTwoNegabinaryNumbers();
        System.out.println(sol.solve(null));
    }
}
