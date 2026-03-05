package org.leetcode.hard;


/**
 * <b>#2719 - Count of Integers</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Math, String, Dynamic Programming</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given two numeric strings num1 and num2 and two integers max_sum and min_sum. We denote an integer x to be good if:
 *
 *
 * num1 &lt;= x &lt;= num2
 *
 * min_sum &lt;= digit_sum(x) &lt;= max_sum.
 *
 * Return the number of good integers. Since the answer may be large, return it modulo 109 + 7.
 *
 *
 * Note that digit_sum(x) denotes the sum of the digits of x.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: num1 = "1", num2 = "12", min_sum = 1, max_sum = 8
 * Output: 11
 * Explanation: There are 11 integers whose sum of digits lies between 1 and 8 are 1,2,3,4,5,6,7,8,10,11, and 12. Thus, we return 11.
 *
 * Example 2:
 *
 * Input: num1 = "1", num2 = "5", min_sum = 1, max_sum = 5
 * Output: 5
 * Explanation: The 5 integers whose sum of digits lies between 1 and 5 are 1,2,3,4, and 5. Thus, we return 5.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= num1 &lt;= num2 &lt;= 1022
 *
 * 1 &lt;= min_sum &lt;= max_sum &lt;= 400
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Let f(n, l, r) denotes the number of integers from 1 to n with the sum of digits between l and r.
 * Hint 2: The answer is f(num2, min_sum, max_sum) - f(num1-1, min_sum, max_sum).
 * Hint 3: You can calculate f(n, l, r) using digit dp.
 *
 * <h2>Approach</h2>
 * Think about the category (Math, String, Dynamic Programming).
 *
 * @see <a href="https://leetcode.com/problems/count-of-integers/">LeetCode #2719</a>
 */
public class CountOfIntegers {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count of Integers");
    }

    public static void main(String[] args) {
        System.out.println("=== CountOfIntegers ===");
        CountOfIntegers sol = new CountOfIntegers();
        System.out.println(sol.solve(null));
    }
}
