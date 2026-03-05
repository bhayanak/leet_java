package org.leetcode.hard;


/**
 * <b>#3267 - Count Almost Equal Pairs II</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Hash Table, Sorting, Counting, Enumeration</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * Attention: In this version, the number of operations that can be performed, has been increased to twice.
 *
 *
 * You are given an array nums consisting of positive integers.
 *
 *
 * We call two integers x and y almost equal if both integers can become equal after performing the following operation at most twice:
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
 * Input: nums = [1023,2310,2130,213]
 *
 *
 * Output: 4
 *
 *
 * Explanation:
 *
 *
 * The almost equal pairs of elements are:
 *
 *
 * 1023 and 2310. By swapping the digits 1 and 2, and then the digits 0 and 3 in 1023, you get 2310.
 *
 * 1023 and 213. By swapping the digits 1 and 0, and then the digits 1 and 2 in 1023, you get 0213, which is 213.
 *
 * 2310 and 213. By swapping the digits 2 and 0, and then the digits 3 and 2 in 2310, you get 0213, which is 213.
 *
 * 2310 and 2130. By swapping the digits 3 and 1 in 2310, you get 2130.
 *
 * Example 2:
 *
 * Input: nums = [1,10,100]
 *
 *
 * Output: 3
 *
 *
 * Explanation:
 *
 *
 * The almost equal pairs of elements are:
 *
 *
 * 1 and 10. By swapping the digits 1 and 0 in 10, you get 01 which is 1.
 *
 * 1 and 100. By swapping the second 0 with the digit 1 in 100, you get 001, which is 1.
 *
 * 10 and 100. By swapping the first 0 with the digit 1 in 100, you get 010, which is 10.
 *
 *
 *
 * Constraints:
 *
 *
 * 2 &lt;= nums.length &lt;= 5000
 *
 * 1 &lt;= nums[i] &lt; 107
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: For each element, find all possible integers we can get by applying the operations.
 * Hint 2: Store the frequencies of all the integers in a hashmap.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Sorting, Counting, Enumeration).
 *
 * @see <a href="https://leetcode.com/problems/count-almost-equal-pairs-ii/">LeetCode #3267</a>
 */
public class CountAlmostEqualPairsIi {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Almost Equal Pairs II");
    }

    public static void main(String[] args) {
        System.out.println("=== CountAlmostEqualPairsIi ===");
        CountAlmostEqualPairsIi sol = new CountAlmostEqualPairsIi();
        System.out.println(sol.solve(null));
    }
}
