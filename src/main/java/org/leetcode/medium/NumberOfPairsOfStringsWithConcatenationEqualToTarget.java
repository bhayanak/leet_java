package org.leetcode.medium;


/**
 * <b>#2023 - Number of Pairs of Strings With Concatenation Equal to Target</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, String, Counting</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Given an array of digit strings nums and a digit string target, return the number of pairs of indices (i, j) (where i != j) such that the concatenation of nums[i] + nums[j] equals target.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = ["777","7","77","77"], target = "7777"
 * Output: 4
 * Explanation: Valid pairs are:
 * - (0, 1): "777" + "7"
 * - (1, 0): "7" + "777"
 * - (2, 3): "77" + "77"
 * - (3, 2): "77" + "77"
 *
 * Example 2:
 *
 * Input: nums = ["123","4","12","34"], target = "1234"
 * Output: 2
 * Explanation: Valid pairs are:
 * - (0, 1): "123" + "4"
 * - (2, 3): "12" + "34"
 *
 * Example 3:
 *
 * Input: nums = ["1","1","1"], target = "11"
 * Output: 6
 * Explanation: Valid pairs are:
 * - (0, 1): "1" + "1"
 * - (1, 0): "1" + "1"
 * - (0, 2): "1" + "1"
 * - (2, 0): "1" + "1"
 * - (1, 2): "1" + "1"
 * - (2, 1): "1" + "1"
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= nums.length &lt;= 100
 *
 * 1 &lt;= nums[i].length &lt;= 100
 *
 * 2 &lt;= target.length &lt;= 100
 *
 * nums[i] and target consist of digits.
 *
 * nums[i] and target do not have leading zeros.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Try to concatenate every two different strings from the list.
 * Hint 2: Count the number of pairs with concatenation equals to target.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, String, Counting).
 *
 * @see <a href="https://leetcode.com/problems/number-of-pairs-of-strings-with-concatenation-equal-to-target/">LeetCode #2023</a>
 */
public class NumberOfPairsOfStringsWithConcatenationEqualToTarget {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Number of Pairs of Strings With Concatenation Equal to Target");
    }

    public static void main(String[] args) {
        System.out.println("=== NumberOfPairsOfStringsWithConcatenationEqualToTarget ===");
        NumberOfPairsOfStringsWithConcatenationEqualToTarget sol = new NumberOfPairsOfStringsWithConcatenationEqualToTarget();
        System.out.println(sol.solve(null));
    }
}
