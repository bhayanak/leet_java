package org.leetcode.medium;


/**
 * <b>#1689 - Partitioning Into Minimum Number Of Deci-Binary Numbers</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> String, Greedy</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * A decimal number is called deci-binary if each of its digits is either 0 or 1 without any leading zeros. For example, 101 and 1100 are deci-binary, while 112 and 3001 are not.
 *
 *
 * Given a string n that represents a positive decimal integer, return the minimum number of positive deci-binary numbers needed so that they sum up to n.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: n = "32"
 * Output: 3
 * Explanation: 10 + 11 + 11 = 32
 *
 * Example 2:
 *
 * Input: n = "82734"
 * Output: 8
 *
 * Example 3:
 *
 * Input: n = "27346209830709182346"
 * Output: 9
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= n.length &lt;= 105
 *
 * n consists of only digits.
 *
 * n does not contain any leading zeros and represents a positive integer.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Think about if the input was only one digit. Then you need to add up as many ones as the value of this digit.
 * Hint 2: If the input has multiple digits, then you can solve for each digit independently, and merge the answers to form numbers that add up to that input.
 * Hint 3: Thus the answer is equal to the max digit.
 *
 * <h2>Approach</h2>
 * Think about the category (String, Greedy).
 * Start brute-force, then optimise: sorting, hashing, two pointers,
 * sliding window, binary search, backtracking, DP, or graph traversal.
 *
 * <h2>Complexity</h2>
 * Time: see implementation  |  Space: see implementation
 *
 * @see <a href="https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/">LeetCode #1689</a>
 */
public class PartitioningIntoMinimumNumberOfDeciBinaryNumbers {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Partitioning Into Minimum Number Of Deci-Binary Numbers");
    }

    /**
     * Runs sample test cases.
     */
    public static void main(String[] args) {
        System.out.println("=== PartitioningIntoMinimumNumberOfDeciBinaryNumbers ===");
        PartitioningIntoMinimumNumberOfDeciBinaryNumbers sol = new PartitioningIntoMinimumNumberOfDeciBinaryNumbers();
        System.out.println(sol.solve(null));
    }
}
