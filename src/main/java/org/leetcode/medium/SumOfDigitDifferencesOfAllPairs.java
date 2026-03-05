package org.leetcode.medium;


/**
 * <b>#3153 - Sum of Digit Differences of All Pairs</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Math, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array nums consisting of positive integers where all integers have the same number of digits.
 *
 *
 * The digit difference between two integers is the count of different digits that are in the same position in the two integers.
 *
 *
 * Return the sum of the digit differences between all pairs of integers in nums.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [13,23,12]
 *
 *
 * Output: 4
 *
 *
 * Explanation:
 *
 * We have the following:
 *
 * - The digit difference between 13 and 23 is 1.
 *
 * - The digit difference between 13 and 12 is 1.
 *
 * - The digit difference between 23 and 12 is 2.
 *
 * So the total sum of digit differences between all pairs of integers is 1 + 1 + 2 = 4.
 *
 * Example 2:
 *
 * Input: nums = [10,10,10,10]
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 * All the integers in the array are the same. So the total sum of digit differences between all pairs of integers will be 0.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt; 109
 *
 * All integers in nums have the same number of digits.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: You can solve the problem for digits that are on the same position separately, and then sum up all the answers.
 * Hint 2: For each position, count the number of occurences of each digit from 0 to 9 that appear on that position.
 * Hint 3: Let <code>c</code> be the number of occurences of a digit on a position, that will contribute with <code>c * (n - c)</code> to the final answer, where <code>n</code> is the number of integers in <code>nums</code>.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Math, Counting).
 *
 * @see <a href="https://leetcode.com/problems/sum-of-digit-differences-of-all-pairs/">LeetCode #3153</a>
 */
public class SumOfDigitDifferencesOfAllPairs {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Sum of Digit Differences of All Pairs");
    }

    public static void main(String[] args) {
        System.out.println("=== SumOfDigitDifferencesOfAllPairs ===");
        SumOfDigitDifferencesOfAllPairs sol = new SumOfDigitDifferencesOfAllPairs();
        System.out.println(sol.solve(null));
    }
}
