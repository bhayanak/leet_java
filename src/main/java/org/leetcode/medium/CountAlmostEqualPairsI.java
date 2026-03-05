package org.leetcode.medium;


/**
 * <b>#3265 - Count Almost Equal Pairs I</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Sorting, Counting, Enumeration</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an array nums consisting of positive integers.
 *
 *
 * We call two integers x and y in this problem almost equal if both integers can become equal after performing the following operation at most once:
 *
 *
 * Choose either x or y and swap any two digits within the chosen number.
 *
 * Return the number of indices i and j in nums where i &lt; j such that nums[i] and nums[j] are almost equal.
 *
 *
 * Note that it is allowed for an integer to have leading zeros after performing an operation.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [3,12,30,17,21]
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * The almost equal pairs of elements are:
 *
 *
 * 3 and 30. By swapping 3 and 0 in 30, you get 3.
 *
 * 12 and 21. By swapping 1 and 2 in 12, you get 21.
 *
 * Example 2:
 *
 * Input: nums = [1,1,1,1,1]
 *
 *
 * Output: 10
 *
 *
 * Explanation:
 *
 *
 * Every two elements in the array are almost equal.
 *
 * Example 3:
 *
 * Input: nums = [123,231]
 *
 *
 * Output: 0
 *
 *
 * Explanation:
 *
 *
 * We cannot swap any two digits of 123 or 231 to reach the other.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= nums.length &lt;= 100
 *
 * 1 &lt;= nums[i] &lt;= 106
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Since the constraint on the number of elements is small, you can check all pairs in the array.
 * Hint 2: For each pair, perform an operation on one of the elements and check if it becomes equal to the other.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Sorting, Counting, Enumeration).
 *
 * @see <a href="https://leetcode.com/problems/count-almost-equal-pairs-i/">LeetCode #3265</a>
 */
public class CountAlmostEqualPairsI {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Almost Equal Pairs I");
    }

    public static void main(String[] args) {
        System.out.println("=== CountAlmostEqualPairsI ===");
        CountAlmostEqualPairsI sol = new CountAlmostEqualPairsI();
        System.out.println(sol.solve(null));
    }
}
