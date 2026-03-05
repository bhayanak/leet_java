package org.leetcode.hard;


/**
 * <b>#3134 - Find the Median of the Uniqueness Array</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Hash Table, Binary Search, Sliding Window</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums. The uniqueness array of nums is the sorted array that contains the number of distinct elements of all the subarrays of nums. In other words, it is a sorted array consisting of distinct(nums[i..j]), for all 0 &lt;= i &lt;= j &lt; nums.length.
 *
 *
 * Here, distinct(nums[i..j]) denotes the number of distinct elements in the subarray that starts at index i and ends at index j.
 *
 *
 * Return the median of the uniqueness array of nums.
 *
 *
 * Note that the median of an array is defined as the middle element of the array when it is sorted in non-decreasing order. If there are two choices for a median, the smaller of the two values is taken.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3]
 *
 *
 * Output: 1
 *
 *
 * Explanation:
 *
 *
 * The uniqueness array of nums is [distinct(nums[0..0]), distinct(nums[1..1]), distinct(nums[2..2]), distinct(nums[0..1]), distinct(nums[1..2]), distinct(nums[0..2])] which is equal to [1, 1, 1, 2, 2, 3]. The uniqueness array has a median of 1. Therefore, the answer is 1.
 *
 * Example 2:
 *
 * Input: nums = [3,4,3,4,5]
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * The uniqueness array of nums is [1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3]. The uniqueness array has a median of 2. Therefore, the answer is 2.
 *
 * Example 3:
 *
 * Input: nums = [4,3,5,4]
 *
 *
 * Output: 2
 *
 *
 * Explanation:
 *
 *
 * The uniqueness array of nums is [1, 1, 1, 1, 2, 2, 2, 3, 3, 3]. The uniqueness array has a median of 2. Therefore, the answer is 2.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 105
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: Binary search over the answer.
 * Hint 2: For a given <code>x</code>, you need to check if <code>x</code> is the median, to the left of the median, or to the right of the median. You can do that by counting the number of sub-arrays <code>nums[i…j]</code> such that <code>distinct(num[i…j]) &lt;= x</code>.
 * Hint 3: Use the sliding window to solve the counting problem in the hint above.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Binary Search, Sliding Window).
 *
 * @see <a href="https://leetcode.com/problems/find-the-median-of-the-uniqueness-array/">LeetCode #3134</a>
 */
public class FindTheMedianOfTheUniquenessArray {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Find the Median of the Uniqueness Array");
    }

    public static void main(String[] args) {
        System.out.println("=== FindTheMedianOfTheUniquenessArray ===");
        FindTheMedianOfTheUniquenessArray sol = new FindTheMedianOfTheUniquenessArray();
        System.out.println(sol.solve(null));
    }
}
