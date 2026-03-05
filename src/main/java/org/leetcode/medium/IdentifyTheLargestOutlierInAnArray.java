package org.leetcode.medium;


/**
 * <b>#3371 - Identify the Largest Outlier in an Array</b>
 *
 * <p><b>Difficulty:</b> Medium</p>
 * <p><b>Category:</b> Array, Hash Table, Counting, Enumeration</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * You are given an integer array nums. This array contains n elements, where exactly n - 2 elements are special numbers. One of the remaining two elements is the sum of these special numbers, and the other is an outlier.
 *
 *
 * An outlier is defined as a number that is neither one of the original special numbers nor the element representing the sum of those numbers.
 *
 *
 * Note that special numbers, the sum element, and the outlier must have distinct indices, but may share the same value.
 *
 *
 * Return the largest potential outlier in nums.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,3,5,10]
 *
 *
 * Output: 10
 *
 *
 * Explanation:
 *
 *
 * The special numbers could be 2 and 3, thus making their sum 5 and the outlier 10.
 *
 * Example 2:
 *
 * Input: nums = [-2,-1,-3,-6,4]
 *
 *
 * Output: 4
 *
 *
 * Explanation:
 *
 *
 * The special numbers could be -2, -1, and -3, thus making their sum -6 and the outlier 4.
 *
 * Example 3:
 *
 * Input: nums = [1,1,1,1,1,5,5]
 *
 *
 * Output: 5
 *
 *
 * Explanation:
 *
 *
 * The special numbers could be 1, 1, 1, 1, and 1, thus making their sum 5 and the other 5 as the outlier.
 *
 *
 *
 * Constraints:
 *
 *
 * 3 &lt;= nums.length &lt;= 105
 *
 * -1000 &lt;= nums[i] &lt;= 1000
 *
 * The input is generated such that at least one potential outlier exists in nums.
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: What will be the value of array sum if we remove the outlier from it?
 * Hint 2: Use hashmap to find occurrence of an element quickly.
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Hash Table, Counting, Enumeration).
 *
 * @see <a href="https://leetcode.com/problems/identify-the-largest-outlier-in-an-array/">LeetCode #3371</a>
 */
public class IdentifyTheLargestOutlierInAnArray {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Identify the Largest Outlier in an Array");
    }

    public static void main(String[] args) {
        System.out.println("=== IdentifyTheLargestOutlierInAnArray ===");
        IdentifyTheLargestOutlierInAnArray sol = new IdentifyTheLargestOutlierInAnArray();
        System.out.println(sol.solve(null));
    }
}
