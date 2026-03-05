package org.leetcode.hard;


/**
 * <b>#2302 - Count Subarrays With Score Less Than K</b>
 *
 * <p><b>Difficulty:</b> Hard</p>
 * <p><b>Category:</b> Array, Binary Search, Sliding Window, Prefix Sum</p>
 *
 * <h2>Problem Description</h2>
 * <pre>
 * The score of an array is defined as the product of its sum and its length.
 *
 *
 * For example, the score of [1, 2, 3, 4, 5] is (1 + 2 + 3 + 4 + 5) * 5 = 75.
 *
 * Given a positive integer array nums and an integer k, return the number of non-empty subarrays of nums whose score is strictly less than k.
 *
 *
 * A subarray is a contiguous sequence of elements within an array.
 *
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,1,4,3,5], k = 10
 * Output: 6
 * Explanation:
 * The 6 subarrays having scores less than 10 are:
 * - [2] with score 2 * 1 = 2.
 * - [1] with score 1 * 1 = 1.
 * - [4] with score 4 * 1 = 4.
 * - [3] with score 3 * 1 = 3. 
 * - [5] with score 5 * 1 = 5.
 * - [2,1] with score (2 + 1) * 2 = 6.
 * Note that subarrays such as [1,4] and [4,3,5] are not considered because their scores are 10 and 36 respectively, while we need scores strictly less than 10.
 *
 * Example 2:
 *
 * Input: nums = [1,1,1], k = 5
 * Output: 5
 * Explanation:
 * Every subarray except [1,1,1] has a score less than 5.
 * [1,1,1] has a score (1 + 1 + 1) * 3 = 9, which is greater than 5.
 * Thus, there are 5 subarrays having scores less than 5.
 *
 *
 *
 * Constraints:
 *
 *
 * 1 &lt;= nums.length &lt;= 105
 *
 * 1 &lt;= nums[i] &lt;= 105
 *
 * 1 &lt;= k &lt;= 1015
 * </pre>
 *
 * <h2>Hints to Solve</h2>
 * Hint 1: If we add an element to a list of elements, how will the score change?
 * Hint 2: How can we use this to determine the number of subarrays with score less than k in a given range?
 * Hint 3: How can we use “Two Pointers” to generalize the solution, and thus count all possible subarrays?
 *
 * <h2>Approach</h2>
 * Think about the category (Array, Binary Search, Sliding Window, Prefix Sum).
 *
 * @see <a href="https://leetcode.com/problems/count-subarrays-with-score-less-than-k/">LeetCode #2302</a>
 */
public class CountSubarraysWithScoreLessThanK {

    /**
     * Solves the problem and Solve.
     *
     * @param input the input (Object)
     * @return the computed Object result
     */
    public Object solve(Object input) {
        throw new UnsupportedOperationException("Not yet implemented: Count Subarrays With Score Less Than K");
    }

    public static void main(String[] args) {
        System.out.println("=== CountSubarraysWithScoreLessThanK ===");
        CountSubarraysWithScoreLessThanK sol = new CountSubarraysWithScoreLessThanK();
        System.out.println(sol.solve(null));
    }
}
