package org.leetcode.medium;


/**
 * <b>#2177 - Find Three Consecutive Integers That Sum to a Given Number</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Math, Simulation</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an integer num, return three consecutive integers (as a sorted array) that sum to num. If num cannot be expressed as the sum of three consecutive integers, return an empty array.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: num = 33
 * Output: [10,11,12]
 * Explanation: 33 can be expressed as 10 + 11 + 12 = 33.
 * 10, 11, 12 are 3 consecutive integers, so we return [10, 11, 12].
 *
 * Example 2:
 *
 * Input: num = 4
 * Output: []
 * Explanation: There is no way to express 4 as the sum of 3 consecutive integers.
 *
 *
 *
 * Constraints:
 *
 *
 * 0 &lt;= num &lt;= 1015
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Notice that if a solution exists, we can represent them as x-1, x, x+1. What does this tell us about the number?
 * Hint 2: Notice the sum of the numbers will be 3x. Can you solve for x?
 *
 * <h2>Approach</h2>
 * Think about the category (Math, Simulation).
 *
 * @see <a href="https://leetcode.com/problems/find-three-consecutive-integers-that-sum-to-a-given-number/">LeetCode #2177</a>
 */
public class FindThreeConsecutiveIntegersThatSumToAGivenNumber {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find Three Consecutive Integers That Sum to a Given Number");
    }

    public static void main(String[] args) {
        System.out.println("=== FindThreeConsecutiveIntegersThatSumToAGivenNumber ===");
        FindThreeConsecutiveIntegersThatSumToAGivenNumber sol = new FindThreeConsecutiveIntegersThatSumToAGivenNumber();
        System.out.println(sol.solve(null));
    }
}
