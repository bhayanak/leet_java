package org.leetcode.hard;


/**
 * <b>#2376 - Count Special Integers</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Math, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * We call a positive integer special if all of its digits are distinct.
 *
 *
 * Given a positive integer n, return the number of special integers that belong to the interval [1, n].
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = 20
 * Output: 19
 * Explanation: All the integers from 1 to 20, except 11, are special. Thus, there are 19 special integers.
 *
 * Example 2:
 *
 * Input: n = 5
 * Output: 5
 * Explanation: All the integers from 1 to 5 are special.
 *
 * Example 3:
 *
 * Input: n = 135
 * Output: 110
 * Explanation: There are 110 integers from 1 to 135 that are special.
 * Some of the integers that are not special are: 22, 114, and 131.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n &lt;= 2 * 109
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Try to think of dynamic programming.
 * Hint 2: Use the idea of digit dynamic programming to build the numbers, in addition to a bitmask that will tell which digits you have used so far on the number that you are building.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Dynamic Programming).
 *
 * @see <a href="https://leetcode.com/problems/count-special-integers/">LeetCode #2376</a>
 */
public class CountSpecialIntegers {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Special Integers");
    }

    public static void main(String[] args) {
        System.out.println("=== CountSpecialIntegers ===");
        CountSpecialIntegers sol = new CountSpecialIntegers();
        System.out.println(sol.solve(null));
    }
}
