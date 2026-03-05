package org.leetcode.hard;


/**
 * <b>#2338 - Count the Number of Ideal Arrays</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Math, Dynamic Programming, Combinatorics, Number Theory</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two integers n and maxValue, which are used to describe an ideal array.
 *
 *
 * A 0-indexed integer array arr of length n is considered ideal if the following conditions hold:
 *
 *
 * Every arr[i] is a value from 1 to maxValue, for 0 &lt;= i &lt; n.
 *
 * Every arr[i] is divisible by arr[i - 1], for 0 &lt; i &lt; n.
 *
 * Return the number of distinct ideal arrays of length n. Since the answer may be very large, return it modulo 109 + 7.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 2, maxValue = 5
 * Output: 10
 * Explanation: The following are the possible ideal arrays:
 * - Arrays starting with the value 1 (5 arrays): [1,1], [1,2], [1,3], [1,4], [1,5]
 * - Arrays starting with the value 2 (2 arrays): [2,2], [2,4]
 * - Arrays starting with the value 3 (1 array): [3,3]
 * - Arrays starting with the value 4 (1 array): [4,4]
 * - Arrays starting with the value 5 (1 array): [5,5]
 * There are a total of 5 + 2 + 1 + 1 + 1 = 10 distinct ideal arrays.
 *
 * Example 2:
 *
 * Input: n = 5, maxValue = 3
 * Output: 11
 * Explanation: The following are the possible ideal arrays:
 * - Arrays starting with the value 1 (9 arrays): 
 *    - With no other distinct values (1 array): [1,1,1,1,1] 
 *    - With 2nd distinct value 2 (4 arrays): [1,1,1,1,2], [1,1,1,2,2], [1,1,2,2,2], [1,2,2,2,2]
 *    - With 2nd distinct value 3 (4 arrays): [1,1,1,1,3], [1,1,1,3,3], [1,1,3,3,3], [1,3,3,3,3]
 * - Arrays starting with the value 2 (1 array): [2,2,2,2,2]
 * - Arrays starting with the value 3 (1 array): [3,3,3,3,3]
 * There are a total of 9 + 1 + 1 = 11 distinct ideal arrays.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= n &lt;= 104
 *
 * 1 &lt;= maxValue &lt;= 104
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Notice that an ideal array is non-decreasing.
 * Hint 2: Consider an alternative problem: where an ideal array must also be strictly increasing. Can you use DP to solve it?
 * Hint 3: Will combinatorics help to get an answer from the alternative problem to the actual problem?
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Dynamic Programming, Combinatorics, Number Theory).
 *
 * @see <a href="https://leetcode.com/problems/count-the-number-of-ideal-arrays/">LeetCode #2338</a>
 */
public class CountTheNumberOfIdealArrays {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count the Number of Ideal Arrays");
    }

    public static void main(String[] args) {
        System.out.println("=== CountTheNumberOfIdealArrays ===");
        CountTheNumberOfIdealArrays sol = new CountTheNumberOfIdealArrays();
        System.out.println(sol.solve(null));
    }
}
