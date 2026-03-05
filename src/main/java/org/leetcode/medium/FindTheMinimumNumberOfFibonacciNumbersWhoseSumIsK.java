package org.leetcode.medium;


/**
 * <b>#1414 - Find the Minimum Number of Fibonacci Numbers Whose Sum Is K</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Math, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer k, return the minimum number of Fibonacci numbers whose sum is equal to k. The same Fibonacci number can be used multiple times.
 *
 *
 * The Fibonacci numbers are defined as:
 *
 *
 * F1 = 1
 *
 * F2 = 1
 *
 * Fn = Fn-1 + Fn-2 for n &gt; 2.
 *
 * It is guaranteed that for the given constraints we can always find such Fibonacci numbers that sum up to k.
 *
 *
 *
 * Example 1:
 *
 * Input: k = 7
 * Output: 2 
 * Explanation: The Fibonacci numbers are: 1, 1, 2, 3, 5, 8, 13, ... 
 * For k = 7 we can use 2 + 5 = 7.
 *
 * Example 2:
 *
 * Input: k = 10
 * Output: 2 
 * Explanation: For k = 10 we can use 2 + 8 = 10.
 *
 * Example 3:
 *
 * Input: k = 19
 * Output: 3 
 * Explanation: For k = 19 we can use 1 + 5 + 13 = 19.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= k &lt;= 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Generate all Fibonacci numbers up to the limit (they are few).
 * Hint 2: Use greedy solution, taking at every time the greatest Fibonacci number which is smaller than or equal to the current number. Subtract this Fibonacci number from the current number and repeat again the process.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Greedy).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/find-the-minimum-number-of-fibonacci-numbers-whose-sum-is-k/">LeetCode #1414</a>
 */
public class FindTheMinimumNumberOfFibonacciNumbersWhoseSumIsK {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find the Minimum Number of Fibonacci Numbers Whose Sum Is K");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== FindTheMinimumNumberOfFibonacciNumbersWhoseSumIsK ===");
        FindTheMinimumNumberOfFibonacciNumbersWhoseSumIsK sol = new FindTheMinimumNumberOfFibonacciNumbersWhoseSumIsK();
        System.out.println(sol.solve(null));
    }
}
