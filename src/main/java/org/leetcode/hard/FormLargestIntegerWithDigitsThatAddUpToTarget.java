package org.leetcode.hard;


/**
 * <b>#1449 - Form Largest Integer With Digits That Add up to Target</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array of integers cost and an integer target, return the maximum integer you can paint under the following rules:
 *
 *
 * The cost of painting a digit (i + 1) is given by cost[i] (0-indexed).
 *
 * The total cost used must be equal to target.
 *
 * The integer does not have 0 digits.
 *
 * Since the answer may be very large, return it as a string. If there is no way to paint any integer given the condition, return "0".
 *
 *
 *
 *
 * Example 1:
 *
 * Input: cost = [4,3,2,5,6,7,2,5,5], target = 9
 * Output: "7772"
 * Explanation: The cost to paint the digit '7' is 2, and the digit '2' is 3. Then cost("7772") = 2*3+ 3*1 = 9. You could also paint "977", but "7772" is the largest number.
 * Digit    cost
 *   1  -&gt;   4
 *   2  -&gt;   3
 *   3  -&gt;   2
 *   4  -&gt;   5
 *   5  -&gt;   6
 *   6  -&gt;   7
 *   7  -&gt;   2
 *   8  -&gt;   5
 *   9  -&gt;   5
 *
 * Example 2:
 *
 * Input: cost = [7,6,5,5,5,6,8,7,8], target = 12
 * Output: "85"
 * Explanation: The cost to paint the digit '8' is 7, and the digit '5' is 5. Then cost("85") = 7 + 5 = 12.
 *
 * Example 3:
 *
 * Input: cost = [2,4,6,2,4,6,4,4,4], target = 5
 * Output: "0"
 * Explanation: It is impossible to paint any integer with total cost equal to target.
 *
 *
 *
 * Constraints:
 *
 *
 * cost.length == 9
 *
 * 1 &lt;= cost[i], target &lt;= 5000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Use dynamic programming to find the maximum digits to paint given a total cost.
 * Hint 2: Build the largest number possible using this DP table.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Dynamic Programming).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/form-largest-integer-with-digits-that-add-up-to-target/">LeetCode #1449</a>
 */
public class FormLargestIntegerWithDigitsThatAddUpToTarget {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Form Largest Integer With Digits That Add up to Target");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== FormLargestIntegerWithDigitsThatAddUpToTarget ===");
        FormLargestIntegerWithDigitsThatAddUpToTarget sol = new FormLargestIntegerWithDigitsThatAddUpToTarget();
        System.out.println(sol.solve(null));
    }
}
