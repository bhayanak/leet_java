package org.leetcode.easy;


/**
 * <b>#2469 - Convert the Temperature</b>
 *
 * <p><b>Difficulty:</b> Easy</p>
 * <p><b>Category:</b> Math</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given a non-negative floating point number rounded to two decimal places celsius, that denotes the temperature in Celsius.
 *
 *
 * You should convert Celsius into Kelvin and Fahrenheit and return it as an array ans = [kelvin, fahrenheit].
 *
 *
 * Return the array ans. Answers within 10-5 of the actual answer will be accepted.
 *
 *
 * Note that:
 *
 *
 * Kelvin = Celsius + 273.15
 *
 * Fahrenheit = Celsius * 1.80 + 32.00
 *
 *
 *
 * Example 1:
 *
 * Input: celsius = 36.50
 * Output: [309.65000,97.70000]
 * Explanation: Temperature at 36.50 Celsius converted in Kelvin is 309.65 and converted in Fahrenheit is 97.70.
 *
 * Example 2:
 *
 * Input: celsius = 122.11
 * Output: [395.26000,251.79800]
 * Explanation: Temperature at 122.11 Celsius converted in Kelvin is 395.26 and converted in Fahrenheit is 251.798.
 *
 *
 *
 * Constraints:
 *
 *
 * 0 &lt;= celsius &lt;= 1000
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Implement formulas that are given in the statement.
 *
 * <h2>Approach</h2>
 * Think about the category (Math).
 *
 * @see <a href="https://leetcode.com/problems/convert-the-temperature/">LeetCode #2469</a>
  *
  * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
  */
public class ConvertTheTemperature {

    /**
     * Solves the problem: Convert temperature.
     *
     * @param celsius the celsius (double)
     * @return the computed double[] result
      *
      * <p><b>Explanation:</b> Applies a direct mathematical formula, avoiding the need for iteration or extra space.</p>
      */
    public double[] convertTemperature(double celsius) {
        return new double[]{celsius+273.15, celsius*1.80+32.00};
    }

    public static void main(String[] args) {
        ConvertTheTemperature sol = new ConvertTheTemperature();
        System.out.println(sol.convertTemperature(0.0));
    }
}
